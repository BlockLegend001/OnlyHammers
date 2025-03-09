package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.blocklegend001.onlyhammers.OnlyHammers.MOD_ID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MOD_ID);

    public static final DeferredItem<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new Hammer(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F))));
    public static final DeferredItem<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new Hammer(ModToolMaterials.STONE_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.STONE_HAMMER, 1, -3.3F))));
    public static final DeferredItem<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new Hammer(ModToolMaterials.IRON_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.IRON_HAMMER, 1, -3.3F))));
    public static final DeferredItem<Item> GOLD_HAMMER = ITEMS.register("gold_hammer",
            () -> new Hammer(ModToolMaterials.GOLD_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.GOLD_HAMMER, 1, -3.3F))));
    public static final DeferredItem<Item> LAPIS_HAMMER = ITEMS.register("lapis_hammer",
            () -> new LapisHammer(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F))));
    public static final DeferredItem<Item> REDSTONE_HAMMER = ITEMS.register("redstone_hammer",
            () -> new RedstoneHammer(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F))));
    public static final DeferredItem<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new Hammer(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F))));
    public static final DeferredItem<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer",
            () -> new EmeraldHammer(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F))));
    public static final DeferredItem<Item> OBSIDIAN_HAMMER = ITEMS.register("obsidian_hammer",
            () -> new ObsidianHammer(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F))));
    public static final DeferredItem<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new Hammer(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
