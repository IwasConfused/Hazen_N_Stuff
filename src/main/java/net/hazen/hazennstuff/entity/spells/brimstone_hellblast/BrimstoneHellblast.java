package net.hazen.hazennstuff.entity.spells.brimstone_hellblast;

import com.mojang.blaze3d.vertex.VertexConsumer;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.capabilities.magic.MagicManager;
import io.redspace.ironsspellbooks.damage.DamageSources;
import io.redspace.ironsspellbooks.entity.spells.AbstractMagicProjectile;
import net.hazen.hazennstuff.registries.HnSEntityRegistry;
import net.hazen.hazennstuff.registries.SpellRegistries;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.Optional;

public class BrimstoneHellblast extends AbstractMagicProjectile implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public BrimstoneHellblast(EntityType<? extends Projectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.setNoGravity(true);
    }

    public BrimstoneHellblast(Level level, LivingEntity shooter)
    {
        this(HnSEntityRegistry.BRIMSTONE_HELLBLAST.get(), level);
        setOwner(shooter);
    }

    @Override
    public void trailParticles() {
        for (int i = 0; i < 1; i++) {
            double speed = .05;
            double dx = Utils.random.nextDouble() * 2 * speed - speed;
            double dy = Utils.random.nextDouble() * 2 * speed - speed;
            double dz = Utils.random.nextDouble() * 2 * speed - speed;
            level().addParticle(Utils.random.nextDouble() < .3 ? ParticleTypes.CAMPFIRE_SIGNAL_SMOKE : ParticleTypes.FLAME, this.getX() + dx, this.getY() + dy, this.getZ() + dz, dx, dy, dz);
        }
    }

    @Override
    public void impactParticles(double x, double y, double z) {
        MagicManager.spawnParticles(this.level(), ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 5, .1, .1, .1, .25, true);
    }

    @Override
    public float getSpeed() {
        return 1.2f;
    }

    @Override
    public Optional<Holder<SoundEvent>> getImpactSound() {
        return Optional.of(SoundEvents.GENERIC_EXPLODE);
    }

    @Override
    protected void doImpactSound(Holder<SoundEvent> sound) {
        level().playSound(null, getX(), getY(), getZ(), sound, SoundSource.NEUTRAL, 1.5f, 1.0f);
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        var target = pResult.getEntity();

        // Deal damage
        DamageSources.applyDamage(target, damage,
                SpellRegistries.BRIMSTONE_HELLBLAST.get().getDamageSource(this, getOwner()));

        // Explosion (no block destruction, no fire)
        level().explode(this, this.getX(), this.getY(), this.getZ(), 2.0f, false, Level.ExplosionInteraction.NONE);

        discard(); // Remove the projectile
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        super.onHitBlock(pResult);

        // Explosion on block hit
        level().explode(this, this.getX(), this.getY(), this.getZ(), 2.0f, false, Level.ExplosionInteraction.NONE);

        discard();
    }

    //ANIMATION
    private final RawAnimation idle = RawAnimation.begin().thenLoop("animation.brimstone_hellblast.idle");

    private PlayState predicate(software.bernie.geckolib.animation.AnimationState event) {
        event.getController().setAnimation(idle);
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<GeoAnimatable>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}