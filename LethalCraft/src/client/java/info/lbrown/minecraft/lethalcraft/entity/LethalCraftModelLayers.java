package info.lbrown.minecraft.lethalcraft.entity;

import info.lbrown.minecraft.lethalcraft.LethalCraft;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class LethalCraftModelLayers {
    public static final EntityModelLayer COILHEAD = new EntityModelLayer(
            Identifier.of(LethalCraft.MOD_ID, "coil_head"),
            "main"
    );
}
