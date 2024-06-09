package com.tj27tj.shinolle_revamped.entity.model.ship.battleship;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class ModelBattleshipNagato extends EntityModel<Entity> {
	private final ModelRenderer BodyMain;
	private final ModelRenderer Cloth;
	private final ModelRenderer Neck;
	private final ModelRenderer Head;
	private final ModelRenderer Hair;
	private final ModelRenderer Ahoke;
	private final ModelRenderer HairMain;
	private final ModelRenderer HairMidL01;
	private final ModelRenderer HairMidL02;
	private final ModelRenderer HeadEquip05;
	private final ModelRenderer HeadEquip;
	private final ModelRenderer HeadEquip03;
	private final ModelRenderer HeadEquip04;
	private final ModelRenderer HeadEquip01;
	private final ModelRenderer HeadEquip02;
	private final ModelRenderer BoobR;
	private final ModelRenderer BoobL;
	private final ModelRenderer ArmLeft01;
	private final ModelRenderer ArmLeft02;
	private final ModelRenderer ArmRight01;
	private final ModelRenderer ArmRight02;
	private final ModelRenderer Butt;
	private final ModelRenderer LegRight;
	private final ModelRenderer ShoesR;
	private final ModelRenderer Skirt;
	private final ModelRenderer SkirtEquip;
	private final ModelRenderer EquipBase;
	private final ModelRenderer EquipBaseM01;
	private final ModelRenderer EquipBaseM03;
	private final ModelRenderer EquipBaseM02;
	private final ModelRenderer EquipL01;
	private final ModelRenderer EquipL02;
	private final ModelRenderer EquipL03;
	private final ModelRenderer EquipR04;
	private final ModelRenderer EquipLC2Base01;
	private final ModelRenderer EquipLC2Base01_r1;
	private final ModelRenderer EquipLC2Base02;
	private final ModelRenderer EquipLC2Base02_r1;
	private final ModelRenderer EquipLC201;
	private final ModelRenderer EquipLC202;
	private final ModelRenderer EquipLC203;
	private final ModelRenderer EquipLC203_r1;
	private final ModelRenderer EquipLC204;
	private final ModelRenderer EquipLC204_r1;
	private final ModelRenderer EquipLCBase01;
	private final ModelRenderer EquipLCBase02;
	private final ModelRenderer EquipLC01;
	private final ModelRenderer EquipLC02;
	private final ModelRenderer EquipLCRadar;
	private final ModelRenderer EquipLC03;
	private final ModelRenderer EquipLC03_r1;
	private final ModelRenderer EquipLC04;
	private final ModelRenderer EquipLC04_r1;
	private final ModelRenderer EquipR01;
	private final ModelRenderer EquipR02;
	private final ModelRenderer EquipR03;
	private final ModelRenderer EquipRCBase01;
	private final ModelRenderer EquipRCBase02;
	private final ModelRenderer EquipRC03;
	private final ModelRenderer EquipRC04;
	private final ModelRenderer EquipRC01;
	private final ModelRenderer EquipRC02;
	private final ModelRenderer EquipRCRadar;
	private final ModelRenderer EquipR04_1;
	private final ModelRenderer EquipRC2Base01;
	private final ModelRenderer EquipRC2Base02;
	private final ModelRenderer EquipRC203;
	private final ModelRenderer EquipRC204;
	private final ModelRenderer EquipRC201;
	private final ModelRenderer EquipRC202;
	private final ModelRenderer LegLeft;
	private final ModelRenderer ShoesL;
	private final ModelRenderer GlowBodyMain;
	private final ModelRenderer GlowNeck;
	private final ModelRenderer GlowHead;
	private final ModelRenderer Face0;
	private final ModelRenderer Face1;
	private final ModelRenderer Face2;
	private final ModelRenderer Face3;
	private final ModelRenderer Face4;
	private final ModelRenderer Mouth0;
	private final ModelRenderer Mouth1;
	private final ModelRenderer Mouth2;
	private final ModelRenderer Flush0;
	private final ModelRenderer Flush1;

	public ModelBattleshipNagato() {
		textureWidth = 256;
		textureHeight = 128;

		BodyMain = new ModelRenderer(this);
		BodyMain.setRotationPoint(0.0F, -14.0F, 0.0F);
		BodyMain.setTextureOffset(0, 105).addBox(-6.5F, -10.0F, -4.0F, 13.0F, 15.0F, 7.0F, 0.0F, false);

		Cloth = new ModelRenderer(this);
		Cloth.setRotationPoint(0.0F, -11.5F, -5.0F);
		BodyMain.addChild(Cloth);
		Cloth.setTextureOffset(96, 16).addBox(-5.5F, 0.0F, 0.0F, 11.0F, 2.0F, 9.0F, 0.0F, false);

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, -10.0F, 0.0F);
		BodyMain.addChild(Neck);
		Neck.setTextureOffset(46, 14).addBox(-7.0F, -0.5F, -4.5F, 14.0F, 12.0F, 8.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -1.0F, 0.0F);
		Neck.addChild(Head);
		Head.setTextureOffset(44, 101).addBox(-7.0F, -14.5F, -6.5F, 14.0F, 14.0F, 13.0F, 0.0F, false);

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(0.0F, 16.5F, 0.0F);
		Head.addChild(Hair);
		Hair.setTextureOffset(50, 75).addBox(-8.2F, -32.2F, -7.9F, 16.0F, 16.0F, 8.0F, 0.0F, false);

		Ahoke = new ModelRenderer(this);
		Ahoke.setRotationPoint(-1.0F, -10.0F, -5.0F);
		Hair.addChild(Ahoke);
		setRotationAngle(Ahoke, 0.0F, 0.5236F, 0.0F);
		Ahoke.setTextureOffset(33, 87).addBox(0.0F, -27.0F, -12.0F, 0.0F, 12.0F, 12.0F, 0.0F, false);

		HairMain = new ModelRenderer(this);
		HairMain.setRotationPoint(0.0F, -15.0F, -3.0F);
		Head.addChild(HairMain);
		HairMain.setTextureOffset(48, 56).addBox(-7.5F, 0.0F, 0.0F, 15.0F, 9.0F, 10.0F, 0.0F, false);

		HairMidL01 = new ModelRenderer(this);
		HairMidL01.setRotationPoint(0.0F, 9.0F, 1.5F);
		HairMain.addChild(HairMidL01);
		setRotationAngle(HairMidL01, 0.3491F, 0.0F, 0.0F);
		HairMidL01.setTextureOffset(48, 34).addBox(-7.5F, 0.0F, 0.0F, 15.0F, 13.0F, 9.0F, 0.0F, false);

		HairMidL02 = new ModelRenderer(this);
		HairMidL02.setRotationPoint(0.0F, 25.0F, 4.8F);
		HairMidL01.addChild(HairMidL02);
		setRotationAngle(HairMidL02, -0.1745F, 0.0F, 0.0F);
		HairMidL02.setTextureOffset(0, 32).addBox(-7.0F, -16.0F, -6.0F, 14.0F, 14.0F, 7.0F, 0.0F, false);

		HeadEquip05 = new ModelRenderer(this);
		HeadEquip05.setRotationPoint(0.0F, -28.5F, 44.0F);
		Head.addChild(HeadEquip05);
		HeadEquip05.setTextureOffset(128, 0).addBox(-16.0F, 17.75F, -45.5F, 32.0F, 1.0F, 1.0F, 0.0F, false);

		HeadEquip = new ModelRenderer(this);
		HeadEquip.setRotationPoint(0.0F, -31.0F, 42.0F);
		Head.addChild(HeadEquip);
		setRotationAngle(HeadEquip, 0.1047F, 0.0F, 0.0F);
		HeadEquip.setTextureOffset(128, 0).addBox(-9.5F, 19.2954F, -46.019F, 19.0F, 4.0F, 11.0F, 0.0F, false);

		HeadEquip03 = new ModelRenderer(this);
		HeadEquip03.setRotationPoint(-7.5F, 25.0F, 9.0F);
		HeadEquip.addChild(HeadEquip03);
		setRotationAngle(HeadEquip03, 0.0F, 0.7854F, 0.1745F);
		HeadEquip03.setTextureOffset(128, 0).addBox(28.1291F, -5.547F, -35.5123F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		HeadEquip04 = new ModelRenderer(this);
		HeadEquip04.setRotationPoint(-4.0F, 1.0F, 0.0F);
		HeadEquip03.addChild(HeadEquip04);
		setRotationAngle(HeadEquip04, 0.0F, 0.0F, 0.0873F);
		HeadEquip04.setTextureOffset(92, 30).addBox(21.5234F, -9.3262F, -34.5123F, 10.0F, 2.0F, 2.0F, 0.0F, false);

		HeadEquip01 = new ModelRenderer(this);
		HeadEquip01.setRotationPoint(7.5F, 0.0F, 9.0F);
		HeadEquip.addChild(HeadEquip01);
		setRotationAngle(HeadEquip01, 0.0F, -0.7854F, -0.1745F);
		HeadEquip01.setTextureOffset(128, 0).addBox(-34.9096F, 19.0023F, -32.1711F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		HeadEquip02 = new ModelRenderer(this);
		HeadEquip02.setRotationPoint(4.0F, 34.0F, 1.0F);
		HeadEquip01.addChild(HeadEquip02);
		setRotationAngle(HeadEquip02, 0.0F, 0.0F, -0.0873F);
		HeadEquip02.setTextureOffset(92, 30).addBox(-36.4329F, -17.8626F, -32.1711F, 10.0F, 2.0F, 2.0F, 0.0F, true);

		BoobR = new ModelRenderer(this);
		BoobR.setRotationPoint(-3.7F, -9.0F, -3.5F);
		BodyMain.addChild(BoobR);
		setRotationAngle(BoobR, -0.7854F, -0.1396F, -0.0873F);
		BoobR.setTextureOffset(0, 70).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 5.0F, 4.0F, 0.0F, false);

		BoobL = new ModelRenderer(this);
		BoobL.setRotationPoint(3.7F, -9.0F, -3.5F);
		BodyMain.addChild(BoobL);
		setRotationAngle(BoobL, -0.7854F, 0.1396F, 0.0873F);
		BoobL.setTextureOffset(0, 70).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 5.0F, 4.0F, 0.0F, true);

		ArmLeft01 = new ModelRenderer(this);
		ArmLeft01.setRotationPoint(8.5F, -10.0F, 0.0F);
		BodyMain.addChild(ArmLeft01);
		setRotationAngle(ArmLeft01, 0.0F, 0.0F, -0.1571F);
		ArmLeft01.setTextureOffset(24, 53).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.0F, true);

		ArmLeft02 = new ModelRenderer(this);
		ArmLeft02.setRotationPoint(0.0F, 10.0F, 0.0F);
		ArmLeft01.addChild(ArmLeft02);
		ArmLeft02.setTextureOffset(0, 53).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.0F, true);

		ArmRight01 = new ModelRenderer(this);
		ArmRight01.setRotationPoint(-8.5F, -10.0F, 0.0F);
		BodyMain.addChild(ArmRight01);
		setRotationAngle(ArmRight01, 0.0F, 0.0F, 0.1571F);
		ArmRight01.setTextureOffset(24, 53).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		ArmRight02 = new ModelRenderer(this);
		ArmRight02.setRotationPoint(0.0F, 10.0F, 0.0F);
		ArmRight01.addChild(ArmRight02);
		ArmRight02.setTextureOffset(0, 53).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		Butt = new ModelRenderer(this);
		Butt.setRotationPoint(0.0F, 0.0F, 0.0F);
		BodyMain.addChild(Butt);
		setRotationAngle(Butt, 0.2618F, 0.0F, 0.0F);
		Butt.setTextureOffset(0, 17).addBox(-8.0F, 4.0F, -5.5F, 16.0F, 8.0F, 7.0F, 0.0F, false);

		LegRight = new ModelRenderer(this);
		LegRight.setRotationPoint(-4.5F, 23.5F, -3.0F);
		Butt.addChild(LegRight);
		setRotationAngle(LegRight, -0.2618F, 0.0F, -0.0524F);
		LegRight.setTextureOffset(0, 80).addBox(-2.2598F, -13.9813F, -5.395F, 6.0F, 19.0F, 6.0F, 0.0F, false);

		ShoesR = new ModelRenderer(this);
		ShoesR.setRotationPoint(0.0F, 19.0F, -0.2F);
		LegRight.addChild(ShoesR);
		ShoesR.setTextureOffset(22, 70).addBox(-2.7598F, -13.9813F, -5.895F, 7.0F, 9.0F, 7.0F, 0.0F, false);

		Skirt = new ModelRenderer(this);
		Skirt.setRotationPoint(0.0F, 21.0F, -2.0F);
		Butt.addChild(Skirt);
		setRotationAngle(Skirt, -0.1367F, 0.0F, 0.0F);
		Skirt.setTextureOffset(0, 0).addBox(-8.5F, -14.3898F, -6.7213F, 17.0F, 6.0F, 9.0F, 0.0F, false);

		SkirtEquip = new ModelRenderer(this);
		SkirtEquip.setRotationPoint(0.0F, -3.0F, 0.2F);
		Skirt.addChild(SkirtEquip);
		SkirtEquip.setTextureOffset(71, 0).addBox(-9.0F, -14.3898F, -7.2213F, 18.0F, 3.0F, 10.0F, 0.0F, false);

		EquipBase = new ModelRenderer(this);
		EquipBase.setRotationPoint(0.0F, 0.0F, 4.0F);
		SkirtEquip.addChild(EquipBase);
		setRotationAngle(EquipBase, 0.1745F, 0.0F, 0.0F);
		EquipBase.setTextureOffset(128, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 8.0F, 0.0F, false);

		EquipBaseM01 = new ModelRenderer(this);
		EquipBaseM01.setRotationPoint(0.0F, -4.0F, 13.8F);
		EquipBase.addChild(EquipBaseM01);
		setRotationAngle(EquipBaseM01, -0.6981F, 0.0F, 0.0F);
		EquipBaseM01.setTextureOffset(128, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 8.0F, 0.0F, false);

		EquipBaseM03 = new ModelRenderer(this);
		EquipBaseM03.setRotationPoint(0.0F, -4.0F, 10.8F);
		EquipBase.addChild(EquipBaseM03);
		setRotationAngle(EquipBaseM03, -0.4363F, 0.0F, 0.0F);
		EquipBaseM03.setTextureOffset(128, 92).addBox(-3.0F, -14.0F, 0.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		EquipBaseM02 = new ModelRenderer(this);
		EquipBaseM02.setRotationPoint(0.0F, -5.5F, 12.8F);
		EquipBase.addChild(EquipBaseM02);
		EquipBaseM02.setTextureOffset(128, 0).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);

		EquipL01 = new ModelRenderer(this);
		EquipL01.setRotationPoint(0.0F, -7.0F, 9.8F);
		EquipBase.addChild(EquipL01);
		setRotationAngle(EquipL01, -0.2094F, 0.0F, 0.0F);
		EquipL01.setTextureOffset(128, 0).addBox(0.0F, 0.0F, 0.0F, 14.0F, 10.0F, 5.0F, 0.0F, false);

		EquipL02 = new ModelRenderer(this);
		EquipL02.setRotationPoint(11.5F, 0.0F, -3.4F);
		EquipL01.addChild(EquipL02);
		setRotationAngle(EquipL02, 0.0F, 0.5236F, 0.0F);
		EquipL02.setTextureOffset(128, 0).addBox(0.0F, 0.0F, 0.0F, 10.0F, 12.0F, 5.0F, 0.0F, false);

		EquipL03 = new ModelRenderer(this);
		EquipL03.setRotationPoint(5.3F, 0.0F, 1.3F);
		EquipL02.addChild(EquipL03);
		setRotationAngle(EquipL03, 0.0F, -0.6981F, 0.0F);
		EquipL03.setTextureOffset(128, 26).addBox(0.0F, 0.0F, -14.0F, 6.0F, 18.0F, 14.0F, 0.0F, false);

		EquipR04 = new ModelRenderer(this);
		EquipR04.setRotationPoint(0.0F, 11.0F, -13.0F);
		EquipL03.addChild(EquipR04);
		setRotationAngle(EquipR04, 0.0F, 0.1745F, 0.0F);
		EquipR04.setTextureOffset(128, 60).addBox(0.0F, 0.0F, -10.0F, 6.0F, 7.0F, 10.0F, 0.0F, false);

		EquipLC2Base01 = new ModelRenderer(this);
		EquipLC2Base01.setRotationPoint(-13.8F, 2.0F, -19.9F);
		EquipR04.addChild(EquipLC2Base01);
		

		EquipLC2Base01_r1 = new ModelRenderer(this);
		EquipLC2Base01_r1.setRotationPoint(14.0F, 14.0F, 31.0F);
		EquipLC2Base01.addChild(EquipLC2Base01_r1);
		setRotationAngle(EquipLC2Base01_r1, -0.0873F, 0.0F, 0.0F);
		EquipLC2Base01_r1.setTextureOffset(128, 0).addBox(-1.5F, -17.6528F, -31.9169F, 9.0F, 10.0F, 10.0F, 0.0F, false);

		EquipLC2Base02 = new ModelRenderer(this);
		EquipLC2Base02.setRotationPoint(0.0F, 0.0F, -1.0F);
		EquipLC2Base01.addChild(EquipLC2Base02);
		setRotationAngle(EquipLC2Base02, 0.0524F, 0.0F, 0.0F);
		

		EquipLC2Base02_r1 = new ModelRenderer(this);
		EquipLC2Base02_r1.setRotationPoint(14.0F, 17.0F, 30.0F);
		EquipLC2Base02.addChild(EquipLC2Base02_r1);
		setRotationAngle(EquipLC2Base02_r1, -0.1309F, 0.0F, 0.0F);
		EquipLC2Base02_r1.setTextureOffset(128, 0).addBox(-2.0F, -23.4661F, -32.7851F, 10.0F, 5.0F, 14.0F, 0.0F, false);

		EquipLC201 = new ModelRenderer(this);
		EquipLC201.setRotationPoint(-5.0F, -14.0F, 15.0F);
		EquipLC2Base02.addChild(EquipLC201);
		setRotationAngle(EquipLC201, -0.1396F, 0.0F, 0.0F);
		EquipLC201.setTextureOffset(128, 117).addBox(18.4F, 4.4644F, -17.0177F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		EquipLC202 = new ModelRenderer(this);
		EquipLC202.setRotationPoint(0.0F, 0.0F, -5.0F);
		EquipLC201.addChild(EquipLC202);
		EquipLC202.setTextureOffset(132, 113).addBox(18.9F, 4.9644F, -25.0177F, 2.0F, 2.0F, 13.0F, 0.0F, false);

		EquipLC203 = new ModelRenderer(this);
		EquipLC203.setRotationPoint(2.0F, -4.0F, -8.0F);
		EquipLC2Base02.addChild(EquipLC203);
		setRotationAngle(EquipLC203, -0.0873F, 0.0F, 0.0F);
		

		EquipLC203_r1 = new ModelRenderer(this);
		EquipLC203_r1.setRotationPoint(-8.0F, 8.2F, 53.2F);
		EquipLC203.addChild(EquipLC203_r1);
		setRotationAngle(EquipLC203_r1, -0.0436F, 0.0F, 0.0F);
		EquipLC203_r1.setTextureOffset(128, 117).addBox(23.4F, -14.4692F, -49.0416F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		EquipLC204 = new ModelRenderer(this);
		EquipLC204.setRotationPoint(-3.0F, -10.0F, 19.0F);
		EquipLC203.addChild(EquipLC204);
		

		EquipLC204_r1 = new ModelRenderer(this);
		EquipLC204_r1.setRotationPoint(-2.0F, 27.0F, 9.8F);
		EquipLC204.addChild(EquipLC204_r1);
		setRotationAngle(EquipLC204_r1, -0.0436F, 0.0F, 0.0F);
		EquipLC204_r1.setTextureOffset(132, 113).addBox(20.9F, -23.9692F, -38.0416F, 2.0F, 2.0F, 13.0F, 0.0F, false);

		EquipLCBase01 = new ModelRenderer(this);
		EquipLCBase01.setRotationPoint(0.0F, 1.0F, -7.0F);
		EquipL03.addChild(EquipLCBase01);
		setRotationAngle(EquipLCBase01, 0.0F, 0.0873F, 0.0F);
		EquipLCBase01.setTextureOffset(128, 0).addBox(0.0F, -5.5F, -12.0F, 7.0F, 11.0F, 10.0F, 0.0F, false);

		EquipLCBase02 = new ModelRenderer(this);
		EquipLCBase02.setRotationPoint(4.2F, 0.0F, -9.4F);
		EquipLCBase01.addChild(EquipLCBase02);
		setRotationAngle(EquipLCBase02, -0.1745F, 0.0524F, 0.0F);
		EquipLCBase02.setTextureOffset(128, 0).addBox(0.0063F, -6.9929F, -4.1685F, 5.0F, 10.0F, 14.0F, 0.0F, false);

		EquipLC01 = new ModelRenderer(this);
		EquipLC01.setRotationPoint(4.0F, -3.0F, 3.0F);
		EquipLCBase02.addChild(EquipLC01);
		setRotationAngle(EquipLC01, 0.0F, -0.2618F, 0.0F);
		EquipLC01.setTextureOffset(128, 117).addBox(-3.1614F, -2.6234F, -10.4679F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		EquipLC02 = new ModelRenderer(this);
		EquipLC02.setRotationPoint(0.0F, 0.0F, -5.0F);
		EquipLC01.addChild(EquipLC02);
		EquipLC02.setTextureOffset(132, 113).addBox(-2.2614F, -2.1234F, -18.4679F, 2.0F, 2.0F, 13.0F, 0.0F, false);

		EquipLCRadar = new ModelRenderer(this);
		EquipLCRadar.setRotationPoint(5.2F, -1.0F, 12.5F);
		EquipLCBase02.addChild(EquipLCRadar);
		EquipLCRadar.setTextureOffset(128, 0).addBox(0.0063F, -8.4929F, -7.1685F, 1.0F, 15.0F, 5.0F, 0.0F, false);

		EquipLC03 = new ModelRenderer(this);
		EquipLC03.setRotationPoint(4.0F, 1.0F, 3.0F);
		EquipLCBase02.addChild(EquipLC03);
		setRotationAngle(EquipLC03, 0.0F, -0.1396F, 0.0F);
		

		EquipLC03_r1 = new ModelRenderer(this);
		EquipLC03_r1.setRotationPoint(-11.7F, 22.0F, 9.5F);
		EquipLC03.addChild(EquipLC03_r1);
		setRotationAngle(EquipLC03_r1, 0.0F, -0.0873F, 0.0F);
		EquipLC03_r1.setTextureOffset(128, 117).addBox(8.0231F, -24.6234F, -21.0215F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		EquipLC04 = new ModelRenderer(this);
		EquipLC04.setRotationPoint(-7.0F, 0.0F, 1.5F);
		EquipLC03.addChild(EquipLC04);
		

		EquipLC04_r1 = new ModelRenderer(this);
		EquipLC04_r1.setRotationPoint(2.9F, 23.0F, 2.0F);
		EquipLC04.addChild(EquipLC04_r1);
		setRotationAngle(EquipLC04_r1, 0.0F, -0.1134F, 0.0F);
		EquipLC04_r1.setTextureOffset(132, 113).addBox(1.3683F, -25.1198F, -27.5645F, 2.0F, 2.0F, 13.0F, 0.0F, false);

		EquipR01 = new ModelRenderer(this);
		EquipR01.setRotationPoint(0.0F, -3.0F, 8.0F);
		EquipBase.addChild(EquipR01);
		setRotationAngle(EquipR01, -0.2094F, 0.0F, 0.0F);
		EquipR01.setTextureOffset(128, 0).addBox(-14.0F, 0.0F, 0.0F, 14.0F, 10.0F, 5.0F, 0.0F, false);

		EquipR02 = new ModelRenderer(this);
		EquipR02.setRotationPoint(-11.5F, -4.0F, -1.6F);
		EquipR01.addChild(EquipR02);
		setRotationAngle(EquipR02, 0.0F, -0.5236F, 0.0F);
		EquipR02.setTextureOffset(128, 0).addBox(-10.0F, 0.0F, 0.0F, 10.0F, 12.0F, 5.0F, 0.0F, false);

		EquipR03 = new ModelRenderer(this);
		EquipR03.setRotationPoint(-5.3F, 0.0F, 1.3F);
		EquipR02.addChild(EquipR03);
		setRotationAngle(EquipR03, 0.0F, 0.6981F, 0.0F);
		EquipR03.setTextureOffset(128, 26).addBox(-6.0F, 0.0F, -14.0F, 6.0F, 18.0F, 14.0F, 0.0F, false);

		EquipRCBase01 = new ModelRenderer(this);
		EquipRCBase01.setRotationPoint(11.5F, 4.0F, -15.6F);
		EquipR03.addChild(EquipRCBase01);
		setRotationAngle(EquipRCBase01, 0.0F, -0.0873F, 0.0F);
		EquipRCBase01.setTextureOffset(128, 0).addBox(-20.0F, -10.5F, -4.0F, 7.0F, 11.0F, 10.0F, 0.0F, false);

		EquipRCBase02 = new ModelRenderer(this);
		EquipRCBase02.setRotationPoint(-7.0F, 0.0F, -6.5F);
		EquipRCBase01.addChild(EquipRCBase02);
		setRotationAngle(EquipRCBase02, -0.1745F, -0.0524F, 0.0F);
		EquipRCBase02.setTextureOffset(128, 0).addBox(-18.0F, -12.0F, -4.0F, 5.0F, 10.0F, 14.0F, 0.0F, false);

		EquipRC03 = new ModelRenderer(this);
		EquipRC03.setRotationPoint(1.3F, 1.0F, 1.7F);
		EquipRCBase02.addChild(EquipRC03);
		setRotationAngle(EquipRC03, 0.0F, 0.2094F, 0.0F);
		EquipRC03.setTextureOffset(128, 117).addBox(-18.1575F, -7.1173F, -12.7442F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		EquipRC04 = new ModelRenderer(this);
		EquipRC04.setRotationPoint(0.0F, 0.0F, -5.0F);
		EquipRC03.addChild(EquipRC04);
		EquipRC04.setTextureOffset(132, 113).addBox(-17.6575F, -6.6173F, -20.7442F, 2.0F, 2.0F, 13.0F, 0.0F, false);

		EquipRC01 = new ModelRenderer(this);
		EquipRC01.setRotationPoint(1.3F, -3.0F, 1.7F);
		EquipRCBase02.addChild(EquipRC01);
		setRotationAngle(EquipRC01, 0.0F, 0.2618F, 0.0F);
		EquipRC01.setTextureOffset(128, 117).addBox(-17.7294F, -7.1173F, -13.6054F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		EquipRC02 = new ModelRenderer(this);
		EquipRC02.setRotationPoint(7.0F, 0.0F, 1.5F);
		EquipRC01.addChild(EquipRC02);
		EquipRC02.setTextureOffset(132, 113).addBox(-24.2294F, -6.6173F, -27.6054F, 2.0F, 2.0F, 13.0F, 0.0F, false);

		EquipRCRadar = new ModelRenderer(this);
		EquipRCRadar.setRotationPoint(0.1F, -1.0F, 11.2F);
		EquipRCBase02.addChild(EquipRCRadar);
		EquipRCRadar.setTextureOffset(128, 0).addBox(-1.0F, -7.5F, 0.0F, 1.0F, 15.0F, 5.0F, 0.0F, false);

		EquipR04_1 = new ModelRenderer(this);
		EquipR04_1.setRotationPoint(11.5F, 14.0F, -21.6F);
		EquipR03.addChild(EquipR04_1);
		setRotationAngle(EquipR04_1, 0.0F, -0.1745F, 0.0F);
		EquipR04_1.setTextureOffset(128, 60).addBox(-16.1F, -3.0F, 1.0F, 6.0F, 7.0F, 10.0F, 0.0F, false);

		EquipRC2Base01 = new ModelRenderer(this);
		EquipRC2Base01.setRotationPoint(2.3F, -1.0F, -11.3F);
		EquipR04_1.addChild(EquipRC2Base01);
		EquipRC2Base01.setTextureOffset(128, 0).addBox(-18.8F, -5.193F, 2.5189F, 9.0F, 10.0F, 10.0F, 0.0F, false);

		EquipRC2Base02 = new ModelRenderer(this);
		EquipRC2Base02.setRotationPoint(0.0F, 0.0F, -1.0F);
		EquipRC2Base01.addChild(EquipRC2Base02);
		setRotationAngle(EquipRC2Base02, 0.0524F, 0.0F, 0.0F);
		EquipRC2Base02.setTextureOffset(128, 0).addBox(-19.3F, -9.6728F, 1.7837F, 10.0F, 5.0F, 14.0F, 0.0F, false);

		EquipRC203 = new ModelRenderer(this);
		EquipRC203.setRotationPoint(5.0F, -14.0F, 15.0F);
		EquipRC2Base02.addChild(EquipRC203);
		setRotationAngle(EquipRC203, -0.1745F, 0.0F, 0.0F);
		EquipRC203.setTextureOffset(128, 117).addBox(-18.9F, 5.2065F, -14.4907F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		EquipRC204 = new ModelRenderer(this);
		EquipRC204.setRotationPoint(0.0F, 0.0F, -4.0F);
		EquipRC203.addChild(EquipRC204);
		EquipRC204.setTextureOffset(132, 113).addBox(-18.4F, 5.7065F, -22.4907F, 2.0F, 2.0F, 13.0F, 0.0F, false);

		EquipRC201 = new ModelRenderer(this);
		EquipRC201.setRotationPoint(-2.0F, -4.0F, -8.0F);
		EquipRC2Base02.addChild(EquipRC201);
		setRotationAngle(EquipRC201, -0.0873F, 0.0F, 0.0F);
		EquipRC201.setTextureOffset(128, 117).addBox(-15.8F, -7.1268F, 7.33F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		EquipRC202 = new ModelRenderer(this);
		EquipRC202.setRotationPoint(3.0F, -10.0F, 19.0F);
		EquipRC201.addChild(EquipRC202);
		EquipRC202.setTextureOffset(132, 113).addBox(-18.4F, 3.3896F, -24.1598F, 2.0F, 2.0F, 13.0F, 0.0F, false);

		LegLeft = new ModelRenderer(this);
		LegLeft.setRotationPoint(4.5F, 23.5F, -3.0F);
		Butt.addChild(LegLeft);
		setRotationAngle(LegLeft, -0.2618F, 0.0F, 0.0524F);
		LegLeft.setTextureOffset(0, 80).addBox(-3.7402F, -13.9813F, -5.395F, 6.0F, 19.0F, 6.0F, 0.0F, true);

		ShoesL = new ModelRenderer(this);
		ShoesL.setRotationPoint(0.0F, 19.0F, -0.2F);
		LegLeft.addChild(ShoesL);
		ShoesL.setTextureOffset(22, 70).addBox(-4.2402F, -13.9813F, -5.895F, 7.0F, 9.0F, 7.0F, 0.0F, true);

		GlowBodyMain = new ModelRenderer(this);
		GlowBodyMain.setRotationPoint(0.0F, -14.0F, 0.0F);
		

		GlowNeck = new ModelRenderer(this);
		GlowNeck.setRotationPoint(0.0F, -10.0F, 0.0F);
		GlowBodyMain.addChild(GlowNeck);
		

		GlowHead = new ModelRenderer(this);
		GlowHead.setRotationPoint(0.0F, -1.0F, 0.0F);
		GlowNeck.addChild(GlowHead);
		

		Face0 = new ModelRenderer(this);
		Face0.setRotationPoint(0.0F, -12.2F, -6.1F);
		GlowHead.addChild(Face0);
		Face0.setTextureOffset(98, 63).addBox(-7.0F, 0.0F, -0.5F, 14.0F, 12.0F, 1.0F, 0.0F, false);

		Face1 = new ModelRenderer(this);
		Face1.setRotationPoint(0.0F, -12.2F, -6.1F);
		GlowHead.addChild(Face1);
		Face1.setTextureOffset(98, 76).addBox(-7.0F, 0.0F, -0.5F, 14.0F, 12.0F, 1.0F, 0.0F, false);

		Face2 = new ModelRenderer(this);
		Face2.setRotationPoint(0.0F, -12.2F, -6.1F);
		GlowHead.addChild(Face2);
		Face2.setTextureOffset(98, 89).addBox(-7.0F, 0.0F, -0.5F, 14.0F, 12.0F, 1.0F, 0.0F, false);

		Face3 = new ModelRenderer(this);
		Face3.setRotationPoint(0.0F, -12.2F, -6.1F);
		GlowHead.addChild(Face3);
		Face3.setTextureOffset(98, 102).addBox(-7.0F, 0.0F, -0.5F, 14.0F, 12.0F, 1.0F, 0.0F, false);

		Face4 = new ModelRenderer(this);
		Face4.setRotationPoint(0.0F, -12.2F, -6.1F);
		GlowHead.addChild(Face4);
		Face4.setTextureOffset(98, 115).addBox(-7.0F, 0.0F, -0.5F, 14.0F, 12.0F, 1.0F, 0.0F, false);

		Mouth0 = new ModelRenderer(this);
		Mouth0.setRotationPoint(0.0F, -4.2F, -6.2F);
		GlowHead.addChild(Mouth0);
		Mouth0.setTextureOffset(100, 53).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);

		Mouth1 = new ModelRenderer(this);
		Mouth1.setRotationPoint(0.0F, -4.2F, -6.2F);
		GlowHead.addChild(Mouth1);
		Mouth1.setTextureOffset(100, 58).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);

		Mouth2 = new ModelRenderer(this);
		Mouth2.setRotationPoint(0.0F, -4.2F, -6.2F);
		GlowHead.addChild(Mouth2);
		Mouth2.setTextureOffset(114, 53).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);

		Flush0 = new ModelRenderer(this);
		Flush0.setRotationPoint(-6.0F, -3.0F, -6.9F);
		GlowHead.addChild(Flush0);
		Flush0.setTextureOffset(114, 58).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);

		Flush1 = new ModelRenderer(this);
		Flush1.setRotationPoint(6.0F, -3.0F, -6.9F);
		GlowHead.addChild(Flush1);
		Flush1.setTextureOffset(114, 58).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
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