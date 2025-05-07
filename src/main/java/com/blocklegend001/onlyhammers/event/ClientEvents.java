package com.blocklegend001.onlyhammers.event;

import com.blocklegend001.onlyhammers.OnlyHammers;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OnlyHammers.MOD_ID, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (Minecraft.getInstance().player != null) {
            ModEvents.isSneaking = Minecraft.getInstance().player.isShiftKeyDown();
        }
    }
}