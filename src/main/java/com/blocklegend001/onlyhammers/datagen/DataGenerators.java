package com.blocklegend001.onlyhammers.datagen;

import net.minecraft.core.RegistrySetBuilder;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import static com.blocklegend001.onlyhammers.OnlyHammers.MOD_ID;

@EventBusSubscriber(modid = MOD_ID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        var builder = new RegistrySetBuilder()
                .add(ModRecipeProvider.create());
        event.createReloadableRegistryObjects(builder);
        event.createProvider(ModBlockTagGenerator::new);
        event.createProvider(ModItemModelProvider::new);
        event.createProvider(ModItemTagGenerator::new);
    }
}
