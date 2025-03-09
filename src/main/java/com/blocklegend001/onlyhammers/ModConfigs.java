package com.blocklegend001.onlyhammers;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ModConfigs {
    public static final ForgeConfigSpec.Builder mycfg = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.IntValue DurabilityWoodenHammer = mycfg
            .comment("Durability of the wooden hammer.")
            .defineInRange("DurabilityWoodenHammer", 302, 0, Integer.MAX_VALUE);
    
    private static final ForgeConfigSpec.IntValue DurabilityStoneHammer = mycfg
            .comment("Durability of the stone hammer.")
            .defineInRange("DurabilityStoneHammer", 650, 0, Integer.MAX_VALUE);
    
    private static final ForgeConfigSpec.IntValue DurabilityIronHammer = mycfg
            .comment("Durability of the iron hammer.")
            .defineInRange("DurabilityIronHammer", 1300, 0, Integer.MAX_VALUE);
    
    private static final ForgeConfigSpec.IntValue DurabilityGoldHammer = mycfg
            .comment("Durability of the gold hammer.")
            .defineInRange("DurabilityGoldHammer", 750, 0, Integer.MAX_VALUE);
    
    private static final ForgeConfigSpec.IntValue DurabilityLapisHammer = mycfg
            .comment("Durability of the lapis hammer.")
            .defineInRange("DurabilityLapisHammer", 1100, 0, Integer.MAX_VALUE);
    
    private static final ForgeConfigSpec.IntValue DurabilityRedstoneHammer = mycfg
            .comment("Durability of the redstone hammer.")
            .defineInRange("DurabilityRedstoneHammer", 1100, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityObsidianHammer = mycfg
            .comment("Durability of the obsidian hammer.")
            .defineInRange("DurabilityObsidianHammer", 11200, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityDiamondHammer = mycfg
            .comment("Durability of the diamond hammer.")
            .defineInRange("DurabilityDiamondHammer", 8025, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityEmeraldHammer = mycfg
            .comment("Durability of the emerald hammer.")
            .defineInRange("DurabilityEmeraldHammer", 9768, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityNetheriteHammer = mycfg
            .comment("Durability of the netherite hammer.")
            .defineInRange("DurabilityNetheriteHammer", 13675, 0, Integer.MAX_VALUE);

    public static ForgeConfigSpec SPEC = mycfg.build();

    public static int durabilityWoodenHammer;
    public static int durabilityStoneHammer;
    public static int durabilityIronHammer;
    public static int durabilityGoldHammer;
    public static int durabilityLapisHammer;
    public static int durabilityRedstoneHammer;
    public static int durabilityObsidianHammer;
    public static int durabilityDiamondHammer;
    public static int durabilityEmeraldHammer;
    public static int durabilityNetheriteHammer;

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig config = CommentedFileConfig.builder(path).sync().autoreload().build();
        config.load();
        spec.setConfig(config);

        durabilityWoodenHammer = DurabilityWoodenHammer.get();
        durabilityStoneHammer = DurabilityStoneHammer.get();
        durabilityIronHammer = DurabilityIronHammer.get();
        durabilityGoldHammer = DurabilityGoldHammer.get();
        durabilityLapisHammer = DurabilityLapisHammer.get();
        durabilityRedstoneHammer = DurabilityRedstoneHammer.get();
        durabilityObsidianHammer = DurabilityObsidianHammer.get();
        durabilityDiamondHammer = DurabilityDiamondHammer.get();
        durabilityEmeraldHammer = DurabilityEmeraldHammer.get();
        durabilityNetheriteHammer = DurabilityNetheriteHammer.get();
    }
}
