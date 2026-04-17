package com.blocklegend001.onlyhammers.utils;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

import static com.blocklegend001.onlyhammers.OnlyHammers.MOD_ID;

public class KeyBinding {
    public static final KeyMapping.Category ONLYHAMMERS_CATEGORY =
            KeyMapping.Category.register(
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "showoutline")
            );

    public static final KeyMapping HAMMERS_SHOW_OUTLINE_KEY = new KeyMapping(
            "key.onlyhammers.showoutline",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_O,
            ONLYHAMMERS_CATEGORY
    );

    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(HAMMERS_SHOW_OUTLINE_KEY);
    }
}