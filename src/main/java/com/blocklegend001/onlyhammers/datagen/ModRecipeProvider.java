package com.blocklegend001.onlyhammers.datagen;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.ModItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.MultiRegistryBootstrap;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.Blocks;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider  {
    protected ModRecipeProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(recipeOutput, advancementOutput);
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
                .pattern("BCB")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('B', Blocks.STONE)
                .define('C', Blocks.COBBLESTONE)
                .unlockedBy(getHasName(Items.STONE), has(Items.COBBLESTONE))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.COPPER_HAMMER.get())
                .pattern("bBb")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('B', Items.COPPER_INGOT)
                .define('b', Blocks.COPPER_BLOCK.weathering().unaffected())
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
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
                .save(this.output, String.valueOf(Identifier.fromNamespaceAndPath(OnlyHammers.MOD_ID, "netherite_hammer")));
    }

    public static MultiRegistryBootstrap create() {
        return new MultiRegistryBootstrap() {
            @Override
            public Set<ResourceKey<? extends Registry<?>>> requestedRegistries() {
                return Set.of(Registries.RECIPE, Registries.ADVANCEMENT);
            }

            @Override
            public void run(MultiRegistryBootstrap.BootstrapGetter registries) {
                new ModRecipeProvider(registries.get(Registries.RECIPE), registries.get(Registries.ADVANCEMENT)).buildRecipes();
            }
        };
    }
}
