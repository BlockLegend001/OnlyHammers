package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",
            new WoodenHammer(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F))));

    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new StoneHammer(ModToolMaterials.STONE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_HAMMER, 1, -3.3F))));

    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new IronHammer(ModToolMaterials.IRON_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_HAMMER, 1, -3.3F))));

    public static final Item GOLD_HAMMER = registerItem("gold_hammer",
            new GoldHammer(ModToolMaterials.GOLD_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GOLD_HAMMER, 1, -3.3F))));

    public static final Item LAPIS_HAMMER = registerItem("lapis_hammer",
            new LapisHammer(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F))));

    public static final Item REDSTONE_HAMMER = registerItem("redstone_hammer",
            new RedstoneHammer(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F))));

    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new DiamondHammer(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F))));

    public static final Item EMERALD_HAMMER = registerItem("emerald_hammer",
            new EmeraldHammer(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F))));

    public static final Item OBSIDIAN_HAMMER = registerItem("obsidian_hammer",
            new ObsidianHammer(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F))));

    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new NetheriteHammer(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OnlyHammers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OnlyHammers.LOGGER.debug("Registering Mod Items for " + OnlyHammers.MOD_ID);
    }
}