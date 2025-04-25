package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.*;
import net.minecraft.resources.ResourceLocation;

public class FireblossomBattlemageHelmetArmorModel extends GeoModel<FireblossomBattlemageHelmetArmorItem> {
    @Override
    public ResourceLocation getModelResource(FireblossomBattlemageHelmetArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/fireblossom_battlemage_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireblossomBattlemageHelmetArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/fireblossom_battlemage_helmet_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FireblossomBattlemageHelmetArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "animations/fireblossom_battlemage_armor.animation.json");
    }
}