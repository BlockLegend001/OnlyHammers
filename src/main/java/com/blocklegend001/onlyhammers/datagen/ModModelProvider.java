package com.blocklegend001.onlyhammers.datagen;

import com.blocklegend001.onlyhammers.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WOODEN_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LAPIS_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REDSTONE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER, Models.HANDHELD);
    }
}
