package com.blocklegend001.onlyhammers.utils;

import com.blocklegend001.onlyhammers.config.ModConfigs;
import com.blocklegend001.onlyhammers.item.ModItems;
import net.minecraft.item.Item;

import java.util.Map;

public class RadiusMap {
    public static final Map<Item, Integer> HAMMER_RADIUS_MAP = Map.of(
            ModItems.WOODEN_HAMMER, ModConfigs.RadiusWoodenHammer,
            ModItems.STONE_HAMMER, ModConfigs.RadiusStoneHammer,
            ModItems.IRON_HAMMER, ModConfigs.RadiusIronHammer,
            ModItems.GOLD_HAMMER, ModConfigs.RadiusGoldHammer,
            ModItems.LAPIS_HAMMER, ModConfigs.RadiusLapisHammer,
            ModItems.REDSTONE_HAMMER, ModConfigs.RadiusRedstoneHammer,
            ModItems.OBSIDIAN_HAMMER, ModConfigs.RadiusObsidianHammer,
            ModItems.DIAMOND_HAMMER, ModConfigs.RadiusDiamondHammer,
            ModItems.EMERALD_HAMMER, ModConfigs.RadiusEmeraldHammer,
            ModItems.NETHERITE_HAMMER, ModConfigs.RadiusNetheriteHammer
    );
}