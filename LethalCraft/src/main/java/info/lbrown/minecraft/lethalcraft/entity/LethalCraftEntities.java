package info.lbrown.minecraft.lethalcraft.entity;

import info.lbrown.minecraft.lethalcraft.LethalCraft;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class LethalCraftEntities {
    public static final EntityType<CubeEntity> CUBE = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(LethalCraft.MOD_ID, "cube"),
            EntityType.Builder.create(CubeEntity::new, SpawnGroup.MONSTER).dimensions(0.75f, 0.75f).build("cube")
    );

    public static final EntityType<CoilHeadEntity> COIL_HEAD = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(LethalCraft.MOD_ID, "coil_head"),
            EntityType.Builder.create(CoilHeadEntity::new, SpawnGroup.MONSTER).dimensions(1f, 1f).build("coil_head")
    );

    public static void initialize() {
        FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(COIL_HEAD, CoilHeadEntity.createCoilHeadAttributes());
    }
}
