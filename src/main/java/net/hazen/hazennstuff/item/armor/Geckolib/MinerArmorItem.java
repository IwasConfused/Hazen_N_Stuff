package net.hazen.hazennstuff.item.armor.Geckolib;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import io.redspace.ironsspellbooks.registries.ArmorMaterialRegistry;
import net.hazen.hazennstuff.effect.HnSEffects;
import net.hazen.hazennstuff.entity.armor.Geckolib.GeckolibSupremeWitchArmorModel;
import net.hazen.hazennstuff.entity.armor.Geckolib.GeckolibSynthesizerVArmorModel;
import net.hazen.hazennstuff.entity.armor.Geckolib.GeckolibUtauArmorModel;
import net.hazen.hazennstuff.entity.armor.Geckolib.MinerArmorModel;
import net.hazen.hazennstuff.item.armor.HnSArmorMaterials;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MinerArmorItem extends ImbuableGeckolibHnSArmorItem {
    public MinerArmorItem(Type type, Properties settings) {
        // Add in your armor tier + additional attributes for your item
        super(ArmorMaterials.DIAMOND, type, settings,
                new AttributeContainer(Attributes.MINING_EFFICIENCY, 0.05, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(Attributes.SUBMERGED_MINING_SPEED, 0.05, AttributeModifier.Operation.ADD_VALUE)
        );
    }

    // Just supply the armor model here; you don't have to worry about making a new renderer
    // ISS already has a custom renderer used for armor models
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new MinerArmorModel());
    }
}
