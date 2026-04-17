package com.blocklegend001.onlyhammers.event;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.utils.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OnlyHammers.MOD_ID, value = Dist.CLIENT)
public class KeyBindingEvents {

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent.Post event) {
        while (KeyBinding.HAMMERS_SHOW_OUTLINE_KEY.consumeClick()) {
            OnlyHammers.SHOW_OUTLINE_ENABLED =
                    !OnlyHammers.SHOW_OUTLINE_ENABLED;

            if (Minecraft.getInstance().player != null) {
                Minecraft.getInstance().player.displayClientMessage(
                        Component.literal(
                                "Outline: " +
                                        (OnlyHammers.SHOW_OUTLINE_ENABLED ? "ON" : "OFF")
                        ), false
                );
            }
        }
    }
}