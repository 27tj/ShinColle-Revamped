package com.tj27tj.shinolle_revamped.entity.model.aircraft;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class ModelAirplaneZero extends EntityModel<Entity> {
	private final ModelRenderer BodyMain;
	private final ModelRenderer Propeller;
	private final ModelRenderer Wing02;
	private final ModelRenderer Prop02;
	private final ModelRenderer Tail01;
	private final ModelRenderer Tail02;
	private final ModelRenderer Tail03;
	private final ModelRenderer Tail04;
	private final ModelRenderer Wing01;
	private final ModelRenderer Tank;
	private final ModelRenderer GlowBodyMain;
	private final ModelRenderer BodyU;

	public ModelAirplaneZero() {
		textureWidth = 64;
		textureHeight = 32;

		BodyMain = new ModelRenderer(this);
		BodyMain.setRotationPoint(0.0F, 0.0F, 0.0F);
		BodyMain.setTextureOffset(0, 17).addBox(-2.0F, -3.0F, -6.0F, 4.0F, 4.0F, 11.0F, 0.0F, false);

		Propeller = new ModelRenderer(this);
		Propeller.setRotationPoint(0.0F, -1.0F, -6.5F);
		BodyMain.addChild(Propeller);
		Propeller.setTextureOffset(0, 6).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, 0.0F, false);

		Wing02 = new ModelRenderer(this);
		Wing02.setRotationPoint(-2.0F, -0.4F, -3.2F);
		BodyMain.addChild(Wing02);
		setRotationAngle(Wing02, 0.0F, 0.0F, 0.0698F);
		Wing02.setTextureOffset(0, 0).addBox(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 5.0F, 0.0F, false);

		Prop02 = new ModelRenderer(this);
		Prop02.setRotationPoint(0.0F, -1.0F, -7.5F);
		BodyMain.addChild(Prop02);
		Prop02.setTextureOffset(0, 24).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Tail01 = new ModelRenderer(this);
		Tail01.setRotationPoint(0.0F, -2.8F, 5.0F);
		BodyMain.addChild(Tail01);
		Tail01.setTextureOffset(30, 25).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		Tail02 = new ModelRenderer(this);
		Tail02.setRotationPoint(0.0F, 0.1F, 4.0F);
		Tail01.addChild(Tail02);
		Tail02.setTextureOffset(46, 24).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		Tail03 = new ModelRenderer(this);
		Tail03.setRotationPoint(0.0F, 0.6F, -0.5F);
		Tail02.addChild(Tail03);
		setRotationAngle(Tail03, -1.0472F, 0.0F, 0.0F);
		Tail03.setTextureOffset(0, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		Tail04 = new ModelRenderer(this);
		Tail04.setRotationPoint(0.0F, 3.0F, -3.0F);
		Tail02.addChild(Tail04);
		Tail04.setTextureOffset(0, 13).addBox(-6.5F, 0.0F, 0.0F, 13.0F, 1.0F, 3.0F, 0.0F, false);

		Wing01 = new ModelRenderer(this);
		Wing01.setRotationPoint(2.0F, -0.4F, -3.2F);
		BodyMain.addChild(Wing01);
		setRotationAngle(Wing01, 0.0F, 0.0F, -0.0698F);
		Wing01.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 5.0F, 0.0F, true);

		Tank = new ModelRenderer(this);
		Tank.setRotationPoint(0.0F, 0.5F, -3.0F);
		BodyMain.addChild(Tank);
		Tank.setTextureOffset(14, 7).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		GlowBodyMain = new ModelRenderer(this);
		GlowBodyMain.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		BodyU = new ModelRenderer(this);
		BodyU.setRotationPoint(0.0F, -4.9F, -1.8F);
		GlowBodyMain.addChild(BodyU);
		setRotationAngle(BodyU, -0.3142F, 0.0F, 0.0F);
		BodyU.setTextureOffset(19, 17).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(@NotNull Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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