package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OnlyHammers.MOD_ID);

    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new Hammer(Tiers.WOOD, 1, -3.3F, new Item.Properties().durability(302).tab(ModCreativeModeTabs.ONLYHAMMERS)));
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new Hammer(Tiers.STONE, 1, -3.3F, new Item.Properties().durability(650).tab(ModCreativeModeTabs.ONLYHAMMERS)));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new Hammer(Tiers.IRON, 1, -3.3F, new Item.Properties().durability(1300).tab(ModCreativeModeTabs.ONLYHAMMERS)));
    public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register("gold_hammer",
            () -> new Hammer(Tiers.GOLD, 1, -3.3F, new Item.Properties().durability(750).tab(ModCreativeModeTabs.ONLYHAMMERS)));
    public static final RegistryObject<Item> LAPIS_HAMMER = ITEMS.register("lapis_hammer",
            () -> new LapisHammer(Tiers.IRON, 1, -3.3F, new Item.Properties().durability(1100).tab(ModCreativeModeTabs.ONLYHAMMERS)));
    public static final RegistryObject<Item> REDSTONE_HAMMER = ITEMS.register("redstone_hammer",
            () -> new RedstoneHammer(Tiers.IRON, 1, -3.3F, new Item.Properties().durability(1100).tab(ModCreativeModeTabs.ONLYHAMMERS)));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new Hammer(Tiers.DIAMOND, 1, -3.3F, new Item.Properties().durability(8025).tab(ModCreativeModeTabs.ONLYHAMMERS)));
    public static final RegistryObject<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer",
            () -> new EmeraldHammer(Tiers.NETHERITE, 1, -3.3F, new Item.Properties().durability(9768).tab(ModCreativeModeTabs.ONLYHAMMERS)));
    public static final RegistryObject<Item> OBSIDIAN_HAMMER = ITEMS.register("obsidian_hammer",
            () -> new ObsidianHammer(Tiers.DIAMOND, 1, -3.3F, new Item.Properties().durability(11200).fireResistant().tab(ModCreativeModeTabs.ONLYHAMMERS)));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new Hammer(Tiers.NETHERITE, 1, -3.3F, new Item.Properties().durability(13675).fireResistant().tab(ModCreativeModeTabs.ONLYHAMMERS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
