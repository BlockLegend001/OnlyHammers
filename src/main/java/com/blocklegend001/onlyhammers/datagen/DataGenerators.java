package com.blocklegend001.onlyhammers.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static com.blocklegend001.onlyhammers.OnlyHammers.MOD_ID;
@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.addProvider(new ModItemModelProvider(packOutput, MOD_ID));
        ModBlockTagGenerator blockTagGenerator = event.addProvider(
                new ModBlockTagGenerator(packOutput, lookupProvider));
        event.addProvider(new ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter()));
        event.addProvider(new ModRecipeProvider.Runner(packOutput, lookupProvider));
    }
}
