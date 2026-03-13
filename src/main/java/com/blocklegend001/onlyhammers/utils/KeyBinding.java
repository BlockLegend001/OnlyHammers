package com.blocklegend001.onlyhammers.utils;

import com.blocklegend001.onlyhammers.OnlyHammers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

@EventBusSubscriber(modid = OnlyHammers.MOD_ID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class KeyBinding {
    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(OnlyHammers.SHOW_OUTLINE_KEY.get());
    }
}