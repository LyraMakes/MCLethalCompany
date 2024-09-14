package info.lbrown.minecraft.lethalcraft;

import info.lbrown.minecraft.lethalcraft.entity.CoilHeadModel;
import info.lbrown.minecraft.lethalcraft.entity.CoilHeadRenderer;
import info.lbrown.minecraft.lethalcraft.entity.LethalCraftEntities;
import info.lbrown.minecraft.lethalcraft.entity.LethalCraftModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class LethalCraftClient implements ClientModInitializer {
	public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(
			Identifier.of(LethalCraft.MOD_ID, "cube"),
			"main");

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlock(LethalCraftBlocks.FACILITY_DOOR, RenderLayer.getTranslucent());

		EntityRendererRegistry.register(LethalCraftEntities.CUBE, CubeEntityRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(MODEL_CUBE_LAYER, CubeEntityModel::getTexturedModelData);
		EntityRendererRegistry.register(LethalCraftEntities.COIL_HEAD, CoilHeadRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(LethalCraftModelLayers.COILHEAD, CoilHeadModel::getTexturedModelData);

	}
}