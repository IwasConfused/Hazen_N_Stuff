package net.hazen.hazennstuff.registries;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;

public class HnSEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, HazenNStuff.MOD_ID);

    public static final Holder<MobEffect> TYRANTS_GRACE_EFFECT = MOB_EFFECTS.register("tyrants_grace",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "tyrants_grace"), 1.0f,
                            AttributeModifier.Operation.ADD_VALUE)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "tyrants_grace"), 0.2f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.FIRE_SPELL_POWER,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "tyrants_grace"), 0.12f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.ATTACK_SPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "tyrants_grace"), 1.0f,
                            AttributeModifier.Operation.ADD_VALUE)
    );

    public static final Holder<MobEffect> CALL_OF_THE_GARDEN_EFFECT = MOB_EFFECTS.register("call_of_the_garden",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "call_of_the_garden"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "call_of_the_garden"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    public static final Holder<MobEffect> SERAPHS_MIGHT_EFFECT = MOB_EFFECTS.register("seraphs_might",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "seraphs_might"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "seraphs_might"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.SAFE_FALL_DISTANCE,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "seraphs_might"), 255f,
                            AttributeModifier.Operation.ADD_VALUE)
    );

    public static final Holder<MobEffect> SCOURGES_GORGE_EFFECT = MOB_EFFECTS.register("scourges_gorge",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "scourges_gorge"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "scourges_gorge"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    public static final Holder<MobEffect> BURNING_POINT_EFFECT = MOB_EFFECTS.register("burning_point",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "burning_point"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "burning_point"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(ALObjects.Attributes.FIRE_DAMAGE,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "burning_point"),1.0f,
                            AttributeModifier.Operation.ADD_VALUE)
    );

    public static final Holder<MobEffect> SADISTIC_NATURE_EFFECT = MOB_EFFECTS.register("sadistic_nature",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "sadistic_nature"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "sadistic_nature"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    public static final Holder<MobEffect> SUB_ZERO_EFFECT = MOB_EFFECTS.register("sub_zero",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "sub_zero"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "sub_zero"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(ALObjects.Attributes.COLD_DAMAGE,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "sub_zero"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    public static final Holder<MobEffect> BUTCHERS_VANITY_EFFECT = MOB_EFFECTS.register("butchers_vanity",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "butchers_vanity"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "butchers_vanity"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(ALObjects.Attributes.LIFE_STEAL,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "butchers_vanity"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    public static final Holder<MobEffect> GRAND_ENDER_DRAGON_EFFECT = MOB_EFFECTS.register("grand_ender_dragon",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "grand_ender_dragon"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "grand_ender_dragon"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(ALObjects.Attributes.ELYTRA_FLIGHT,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "grand_ender_dragon"), 1f,
                            AttributeModifier.Operation.ADD_VALUE)
    );

    public static final Holder<MobEffect> FIREBLOSSOM_EFFECT = MOB_EFFECTS.register("fireblossom",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "fireblossom"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "fireblossom"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final Holder<MobEffect> FIREBLOSSOM_WARRIOR_EFFECT = MOB_EFFECTS.register("fireblossom_warrior",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(Attributes.ARMOR,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "fireblossom_warrior"), 2f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.ARMOR_TOUGHNESS,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "fireblossom_warrior"), 2f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(ALObjects.Attributes.PROT_SHRED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "fireblossom_warrior"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final Holder<MobEffect> DISCERNING_THE_ELDRITCH_EFFECT = MOB_EFFECTS.register("discerning_the_eldritch",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "discerning_the_eldritch"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "discerning_the_eldritch"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    public static final Holder<MobEffect> ARBITER_EFFECT = MOB_EFFECTS.register("arbiter",
            () -> new HazensEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.CASTING_MOVESPEED,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "arbiter"), 0.15f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "arbiter"), 0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }

}
