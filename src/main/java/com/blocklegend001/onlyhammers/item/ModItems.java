package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.custom.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OnlyHammers.MOD_ID);

    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new Hammer(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyHammers.MOD_ID, "wooden_hammer")))));

    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new Hammer(ModToolMaterials.STONE_HAMMER, 1, -3.3F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyHammers.MOD_ID, "stone_hammer")))));

    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new Hammer(ModToolMaterials.IRON_HAMMER, 1, -3.3F, new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyHammers.MOD_ID, "iron_hammer")))));

    public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register("gold_hammer",
            () -> new Hammer(ModToolMaterials.GOLD_HAMMER, 1, -3.3F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyHammers.MOD_ID, "gold_hammer")))));

    public static final RegistryObject<Item> LAPIS_HAMMER = ITEMS.register("lapis_hammer",
            () -> new Hammer(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyHammers.MOD_ID, "lapis_hammer")))));

    public static final RegistryObject<Item> REDSTONE_HAMMER = ITEMS.register("redstone_hammer",
            () -> new Hammer(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyHammers.MOD_ID, "redstone_hammer")))));

    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new Hammer(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyHammers.MOD_ID, "diamond_hammer")))));

    public static final RegistryObject<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer",
            () -> new Hammer(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyHammers.MOD_ID, "emerald_hammer")))));

    public static final RegistryObject<Item> OBSIDIAN_HAMMER = ITEMS.register("obsidian_hammer",
            () -> new Hammer(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F, new Item.Properties().fireResistant()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyHammers.MOD_ID, "obsidian_hammer")))));

    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new Hammer(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F, new Item.Properties().fireResistant()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyHammers.MOD_ID, "netherite_hammer")))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
