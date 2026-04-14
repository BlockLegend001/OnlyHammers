package com.blocklegend001.onlyhammers.utils;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

@EventBusSubscriber(modid = OnlyHammers.MOD_ID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class KeyBinding {

    public static final KeyMapping HAMMER_SHOW_OUTLINE_KEY =
            new KeyMapping(
                    "key.onlyhammers.showoutline",
                    InputConstants.Type.KEYSYM,
                    GLFW.GLFW_KEY_O,
                    "key.category.onlyhammers.showoutline"
            );

    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(HAMMER_SHOW_OUTLINE_KEY);
    }
}