package com.blocklegend001.onlyhammers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModConfigs {
    private static final File CONFIG_FILE = new File("config/onlyhammers-common.toml");

    // Configurazioni per gli Hammers
    public static int DurabilityWoodenHammer = 302;
    public static int DurabilityStoneHammer = 650;
    public static int DurabilityCopperHammer = 850;
    public static int DurabilityIronHammer = 1300;
    public static int DurabilityGoldHammer = 750;
    public static int DurabilityLapisHammer = 1100;
    public static int DurabilityRedstoneHammer = 1100;
    public static int DurabilityObsidianHammer = 11200;
    public static int DurabilityDiamondHammer = 8025;
    public static int DurabilityEmeraldHammer = 9768;
    public static int DurabilityNetheriteHammer = 13675;

    public static int radiusWoodenHammer = 1;
    public static int radiusStoneHammer = 1;
    public static int radiusCopperHammer = 1;
    public static int radiusIronHammer = 1;
    public static int radiusGoldHammer = 1;
    public static int radiusLapisHammer = 1;
    public static int radiusRedstoneHammer = 1;
    public static int radiusObsidianHammer = 1;
    public static int radiusDiamondHammer = 1;
    public static int radiusEmeraldHammer = 1;
    public static int radiusNetheriteHammer = 1;

    public static void loadConfig() {
        if (!CONFIG_FILE.exists()) {
            saveConfig();
        } else {
            try (FileReader reader = new FileReader(CONFIG_FILE)) {
                JsonObject config = JsonParser.parseReader(reader).getAsJsonObject();

                DurabilityWoodenHammer = config.get("DurabilityWoodenHammer").getAsInt();
                DurabilityStoneHammer = config.get("DurabilityStoneHammer").getAsInt();
                DurabilityCopperHammer = config.get("DurabilityCopperHammer").getAsInt();
                DurabilityIronHammer = config.get("DurabilityIronHammer").getAsInt();
                DurabilityGoldHammer = config.get("DurabilityGoldHammer").getAsInt();
                DurabilityLapisHammer = config.get("DurabilityLapisHammer").getAsInt();
                DurabilityRedstoneHammer = config.get("DurabilityRedstoneHammer").getAsInt();
                DurabilityObsidianHammer = config.get("DurabilityObsidianHammer").getAsInt();
                DurabilityDiamondHammer = config.get("DurabilityDiamondHammer").getAsInt();
                DurabilityEmeraldHammer = config.get("DurabilityEmeraldHammer").getAsInt();
                DurabilityNetheriteHammer = config.get("DurabilityNetheriteHammer").getAsInt();

                radiusWoodenHammer = config.get("radiusWoodenHammer").getAsInt();
                radiusStoneHammer = config.get("radiusStoneHammer").getAsInt();
                radiusCopperHammer = config.get("radiusCopperHammer").getAsInt();
                radiusIronHammer = config.get("radiusIronHammer").getAsInt();
                radiusGoldHammer = config.get("radiusGoldHammer").getAsInt();
                radiusLapisHammer = config.get("radiusLapisHammer").getAsInt();
                radiusRedstoneHammer = config.get("radiusRedstoneHammer").getAsInt();
                radiusObsidianHammer = config.get("radiusObsidianHammer").getAsInt();
                radiusDiamondHammer = config.get("radiusDiamondHammer").getAsInt();
                radiusEmeraldHammer = config.get("radiusEmeraldHammer").getAsInt();
                radiusNetheriteHammer = config.get("radiusNetheriteHammer").getAsInt();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void saveConfig() {
        JsonObject config = new JsonObject();

        config.addProperty("DurabilityWoodenHammer", DurabilityWoodenHammer);
        config.addProperty("DurabilityStoneHammer", DurabilityStoneHammer);
        config.addProperty("DurabilityCopperHammer", DurabilityCopperHammer);
        config.addProperty("DurabilityIronHammer", DurabilityIronHammer);
        config.addProperty("DurabilityGoldHammer", DurabilityGoldHammer);
        config.addProperty("DurabilityLapisHammer", DurabilityLapisHammer);
        config.addProperty("DurabilityRedstoneHammer", DurabilityRedstoneHammer);
        config.addProperty("DurabilityObsidianHammer", DurabilityObsidianHammer);
        config.addProperty("DurabilityDiamondHammer", DurabilityDiamondHammer);
        config.addProperty("DurabilityEmeraldHammer", DurabilityEmeraldHammer);
        config.addProperty("DurabilityNetheriteHammer", DurabilityNetheriteHammer);

        config.addProperty("radiusWoodenHammer", radiusWoodenHammer);
        config.addProperty("radiusStoneHammer", radiusStoneHammer);
        config.addProperty("radiusCopperHammer", radiusCopperHammer);
        config.addProperty("radiusIronHammer", radiusIronHammer);
        config.addProperty("radiusGoldHammer", radiusGoldHammer);
        config.addProperty("radiusLapisHammer", radiusLapisHammer);
        config.addProperty("radiusRedstoneHammer", radiusRedstoneHammer);
        config.addProperty("radiusObsidianHammer", radiusObsidianHammer);
        config.addProperty("radiusDiamondHammer", radiusDiamondHammer);
        config.addProperty("radiusEmeraldHammer", radiusEmeraldHammer);
        config.addProperty("radiusNetheriteHammer", radiusNetheriteHammer);

        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(config));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}