package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OnlyHammers.MOD_ID);

    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new Hammer(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F))));
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new Hammer(ModToolMaterials.STONE_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.STONE_HAMMER, 1, -3.3F))));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new Hammer(ModToolMaterials.IRON_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.IRON_HAMMER, 1, -3.3F))));
    public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register("gold_hammer",
            () -> new Hammer(ModToolMaterials.GOLD_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.GOLD_HAMMER, 1, -3.3F))));
    public static final RegistryObject<Item> LAPIS_HAMMER = ITEMS.register("lapis_hammer",
            () -> new LapisHammer(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F))));
    public static final RegistryObject<Item> REDSTONE_HAMMER = ITEMS.register("redstone_hammer",
            () -> new RedstoneHammer(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F))));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new Hammer(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F))));
    public static final RegistryObject<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer",
            () -> new EmeraldHammer(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F))));
    public static final RegistryObject<Item> OBSIDIAN_HAMMER = ITEMS.register("obsidian_hammer",
            () -> new ObsidianHammer(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F))));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new Hammer(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
