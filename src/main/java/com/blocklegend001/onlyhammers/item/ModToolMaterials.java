package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.ModConfigs;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Supplier;

public enum ModToolMaterials implements Tier {

    WOODEN_HAMMER(
            0,
            ModConfigs.durabilityWoodenHammer,
            2.0F, 0.0F, 15,
            () -> Ingredient.of(ItemTags.PLANKS)
    ),

    STONE_HAMMER(
            1,
            ModConfigs.durabilityStoneHammer,
            4.0F, 1.0F, 5,
            () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)
    ),

    IRON_HAMMER(
            2,
            ModConfigs.durabilityIronHammer,
            6.0F, 2.0F, 14,
            () -> Ingredient.of(Items.IRON_INGOT)
    ),

    GOLD_HAMMER(
            0,
            ModConfigs.durabilityGoldHammer,
            12.0F, 0.0F, 22,
            () -> Ingredient.of(Items.GOLD_INGOT)
    ),

    LAPIS_HAMMER(
            2,
            ModConfigs.durabilityLapisHammer,
            6.0F, 2.0F, 14,
            () -> Ingredient.of(Items.LAPIS_LAZULI)
    ),

    REDSTONE_HAMMER(
            2,
            ModConfigs.durabilityRedstoneHammer,
            6.0F, 2.0F, 14,
            () -> Ingredient.of(Items.REDSTONE)
    ),

    DIAMOND_HAMMER(
            3,
            ModConfigs.durabilityDiamondHammer,
            8.0F, 3.0F, 10,
            () -> Ingredient.of(Items.DIAMOND)
    ),

    EMERALD_HAMMER(
            4,
            ModConfigs.durabilityEmeraldHammer,
            9.0F, 4.0F, 15,
            () -> Ingredient.of(Items.EMERALD)
    ),

    OBSIDIAN_HAMMER(
            4,
            ModConfigs.durabilityObsidianHammer,
            9.0F, 4.0F, 10,
            () -> Ingredient.of(Blocks.OBSIDIAN)
    ),

    NETHERITE_HAMMER(
            4,
            ModConfigs.durabilityNetheriteHammer,
            9.0F, 4.0F, 15,
            () -> Ingredient.of(Items.NETHERITE_INGOT)
    );

    private final int level;
    private final Supplier<Integer> durability;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(
            int level,
            Supplier<Integer> durability,
            float speed,
            float attackDamageBonus,
            int enchantmentValue,
            Supplier<Ingredient> repairIngredient
    ) {
        this.level = level;
        this.durability = durability;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return durability.get();
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}