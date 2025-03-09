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
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Hammer extends PickaxeItem {
    public Hammer(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, settings);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        BlockHitResult blockHitResult = (BlockHitResult) miner.raycast(4, 0, false);
        BlockState targetBlockState = world.getBlockState(blockHitResult.getBlockPos());
        Vec3i offset = switch (blockHitResult.getSide().getAxis()) {
            case X -> new Vec3i(0, 1, 1);
            case Y -> new Vec3i(1, 0, 1);
            case Z -> new Vec3i(1, 1, 0);
        };

        int hammerMiningLevel = getMiningLevelFromMaterial(this.getMaterial());

        if (!state.isToolRequired() && !(state.getHardness(world, pos) >= hammerMiningLevel)) {
            return super.postMine(stack, world, state, pos, miner);
        }

        AtomicInteger blocksBroken = new AtomicInteger(1);
        BlockPos.iterateOutwards(pos, offset.getX(), offset.getY(), offset.getZ()).forEach(e -> {
            BlockState targetBlockStateInner = world.getBlockState(e);
            int requiredToolLevel = getMiningLevelFromHardness(targetBlockStateInner.getBlock().getHardness());
            if (isSuitableFor(targetBlockStateInner) && targetBlockStateInner.isIn(BlockTags.PICKAXE_MINEABLE) && hammerMiningLevel >= requiredToolLevel) {
                targetBlockStateInner.getBlock().onBreak(world, e, targetBlockStateInner, (PlayerEntity) miner);
                boolean canHarvest = canHarvestBlock(targetBlockStateInner, stack);
                int silkTouchLevel = EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack);
                int fortuneLevel = EnchantmentHelper.getLevel(Enchantments.FORTUNE, stack);
                if (canHarvest && silkTouchLevel > 0) {
                    Block.dropStack(world, e, new ItemStack(targetBlockStateInner.getBlock()));
                } else {
                    if (world instanceof ServerWorld) {
                        targetBlockStateInner.getBlock().afterBreak((ServerWorld) world, (PlayerEntity) miner, e, targetBlockStateInner, null, stack);
                    }
                }
                world.breakBlock(e, false, miner, Block.NOTIFY_ALL);
                blocksBroken.getAndIncrement();
            }
        });


        int durabilityCost = blocksBroken.get();
        int originalDamage = stack.getDamage();
        stack.setDamage(stack.getDamage() + durabilityCost);
        if (stack.getDamage() >= stack.getMaxDamage()) {
            stack.setCount(0);
        }

        if (miner instanceof PlayerEntity && stack.getDamage() >= stack.getMaxDamage() && originalDamage < stack.getMaxDamage()) {
            ((PlayerEntity) miner).sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        }
        return true;
    }

    private boolean canHarvestBlock(BlockState state, ItemStack stack) {
        return state.isIn(BlockTags.PICKAXE_MINEABLE) && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) > 0
                || getMiningLevelFromMaterial(this.getMaterial()) >= getMiningLevelFromHardness(state.getBlock().getHardness());
    }

    public boolean isSuitableFor(BlockState state) {
        return state.isIn(BlockTags.PICKAXE_MINEABLE);
    }

    private int getMiningLevelFromMaterial(ToolMaterial material) {
        if (material == ToolMaterials.WOOD) return 0;
        if (material == ToolMaterials.STONE) return 1;
        if (material == ToolMaterials.IRON) return 2;
        if (material == ToolMaterials.DIAMOND) return 3;
        if (material == ToolMaterials.NETHERITE) return 4;
        return 0;
    }

    private int getMiningLevelFromHardness(float hardness) {
        if (hardness < 2.0F) return 0; // Wood
        if (hardness < 3.0F) return 1; // Stone
        if (hardness < 5.0F) return 2; // Iron
        if (hardness < 8.0F) return 3; // Diamond
        return 4; // Netherite
    }
}