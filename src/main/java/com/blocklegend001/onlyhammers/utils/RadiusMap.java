package com.blocklegend001.onlyhammers.utils;

import com.blocklegend001.onlyhammers.config.ModConfigs;
import com.blocklegend001.onlyhammers.item.ModItems;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;

public class RadiusMap {
    public static final Map<Item, Integer> HAMMER_RADIUS_MAP = new HashMap<>();

    static {
        addItem(ModItems.WOODEN_HAMMER, ModConfigs.RadiusWoodenHammer);
        addItem(ModItems.STONE_HAMMER, ModConfigs.RadiusStoneHammer);
        addItem(ModItems.IRON_HAMMER, ModConfigs.RadiusIronHammer);
        addItem(ModItems.GOLD_HAMMER, ModConfigs.RadiusGoldHammer);
        addItem(ModItems.LAPIS_HAMMER, ModConfigs.RadiusLapisHammer);
        addItem(ModItems.REDSTONE_HAMMER, ModConfigs.RadiusRedstoneHammer);
        addItem(ModItems.OBSIDIAN_HAMMER, ModConfigs.RadiusObsidianHammer);
        addItem(ModItems.DIAMOND_HAMMER, ModConfigs.RadiusDiamondHammer);
        addItem(ModItems.EMERALD_HAMMER, ModConfigs.RadiusEmeraldHammer);
        addItem(ModItems.NETHERITE_HAMMER, ModConfigs.RadiusNetheriteHammer);
    }

    private static void addItem(Item item, int radius) {
        HAMMER_RADIUS_MAP.put(item, Math.max(radius, 1));
    }
}