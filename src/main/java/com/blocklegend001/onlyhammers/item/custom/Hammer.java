package com.blocklegend001.onlyhammers.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

import java.util.concurrent.atomic.AtomicInteger;

public class Hammer extends PickaxeItem {
    public Hammer(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        Vec3i offset = switch (((BlockHitResult) miner.raycast(4, 0, false)).getSide().getAxis()) {
            case X -> new Vec3i(0, 1, 1);
            case Y -> new Vec3i(1, 0, 1);
            case Z -> new Vec3i(1, 1, 0);
        };

        if (!state.isToolRequired() && !(state.getHardness(world, pos) >= this.getMaterial().getMiningLevel())) {
            return super.postMine(stack, world, state, pos, miner);
        }

        AtomicInteger blocksBroken = new AtomicInteger(1);
        BlockPos.iterateOutwards(pos, offset.getX(), offset.getY(), offset.getZ()).forEach(e -> {
            BlockState targetBlockState = world.getBlockState(e);
            Block targetBlock = targetBlockState.getBlock();
            int requiredToolLevel = (int) targetBlock.getHardness();
            int hammerMiningLevel = this.getMaterial().getMiningLevel();
            if (isSuitableFor(targetBlockState) && targetBlockState.isIn(BlockTags.PICKAXE_MINEABLE) && hammerMiningLevel >= requiredToolLevel) {
                targetBlockState.getBlock().onBreak(world, e, targetBlockState, (PlayerEntity) miner);
                boolean canHarvest = canHarvestBlock(targetBlockState, stack);
                int silkTouchLevel = EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack);
                int fortuneLevel = EnchantmentHelper.getLevel(Enchantments.FORTUNE, stack);
                if (canHarvest && silkTouchLevel > 0) {
                    Block.dropStack(world, e, new ItemStack(targetBlock));
                } else {
                    if (world instanceof ServerWorld) {
                        targetBlockState.getBlock().afterBreak((ServerWorld) world, (PlayerEntity) miner, e, targetBlockState, null, stack);
                    }
                }
                world.breakBlock(e, false, miner, Block.NOTIFY_ALL);
                blocksBroken.getAndIncrement();
            }
        });

        int durabilityCost = blocksBroken.get();
        stack.damage(durabilityCost, miner, (entity) -> entity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return true;
    }

    private boolean canHarvestBlock(BlockState state, ItemStack stack) {
        return state.isIn(BlockTags.PICKAXE_MINEABLE) && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) > 0
                || this.getMaterial().getMiningLevel() >= state.getBlock().getHardness();
    }
}
