package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import com.blocklegend001.onlyhammers.item.custom.Hammer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",
            properties -> new Hammer(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F, properties));

    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            properties -> new Hammer(ModToolMaterials.STONE_HAMMER, 1, -3.3F, properties));

    public static final Item COPPER_HAMMER = registerItem("copper_hammer",
            properties -> new Hammer(ModToolMaterials.COPPER_HAMMER, 1, -3.3F, properties));

    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            properties -> new Hammer(ModToolMaterials.IRON_HAMMER, 1, -3.3F, properties));

    public static final Item GOLD_HAMMER = registerItem("gold_hammer",
            properties -> new Hammer(ModToolMaterials.GOLD_HAMMER, 1, -3.3F, properties));

    public static final Item LAPIS_HAMMER = registerItem("lapis_hammer",
            properties -> new Hammer(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F, properties));

    public static final Item REDSTONE_HAMMER = registerItem("redstone_hammer",
            properties -> new Hammer(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F, properties));

    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            properties -> new Hammer(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F, properties));

    public static final Item EMERALD_HAMMER = registerItem("emerald_hammer",
            properties -> new Hammer(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F, properties));

    public static final Item OBSIDIAN_HAMMER = registerItem("obsidian_hammer",
            properties -> new Hammer(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F, properties.fireResistant()));

    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            properties -> new Hammer(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F, properties.fireResistant()));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(OnlyHammers.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyHammers.MOD_ID, name)))));
    }

    public static void registerModItems() {
        OnlyHammers.LOGGER.debug("Registering Mod Items for " + OnlyHammers.MOD_ID);
    }
}