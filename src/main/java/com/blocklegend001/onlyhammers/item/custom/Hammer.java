package com.blocklegend001.onlyhammers.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.blocklegend001.onlyhammers.utils.RadiusMap.HAMMER_RADIUS_MAP;

public class Hammer extends Item {
    private static TagKey<Block> pickaxeMineable;

    public Hammer(ToolMaterial material, float attackDamage, float attackSpeed, Properties settings) {
        super(computeSettings(material, BlockTags.MINEABLE_WITH_PICKAXE, settings, attackDamage, attackSpeed));
    }

    private static Properties computeSettings(ToolMaterial material, TagKey<Block> pickaxeMineable, Properties settings, float attackDamage, float attackSpeed) {
        Hammer.pickaxeMineable = pickaxeMineable;
        settings.pickaxe(wrapMaterial(material, material.durability()), attackDamage, attackSpeed);
        return settings;
    }

    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initalBlockPos, ServerPlayer player) {
        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.level().clip(new ClipContext(player.getEyePosition(1f),
                (player.getEyePosition(1f).add(player.getViewVector(1f).scale(6f))),
                ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, player));

        if (hit.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHit = (BlockHitResult) hit;

            if(blockHit.getDirection() == Direction.DOWN || blockHit.getDirection() == Direction.UP) {
                for(int x = -range; x <= range; x++) {
                    for(int y = -range; y <= range; y++) {
                        positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY(), initalBlockPos.getZ() + y));
                    }
                }
            }

            if(blockHit.getDirection() == Direction.NORTH || blockHit.getDirection() == Direction.SOUTH) {
                for(int x = -range; x <= range; x++) {
                    for(int y = -range; y <= range; y++) {
                        positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY() + y, initalBlockPos.getZ()));
                    }
                }
            }

            if(blockHit.getDirection() == Direction.EAST || blockHit.getDirection() == Direction.WEST) {
                for(int x = -range; x <= range; x++) {
                    for(int y = -range; y <= range; y++) {
                        positions.add(new BlockPos(initalBlockPos.getX(), initalBlockPos.getY() + y, initalBlockPos.getZ() + x));
                    }
                }
            }
        }

        return positions;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltip, Consumer<Component> textConsumer, TooltipFlag options) {
        int radius = getRadiusForExcavator(stack);
        int widht = radius * 2 + 1;

        Component text = Component.literal("Dig area: ")
                .withStyle(ChatFormatting.GRAY)
                .append(Component.literal(widht + "x1").withStyle(ChatFormatting.YELLOW));

        textConsumer.accept(text);

        super.appendHoverText(stack, context, tooltip, textConsumer, options);
    }

    private int getRadiusForExcavator(ItemStack stack) {
        if (HAMMER_RADIUS_MAP.containsKey(stack.getItem())) {
            return HAMMER_RADIUS_MAP.get(stack.getItem());
        }
        return 0;
    }

    private static ToolMaterial wrapMaterial(ToolMaterial toolMaterial, int durability) {
        return new ToolMaterial(
                toolMaterial.incorrectBlocksForDrops(),
                durability,
                toolMaterial.speed(),
                toolMaterial.attackDamageBonus(),
                toolMaterial.enchantmentValue(),
                toolMaterial.repairItems()
        );
    }
}