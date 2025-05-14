package net.hazen.hazennstuff.entity.armor.Geckolib;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.Geckolib.ArbitriumRobesGeckolibArmorItem;
import net.hazen.hazennstuff.item.armor.Geckolib.GeckolibChargedScourgeArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class ArbitriumRobesGeckolibArmorModel extends DefaultedEntityGeoModel<ArbitriumRobesGeckolibArmorItem> {
    public ArbitriumRobesGeckolibArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
    @Override
    public ResourceLocation getModelResource(ArbitriumRobesGeckolibArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/arbitrium_robes_geckolib.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArbitriumRobesGeckolibArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/geckolib/arbitrium_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ArbitriumRobesGeckolibArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "animations/arbitrium_robes_geckolib.animation.json");
    }
}
