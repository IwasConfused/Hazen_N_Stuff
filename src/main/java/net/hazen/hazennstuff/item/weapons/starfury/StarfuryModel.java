package net.hazen.hazennstuff.item.weapons.starfury;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.weapons.starfury.StarfuryItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class StarfuryModel extends DefaultedItemGeoModel<StarfuryItem> {
    public StarfuryModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(StarfuryItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/starfury.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(StarfuryItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/item/weapons/starfury/starfury.png");
    }

    @Override
    public ResourceLocation getAnimationResource(StarfuryItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
