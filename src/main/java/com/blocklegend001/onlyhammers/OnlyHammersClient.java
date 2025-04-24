package com.blocklegend001.onlyhammers;

import com.blocklegend001.onlyhammers.utils.HammerOverlayRenderer;
import net.fabricmc.api.ClientModInitializer;

public class OnlyHammersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HammerOverlayRenderer.init();
    }
}
