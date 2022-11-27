package net.namozdizex.nura.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.namozdizex.nura.client.model.NurarihyonModel;
import net.namozdizex.nura.entity.Nurarihyon;

public class NurarihyonRenderer extends MobRenderer<Nurarihyon, NurarihyonModel<Nurarihyon>> {
    public NurarihyonRenderer(EntityRendererProvider.Context context) {
        super(context, new NurarihyonModel(context.bakeLayer(NurarihyonModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(Nurarihyon entity) {
        return new ResourceLocation("nura", "textures/entity/yokai/nurarihyon.png");
    }

    @Override
    protected void setupRotations(Nurarihyon livingEntity, PoseStack poseStack, float f, float g, float h) {
        super.setupRotations(livingEntity, poseStack, f, g, h);
        poseStack.translate(0.0, Nurarihyon.getViewScale() + 0.1f, 0.0);
        poseStack.mulPose(Vector3f.ZP.rotationDegrees(180.0f));
    }
}
