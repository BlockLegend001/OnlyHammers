package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            OnlyHammers.MOD_ID);

    public static RegistryObject<CreativeModeTab> ONLYHAMMERS = CREATIVE_MODE_TABS.register("onlyhammers", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITE_HAMMER.get()))
                    .title(Component.translatable("creativemodetab.onlyhammers")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}