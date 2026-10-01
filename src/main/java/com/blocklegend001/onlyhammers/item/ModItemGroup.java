package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {
    public static final CreativeModeTab ONLYHAMMERS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(OnlyHammers.MOD_ID, "onlyhammers"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITE_HAMMER))
                    .title(Component.translatable("itemGroup.onlyhammers.onlyhammers").withStyle(ChatFormatting.DARK_AQUA))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.WOODEN_HAMMER);
                        output.accept(ModItems.STONE_HAMMER);
                        output.accept(ModItems.COPPER_HAMMER);
                        output.accept(ModItems.IRON_HAMMER);
                        output.accept(ModItems.GOLD_HAMMER);
                        output.accept(ModItems.LAPIS_HAMMER);
                        output.accept(ModItems.REDSTONE_HAMMER);
                        output.accept(ModItems.DIAMOND_HAMMER);
                        output.accept(ModItems.EMERALD_HAMMER);
                        output.accept(ModItems.OBSIDIAN_HAMMER);
                        output.accept(ModItems.NETHERITE_HAMMER);
                    }).build());

    public static void registerItemGroups() {

    }
}