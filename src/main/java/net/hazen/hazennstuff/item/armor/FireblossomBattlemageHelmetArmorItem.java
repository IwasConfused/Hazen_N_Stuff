package net.hazen.hazennstuff.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import mod.azure.azurelib.common.api.common.animatable.GeoItem;
import mod.azure.azurelib.common.internal.client.RenderProvider;
import mod.azure.azurelib.core.animatable.GeoAnimatable;
import net.hazen.hazennstuff.entity.render.armor.CreakingSorcererArmorRenderer;
import net.hazen.hazennstuff.entity.render.armor.CryogenicRulerArmorRenderer;
import net.hazen.hazennstuff.entity.render.armor.EnderDragonArmorRenderer;
import net.hazen.hazennstuff.entity.render.armor.FireblossomBattlemageHelmetArmorRenderer;
import net.hazen.hazennstuff.item.armor.HnSArmorMaterials;
import net.hazen.hazennstuff.item.armor.ImbuableHnSArmorItem;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class FireblossomBattlemageHelmetArmorItem extends ImbuableHnSArmorItem implements GeoAnimatable, GeoItem {
    public FireblossomBattlemageHelmetArmorItem(ArmorItem.Type type, Properties settings) {
        super(HnSArmorMaterials.FIREBLOSSOM_MATERIAL, type, settings,
                new AttributeContainer(AttributeRegistry.MAX_MANA, 150.0, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.NATURE_SPELL_POWER, .15, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.FIRE_SPELL_POWER, .15, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, .05, AttributeModifier.Operation.ADD_VALUE)
        );
    }

    @Override
    public void createRenderer(Consumer<RenderProvider> consumer) {
        consumer.accept(new RenderProvider() {
            private FireblossomBattlemageHelmetArmorRenderer renderer;

            @Override
            public HumanoidModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<LivingEntity> original) {
                if (renderer == null)
                {
                    renderer = new FireblossomBattlemageHelmetArmorRenderer();
                }
                renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }
}