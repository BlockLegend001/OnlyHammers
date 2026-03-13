package com.blocklegend001.onlyhammers;

import com.blocklegend001.onlyhammers.event.ModEvents;
import com.blocklegend001.onlyhammers.item.ModItems;
import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.logging.LogUtils;
import net.minecraft.client.KeyMapping;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.common.util.Lazy;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;

@Mod("onlyhammers")
public class OnlyHammers {

    public static final String MOD_ID = "onlyhammers";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static boolean SHOW_OUTLINE_ENABLED = true;

    public static final KeyMapping.Category ONLYHAMMERS_CATEGORY =
            KeyMapping.Category.register(
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "showoutline")
            );

    public static final Lazy<KeyMapping> SHOW_OUTLINE_KEY = Lazy.of(() ->
            new KeyMapping(
                    "key.onlyhammers.showoutline",
                    InputConstants.Type.KEYSYM,
                    GLFW.GLFW_KEY_O,
                    ONLYHAMMERS_CATEGORY
            )
    );

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ONLYHAMMERS = CREATIVE_MODE_TABS.register("onlyhammers", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.onlyhammers"))
            .icon(() -> new ItemStack(ModItems.NETHERITE_HAMMER.get()))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.WOODEN_HAMMER.get());
                output.accept(ModItems.STONE_HAMMER.get());
                output.accept(ModItems.COPPER_HAMMER.get());
                output.accept(ModItems.IRON_HAMMER.get());
                output.accept(ModItems.GOLD_HAMMER.get());
                output.accept(ModItems.LAPIS_HAMMER.get());
                output.accept(ModItems.REDSTONE_HAMMER.get());
                output.accept(ModItems.DIAMOND_HAMMER.get());
                output.accept(ModItems.EMERALD_HAMMER.get());
                output.accept(ModItems.OBSIDIAN_HAMMER.get());
                output.accept(ModItems.NETHERITE_HAMMER.get());
            }).build()
    );

    public OnlyHammers(IEventBus modEventBus) {
        ModConfigs.loadConfig();
        NeoForge.EVENT_BUS.register(ModEvents.class);
        ModItems.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}