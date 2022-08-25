package com.github.agentallandev.powerrangers.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

import com.github.agentallandev.powerrangers.entity.PowerBowEntity;
import com.github.agentallandev.powerrangers.client.model.Modelpower_arrow;

public class PowerBowRenderer extends EntityRenderer<PowerBowEntity> {
	private static final ResourceLocation texture = new ResourceLocation("powerrangers:textures/entities/mmpr_power_arrow.png");
	private final Modelpower_arrow model;

	public PowerBowRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelpower_arrow(context.bakeLayer(Modelpower_arrow.LAYER_LOCATION));
	}

	@Override
	public void render(PowerBowEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn,
			int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(PowerBowEntity entity) {
		return texture;
	}
}
