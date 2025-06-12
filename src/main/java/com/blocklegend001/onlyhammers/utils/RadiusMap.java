package com.blocklegend001.onlyhammers.utils;

import com.blocklegend001.onlyhammers.ModConfigs;
import com.blocklegend001.onlyhammers.item.ModItems;
import net.minecraft.world.item.Item;

import java.util.Map;

public class RadiusMap {

    public static Map<Item, Integer> hammerRadius = null;

    public static Map<Item, Integer> getHammerRadius() {
        if (hammerRadius == null) {
            hammerRadius = Map.of(
                    ModItems.WOODEN_HAMMER.get(), ModConfigs.radiusWoodenHammer.get(),
                    ModItems.STONE_HAMMER.get(), ModConfigs.radiusStoneHammer.get(),
                    ModItems.IRON_HAMMER.get(), ModConfigs.radiusIronHammer.get(),
                    ModItems.GOLD_HAMMER.get(), ModConfigs.radiusGoldHammer.get(),
                    ModItems.LAPIS_HAMMER.get(), ModConfigs.radiusLapisHammer.get(),
                    ModItems.REDSTONE_HAMMER.get(), ModConfigs.radiusRedstoneHammer.get(),
                    ModItems.OBSIDIAN_HAMMER.get(), ModConfigs.radiusObsidianHammer.get(),
                    ModItems.DIAMOND_HAMMER.get(), ModConfigs.radiusDiamondHammer.get(),
                    ModItems.EMERALD_HAMMER.get(), ModConfigs.radiusEmeraldHammer.get(),
                    ModItems.NETHERITE_HAMMER.get(), ModConfigs.radiusNetheriteHammer.get()
            );
        }
        return hammerRadius;
    }
}