package net.hazen.hazennstuff.util;

import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class HnSTags {
    public static class Blocks {
       public static final TagKey<Block> NEEDS_MITRHIL_TOOL = createTag("needs_mithril_tool");
       public static final TagKey<Block> INCORRECT_FOR_MITHRIL_TOOl = createTag("incorrect_for_mithril_tool");


        private static TagKey<Block> createTag (String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, name));
    }

    public static class Items {

        private static TagKey<Item> createTag (String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, name));
        }
    }
}
}
