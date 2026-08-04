package com.blocklegend001.onlyhammers.datagen;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider  {

    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                        .pattern("BBB")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('S', Items.STICK)
                        .define('B', ItemTags.LOGS)
                        .unlockedBy("has_logs", has(Items.OAK_LOG))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.STONE_HAMMER)
                        .pattern("BCB")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('S', Items.STICK)
                        .define('B', Blocks.STONE)
                        .define('C', Blocks.COBBLESTONE)
                        .unlockedBy("has_stone", has(Items.COBBLESTONE))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.COPPER_HAMMER)
                        .pattern("bBb")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('S', Items.STICK)
                        .define('B', Items.COPPER_INGOT)
                        .define('b', Blocks.COPPER_BLOCK.weathering().unaffected())
                        .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.IRON_HAMMER)
                        .pattern("bBb")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('S', Items.STICK)
                        .define('B', Items.IRON_INGOT)
                        .define('b', Blocks.IRON_BLOCK)
                        .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.GOLD_HAMMER)
                        .pattern("bBb")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('S', Items.STICK)
                        .define('B', Items.GOLD_INGOT)
                        .define('b', Blocks.GOLD_BLOCK)
                        .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.LAPIS_HAMMER)
                        .pattern("bBb")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('S', Items.STICK)
                        .define('B', Items.LAPIS_LAZULI)
                        .define('b', Blocks.LAPIS_BLOCK)
                        .unlockedBy("has_lapis_lazuli", has(Items.LAPIS_LAZULI))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.REDSTONE_HAMMER)
                        .pattern("bBb")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('S', Items.STICK)
                        .define('B', Items.REDSTONE)
                        .define('b', Blocks.REDSTONE_BLOCK)
                        .unlockedBy("has_redstone", has(Items.REDSTONE))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.DIAMOND_HAMMER)
                        .pattern("bBb")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('S', Items.STICK)
                        .define('B', Items.DIAMOND)
                        .define('b', Blocks.DIAMOND_BLOCK)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.EMERALD_HAMMER)
                        .pattern("bBb")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('S', Items.STICK)
                        .define('B', Items.EMERALD)
                        .define('b', Blocks.EMERALD_BLOCK)
                        .unlockedBy("has_emerald", has(Items.EMERALD))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_HAMMER)
                        .pattern("BBB")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('S', Items.STICK)
                        .define('B', Blocks.OBSIDIAN)
                        .unlockedBy("has_obsidian", has(Items.OBSIDIAN))
                        .save(output);


                SmithingTransformRecipeBuilder
                        .smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(ModItems.DIAMOND_HAMMER),
                                Ingredient.of(Items.NETHERITE_INGOT),
                                RecipeCategory.TOOLS,
                                ModItems.NETHERITE_HAMMER
                        )
                        .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                        .save(output, String.valueOf(Identifier.fromNamespaceAndPath(OnlyHammers.MOD_ID, "netherite_hammer")));

            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
