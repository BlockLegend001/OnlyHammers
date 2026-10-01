package com.blocklegend001.onlyhammers.datagen;

import com.blocklegend001.onlyhammers.item.ModItems;
import com.blocklegend001.onlyhammers.utils.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends VanillaItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.WOODEN_HAMMERS).add(ModItems.WOODEN_HAMMER.getKey());
        tag(ModTags.Items.STONE_HAMMERS).add(ModItems.STONE_HAMMER.getKey());
        tag(ModTags.Items.COPPER_HAMMERS).add(ModItems.COPPER_HAMMER.getKey());
        tag(ModTags.Items.IRON_HAMMERS).add(ModItems.IRON_HAMMER.getKey());
        tag(ModTags.Items.GOLD_HAMMERS).add(ModItems.GOLD_HAMMER.getKey());
        tag(ModTags.Items.LAPIS_HAMMERS).add(ModItems.LAPIS_HAMMER.getKey());
        tag(ModTags.Items.REDSTONE_HAMMERS).add(ModItems.REDSTONE_HAMMER.getKey());
        tag(ModTags.Items.DIAMOND_HAMMERS).add(ModItems.DIAMOND_HAMMER.getKey());
        tag(ModTags.Items.EMERALD_HAMMERS).add(ModItems.EMERALD_HAMMER.getKey());
        tag(ModTags.Items.OBSIDIAN_HAMMERS).add(ModItems.OBSIDIAN_HAMMER.getKey());
        tag(ModTags.Items.NETHERITE_HAMMERS).add(ModItems.NETHERITE_HAMMER.getKey());

        tag(ModTags.Items.LAPIS_HAMMERS_REAPIRS).add(Items.LAPIS_LAZULI.builtInRegistryHolder().key());
        tag(ModTags.Items.REDSTONE_HAMMERS_REAPIRS).add(Items.REDSTONE.builtInRegistryHolder().key());
        tag(ModTags.Items.EMERALD_HAMMERS_REAPIRS).add(Items.EMERALD.builtInRegistryHolder().key());
        tag(ModTags.Items.OBSIDIAN_HAMMERS_REAPIRS).add(Items.OBSIDIAN.builtInRegistryHolder().key());

        tag(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey());

        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey());

        tag(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey());

        tag(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey());

        tag(ItemTags.PICKAXES).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey());

        tag(ItemTags.CLUSTER_MAX_HARVESTABLES).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey());

        tag(ItemTags.BREAKS_DECORATED_POTS).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey());

        tag(Tags.Items.TOOLS).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey());

        tag(Tags.Items.MINING_TOOL_TOOLS).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey());
    }
}

