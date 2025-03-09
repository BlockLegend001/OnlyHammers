package com.blocklegend001.onlyhammers;

import com.blocklegend001.onlyhammers.item.ModItemGroup;
import com.blocklegend001.onlyhammers.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class OnlyHammers implements ModInitializer {
    public static final String MOD_ID = "onlyhammers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroup();
        ModItems.registerModItems();
    }
}
