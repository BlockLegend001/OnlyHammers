package com.blocklegend001.onlyhammers.config;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.mojang.datafixers.util.Pair;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int DurabilityWoodenHammer;
    public static int DurabilityStoneHammer;
    public static int DurabilityCopperHammer;
    public static int DurabilityIronHammer;
    public static int DurabilityGoldHammer;
    public static int DurabilityLapisHammer;
    public static int DurabilityRedstoneHammer;
    public static int DurabilityObsidianHammer;
    public static int DurabilityDiamondHammer;
    public static int DurabilityEmeraldHammer;
    public static int DurabilityNetheriteHammer;

    public static int RadiusWoodenHammer;
    public static int RadiusStoneHammer;
    public static int RadiusCopperHammer;
    public static int RadiusIronHammer;
    public static int RadiusGoldHammer;
    public static int RadiusLapisHammer;
    public static int RadiusRedstoneHammer;
    public static int RadiusObsidianHammer;
    public static int RadiusDiamondHammer;
    public static int RadiusEmeraldHammer;
    public static int RadiusNetheriteHammer;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(OnlyHammers.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addComment("Hammer Durability Settings");

        configs.addKeyValuePair(new Pair<>("DurabilityWoodenHammer", 302), "Durability of the Wooden Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityStoneHammer", 650), "Durability of the Stone Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityCopperHammer", 850), "Durability of the Copper Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityIronHammer", 1300), "Durability of the Iron Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityGoldHammer", 750), "Durability of the Gold Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityLapisHammer", 1100), "Durability of the Lapis Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityRedstoneHammer", 1100), "Durability of the Redstone Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityObsidianHammer", 11200), "Durability of the Obsidian Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityDiamondHammer", 8025), "Durability of the Diamond Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityEmeraldHammer", 9768), "Durability of the Emerald Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityNetheriteHammer", 13675), "Durability of the Netherite Hammer");

        configs.addComment("Hammer Radius Settings");

        configs.addKeyValuePair(new Pair<>("RadiusWoodenHammer", 1), "Hammering radius for Wooden Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusStoneHammer", 1), "Hammering radius for Stone Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusCopperHammer", 1), "Hammering radius for Copper Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusIronHammer", 1), "Hammering radius for Iron Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusGoldHammer", 1), "Hammering radius for Gold Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusLapisHammer", 1), "Hammering radius for Lapis Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusRedstoneHammer", 1), "Hammering radius for Redstone Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusObsidianHammer", 1), "Hammering radius for Obsidian Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusDiamondHammer", 1), "Hammering radius for Diamond Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusEmeraldHammer", 1), "Hammering radius for Emerald Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusNetheriteHammer", 1), "Hammering radius for Netherite Hammer (radius 1 = 3×1 area)");
    }

    private static void assignConfigs() {
        DurabilityWoodenHammer = CONFIG.getOrDefault("DurabilityWoodenHammer", 302);
        DurabilityStoneHammer = CONFIG.getOrDefault("DurabilityStoneHammer", 650);
        DurabilityCopperHammer = CONFIG.getOrDefault("DurabilityCopperHammer", 850);
        DurabilityIronHammer = CONFIG.getOrDefault("DurabilityIronHammer", 1300);
        DurabilityGoldHammer = CONFIG.getOrDefault("DurabilityGoldHammer", 750);
        DurabilityLapisHammer = CONFIG.getOrDefault("DurabilityLapisHammer", 1100);
        DurabilityRedstoneHammer = CONFIG.getOrDefault("DurabilityRedstoneHammer", 1100);
        DurabilityObsidianHammer = CONFIG.getOrDefault("DurabilityObsidianHammer", 11200);
        DurabilityDiamondHammer = CONFIG.getOrDefault("DurabilityDiamondHammer", 8025);
        DurabilityEmeraldHammer = CONFIG.getOrDefault("DurabilityEmeraldHammer", 9768);
        DurabilityNetheriteHammer = CONFIG.getOrDefault("DurabilityNetheriteHammer", 13675);

        RadiusWoodenHammer = CONFIG.getOrDefault("RadiusWoodenHammer", 1);
        RadiusStoneHammer = CONFIG.getOrDefault("RadiusStoneHammer", 1);
        RadiusCopperHammer = CONFIG.getOrDefault("RadiusCopperHammer", 1);
        RadiusIronHammer = CONFIG.getOrDefault("RadiusIronHammer", 1);
        RadiusGoldHammer = CONFIG.getOrDefault("RadiusGoldHammer", 1);
        RadiusLapisHammer = CONFIG.getOrDefault("RadiusLapisHammer", 1);
        RadiusRedstoneHammer = CONFIG.getOrDefault("RadiusRedstoneHammer", 1);
        RadiusObsidianHammer = CONFIG.getOrDefault("RadiusObsidianHammer", 1);
        RadiusDiamondHammer = CONFIG.getOrDefault("RadiusDiamondHammer", 1);
        RadiusEmeraldHammer = CONFIG.getOrDefault("RadiusEmeraldHammer", 1);
        RadiusNetheriteHammer = CONFIG.getOrDefault("RadiusNetheriteHammer", 1);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}