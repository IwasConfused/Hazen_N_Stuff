package net.hazen.hazennstuff.item.weapons;

import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;

public interface HazensWeaponTier {
    float getAttackDamageBonus();

    float getSpeed();

    AttributeContainer[] getAdditionalAttributes();
}