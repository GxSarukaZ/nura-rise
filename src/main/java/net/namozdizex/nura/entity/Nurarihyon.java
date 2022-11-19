package net.namozdizex.nura.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.namozdizex.nura.registry.NRItems;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class Nurarihyon extends Mob {
    private static final int ATTACK_DAMAGE = 50 ;
    private static final int MAX_HEALTH = 2500;
    private static final int KNOCKBACK_RESISTANCE = 5;
    private static final int DARKNESS_DISPLAY_LIMIT = 200;
    private static final int DARKNESS_DURATION = 260;
    private static final int DARKNESS_RADIUS = 20;
    private static final int DARKNESS_INTERVAL = 120;

    public Nurarihyon(EntityType<? extends Mob> entityType, Level level) {
        super(entityType, level);
        this.xpReward = 25;
        this.getNavigation().setCanFloat(true);
        this.setPathfindingMalus(BlockPathTypes.UNPASSABLE_RAIL, 0.0F);
        this.setPathfindingMalus(BlockPathTypes.DAMAGE_OTHER, 8.0F);
        this.setPathfindingMalus(BlockPathTypes.POWDER_SNOW, 8.0F);
    }

    public static int getDarknessInterval() {
        return DARKNESS_INTERVAL;
    }

    public static int getDarknessRadius() {
        return DARKNESS_RADIUS;
    }

    public static int getDarknessDuration() {
        return DARKNESS_DURATION;
    }

    public static int getDarknessDisplayLimit() {
        return DARKNESS_DISPLAY_LIMIT;
    }

    public static int getAttackDamage() {
        return ATTACK_DAMAGE;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ALLAY_DEATH;
    }
    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.WARDEN_DEATH;
    }

    public static int getKnockbackResistance() {
        return KNOCKBACK_RESISTANCE;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.WARDEN_HURT;
    }

    protected void populateDefaultEquipmentSlots(RandomSource randomSource, DifficultyInstance difficultyInstance) {
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(NRItems.NENEKIRIMARU));
    }
    protected float getStandingEyeHeight(Pose pose, EntityDimensions entityDimensions) {
        return 2.1F;
    }

    public boolean canBeAffected(MobEffectInstance mobEffectInstance) {
        return mobEffectInstance.getEffect() == MobEffects.DARKNESS ? false : super.canBeAffected(mobEffectInstance);
    }
}
