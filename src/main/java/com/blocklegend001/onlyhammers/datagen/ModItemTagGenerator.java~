package com.blocklegend001.onlyhammers.datagen;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.ModItems;
import com.blocklegend001.onlyhammers.utils.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                               CompletableFuture<TagLookup<Block>> tagLookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, tagLookupCompletableFuture, OnlyHammers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.WOODEN_HAMMERS).add(ModItems.WOODEN_HAMMER.get());
        tag(ModTags.Items.STONE_HAMMERS).add(ModItems.STONE_HAMMER.get());
        tag(ModTags.Items.IRON_HAMMERS).add(ModItems.IRON_HAMMER.get());
        tag(ModTags.Items.GOLD_HAMMERS).add(ModItems.GOLD_HAMMER.get());
        tag(ModTags.Items.LAPIS_HAMMERS).add(ModItems.LAPIS_HAMMER.get());
        tag(ModTags.Items.REDSTONE_HAMMERS).add(ModItems.REDSTONE_HAMMER.get());
        tag(ModTags.Items.DIAMOND_HAMMERS).add(ModItems.DIAMOND_HAMMER.get());
        tag(ModTags.Items.EMERALD_HAMMERS).add(ModItems.EMERALD_HAMMER.get());
        tag(ModTags.Items.OBSIDIAN_HAMMERS).add(ModItems.OBSIDIAN_HAMMER.get());
        tag(ModTags.Items.NETHERITE_HAMMERS).add(ModItems.NETHERITE_HAMMER.get());

        tag(ModTags.Items.LAPIS_HAMMERS_REAPIRS).add(Items.LAPIS_LAZULI);
        tag(ModTags.Items.REDSTONE_HAMMERS_REAPIRS).add(Items.REDSTONE);
        tag(ModTags.Items.EMERALD_HAMMERS_REAPIRS).add(Items.EMERALD);
        tag(ModTags.Items.OBSIDIAN_HAMMERS_REAPIRS).add(Items.OBSIDIAN);

        tag(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.get())
                .add(ModItems.STONE_HAMMER.get())
                .add(ModItems.IRON_HAMMER.get())
                .add(ModItems.GOLD_HAMMER.get())
                .add(ModItems.REDSTONE_HAMMER.get())
                .add(ModItems.LAPIS_HAMMER.get())
                .add(ModItems.DIAMOND_HAMMER.get())
                .add(ModItems.EMERALD_HAMMER.get())
                .add(ModItems.OBSIDIAN_HAMMER.get())
                .add(ModItems.NETHERITE_HAMMER.get());

        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.get())
                .add(ModItems.STONE_HAMMER.get())
                .add(ModItems.IRON_HAMMER.get())
                .add(ModItems.GOLD_HAMMER.get())
                .add(ModItems.REDSTONE_HAMMER.get())
                .add(ModItems.LAPIS_HAMMER.get())
                .add(ModItems.DIAMOND_HAMMER.get())
                .add(ModItems.EMERALD_HAMMER.get())
                .add(ModItems.OBSIDIAN_HAMMER.get())
                .add(ModItems.NETHERITE_HAMMER.get());

        tag(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.get())
                .add(ModItems.STONE_HAMMER.get())
                .add(ModItems.IRON_HAMMER.get())
                .add(ModItems.GOLD_HAMMER.get())
                .add(ModItems.REDSTONE_HAMMER.get())
                .add(ModItems.LAPIS_HAMMER.get())
                .add(ModItems.DIAMOND_HAMMER.get())
                .add(ModItems.EMERALD_HAMMER.get())
                .add(ModItems.OBSIDIAN_HAMMER.get())
                .add(ModItems.NETHERITE_HAMMER.get());

        tag(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.get())
                .add(ModItems.STONE_HAMMER.get())
                .add(ModItems.IRON_HAMMER.get())
                .add(ModItems.GOLD_HAMMER.get())
                .add(ModItems.REDSTONE_HAMMER.get())
                .add(ModItems.LAPIS_HAMMER.get())
                .add(ModItems.DIAMOND_HAMMER.get())
                .add(ModItems.EMERALD_HAMMER.get())
                .add(ModItems.OBSIDIAN_HAMMER.get())
                .add(ModItems.NETHERITE_HAMMER.get());
    }
}

