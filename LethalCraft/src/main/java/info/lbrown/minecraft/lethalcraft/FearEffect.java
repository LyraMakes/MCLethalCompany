package info.lbrown.minecraft.lethalcraft;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;

public class FearEffect extends StatusEffect {
    protected FearEffect() {
        super(StatusEffectCategory.NEUTRAL, 0xFF0000);
    }

    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        if (!entity.getWorld().isClient && entity instanceof PlayerEntity) {
            SoundEvent fearSound = (amplifier >= 1) ? LethalCraftSounds.FEAR_HIGH : LethalCraftSounds.FEAR_LOW ;
            ((PlayerEntity) entity).playSoundToPlayer(fearSound, SoundCategory.HOSTILE, 0.7f, 1f);
        }
        super.onApplied(entity, amplifier);
    }
}
