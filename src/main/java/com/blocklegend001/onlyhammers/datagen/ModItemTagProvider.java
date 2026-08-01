package com.blocklegend001.onlyhammers.datagen;

import com.blocklegend001.onlyhammers.item.ModItems;
import com.blocklegend001.onlyhammers.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    private static List<ResourceKey<Item>> keys(Item... items) {
        return Arrays.stream(items)
                .map(item -> item.builtInRegistryHolder().key())
                .collect(Collectors.toList());
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(ItemTags.DURABILITY_ENCHANTABLE).addAll(keys(ModItems.WOODEN_HAMMER,
                ModItems.STONE_HAMMER,
                ModItems.COPPER_HAMMER,
                ModItems.IRON_HAMMER,
                ModItems.GOLD_HAMMER,
                ModItems.LAPIS_HAMMER,
                ModItems.REDSTONE_HAMMER,
                ModItems.OBSIDIAN_HAMMER,
                ModItems.DIAMOND_HAMMER,
                ModItems.EMERALD_HAMMER,
                ModItems.NETHERITE_HAMMER));

        builder(ItemTags.MINING_LOOT_ENCHANTABLE).addAll(keys(ModItems.WOODEN_HAMMER,
                ModItems.STONE_HAMMER,
                ModItems.COPPER_HAMMER,
                ModItems.IRON_HAMMER,
                ModItems.GOLD_HAMMER,
                ModItems.LAPIS_HAMMER,
                ModItems.REDSTONE_HAMMER,
                ModItems.OBSIDIAN_HAMMER,
                ModItems.DIAMOND_HAMMER,
                ModItems.EMERALD_HAMMER,
                ModItems.NETHERITE_HAMMER));

        builder(ItemTags.VANISHING_ENCHANTABLE).addAll(keys(ModItems.WOODEN_HAMMER,
                ModItems.STONE_HAMMER,
                ModItems.COPPER_HAMMER,
                ModItems.IRON_HAMMER,
                ModItems.GOLD_HAMMER,
                ModItems.LAPIS_HAMMER,
                ModItems.REDSTONE_HAMMER,
                ModItems.OBSIDIAN_HAMMER,
                ModItems.DIAMOND_HAMMER,
                ModItems.EMERALD_HAMMER,
                ModItems.NETHERITE_HAMMER));

        builder(ItemTags.MINING_ENCHANTABLE).addAll(keys(ModItems.WOODEN_HAMMER,
                ModItems.STONE_HAMMER,
                ModItems.COPPER_HAMMER,
                ModItems.IRON_HAMMER,
                ModItems.GOLD_HAMMER,
                ModItems.LAPIS_HAMMER,
                ModItems.REDSTONE_HAMMER,
                ModItems.OBSIDIAN_HAMMER,
                ModItems.DIAMOND_HAMMER,
                ModItems.EMERALD_HAMMER,
                ModItems.NETHERITE_HAMMER));

        builder(ItemTags.PICKAXES).addAll(keys(ModItems.WOODEN_HAMMER,
                ModItems.STONE_HAMMER,
                ModItems.COPPER_HAMMER,
                ModItems.IRON_HAMMER,
                ModItems.GOLD_HAMMER,
                ModItems.LAPIS_HAMMER,
                ModItems.REDSTONE_HAMMER,
                ModItems.OBSIDIAN_HAMMER,
                ModItems.DIAMOND_HAMMER,
                ModItems.EMERALD_HAMMER,
                ModItems.NETHERITE_HAMMER));

        builder(ItemTags.BREAKS_DECORATED_POTS).addAll(keys(ModItems.WOODEN_HAMMER,
                ModItems.STONE_HAMMER,
                ModItems.COPPER_HAMMER,
                ModItems.IRON_HAMMER,
                ModItems.GOLD_HAMMER,
                ModItems.LAPIS_HAMMER,
                ModItems.REDSTONE_HAMMER,
                ModItems.OBSIDIAN_HAMMER,
                ModItems.DIAMOND_HAMMER,
                ModItems.EMERALD_HAMMER,
                ModItems.NETHERITE_HAMMER));

        builder(ConventionalItemTags.TOOLS).addAll(keys(ModItems.WOODEN_HAMMER,
                ModItems.STONE_HAMMER,
                ModItems.COPPER_HAMMER,
                ModItems.IRON_HAMMER,
                ModItems.GOLD_HAMMER,
                ModItems.LAPIS_HAMMER,
                ModItems.REDSTONE_HAMMER,
                ModItems.OBSIDIAN_HAMMER,
                ModItems.DIAMOND_HAMMER,
                ModItems.EMERALD_HAMMER,
                ModItems.NETHERITE_HAMMER));

        builder(ConventionalItemTags.MINING_TOOL_TOOLS).addAll(keys(ModItems.WOODEN_HAMMER,
                ModItems.STONE_HAMMER,
                ModItems.COPPER_HAMMER,
                ModItems.IRON_HAMMER,
                ModItems.GOLD_HAMMER,
                ModItems.LAPIS_HAMMER,
                ModItems.REDSTONE_HAMMER,
                ModItems.OBSIDIAN_HAMMER,
                ModItems.DIAMOND_HAMMER,
                ModItems.EMERALD_HAMMER,
                ModItems.NETHERITE_HAMMER));

        builder(ModTags.Items.LAPIS_HAMMERS_REAPIRS).addAll(keys(Items.LAPIS_LAZULI));
        builder(ModTags.Items.REDSTONE_HAMMERS_REAPIRS).addAll(keys(Items.REDSTONE));
        builder(ModTags.Items.EMERALD_HAMMERS_REAPIRS).addAll(keys(Items.EMERALD));
        builder(ModTags.Items.OBSIDIAN_HAMMERS_REAPIRS).addAll(keys(Items.OBSIDIAN));

        builder(ModTags.Items.WOODEN_HAMMER).addAll(keys(ModItems.WOODEN_HAMMER));
        builder(ModTags.Items.STONE_HAMMER).addAll(keys(ModItems.STONE_HAMMER));
        builder(ModTags.Items.COPPER_HAMMER).addAll(keys(ModItems.COPPER_HAMMER));
        builder(ModTags.Items.IRON_HAMMER).addAll(keys(ModItems.IRON_HAMMER));
        builder(ModTags.Items.GOLD_HAMMER).addAll(keys(ModItems.GOLD_HAMMER));
        builder(ModTags.Items.LAPIS_HAMMER).addAll(keys(ModItems.LAPIS_HAMMER));
        builder(ModTags.Items.REDSTONE_HAMMER).addAll(keys(ModItems.REDSTONE_HAMMER));
        builder(ModTags.Items.OBSIDIAN_HAMMER).addAll(keys(ModItems.OBSIDIAN_HAMMER));
        builder(ModTags.Items.DIAMOND_HAMMER).addAll(keys(ModItems.DIAMOND_HAMMER));
        builder(ModTags.Items.EMERALD_HAMMER).addAll(keys(ModItems.EMERALD_HAMMER));
        builder(ModTags.Items.NETHERITE_HAMMER).addAll(keys(ModItems.NETHERITE_HAMMER));
    }
}
