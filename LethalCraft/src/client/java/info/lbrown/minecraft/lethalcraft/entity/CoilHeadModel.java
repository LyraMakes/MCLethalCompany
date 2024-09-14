package info.lbrown.minecraft.lethalcraft.entity;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class CoilHeadModel<T extends CoilHeadEntity> extends SinglePartEntityModel<T> {
	private final ModelPart coilhead;
	private final ModelPart head;
	public CoilHeadModel(ModelPart root) {
		this.coilhead = root.getChild("coilhead");
		this.head = root.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData coilhead = modelPartData.addChild("coilhead", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData larm_r1 = coilhead.addChild("larm_r1", ModelPartBuilder.create().uv(32, 0).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, -24.0F, 0.0F, 0.48F, 0.0F, -0.1309F));

		ModelPartData rarm_r1 = coilhead.addChild("rarm_r1", ModelPartBuilder.create().uv(16, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -24.0F, 0.0F, 0.48F, 0.0F, 0.1309F));

		ModelPartData head = coilhead.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -18.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(32, 32).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 9.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -23.0F, 0.0F));

		ModelPartData lleg = coilhead.addChild("lleg", ModelPartBuilder.create().uv(0, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -12.0F, 0.0F));

		ModelPartData rleg = coilhead.addChild("rleg", ModelPartBuilder.create().uv(24, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -12.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void setAngles(CoilHeadEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		coilhead.render(matrices, vertexConsumer, light, overlay, color);
	}

	@Override
	public ModelPart getPart() {
		return coilhead;
	}
}