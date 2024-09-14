package info.lbrown.minecraft.lethalcraft;

import info.lbrown.minecraft.lethalcraft.entity.CubeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.util.Identifier;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, EntityModel<CubeEntity>> {
    public CubeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CubeEntityModel(context.getPart(LethalCraftClient.MODEL_CUBE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return Identifier.of(LethalCraft.MOD_ID, "textures/entity/cube/cube.png");
    }
}
