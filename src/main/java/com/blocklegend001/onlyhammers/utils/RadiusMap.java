package com.blocklegend001.onlyhammers.utils;

import com.blocklegend001.onlyhammers.config.ModConfigs;
import com.blocklegend001.onlyhammers.item.ModItems;
import net.minecraft.item.Item;

import java.util.Map;

public class RadiusMap {
    public static final Map<Item, Integer> HAMMER_RADIUS_MAP = Map.ofEntries(
            Map.entry(ModItems.WOODEN_HAMMER, ModConfigs.RadiusWoodenHammer),
            Map.entry(ModItems.STONE_HAMMER, ModConfigs.RadiusStoneHammer),
            Map.entry(ModItems.COPPER_HAMMER, ModConfigs.RadiusCopperHammer),
            Map.entry(ModItems.IRON_HAMMER, ModConfigs.RadiusIronHammer),
            Map.entry(ModItems.GOLD_HAMMER, ModConfigs.RadiusGoldHammer),
            Map.entry(ModItems.LAPIS_HAMMER, ModConfigs.RadiusLapisHammer),
            Map.entry(ModItems.REDSTONE_HAMMER, ModConfigs.RadiusRedstoneHammer),
            Map.entry(ModItems.OBSIDIAN_HAMMER, ModConfigs.RadiusObsidianHammer),
            Map.entry(ModItems.DIAMOND_HAMMER, ModConfigs.RadiusDiamondHammer),
            Map.entry(ModItems.EMERALD_HAMMER, ModConfigs.RadiusEmeraldHammer),
            Map.entry(ModItems.NETHERITE_HAMMER, ModConfigs.RadiusNetheriteHammer)
    );
}