package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.config.ModConfigs;
import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    WOODEN_HAMMER(0, ModConfigs.DurabilityWoodenHammer, 2.0F, 0.0F, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE_HAMMER(1, ModConfigs.DurabilityStoneHammer, 4.0F, 1.0F, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON_HAMMER(2, ModConfigs.DurabilityIronHammer, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    GOLD_HAMMER(0, ModConfigs.DurabilityGoldHammer, 12.0F, 0.0F, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    LAPIS_HAMMER(2, ModConfigs.DurabilityLapisHammer, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.LAPIS_LAZULI)),
    REDSTONE_HAMMER(2, ModConfigs.DurabilityRedstoneHammer, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.REDSTONE)),
    DIAMOND_HAMMER(3, ModConfigs.DurabilityDiamondHammer, 8.0F, 3.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    EMERALD_HAMMER(4, ModConfigs.DurabilityEmeraldHammer, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(Items.EMERALD)),
    OBSIDIAN_HAMMER(4, ModConfigs.DurabilityObsidianHammer, 9.0F, 4.0F, 10, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),
    NETHERITE_HAMMER(4, ModConfigs.DurabilityNetheriteHammer, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
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
    public int getMiningLevel() {
        return this.miningLevel;
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