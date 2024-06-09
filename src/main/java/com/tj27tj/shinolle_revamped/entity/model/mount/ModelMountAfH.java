package com.tj27tj.shinolle_revamped.entity.model.mount;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class ModelMountAfH extends EntityModel<Entity> {
	private final ModelRenderer BodyMain;
	private final ModelRenderer ChestCannon01a;
	private final ModelRenderer EquipBaseL;
	private final ModelRenderer EquipL01;
	private final ModelRenderer EquipL02;
	private final ModelRenderer ChestCannon03a;
	private final ModelRenderer Neck;
	private final ModelRenderer CannonBase;
	private final ModelRenderer Cannon01;
	private final ModelRenderer Cannon02;
	private final ModelRenderer Cannon05;
	private final ModelRenderer Cannon04;
	private final ModelRenderer Cannon03;
	private final ModelRenderer HeadBack03;
	private final ModelRenderer NeckBack;
	private final ModelRenderer HeadBack01;
	private final ModelRenderer Head;
	private final ModelRenderer Jaw;
	private final ModelRenderer EquipBaseR;
	private final ModelRenderer EquipR01;
	private final ModelRenderer EquipR02;
	private final ModelRenderer ChestCannon02a;
	private final ModelRenderer GlowBodyMain;
	private final ModelRenderer GlowNeck;
	private final ModelRenderer GlowJaw;
	private final ModelRenderer JawTooth;
	private final ModelRenderer JawTooth_r1;
	private final ModelRenderer JawTooth2;
	private final ModelRenderer JawTooth2_r1;
	private final ModelRenderer GlowHead;
	private final ModelRenderer HeadTooth;
	private final ModelRenderer HeadTooth2;
	private final ModelRenderer NeckFront;
	private final ModelRenderer GlowCannonBase;
	private final ModelRenderer GlowCannon04;
	private final ModelRenderer Cannon06;
	private final ModelRenderer GlowEquipBaseL;
	private final ModelRenderer GlowEquipL01;
	private final ModelRenderer GlowEquipL02;
	private final ModelRenderer EquipCannonPlate;
	private final ModelRenderer EquipCannon01;
	private final ModelRenderer EquipCannon02;
	private final ModelRenderer GlowEquipBaseR;
	private final ModelRenderer GlowEquipR01;
	private final ModelRenderer EquipCannonPlate_1;
	private final ModelRenderer EquipCannon01_1;
	private final ModelRenderer EquipCannon02_1;

	public ModelMountAfH() {
		textureWidth = 128;
		textureHeight = 128;

		BodyMain = new ModelRenderer(this);
		BodyMain.setRotationPoint(0.0F, 0.0F, 0.0F);
		BodyMain.setTextureOffset(0, 0).addBox(-9.0F, -7.0F, 10.0F, 18.0F, 12.0F, 9.0F, 0.0F, false);

		ChestCannon01a = new ModelRenderer(this);
		ChestCannon01a.setRotationPoint(3.3F, 6.0F, -2.0F);
		BodyMain.addChild(ChestCannon01a);
		setRotationAngle(ChestCannon01a, 0.0873F, 0.0F, 0.0F);
		ChestCannon01a.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 5.0F, 5.0F, 17.0F, 0.0F, false);

		EquipBaseL = new ModelRenderer(this);
		EquipBaseL.setRotationPoint(14.5F, 2.0F, 5.0F);
		BodyMain.addChild(EquipBaseL);
		setRotationAngle(EquipBaseL, 0.0F, -0.0873F, 0.0F);
		EquipBaseL.setTextureOffset(0, 10).addBox(-6.0F, 0.0F, -10.0F, 11.0F, 6.0F, 21.0F, 0.0F, false);

		EquipL01 = new ModelRenderer(this);
		EquipL01.setRotationPoint(0.0F, -8.0F, 1.0F);
		EquipBaseL.addChild(EquipL01);
		setRotationAngle(EquipL01, -0.1396F, 0.0F, 0.0F);
		EquipL01.setTextureOffset(0, 0).addBox(-6.0F, 0.0F, -7.0F, 10.0F, 9.0F, 20.0F, 0.0F, false);

		EquipL02 = new ModelRenderer(this);
		EquipL02.setRotationPoint(0.0F, -3.0F, 0.0F);
		EquipL01.addChild(EquipL02);
		setRotationAngle(EquipL02, 0.0524F, 0.0F, 0.0F);
		EquipL02.setTextureOffset(0, 0).addBox(-6.5F, 0.0F, -9.0F, 11.0F, 4.0F, 23.0F, 0.0F, false);

		ChestCannon03a = new ModelRenderer(this);
		ChestCannon03a.setRotationPoint(-8.3F, 6.0F, -2.0F);
		BodyMain.addChild(ChestCannon03a);
		setRotationAngle(ChestCannon03a, 0.0873F, 0.0F, 0.0F);
		ChestCannon03a.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 5.0F, 5.0F, 17.0F, 0.0F, false);

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(-29.0F, 5.0F, 6.0F);
		BodyMain.addChild(Neck);
		setRotationAngle(Neck, 0.0F, 0.2618F, 0.0F);
		Neck.setTextureOffset(70, 58).addBox(-7.5F, -15.0F, -3.0F, 15.0F, 15.0F, 14.0F, 0.0F, false);

		CannonBase = new ModelRenderer(this);
		CannonBase.setRotationPoint(-1.0F, -16.0F, 7.0F);
		Neck.addChild(CannonBase);
		setRotationAngle(CannonBase, -0.5236F, 0.0F, 0.0F);
		CannonBase.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, 0.0F, 10.0F, 14.0F, 4.0F, 0.0F, false);

		Cannon01 = new ModelRenderer(this);
		Cannon01.setRotationPoint(31.0F, -14.0F, -6.0F);
		CannonBase.addChild(Cannon01);
		Cannon01.setTextureOffset(0, 0).addBox(-29.7635F, 4.6145F, -3.9926F, 3.0F, 3.0F, 10.0F, 0.0F, false);

		Cannon02 = new ModelRenderer(this);
		Cannon02.setRotationPoint(26.0F, -14.0F, -6.0F);
		CannonBase.addChild(Cannon02);
		Cannon02.setTextureOffset(0, 0).addBox(-29.7635F, 4.6145F, -3.9926F, 3.0F, 3.0F, 10.0F, 0.0F, false);

		Cannon05 = new ModelRenderer(this);
		Cannon05.setRotationPoint(29.0F, -19.6F, -5.5F);
		CannonBase.addChild(Cannon05);
		setRotationAngle(Cannon05, -0.0524F, 0.0F, 0.0F);
		Cannon05.setTextureOffset(0, 0).addBox(-29.7635F, 4.2938F, -3.7593F, 2.0F, 2.0F, 10.0F, 0.0F, false);

		Cannon04 = new ModelRenderer(this);
		Cannon04.setRotationPoint(1.0F, -13.5F, 0.0F);
		CannonBase.addChild(Cannon04);
		setRotationAngle(Cannon04, 0.0F, 0.0F, 0.7854F);
		Cannon04.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -13.0F, 4.0F, 4.0F, 13.0F, 0.0F, false);

		Cannon03 = new ModelRenderer(this);
		Cannon03.setRotationPoint(-3.5F, -11.3F, 0.0F);
		CannonBase.addChild(Cannon03);
		Cannon03.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -9.0F, 2.0F, 2.0F, 9.0F, 0.0F, false);

		HeadBack03 = new ModelRenderer(this);
		HeadBack03.setRotationPoint(-4.0F, -16.1F, 14.5F);
		Neck.addChild(HeadBack03);
		setRotationAngle(HeadBack03, 0.0911F, 0.0F, 0.0F);
		HeadBack03.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 8.0F, 18.0F, 8.0F, 0.0F, false);

		NeckBack = new ModelRenderer(this);
		NeckBack.setRotationPoint(-2.0F, -6.0F, 11.0F);
		Neck.addChild(NeckBack);
		NeckBack.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		HeadBack01 = new ModelRenderer(this);
		HeadBack01.setRotationPoint(-4.0F, -18.0F, 8.0F);
		Neck.addChild(HeadBack01);
		setRotationAngle(HeadBack01, -0.1396F, 0.0F, 0.0F);
		HeadBack01.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 11.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -15.0F, 7.0F);
		Neck.addChild(Head);
		setRotationAngle(Head, -0.2094F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 94).addBox(-9.5F, -7.0F, -22.0F, 19.0F, 10.0F, 24.0F, 0.0F, false);

		Jaw = new ModelRenderer(this);
		Jaw.setRotationPoint(0.0F, -3.0F, 0.5F);
		Neck.addChild(Jaw);
		setRotationAngle(Jaw, 0.5463F, 0.0F, 0.0F);
		Jaw.setTextureOffset(0, 68).addBox(-9.5F, 0.0F, -15.0F, 19.0F, 7.0F, 19.0F, 0.0F, true);

		EquipBaseR = new ModelRenderer(this);
		EquipBaseR.setRotationPoint(-13.5F, 2.0F, 5.0F);
		BodyMain.addChild(EquipBaseR);
		setRotationAngle(EquipBaseR, 0.0F, 0.0873F, 0.0F);
		EquipBaseR.setTextureOffset(0, 10).addBox(-6.0F, 0.0F, -10.0F, 11.0F, 6.0F, 21.0F, 0.0F, false);

		EquipR01 = new ModelRenderer(this);
		EquipR01.setRotationPoint(0.0F, -8.0F, 1.0F);
		EquipBaseR.addChild(EquipR01);
		setRotationAngle(EquipR01, -0.1396F, 0.0F, 0.0F);
		EquipR01.setTextureOffset(0, 0).addBox(-5.0F, 0.0F, -7.0F, 10.0F, 9.0F, 20.0F, 0.0F, false);

		EquipR02 = new ModelRenderer(this);
		EquipR02.setRotationPoint(13.5F, -5.0F, -5.0F);
		EquipR01.addChild(EquipR02);
		setRotationAngle(EquipR02, 0.0524F, 0.0F, 0.0F);
		EquipR02.setTextureOffset(0, 0).addBox(-18.5F, 3.0F, -4.3F, 11.0F, 4.0F, 23.0F, 0.0F, false);

		ChestCannon02a = new ModelRenderer(this);
		ChestCannon02a.setRotationPoint(-2.5F, 6.0F, -2.0F);
		BodyMain.addChild(ChestCannon02a);
		setRotationAngle(ChestCannon02a, 0.0873F, 0.0F, 0.0F);
		ChestCannon02a.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 5.0F, 5.0F, 17.0F, 0.0F, false);

		GlowBodyMain = new ModelRenderer(this);
		GlowBodyMain.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		GlowNeck = new ModelRenderer(this);
		GlowNeck.setRotationPoint(-29.0F, 5.0F, 6.0F);
		GlowBodyMain.addChild(GlowNeck);
		setRotationAngle(GlowNeck, 0.0F, 0.2618F, 0.0F);
		

		GlowJaw = new ModelRenderer(this);
		GlowJaw.setRotationPoint(0.0F, -3.0F, 0.5F);
		GlowNeck.addChild(GlowJaw);
		

		JawTooth = new ModelRenderer(this);
		JawTooth.setRotationPoint(0.0F, -1.6F, -0.3F);
		GlowJaw.addChild(JawTooth);
		setRotationAngle(JawTooth, -0.0873F, -0.0223F, 0.0F);
		

		JawTooth_r1 = new ModelRenderer(this);
		JawTooth_r1.setRotationPoint(29.0F, 23.6F, -6.2F);
		JawTooth.addChild(JawTooth_r1);
		setRotationAngle(JawTooth_r1, 0.4047F, 0.029F, 0.0152F);
		JawTooth_r1.setTextureOffset(63, 99).addBox(-38.4194F, -16.9235F, -0.3001F, 18.0F, 3.0F, 14.0F, 0.0F, false);

		JawTooth2 = new ModelRenderer(this);
		JawTooth2.setRotationPoint(0.0F, -2.6F, 0.0F);
		GlowJaw.addChild(JawTooth2);
		setRotationAngle(JawTooth2, -0.1396F, 0.0F, 0.0F);
		

		JawTooth2_r1 = new ModelRenderer(this);
		JawTooth2_r1.setRotationPoint(29.0F, 24.6F, -6.5F);
		JawTooth2.addChild(JawTooth2_r1);
		setRotationAngle(JawTooth2_r1, 0.4046F, 0.0252F, 0.0252F);
		JawTooth2_r1.setTextureOffset(66, 100).addBox(-37.5732F, -18.3237F, 1.3281F, 16.0F, 3.0F, 13.0F, 0.0F, true);

		GlowHead = new ModelRenderer(this);
		GlowHead.setRotationPoint(0.0F, -15.0F, 7.0F);
		GlowNeck.addChild(GlowHead);
		setRotationAngle(GlowHead, -0.2094F, 0.0F, 0.0F);
		

		HeadTooth = new ModelRenderer(this);
		HeadTooth.setRotationPoint(0.0F, 2.0F, -15.0F);
		GlowHead.addChild(HeadTooth);
		setRotationAngle(HeadTooth, 0.0524F, 0.0F, 0.0F);
		HeadTooth.setTextureOffset(62, 98).addBox(-9.0F, 0.0F, -6.5F, 18.0F, 4.0F, 15.0F, 0.0F, false);

		HeadTooth2 = new ModelRenderer(this);
		HeadTooth2.setRotationPoint(0.0F, 3.6F, -6.5F);
		GlowHead.addChild(HeadTooth2);
		setRotationAngle(HeadTooth2, 0.1745F, 0.0F, 0.0F);
		HeadTooth2.setTextureOffset(65, 99).addBox(-8.0F, 0.0F, -14.0F, 16.0F, 3.0F, 14.0F, 0.0F, true);

		NeckFront = new ModelRenderer(this);
		NeckFront.setRotationPoint(0.0F, -14.0F, -5.0F);
		GlowNeck.addChild(NeckFront);
		NeckFront.setTextureOffset(0, 52).addBox(-6.5F, 0.0F, 0.0F, 13.0F, 14.0F, 2.0F, 0.0F, false);

		GlowCannonBase = new ModelRenderer(this);
		GlowCannonBase.setRotationPoint(-1.0F, -16.0F, 7.0F);
		GlowNeck.addChild(GlowCannonBase);
		setRotationAngle(GlowCannonBase, -0.5236F, 0.0F, 0.0F);
		

		GlowCannon04 = new ModelRenderer(this);
		GlowCannon04.setRotationPoint(1.0F, -13.5F, 0.0F);
		GlowCannonBase.addChild(GlowCannon04);
		setRotationAngle(GlowCannon04, 0.0F, 0.0F, 0.7854F);
		

		Cannon06 = new ModelRenderer(this);
		Cannon06.setRotationPoint(1.0F, 1.0F, -13.0F);
		GlowCannon04.addChild(Cannon06);
		Cannon06.setTextureOffset(74, 0).addBox(0.0F, 0.0F, -15.0F, 2.0F, 2.0F, 15.0F, 0.0F, false);

		GlowEquipBaseL = new ModelRenderer(this);
		GlowEquipBaseL.setRotationPoint(14.5F, 2.0F, 5.0F);
		GlowBodyMain.addChild(GlowEquipBaseL);
		setRotationAngle(GlowEquipBaseL, 0.0F, -0.0873F, 0.0F);
		

		GlowEquipL01 = new ModelRenderer(this);
		GlowEquipL01.setRotationPoint(0.0F, -8.0F, 1.0F);
		GlowEquipBaseL.addChild(GlowEquipL01);
		setRotationAngle(GlowEquipL01, -0.1396F, 0.0F, 0.0F);
		

		GlowEquipL02 = new ModelRenderer(this);
		GlowEquipL02.setRotationPoint(0.0F, -3.0F, 0.0F);
		GlowEquipL01.addChild(GlowEquipL02);
		setRotationAngle(GlowEquipL02, 0.0524F, 0.0F, 0.0F);
		

		EquipCannonPlate = new ModelRenderer(this);
		EquipCannonPlate.setRotationPoint(-2.0F, 2.0F, -8.0F);
		GlowEquipL01.addChild(EquipCannonPlate);
		EquipCannonPlate.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		EquipCannon01 = new ModelRenderer(this);
		EquipCannon01.setRotationPoint(1.5F, 1.0F, 0.5F);
		EquipCannonPlate.addChild(EquipCannon01);
		setRotationAngle(EquipCannon01, -0.3187F, -0.0873F, 0.0F);
		EquipCannon01.setTextureOffset(73, 0).addBox(0.0F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);

		EquipCannon02 = new ModelRenderer(this);
		EquipCannon02.setRotationPoint(1.5F, 4.0F, 0.5F);
		EquipCannonPlate.addChild(EquipCannon02);
		setRotationAngle(EquipCannon02, 0.0F, -0.0873F, 0.0F);
		EquipCannon02.setTextureOffset(73, 0).addBox(0.0F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);

		GlowEquipBaseR = new ModelRenderer(this);
		GlowEquipBaseR.setRotationPoint(-13.5F, 2.0F, 5.0F);
		GlowBodyMain.addChild(GlowEquipBaseR);
		setRotationAngle(GlowEquipBaseR, 0.0F, 0.0873F, 0.0F);
		

		GlowEquipR01 = new ModelRenderer(this);
		GlowEquipR01.setRotationPoint(0.0F, -8.0F, 1.0F);
		GlowEquipBaseR.addChild(GlowEquipR01);
		setRotationAngle(GlowEquipR01, -0.1396F, 0.0F, 0.0F);
		

		EquipCannonPlate_1 = new ModelRenderer(this);
		EquipCannonPlate_1.setRotationPoint(-2.0F, 2.0F, -8.0F);
		GlowEquipR01.addChild(EquipCannonPlate_1);
		EquipCannonPlate_1.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		EquipCannon01_1 = new ModelRenderer(this);
		EquipCannon01_1.setRotationPoint(1.5F, 1.0F, 0.5F);
		EquipCannonPlate_1.addChild(EquipCannon01_1);
		setRotationAngle(EquipCannon01_1, -0.182F, 0.1367F, 0.0F);
		EquipCannon01_1.setTextureOffset(73, 0).addBox(0.0F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);

		EquipCannon02_1 = new ModelRenderer(this);
		EquipCannon02_1.setRotationPoint(1.5F, 4.0F, 0.5F);
		EquipCannonPlate_1.addChild(EquipCannon02_1);
		setRotationAngle(EquipCannon02_1, 0.182F, 0.0911F, 0.0F);
		EquipCannon02_1.setTextureOffset(73, 0).addBox(0.0F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
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