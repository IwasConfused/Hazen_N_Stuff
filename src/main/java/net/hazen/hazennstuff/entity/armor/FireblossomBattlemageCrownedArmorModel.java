package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.*;
import net.minecraft.resources.ResourceLocation;

public class FireblossomBattlemageCrownedArmorModel extends GeoModel<FireblossomBattlemageCrownedArmorItem> {
    @Override
    public ResourceLocation getModelResource(FireblossomBattlemageCrownedArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/fireblossom_battlemage_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireblossomBattlemageCrownedArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/fireblossom_battlemage_crowned_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FireblossomBattlemageCrownedArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "animations/fireblossom_battlemage_armor.animation.json");
    }
}