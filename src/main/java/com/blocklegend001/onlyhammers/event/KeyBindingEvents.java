package com.blocklegend001.onlyhammers.event;

import com.blocklegend001.onlyhammers.OnlyHammers;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@EventBusSubscriber(modid = OnlyHammers.MOD_ID, value = Dist.CLIENT)
public class KeyBindingEvents {

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {

        if (OnlyHammers.SHOW_OUTLINE_KEY.get().consumeClick()) {

            OnlyHammers.SHOW_OUTLINE_ENABLED =
                    !OnlyHammers.SHOW_OUTLINE_ENABLED;

            var mc = Minecraft.getInstance();

            if (mc.player != null) {
                mc.player.displayClientMessage(
                        Component.literal(
                                "Outline: " +
                                        (OnlyHammers.SHOW_OUTLINE_ENABLED ? "ON" : "OFF")
                        ), false
                );
            }
        }
    }
}