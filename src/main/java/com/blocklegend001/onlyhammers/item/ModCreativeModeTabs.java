package com.blocklegend001.onlyhammers.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab ONLYHAMMERS = new CreativeModeTab("onlyhammers") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NETHERITE_HAMMER.get());
        }
    };
}
