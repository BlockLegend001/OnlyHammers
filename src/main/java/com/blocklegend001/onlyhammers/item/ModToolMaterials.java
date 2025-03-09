package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.config.ModConfigs;
import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    WOODEN_HAMMER(BlockTags.INCORRECT_FOR_WOODEN_TOOL, ModConfigs.DurabilityWoodenHammer, 2.0F, 0.0F, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE_HAMMER(BlockTags.INCORRECT_FOR_STONE_TOOL, ModConfigs.DurabilityStoneHammer, 4.0F, 1.0F, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON_HAMMER(BlockTags.INCORRECT_FOR_IRON_TOOL, ModConfigs.DurabilityIronHammer, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    GOLD_HAMMER(BlockTags.INCORRECT_FOR_GOLD_TOOL, ModConfigs.DurabilityGoldHammer, 12.0F, 0.0F, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    LAPIS_HAMMER(BlockTags.INCORRECT_FOR_IRON_TOOL, ModConfigs.DurabilityLapisHammer, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.LAPIS_LAZULI)),
    REDSTONE_HAMMER(BlockTags.INCORRECT_FOR_IRON_TOOL, ModConfigs.DurabilityRedstoneHammer, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.REDSTONE)),
    DIAMOND_HAMMER(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, ModConfigs.DurabilityDiamondHammer, 8.0F, 3.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    EMERALD_HAMMER(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, ModConfigs.DurabilityEmeraldHammer, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(Items.EMERALD)),
    OBSIDIAN_HAMMER(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, ModConfigs.DurabilityObsidianHammer, 9.0F, 4.0F, 10, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),
    NETHERITE_HAMMER(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, ModConfigs.DurabilityNetheriteHammer, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,final float miningSpeed,
                     final float attackDamage, final int enchantability,final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}