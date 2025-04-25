package com.blocklegend001.onlyhammers.datagen;

import com.blocklegend001.onlyhammers.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.Collections;

public class ModItemModelProvider extends ModelProvider {
    public ModItemModelProvider(PackOutput output, String modId) {
        super(output, modId);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModel(itemModels, ModItems.WOODEN_HAMMER.get());
        itemModel(itemModels, ModItems.STONE_HAMMER.get());
        itemModel(itemModels, ModItems.IRON_HAMMER.get());
        itemModel(itemModels, ModItems.GOLD_HAMMER.get());
        itemModel(itemModels, ModItems.REDSTONE_HAMMER.get());
        itemModel(itemModels, ModItems.LAPIS_HAMMER.get());
        itemModel(itemModels, ModItems.DIAMOND_HAMMER.get());
        itemModel(itemModels, ModItems.EMERALD_HAMMER.get());
        itemModel(itemModels, ModItems.OBSIDIAN_HAMMER.get());
        itemModel(itemModels, ModItems.NETHERITE_HAMMER.get());
    }

    public void itemModel(ItemModelGenerators itemModels, Item item) {
        this.itemModel(itemModels, item, ModelTemplates.FLAT_ITEM);
    }

    public void itemModel(ItemModelGenerators itemModels, Item item, ModelTemplate template) {
        ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(item);
        ResourceLocation textureLoc = ResourceLocation.fromNamespaceAndPath(itemId.getNamespace(), "item/" + itemId.getPath());
        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.LAYER0, textureLoc);
        itemModels.itemModelOutput.accept(item, new BlockModelWrapper.Unbaked(template.create(item, textureMapping, itemModels.modelOutput), Collections.emptyList()));
    }
}
