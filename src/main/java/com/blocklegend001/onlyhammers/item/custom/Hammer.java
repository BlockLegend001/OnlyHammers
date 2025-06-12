package com.blocklegend001.onlyhammers.item.custom;

import net.minecraft.block.Block;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.blocklegend001.onlyhammers.utils.RadiusMap.HAMMER_RADIUS_MAP;

public class Hammer extends Item {
    private static TagKey<Block> pickaxeMineable;

    public Hammer(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(computeSettings(material, BlockTags.PICKAXE_MINEABLE, settings, attackDamage, attackSpeed));
    }

    private static Item.Settings computeSettings(ToolMaterial material, TagKey<Block> pickaxeMineable, Item.Settings settings, float attackDamage, float attackSpeed) {
        Hammer.pickaxeMineable = pickaxeMineable;
        settings.pickaxe(wrapMaterial(material, material.durability()), attackDamage, attackSpeed);
        return settings;
    }
    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initalBlockPos, ServerPlayerEntity player) {
        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(20, 0, false);
        if (hit.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHit = (BlockHitResult) hit;

            if(blockHit.getSide() == Direction.DOWN || blockHit.getSide() == Direction.UP) {
                for(int x = -range; x <= range; x++) {
                    for(int y = -range; y <= range; y++) {
                        positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY(), initalBlockPos.getZ() + y));
                    }
                }
            }

            if(blockHit.getSide() == Direction.NORTH || blockHit.getSide() == Direction.SOUTH) {
                for(int x = -range; x <= range; x++) {
                    for(int y = -range; y <= range; y++) {
                        positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY() + y, initalBlockPos.getZ()));
                    }
                }
            }

            if(blockHit.getSide() == Direction.EAST || blockHit.getSide() == Direction.WEST) {
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
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        int radius = getRadiusForExcavator(stack);

        Text text = Text.empty()
                .append(Text.literal("Break Radius: ").formatted(Formatting.GRAY))
                .append(Text.literal(String.valueOf(radius)).formatted(Formatting.YELLOW))
                .append(Text.literal(" Blocks").formatted(Formatting.GRAY));

        textConsumer.accept(text);

        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
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