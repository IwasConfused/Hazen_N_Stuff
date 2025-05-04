package net.hazen.hazennstuff.item.util;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.hazen.hazennstuff.util.HnSTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.SimpleTier;

public class HnSToolTier {
    public static final Tier MITHRIL = new SimpleTier(HnSTags.Blocks.INCORRECT_FOR_MITHRIL_TOOl,
            4042, 4f, 3f, 28, () -> Ingredient.of((ItemLike) ItemRegistry.MITHRIL_SCRAP));

}