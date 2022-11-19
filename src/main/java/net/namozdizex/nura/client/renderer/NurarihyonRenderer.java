package net.namozdizex.nura.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.namozdizex.nura.client.model.NurarihyonModel;
import net.namozdizex.nura.entity.Nurarihyon;

public class NurarihyonRenderer extends MobRenderer<Nurarihyon, NurarihyonModel<Nurarihyon>> {
    public NurarihyonRenderer(EntityRendererProvider.Context context) {
        super(context, new NurarihyonModel(context.bakeLayer(NurarihyonModel.LAYER_LOCATION)), 1.0F);
    }

    @Override
    public ResourceLocation getTextureLocation(Nurarihyon entity) {
        return new ResourceLocation("nura", "textures/entity/yokai/nurarihyon");
    }
}