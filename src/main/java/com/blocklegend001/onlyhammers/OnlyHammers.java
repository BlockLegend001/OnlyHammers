package com.blocklegend001.onlyhammers;

import com.blocklegend001.onlyhammers.item.ModCreativeModeTab;
import com.blocklegend001.onlyhammers.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(OnlyHammers.MOD_ID)
public class OnlyHammers {

    public static final String MOD_ID = "onlyhammers";
    private static final Logger LOGGER = LogUtils.getLogger();

    public OnlyHammers() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTab.ONLYHAMMERS) {
            event.accept(ModItems.WOODEN_HAMMER);
            event.accept(ModItems.STONE_HAMMER);
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
