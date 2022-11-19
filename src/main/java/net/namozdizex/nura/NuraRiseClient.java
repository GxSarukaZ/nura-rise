package net.namozdizex.nura;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.RenderType;
import net.namozdizex.nura.client.model.NurarihyonModel;
import net.namozdizex.nura.client.renderer.NurarihyonRenderer;
import net.namozdizex.nura.entity.Nurarihyon;
import net.namozdizex.nura.registry.NRBlocks;
import net.namozdizex.nura.registry.NREntity;

public class NuraRiseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        var cutout = RenderType.cutout();
        var translucent = RenderType.translucent();

        BlockRenderLayerMap.INSTANCE.putBlocks(cutout, NRBlocks.YOKAI_LAMP);
        BlockRenderLayerMap.INSTANCE.putBlocks(cutout, NRBlocks.SOUL_YOKAI_LAMP);

        EntityRendererRegistry.register(NREntity.NURARIHYON, NurarihyonRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(NurarihyonModel.LAYER_LOCATION, NurarihyonModel::createBodyLayer);
    }
}