package net.hazen.hazennstuff.spells;

import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.spells.ender.ChaoticTeleportSpell;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static io.redspace.ironsspellbooks.api.registry.SpellRegistry.SPELL_REGISTRY_KEY;

public class SpellRegistries {
    public static final DeferredRegister<AbstractSpell> SPELLS = DeferredRegister.create(SPELL_REGISTRY_KEY, HazenNStuff.MOD_ID);

    public static Supplier<AbstractSpell> registerSpell(AbstractSpell spell) {
        return SPELLS.register(spell.getSpellName(), () -> spell);
    }

    /***
     * Ender Spells
     */

  //Chaotic Teleport
    public static final Supplier<AbstractSpell> CHAOTIC_TELEPORT = registerSpell(new ChaoticTeleportSpell());


    public static void register(IEventBus eventBus)
    {
        SPELLS.register(eventBus);
    }
}