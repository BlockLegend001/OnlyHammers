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
                    ModItems.WOODEN_HAMMER.get(), ModConfigs.radiusWoodenHammer,
                    ModItems.STONE_HAMMER.get(), ModConfigs.radiusStoneHammer,
                    ModItems.IRON_HAMMER.get(), ModConfigs.radiusIronHammer,
                    ModItems.GOLD_HAMMER.get(), ModConfigs.radiusGoldHammer,
                    ModItems.LAPIS_HAMMER.get(), ModConfigs.radiusLapisHammer,
                    ModItems.REDSTONE_HAMMER.get(), ModConfigs.radiusRedstoneHammer,
                    ModItems.OBSIDIAN_HAMMER.get(), ModConfigs.radiusObsidianHammer,
                    ModItems.DIAMOND_HAMMER.get(), ModConfigs.radiusDiamondHammer,
                    ModItems.EMERALD_HAMMER.get(), ModConfigs.radiusEmeraldHammer,
                    ModItems.NETHERITE_HAMMER.get(), ModConfigs.radiusNetheriteHammer
            );
        }
        return hammerRadius;
    }
}