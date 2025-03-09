package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ONLYHAMMERS = FabricItemGroupBuilder.build(
            new Identifier(OnlyHammers.MOD_ID, "onlyhammers"), () -> new ItemStack(ModItems.NETHERITE_HAMMER));
}
