package info.lbrown.minecraft.lethalcraft;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class LethalCraftSounds {
    private static SoundEvent register(String id) {
        Identifier identifier = Identifier.of(LethalCraft.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static final SoundEvent FACILITY_DOOR_OPEN = register("facility_door_open");
    public static final SoundEvent FACILITY_DOOR_CLOSE = register("facility_door_close");

    public static final SoundEvent FEAR_HIGH = register("fear_high");
    public static final SoundEvent FEAR_LOW = register("fear_low");

    public static void initialize() {
        // Just called for peace of mind and consistency
    }
}
