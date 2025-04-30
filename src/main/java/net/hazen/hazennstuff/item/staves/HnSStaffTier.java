package net.hazen.hazennstuff.item.staves;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import io.redspace.ironsspellbooks.item.weapons.IronsWeaponTier;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class HnSStaffTier implements IronsWeaponTier {
    // Frieren Staff
    public static HnSStaffTier FRIEREN_STAFF = new HnSStaffTier(3, -3,
            new AttributeContainer(AttributeRegistry.CAST_TIME_REDUCTION, .15, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .15, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
            new AttributeContainer(AttributeRegistry.SPELL_POWER, .10, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    float damage;
    float speed;
    AttributeContainer[] attributeContainers;

    public HnSStaffTier(float damage, float speed, AttributeContainer... attributeContainers)
    {
        this.damage = damage;
        this.speed = speed;
        this.attributeContainers = attributeContainers;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public AttributeContainer[] getAdditionalAttributes() {
        return this.attributeContainers;
    }
}