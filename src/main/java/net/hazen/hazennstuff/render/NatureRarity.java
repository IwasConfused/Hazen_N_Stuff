package net.hazen.hazennstuff.render;

import net.minecraft.world.item.Rarity;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;
import net.minecraft.network.chat.Style;

import java.util.function.UnaryOperator;

public class NatureRarity {
    public static final EnumProxy<Rarity> NATURE_RARITY_PROXY = new EnumProxy<>(Rarity.class,
            -1,
            "hazennstuff:nature",
            (UnaryOperator<Style>) ((style) -> style.withColor(0x30a11a))
    );
}