package com.blocklegend001.onlyhammers.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;

public class DiamondHammer extends Hammer {
    public DiamondHammer(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings.maxDamage(8025));
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.getItem() == Items.DIAMOND;
    }

}
