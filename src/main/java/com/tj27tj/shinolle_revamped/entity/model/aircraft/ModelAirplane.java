package com.tj27tj.shinolle_revamped.entity.model.aircraft;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class ModelAirplane extends EntityModel<Entity> {
	private final ModelRenderer BodyMain;
	private final ModelRenderer Head;
	private final ModelRenderer BombR;
	private final ModelRenderer AirfoilL;
	private final ModelRenderer AirfoilR;
	private final ModelRenderer BombL;
	private final ModelRenderer GunBase;
	private final ModelRenderer Gun;
	private final ModelRenderer Tail;
	private final ModelRenderer BodyFront;
	private final ModelRenderer Tongue;
	private final ModelRenderer GlowBodyMain;
	private final ModelRenderer EyeL;
	private final ModelRenderer EyeR;

	public ModelAirplane() {
		textureWidth = 32;
		textureHeight = 32;

		BodyMain = new ModelRenderer(this);
		BodyMain.setRotationPoint(0.0F, 0.0F, 0.0F);
		BodyMain.setTextureOffset(3, 18).addBox(-3.0F, -3.0F, -1.0F, 6.0F, 7.0F, 7.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, -6.2F);
		BodyMain.addChild(Head);
		setRotationAngle(Head, 0.0F, 0.7854F, 0.0F);
		Head.setTextureOffset(8, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		BombR = new ModelRenderer(this);
		BombR.setRotationPoint(-6.0F, 2.3F, -1.0F);
		BodyMain.addChild(BombR);
		setRotationAngle(BombR, 0.0F, 0.0F, 0.7854F);
		BombR.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		AirfoilL = new ModelRenderer(this);
		AirfoilL.setRotationPoint(3.5F, 0.0F, 0.0F);
		BodyMain.addChild(AirfoilL);
		setRotationAngle(AirfoilL, 0.0F, 0.5236F, 0.1222F);
		AirfoilL.setTextureOffset(0, 17).addBox(-2.5F, -2.0F, -6.0F, 5.0F, 4.0F, 11.0F, 0.0F, false);

		AirfoilR = new ModelRenderer(this);
		AirfoilR.setRotationPoint(-3.5F, 0.0F, 0.0F);
		BodyMain.addChild(AirfoilR);
		setRotationAngle(AirfoilR, 0.0F, -0.5236F, -0.1222F);
		AirfoilR.setTextureOffset(0, 17).addBox(-2.5F, -2.0F, -6.0F, 5.0F, 4.0F, 11.0F, 0.0F, false);

		BombL = new ModelRenderer(this);
		BombL.setRotationPoint(6.0F, 2.3F, -1.0F);
		BodyMain.addChild(BombL);
		setRotationAngle(BombL, 0.0F, 0.0F, 0.7854F);
		BombL.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		GunBase = new ModelRenderer(this);
		GunBase.setRotationPoint(0.0F, 4.0F, 2.5F);
		BodyMain.addChild(GunBase);
		GunBase.setTextureOffset(10, 24).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		Gun = new ModelRenderer(this);
		Gun.setRotationPoint(0.0F, 2.5F, 0.0F);
		GunBase.addChild(Gun);
		setRotationAngle(Gun, 0.0524F, 0.0F, 0.0F);
		Gun.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -8.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 0.0F, 4.3F);
		BodyMain.addChild(Tail);
		setRotationAngle(Tail, 0.0F, 0.7854F, 0.0F);
		Tail.setTextureOffset(0, 19).addBox(-4.0F, -2.5F, -4.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);

		BodyFront = new ModelRenderer(this);
		BodyFront.setRotationPoint(0.0F, 0.0F, -3.2F);
		BodyMain.addChild(BodyFront);
		setRotationAngle(BodyFront, 0.0873F, 0.0F, 0.0F);
		BodyFront.setTextureOffset(12, 6).addBox(-2.5F, -2.6F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);

		Tongue = new ModelRenderer(this);
		Tongue.setRotationPoint(0.0F, 2.3F, -3.5F);
		BodyMain.addChild(Tongue);
		setRotationAngle(Tongue, 1.6581F, 0.0F, 0.0F);
		Tongue.setTextureOffset(0, 13).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		GlowBodyMain = new ModelRenderer(this);
		GlowBodyMain.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		EyeL = new ModelRenderer(this);
		EyeL.setRotationPoint(3.7F, -3.2F, 2.0F);
		GlowBodyMain.addChild(EyeL);
		setRotationAngle(EyeL, 0.0F, 0.7854F, 0.1745F);
		EyeL.setTextureOffset(16, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		EyeR = new ModelRenderer(this);
		EyeR.setRotationPoint(-3.7F, -3.2F, 2.0F);
		GlowBodyMain.addChild(EyeR);
		setRotationAngle(EyeR, 0.0F, -2.3562F, -0.1745F);
		EyeR.setTextureOffset(16, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(@NotNull MatrixStack matrixStack, @NotNull IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		BodyMain.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		GlowBodyMain.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}