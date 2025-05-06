package com.blocklegend001.onlyhammers;

import com.blocklegend001.onlyhammers.utils.HammerOverlayRenderer;
import com.blocklegend001.onlyhammers.utils.HammerUsageEvent;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.util.ActionResult;

public class OnlyHammersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HammerOverlayRenderer.init();
        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
            if (world.isClient) {
                HammerUsageEvent.isSneaking = player.isSneaking();
            }
            return ActionResult.PASS;
        });
    }
}
