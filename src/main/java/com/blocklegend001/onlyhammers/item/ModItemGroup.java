package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup ONLYHAMMERS = Registry.register(Registries.ITEM_GROUP, Identifier.of(OnlyHammers.MOD_ID, "onlyhammers"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.onlyhammers.onlyhammers"))
                    .icon(() -> new ItemStack(ModItems.NETHERITE_HAMMER)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.WOODEN_HAMMER);
                        entries.add(ModItems.STONE_HAMMER);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.GOLD_HAMMER);
                        entries.add(ModItems.LAPIS_HAMMER);
                        entries.add(ModItems.REDSTONE_HAMMER);
                        entries.add(ModItems.DIAMOND_HAMMER);
                        entries.add(ModItems.EMERALD_HAMMER);
                        entries.add(ModItems.OBSIDIAN_HAMMER);
                        entries.add(ModItems.NETHERITE_HAMMER);
                    }))
                    .build());

    public static void registerItemGroups() {

    }
}