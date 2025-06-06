package net.hazen.hazennstuff.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.armor.IDisableHat;
import io.redspace.ironsspellbooks.item.armor.IDisableJacket;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.hazen.hazennstuff.registries.HnSEffects;
import net.hazen.hazennstuff.item.custom.HnSArmorDispatcher;
import net.hazen.hazennstuff.registries.HnSItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ChargedScourgeArmorItem extends ImbuableHnSArmorItem implements IDisableHat, IDisableJacket {
    // This is your class where you will setup the AzCommands/Animations you wish to play
    public final HnSArmorDispatcher dispatcher;

    public ChargedScourgeArmorItem(Type type, Properties settings) {
        super(HnSArmorMaterials.CHARGED_SCOURGE_MATERIAL, type, settings,
                new AttributeContainer(AttributeRegistry.MAX_MANA, 500.0, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, .25, AttributeModifier.Operation.ADD_VALUE)
        );
        // Create the instance of the class here to use later.
        this.dispatcher = new HnSArmorDispatcher();
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (!(entity instanceof Player player) || level.isClientSide) return;

        player.getArmorSlots().forEach(wornArmor -> {
            if (wornArmor != null && wornArmor.getItem() instanceof ArbitriumRobesArmorItem) {
                dispatcher.idle(player, wornArmor); // Always play idle animation
            }
        });

        // Armor effect logic
        if (isWearingFullSet(player) && !player.hasEffect(HnSEffects.ARBITER_EFFECT)) {
            player.addEffect(new MobEffectInstance(HnSEffects.ARBITER_EFFECT, 200, 0, false, false, false));
        }


        // Armor effect logic
        if (isWearingFullSet(player) && !player.hasEffect(HnSEffects.BURNING_POINT_EFFECT)) {
            player.addEffect(new MobEffectInstance(HnSEffects.BURNING_POINT_EFFECT, 200, 0, false, false, false));
        }
    }

    private void evaluateArmorEffects(Player player) {
        if (!player.hasEffect(HnSEffects.BURNING_POINT_EFFECT)) {
            player.addEffect(new MobEffectInstance(HnSEffects.BURNING_POINT_EFFECT, 200, 0, false, false, false));
        }
    }

    private boolean isWearingFullSet(Player player) {
        return player.getItemBySlot(ArmorItem.Type.HELMET.getSlot()).getItem() instanceof ChargedScourgeArmorItem &&
                player.getItemBySlot(ArmorItem.Type.CHESTPLATE.getSlot()).getItem() instanceof ChargedScourgeArmorItem &&
                player.getItemBySlot(ArmorItem.Type.LEGGINGS.getSlot()).getItem() instanceof ChargedScourgeArmorItem &&
                player.getItemBySlot(ArmorItem.Type.BOOTS.getSlot()).getItem() instanceof ChargedScourgeArmorItem;
    }
}