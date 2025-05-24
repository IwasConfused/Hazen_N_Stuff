package net.hazen.hazennstuff.entity.spells.animators;

import mod.azure.azurelib.rewrite.animation.controller.AzAnimationController;
import mod.azure.azurelib.rewrite.animation.controller.AzAnimationControllerContainer;
import mod.azure.azurelib.rewrite.animation.impl.AzEntityAnimator;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.entity.spells.brimstone_hellblast.BrimstoneHellblast;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class BrimstoneHellblastAnimator extends AzEntityAnimator<BrimstoneHellblast> {
    private static final ResourceLocation ANIMATIONS = ResourceLocation.fromNamespaceAndPath(
            HazenNStuff.MOD_ID,
            "animations/brimstone_hellblast.animation.json"
    );

    @Override
    public void registerControllers(AzAnimationControllerContainer<BrimstoneHellblast> animationControllerContainer) {
        animationControllerContainer.add(
                AzAnimationController.builder(this, "base_controller")
                        .build()
        );
    }

    @Override
    public @NotNull ResourceLocation getAnimationLocation(BrimstoneHellblast animatable) {
        return ANIMATIONS;
    }
}
