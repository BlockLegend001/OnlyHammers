package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",
            new WoodenHammer(ToolMaterials.STONE, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.STONE, 1, -3.3F))));

    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new StoneHammer(ToolMaterials.STONE, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.STONE, 1, -3.3F))));

    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new IronHammer(ToolMaterials.IRON, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.IRON, 1, -3.3F))));

    public static final Item GOLD_HAMMER = registerItem("gold_hammer",
            new GoldHammer(ToolMaterials.IRON, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.IRON, 1, -3.3F))));

    public static final Item LAPIS_HAMMER = registerItem("lapis_hammer",
            new LapisHammer(ToolMaterials.IRON, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.IRON, 1, -3.3F))));

    public static final Item REDSTONE_HAMMER = registerItem("redstone_hammer",
            new RedstoneHammer(ToolMaterials.IRON, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.IRON, 1, -3.3F))));

    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new DiamondHammer(ToolMaterials.DIAMOND, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 1, -3.3F))));

    public static final Item EMERALD_HAMMER = registerItem("emerald_hammer",
            new EmeraldHammer(ToolMaterials.NETHERITE, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1, -3.3F))));

    public static final Item OBSIDIAN_HAMMER = registerItem("obsidian_hammer",
            new ObsidianHammer(ToolMaterials.DIAMOND, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 1, -3.3F))));

    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new NetheriteHammer(ToolMaterials.NETHERITE, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1, -3.3F))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OnlyHammers.MOD_ID, name), item);
    }
    
    public static void registerModItems() {
        OnlyHammers.LOGGER.debug("Registering Mod Items for " + OnlyHammers.MOD_ID);
    }
}