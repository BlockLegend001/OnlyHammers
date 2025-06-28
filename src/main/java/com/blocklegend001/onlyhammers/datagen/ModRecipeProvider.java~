package com.blocklegend001.onlyhammers.datagen;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements net.neoforged.neoforge.common.conditions.IConditionBuilder {
    protected ModRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
            super(output, providerCompletableFuture);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        shaped(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER.get())
                .pattern("BBB")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('B', ItemTags.LOGS)
                .unlockedBy(getHasName(Items.OAK_LOG), has(ItemTags.LOGS))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.STONE_HAMMER.get())
                .pattern("BBB")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('B', ItemTags.STONE_CRAFTING_MATERIALS)
                .unlockedBy(getHasName(Items.STONE), has(ItemTags.STONE_CRAFTING_MATERIALS))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.IRON_HAMMER.get())
                .pattern("bBb")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('B', Items.IRON_INGOT)
                .define('b', Blocks.IRON_BLOCK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.GOLD_HAMMER.get())
                .pattern("bBb")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('B', Items.GOLD_INGOT)
                .define('b', Blocks.GOLD_BLOCK)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.LAPIS_HAMMER.get())
                .pattern("bBb")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('B', Items.LAPIS_LAZULI)
                .define('b', Blocks.LAPIS_BLOCK)
                .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.REDSTONE_HAMMER.get())
                .pattern("bBb")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('B', Items.REDSTONE)
                .define('b', Blocks.REDSTONE_BLOCK)
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.DIAMOND_HAMMER.get())
                .pattern("bBb")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('B', Items.DIAMOND)
                .define('b', Blocks.DIAMOND_BLOCK)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.EMERALD_HAMMER.get())
                .pattern("bBb")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('B', Items.EMERALD)
                .define('b', Blocks.EMERALD_BLOCK)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_HAMMER.get())
                .pattern("BBB")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('B', Blocks.OBSIDIAN)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(this.output);

        SmithingTransformRecipeBuilder
                .smithing(
                        Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.DIAMOND_HAMMER.get()),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.NETHERITE_HAMMER.get()
                )
                .unlocks(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(this.output, String.valueOf(ResourceLocation.fromNamespaceAndPath(OnlyHammers.MOD_ID, "netherite_hammer")));
    }
}
