package com.blocklegend001.onlyhammers.utils;

import com.blocklegend001.onlyhammers.ModConfigs;
import com.blocklegend001.onlyhammers.item.ModItems;
import net.minecraft.world.item.Item;

import java.util.Map;

public class RadiusMap {

    public static Map<Item, Integer> hammerRadius = null;

    public static Map<Item, Integer> getHammerRadius() {
        if (hammerRadius == null) {
            hammerRadius = Map.ofEntries(
                    Map.entry(ModItems.WOODEN_HAMMER.get(), ModConfigs.radiusWoodenHammer),
                    Map.entry(ModItems.STONE_HAMMER.get(), ModConfigs.radiusStoneHammer),
                    Map.entry(ModItems.COPPER_HAMMER.get(), ModConfigs.radiusCopperHammer),
                    Map.entry(ModItems.IRON_HAMMER.get(), ModConfigs.radiusIronHammer),
                    Map.entry(ModItems.GOLD_HAMMER.get(), ModConfigs.radiusGoldHammer),
                    Map.entry(ModItems.LAPIS_HAMMER.get(), ModConfigs.radiusLapisHammer),
                    Map.entry(ModItems.REDSTONE_HAMMER.get(), ModConfigs.radiusRedstoneHammer),
                    Map.entry(ModItems.OBSIDIAN_HAMMER.get(), ModConfigs.radiusObsidianHammer),
                    Map.entry(ModItems.DIAMOND_HAMMER.get(), ModConfigs.radiusDiamondHammer),
                    Map.entry(ModItems.EMERALD_HAMMER.get(), ModConfigs.radiusEmeraldHammer),
                    Map.entry(ModItems.NETHERITE_HAMMER.get(), ModConfigs.radiusNetheriteHammer)
            );
        }
        return hammerRadius;
    }
}