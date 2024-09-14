package info.lbrown.minecraft.lethalcraft;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class LethalCraftEffects {
    public static final StatusEffect FEAR_EFFECT = Registry.register(
            Registries.STATUS_EFFECT,
            Identifier.of(LethalCraft.MOD_ID, "fear"),
            new FearEffect()
            );

    public static void initialize() {
        // Just called for peace of mind and consistency
    }
}
