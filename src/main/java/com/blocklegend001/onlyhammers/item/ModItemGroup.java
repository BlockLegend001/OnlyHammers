package com.blocklegend001.onlyhammers.item;

import com.blocklegend001.onlyhammers.OnlyHammers;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup ONLYHAMMERS;

    public static void registerItemGroup() {
        ONLYHAMMERS = FabricItemGroup
                .builder(new Identifier(OnlyHammers.MOD_ID, "onlyhammers"))
                .displayName(Text.translatable("itemGroup.onlyhammers.onlyhammers"))
                .icon(() -> new ItemStack(ModItems.NETHERITE_HAMMER))
                .build();
    }
}