package com.blocklegend001.onlyhammers;

import com.blocklegend001.onlyhammers.item.ModCreativeModeTabs;
import com.blocklegend001.onlyhammers.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.slf4j.Logger;

@Mod(OnlyHammers.MOD_ID)
public class OnlyHammers {

    public static final String MOD_ID = "onlyhammers";
    private static final Logger LOGGER = LogUtils.getLogger();

    public OnlyHammers(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();
        context.registerConfig(ModConfig.Type.COMMON, ModConfigs.SPEC, "onlyhammers.toml");
        ModConfigs.loadConfig(ModConfigs.SPEC, FMLPaths.CONFIGDIR.get().resolve("onlyhammers.toml"));
        ModCreativeModeTabs.register(modBusGroup);
        ModItems.register(modBusGroup);
        BuildCreativeModeTabContentsEvent.BUS.addListener(this::addCreative);
        FMLCommonSetupEvent.getBus(modBusGroup).addListener(this::setup);
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event) {
        ModConfigs.loadConfig(ModConfigs.SPEC, FMLPaths.CONFIGDIR.get().resolve("onlyhammers.toml"));
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == ModCreativeModeTabs.ONLYHAMMERS.get()) {
            event.accept(ModItems.WOODEN_HAMMER);
            event.accept(ModItems.STONE_HAMMER);
            event.accept(ModItems.COPPER_HAMMER);
            event.accept(ModItems.IRON_HAMMER);
            event.accept(ModItems.GOLD_HAMMER);
            event.accept(ModItems.LAPIS_HAMMER);
            event.accept(ModItems.REDSTONE_HAMMER);
            event.accept(ModItems.DIAMOND_HAMMER);
            event.accept(ModItems.EMERALD_HAMMER);
            event.accept(ModItems.OBSIDIAN_HAMMER);
            event.accept(ModItems.NETHERITE_HAMMER);
        }
    }
}