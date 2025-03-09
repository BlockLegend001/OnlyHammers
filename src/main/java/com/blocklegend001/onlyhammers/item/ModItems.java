package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",
            new WoodenHammer(ToolMaterials.STONE, 1, -3.3F,
                    new FabricItemSettings().maxCount(1)));

    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new StoneHammer(ToolMaterials.STONE, 1, -3.3F,
                    new FabricItemSettings().maxCount(1)));

    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new IronHammer(ToolMaterials.IRON, 1, -3.3F,
                    new FabricItemSettings().maxCount(1)));

    public static final Item GOLD_HAMMER = registerItem("gold_hammer",
            new GoldHammer(ToolMaterials.IRON, 1, -3.3F,
                    new FabricItemSettings().maxCount(1)));

    public static final Item LAPIS_HAMMER = registerItem("lapis_hammer",
            new LapisHammer(ToolMaterials.IRON, 1, -3.3F,
                    new FabricItemSettings().maxCount(1)));

    public static final Item REDSTONE_HAMMER = registerItem("redstone_hammer",
            new RedstoneHammer(ToolMaterials.IRON, 1, -3.3F,
                    new FabricItemSettings().maxCount(1)));

    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new DiamondHammer(ToolMaterials.DIAMOND, 1, -3.3F,
                    new FabricItemSettings().maxCount(1)));

    public static final Item EMERALD_HAMMER = registerItem("emerald_hammer",
            new EmeraldHammer(ToolMaterials.NETHERITE, 1, -3.3F,
                    new FabricItemSettings().maxCount(1)));

    public static final Item OBSIDIAN_HAMMER = registerItem("obsidian_hammer",
            new ObsidianHammer(ToolMaterials.DIAMOND, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).fireproof()));

    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new NetheriteHammer(ToolMaterials.NETHERITE, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OnlyHammers.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.ONLYHAMMERS, WOODEN_HAMMER);
        addToItemGroup(ModItemGroup.ONLYHAMMERS, STONE_HAMMER);
        addToItemGroup(ModItemGroup.ONLYHAMMERS, IRON_HAMMER);
        addToItemGroup(ModItemGroup.ONLYHAMMERS, GOLD_HAMMER);
        addToItemGroup(ModItemGroup.ONLYHAMMERS, LAPIS_HAMMER);
        addToItemGroup(ModItemGroup.ONLYHAMMERS, REDSTONE_HAMMER);
        addToItemGroup(ModItemGroup.ONLYHAMMERS, DIAMOND_HAMMER);
        addToItemGroup(ModItemGroup.ONLYHAMMERS, EMERALD_HAMMER);
        addToItemGroup(ModItemGroup.ONLYHAMMERS, OBSIDIAN_HAMMER);
        addToItemGroup(ModItemGroup.ONLYHAMMERS, NETHERITE_HAMMER);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    
    public static void registerModItems() {
        OnlyHammers.LOGGER.debug("Registering Mod Items for " + OnlyHammers.MOD_ID);

        addItemsToItemGroup();
    }
}