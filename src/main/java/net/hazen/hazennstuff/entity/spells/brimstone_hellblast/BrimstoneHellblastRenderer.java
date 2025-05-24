package net.hazen.hazennstuff.entity.spells.brimstone_hellblast;

import mod.azure.azurelib.rewrite.render.entity.AzEntityRenderer;
import mod.azure.azurelib.rewrite.render.entity.AzEntityRendererConfig;
import mod.azure.azurelib.rewrite.render.layer.AzAutoGlowingLayer;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.entity.spells.animators.BrimstoneHellblastAnimator;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class BrimstoneHellblastRenderer extends AzEntityRenderer<BrimstoneHellblast> {
    private static final ResourceLocation GEO = ResourceLocation.fromNamespaceAndPath(
            HazenNStuff.MOD_ID,
            "geo/entity/brimstone_hellblast.geo.json"
    );

    private static final ResourceLocation TEX = ResourceLocation.fromNamespaceAndPath(
            HazenNStuff.MOD_ID,
            "textures/spells/brimstone_hellblast/brimstone_hellblast_static.png"
    );

    public BrimstoneHellblastRenderer(EntityRendererProvider.Context context) {
        super(
                AzEntityRendererConfig.<BrimstoneHellblast>builder(GEO, TEX)
                        .addRenderLayer(new AzAutoGlowingLayer<>())
                        .setAnimatorProvider(BrimstoneHellblastAnimator::new)
                .build(), context
        );
    }
}