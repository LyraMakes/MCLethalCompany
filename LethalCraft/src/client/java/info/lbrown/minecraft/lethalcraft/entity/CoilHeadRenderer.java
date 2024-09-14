package info.lbrown.minecraft.lethalcraft.entity;

import info.lbrown.minecraft.lethalcraft.LethalCraft;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CoilHeadRenderer extends MobEntityRenderer<CoilHeadEntity, CoilHeadModel<CoilHeadEntity>> {
    private static final Identifier TEXTURE = Identifier.of(LethalCraft.MOD_ID, "textures/entity/coil_head.png");

    public CoilHeadRenderer(EntityRendererFactory.Context context) {
        super(context, new CoilHeadModel<>(context.getPart(LethalCraftModelLayers.COILHEAD)), 0.6f);
    }

    @Override
    public Identifier getTexture(CoilHeadEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CoilHeadEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
