package net.hazen.hazennstuff.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.armor.IDisableJacket;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.hazen.hazennstuff.registries.HnSEffects;
import net.hazen.hazennstuff.item.custom.HnSArmorDispatcher;
import net.hazen.hazennstuff.registries.HnSItems;
import net.hazen.hazennstuff.registries.HnSTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ElytraItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class ArbitriumRobesArmorItem extends ImbuableHnSArmorItem implements IDisableJacket {
    // This is your class where you will setup the AzCommands/Animations you wish to play
    public final HnSArmorDispatcher dispatcher;

    public ArbitriumRobesArmorItem(Type type, Properties settings) {
        super(HnSArmorMaterials.ARBITER_MATERIAL, type, settings,
                new AttributeContainer(AttributeRegistry.MAX_MANA, 500.0, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, .25, AttributeModifier.Operation.ADD_VALUE)
        );
        // Create the instance of the class here to use later.
        this.dispatcher = new HnSArmorDispatcher();
    }


    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (!(entity instanceof Player player) || level.isClientSide) return;

        boolean isFlying = player.isFallFlying();

        player.getArmorSlots().forEach(wornArmor -> {
            if (wornArmor != null && wornArmor.getItem() instanceof ArbitriumRobesArmorItem) {
                if (isFlying) {
                    dispatcher.flight(player, wornArmor);  // Play flight animation
                } else {
                    dispatcher.idle(player, wornArmor);   // Play idle animation
                }
            }
        });

        // Armor effect logic
        if (isWearingFullSet(player) && !player.hasEffect(HnSEffects.ARBITER_EFFECT)) {
            player.addEffect(new MobEffectInstance(HnSEffects.ARBITER_EFFECT, 200, 0, false, false, false));
        }
    }

    private void evaluateArmorEffects(Player player) {
        if (!player.hasEffect(HnSEffects.ARBITER_EFFECT)) {
            player.addEffect(new MobEffectInstance(HnSEffects.ARBITER_EFFECT, 200, 0, false, false, false));
        }
    }

    private boolean isWearingFullSet(Player player) {
        return player.getItemBySlot(ArmorItem.Type.HELMET.getSlot()).getItem() instanceof ArbitriumRobesArmorItem &&
                player.getItemBySlot(ArmorItem.Type.CHESTPLATE.getSlot()).getItem() instanceof ArbitriumRobesArmorItem &&
                player.getItemBySlot(ArmorItem.Type.LEGGINGS.getSlot()).getItem() instanceof ArbitriumRobesArmorItem &&
                player.getItemBySlot(ArmorItem.Type.BOOTS.getSlot()).getItem() instanceof ArbitriumRobesArmorItem;
    }

    //@Override
    //public boolean elytraFlightTick(ItemStack stack, LivingEntity entity, int flightTicks) {
        //if (!entity.level().isClientSide && entity instanceof Player player )
        //{
                //player.getArmorSlots().forEach(wornArmor -> {
                    // Doing this through tags rather than listing everything in an or condition
                    //if (wornArmor != null && wornArmor.is(HnSTags.ARMORS_FOR_IDLE)) {
                        //dispatcher.idle(player, wornArmor);
                    //}
                    //if (wornArmor != null && wornArmor.is(HnSTags.ARMORS_FOR_FLIGHT) && player.isFallFlying()) {
                        //dispatcher.flight(player, wornArmor);
                    //}
                //});
       // }
       // return true;
    //}

    //   if (!level.isClientSide && entity instanceof Player player ) {

    @Override
    public boolean canElytraFly(ItemStack stack, LivingEntity entity) {
        return true;
    }

    @Override
    public boolean elytraFlightTick(ItemStack stack, LivingEntity entity, int flightTicks) {
        return true; // Needed to allow flight ticking
    }
}