package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",
            new Hammer(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammers.MOD_ID, "wooden_hammer")))));

    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new Hammer(ModToolMaterials.STONE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammers.MOD_ID, "stone_hammer")))));

    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new Hammer(ModToolMaterials.IRON_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammers.MOD_ID, "iron_hammer")))));

    public static final Item GOLD_HAMMER = registerItem("gold_hammer",
            new Hammer(ModToolMaterials.GOLD_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammers.MOD_ID, "gold_hammer")))));

    public static final Item LAPIS_HAMMER = registerItem("lapis_hammer",
            new Hammer(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammers.MOD_ID, "lapis_hammer")))));

    public static final Item REDSTONE_HAMMER = registerItem("redstone_hammer",
            new Hammer(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammers.MOD_ID, "redstone_hammer")))));

    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new Hammer(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammers.MOD_ID, "diamond_hammer")))));

    public static final Item EMERALD_HAMMER = registerItem("emerald_hammer",
            new Hammer(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammers.MOD_ID, "emerald_hammer")))));

    public static final Item OBSIDIAN_HAMMER = registerItem("obsidian_hammer",
            new Hammer(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammers.MOD_ID, "obsidian_hammer")))));

    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new Hammer(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammers.MOD_ID, "netherite_hammer")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OnlyHammers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OnlyHammers.LOGGER.debug("Registering Mod Items for " + OnlyHammers.MOD_ID);
    }
}