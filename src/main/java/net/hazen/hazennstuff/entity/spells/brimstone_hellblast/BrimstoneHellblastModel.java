package net.hazen.hazennstuff.entity.spells.brimstone_hellblast;

import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BrimstoneHellblastModel extends GeoModel<BrimstoneHellblast> {

    @Override
    public ResourceLocation getModelResource(BrimstoneHellblast object) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/brimstone_hellblast.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BrimstoneHellblast object) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/spells/brimstone_hellblast/brimstone_hellblast_static.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BrimstoneHellblast object) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "animations/brimstone_hellblast.animation.json");
    }

}