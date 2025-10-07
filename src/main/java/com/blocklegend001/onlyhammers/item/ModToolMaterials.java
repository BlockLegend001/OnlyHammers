package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.ModConfigs;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.level.block.Block;

import java.util.List;

public record ModToolMaterials(TagKey<Block> incorrectBlocksForDrops, int durability, float speed,
                               float attackDamageBonus, int enchantmentValue) {

    public static final ModToolMaterials WOODEN_HAMMER = new ModToolMaterials(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            ModConfigs.durabilityWoodenHammer.get(),
            2,
            0.0F,
            15
    );

    public static final ModToolMaterials STONE_HAMMER = new ModToolMaterials(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            ModConfigs.durabilityStoneHammer.get(),
            4,
            1.0F,
            5
    );

    public static final ModToolMaterials IRON_HAMMER = new ModToolMaterials(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.durabilityIronHammer.get(),
            6,
            2.0F,
            14
    );

    public static final ModToolMaterials GOLD_HAMMER = new ModToolMaterials(
            BlockTags.INCORRECT_FOR_GOLD_TOOL,
            ModConfigs.durabilityGoldHammer.get(),
            12,
            0.0F,
            22
    );

    public static final ModToolMaterials LAPIS_HAMMER = new ModToolMaterials(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.durabilityLapisHammer.get(),
            6,
            2.0F,
            14
    );

    public static final ModToolMaterials REDSTONE_HAMMER = new ModToolMaterials(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.durabilityRedstoneHammer.get(),
            6,
            2.0F,
            14
    );

    public static final ModToolMaterials DIAMOND_HAMMER = new ModToolMaterials(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            ModConfigs.durabilityDiamondHammer.get(),
            8,
            3.0F,
            10
    );

    public static final ModToolMaterials EMERALD_HAMMER = new ModToolMaterials(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.durabilityEmeraldHammer.get(),
            9,
            4.0F,
            15
    );

    public static final ModToolMaterials OBSIDIAN_HAMMER = new ModToolMaterials(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.durabilityObsidianHammer.get(),
            9,
            4.0F,
            10
    );

    public static final ModToolMaterials NETHERITE_HAMMER = new ModToolMaterials(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.durabilityNetheriteHammer.get(),
            9,
            4.0F,
            15
    );

    private Item.Properties applyCommonProperties(Item.Properties props) {
        return props
                .durability(this.durability)
                .enchantable(this.enchantmentValue);
    }

    private ItemAttributeModifiers createToolAttributes(float attackDamage, float attackSpeed) {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, attackDamage + this.attackDamageBonus, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ATTACK_SPEED, new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, attackSpeed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .build();
    }

    public Item.Properties applyPickaxeProperties(Item.Properties properties, TagKey<Block> effectiveBlocks, float damage, float speed) {
        HolderGetter<Block> blockGetter = BuiltInRegistries.acquireBootstrapRegistrationLookup(BuiltInRegistries.BLOCK);

        return applyCommonProperties(properties)
                .component(DataComponents.TOOL, new Tool(
                        List.of(
                                Tool.Rule.deniesDrops(blockGetter.getOrThrow(this.incorrectBlocksForDrops)),
                                Tool.Rule.minesAndDrops(blockGetter.getOrThrow(effectiveBlocks), this.speed)
                        ),
                        1.0F,
                        1,
                        true
                ))
                .attributes(createToolAttributes(damage, speed));
    }
}
