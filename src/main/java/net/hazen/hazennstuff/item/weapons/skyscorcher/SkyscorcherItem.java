package net.hazen.hazennstuff.item.weapons.skyscorcher;

import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.hazen.hazennstuff.entity.render.item.weapons.IcePikeRenderer;
import net.hazen.hazennstuff.entity.render.item.weapons.SkyscorcherRenderer;
import net.hazen.hazennstuff.item.weapons.HNSExtendedWeaponsTiers;
import net.hazen.hazennstuff.render.ElectricRarity;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.MaceItem;
import net.minecraft.world.item.Rarity;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public class SkyscorcherItem extends MagicSwordItem implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public SkyscorcherItem() {
        super(
                HNSExtendedWeaponsTiers.SKYSCORCHER,
                ItemPropertiesHelper
                        .equipment(1)
                        .fireResistant()
                        .rarity(ElectricRarity.ELECTRIC_RARITY_PROXY.getValue())
                        .attributes(ExtendedSwordItem.createAttributes(HNSExtendedWeaponsTiers.SKYSCORCHER))
                        .component(DataComponents.TOOL, MaceItem.createToolProperties()),
                SpellDataRegistryHolder.of(
                        new SpellDataRegistryHolder(SpellRegistry.ASCENSION_SPELL, 10))
        );
    }


    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        //controllerRegistrar.add(animationController);
    }

    // Animations and stuff
    private static final RawAnimation IDLE_ANIMATION = RawAnimation.begin().thenLoop("idle");

    private final AnimationController<SkyscorcherItem> animationController = new AnimationController<>(this, "controller", 0, this::predicate);

    // Make your animations in this predicate
    private PlayState predicate(AnimationState<SkyscorcherItem> event)
    {
        event.getController().setAnimation(IDLE_ANIMATION);

        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    // Your renderer for items
    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private SkyscorcherRenderer renderer;

            @Override
            public BlockEntityWithoutLevelRenderer getGeoItemRenderer() {
                if (this.renderer == null)
                    this.renderer = new SkyscorcherRenderer();

                return this.renderer;
            }
        });
    }
}
