package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.ModConfigs;
import com.blocklegend001.onlyhammers.utils.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {

    public static final ToolMaterial WOODEN_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            ModConfigs.durabilityWoodenHammer,
            2,
            0.0F,
            15,
            ItemTags.WOODEN_TOOL_MATERIALS
    );

    public static final ToolMaterial STONE_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            ModConfigs.durabilityStoneHammer,
            4,
            1.0F,
            5,
            ItemTags.STONE_TOOL_MATERIALS
    );

    public static final ToolMaterial IRON_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.durabilityIronHammer,
            6,
            2.0F,
            14,
            ItemTags.IRON_TOOL_MATERIALS
    );

    public static final ToolMaterial GOLD_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_GOLD_TOOL,
            ModConfigs.durabilityGoldHammer,
            12,
            0.0F,
            22,
            ItemTags.GOLD_TOOL_MATERIALS
    );

    public static final ToolMaterial LAPIS_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.durabilityLapisHammer,
            6,
            2.0F,
            14,
            ModTags.Items.LAPIS_HAMMERS_REAPIRS
    );

    public static final ToolMaterial REDSTONE_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.durabilityRedstoneHammer,
            6,
            2.0F,
            14,
            ModTags.Items.REDSTONE_HAMMERS_REAPIRS
    );

    public static final ToolMaterial DIAMOND_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            ModConfigs.durabilityDiamondHammer,
            8,
            3.0F,
            10,
            ItemTags.DIAMOND_TOOL_MATERIALS
    );

    public static final ToolMaterial EMERALD_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.durabilityEmeraldHammer,
            9,
            4.0F,
            15,
            ModTags.Items.EMERALD_HAMMERS_REAPIRS
    );

    public static final ToolMaterial OBSIDIAN_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.durabilityObsidianHammer,
            9,
            4.0F,
            10,
            ModTags.Items.OBSIDIAN_HAMMERS_REAPIRS
    );

    public static final ToolMaterial NETHERITE_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.durabilityNetheriteHammer,
            9,
            4.0F,
            15,
            ItemTags.NETHERITE_TOOL_MATERIALS
    );
}