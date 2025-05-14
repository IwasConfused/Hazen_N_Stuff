package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.ArbitriumRobesArmorItem;
import net.hazen.hazennstuff.item.armor.ChargedScourgeArmorItem;
import net.hazen.hazennstuff.item.armor.CreakingSorcererArmorItem;
import net.minecraft.resources.ResourceLocation;

public class ArbitriumRobesArmorModel extends GeoModel<ArbitriumRobesArmorItem> {
    @Override
    public ResourceLocation getModelResource(ArbitriumRobesArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/arbitrium_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArbitriumRobesArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/arbitrium_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ArbitriumRobesArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "animations/arbitrium_robes.animation.json");
    }
}