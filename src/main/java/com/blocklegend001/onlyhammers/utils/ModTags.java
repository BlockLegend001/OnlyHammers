package com.blocklegend001.onlyhammers.utils;

import com.blocklegend001.onlyhammers.OnlyHammers;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {

        public static final TagKey<Item> WOODEN_HAMMER = createTag("wooden_hammer");
        public static final TagKey<Item> STONE_HAMMER = createTag("stone_hammer");
        public static final TagKey<Item> IRON_HAMMER = createTag("iron_hammer");
        public static final TagKey<Item> GOLD_HAMMER = createTag("gold_hammer");
        public static final TagKey<Item> LAPIS_HAMMER = createTag("lapis_hammer");
        public static final TagKey<Item> REDSTONE_HAMMER = createTag("redstone_hammer");
        public static final TagKey<Item> OBSIDIAN_HAMMER = createTag("obsidian_hammer");
        public static final TagKey<Item> DIAMOND_HAMMER = createTag("diamond_hammer");
        public static final TagKey<Item> EMERALD_HAMMER = createTag("emerald_hammer");
        public static final TagKey<Item> NETHERITE_HAMMER = createTag("netherite_hammer");

        public static final TagKey<Item> LAPIS_HAMMERS_REAPIRS = createTag("lapis_hammers_reapirs");
        public static final TagKey<Item> REDSTONE_HAMMERS_REAPIRS = createTag("redstone_hammers_reapirs");
        public static final TagKey<Item> EMERALD_HAMMERS_REAPIRS = createTag("emerald_hammers_reapirs");
        public static final TagKey<Item> OBSIDIAN_HAMMERS_REAPIRS = createTag("obsidian_hammers_reapirs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammers.MOD_ID, name));
        }
    }
}
