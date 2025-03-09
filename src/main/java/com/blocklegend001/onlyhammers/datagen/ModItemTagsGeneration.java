package com.blocklegend001.onlyhammers.datagen;

import com.blocklegend001.onlyhammers.item.ModItems;
import com.blocklegend001.onlyhammers.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsGeneration extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsGeneration(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataOutput, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.LAPIS_HAMMER)
                .add(ModItems.REDSTONE_HAMMER)
                .add(ModItems.OBSIDIAN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);

        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.LAPIS_HAMMER)
                .add(ModItems.REDSTONE_HAMMER)
                .add(ModItems.OBSIDIAN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);

        getOrCreateTagBuilder(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.LAPIS_HAMMER)
                .add(ModItems.REDSTONE_HAMMER)
                .add(ModItems.OBSIDIAN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.LAPIS_HAMMER)
                .add(ModItems.REDSTONE_HAMMER)
                .add(ModItems.OBSIDIAN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);

        getOrCreateTagBuilder(ModTags.Items.WOODEN_HAMMER).add(ModItems.WOODEN_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.STONE_HAMMER).add(ModItems.STONE_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.IRON_HAMMER).add(ModItems.IRON_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.GOLD_HAMMER).add(ModItems.GOLD_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.LAPIS_HAMMER).add(ModItems.LAPIS_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.REDSTONE_HAMMER).add(ModItems.REDSTONE_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.OBSIDIAN_HAMMER).add(ModItems.OBSIDIAN_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.DIAMOND_HAMMER).add(ModItems.DIAMOND_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.EMERALD_HAMMER).add(ModItems.EMERALD_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.NETHERITE_HAMMER).add(ModItems.NETHERITE_HAMMER);
    }
}
