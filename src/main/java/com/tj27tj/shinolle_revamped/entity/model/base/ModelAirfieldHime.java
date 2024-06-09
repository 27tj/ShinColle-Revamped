package com.tj27tj.shinolle_revamped.entity.model.base;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class ModelAirfieldHime extends EntityModel<Entity> {
	private final ModelRenderer BodyMain;
	private final ModelRenderer BoobR;
	private final ModelRenderer BoobL;
	private final ModelRenderer Butt;
	private final ModelRenderer LegLeft01;
	private final ModelRenderer LegLeft02;
	private final ModelRenderer ShoesL;
	private final ModelRenderer LegRight01;
	private final ModelRenderer LegRight02;
	private final ModelRenderer ShoesR;
	private final ModelRenderer ArmRight01;
	private final ModelRenderer ArmRight02;
	private final ModelRenderer EquipHand01;
	private final ModelRenderer Neck;
	private final ModelRenderer Head;
	private final ModelRenderer HairMain;
	private final ModelRenderer Hair01;
	private final ModelRenderer Hair02;
	private final ModelRenderer Hair03;
	private final ModelRenderer Hair;
	private final ModelRenderer Ahoke;
	private final ModelRenderer HairR01;
	private final ModelRenderer HairR02;
	private final ModelRenderer HairL01;
	private final ModelRenderer HairL02;
	private final ModelRenderer ArmLeft01;
	private final ModelRenderer ArmLeft02;
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
	private final ModelRenderer HeadHL;
	private final ModelRenderer HeadHL2;
	private final ModelRenderer HeadHL3;
	private final ModelRenderer HeadHR;
	private final ModelRenderer HeadHR2;
	private final ModelRenderer HeadHR3;
	private final ModelRenderer GlowEquipBase;
	private final ModelRenderer EquipRdL01;
	private final ModelRenderer EquipRdL02;
	private final ModelRenderer EquipRdL03;
	private final ModelRenderer EquipRdL04;
	private final ModelRenderer EquipRdL05;
	private final ModelRenderer EquipRdL06;
	private final ModelRenderer EquipRdR01;
	private final ModelRenderer EquipRdR02;
	private final ModelRenderer EquipRdR03;
	private final ModelRenderer EquipRdR04;
	private final ModelRenderer EquipRdR05;
	private final ModelRenderer EquipRdR06;
	private final ModelRenderer getArmForSideEnumHandSide;

	public ModelAirfieldHime() {
		textureWidth = 128;
		textureHeight = 128;

		BodyMain = new ModelRenderer(this);
		BodyMain.setRotationPoint(0.0F, -15.0F, 0.0F);
		setRotationAngle(BodyMain, -0.1745F, 0.0F, 0.0F);
		BodyMain.setTextureOffset(0, 104).addBox(-6.5F, -8.0456F, -3.4791F, 13.0F, 17.0F, 7.0F, 0.0F, false);

		BoobR = new ModelRenderer(this);
		BoobR.setRotationPoint(-3.7F, -8.6F, -3.5F);
		BodyMain.addChild(BoobR);
		setRotationAngle(BoobR, -0.6981F, -0.1396F, -0.0873F);
		BoobR.setTextureOffset(33, 101).addBox(-3.6521F, 1.2532F, 0.9035F, 7.0F, 5.0F, 5.0F, 0.0F, false);

		BoobL = new ModelRenderer(this);
		BoobL.setRotationPoint(3.7F, -8.6F, -3.5F);
		BodyMain.addChild(BoobL);
		setRotationAngle(BoobL, -0.6981F, 0.1396F, 0.0873F);
		BoobL.setTextureOffset(33, 101).addBox(-3.3479F, 1.2532F, 0.9035F, 7.0F, 5.0F, 5.0F, 0.0F, true);

		Butt = new ModelRenderer(this);
		Butt.setRotationPoint(0.0F, 0.0F, 0.0F);
		BodyMain.addChild(Butt);
		setRotationAngle(Butt, 0.3142F, 0.0F, 0.0F);
		Butt.setTextureOffset(39, 0).addBox(-7.5F, 6.9708F, -6.1175F, 15.0F, 8.0F, 8.0F, 0.0F, false);

		LegLeft01 = new ModelRenderer(this);
		LegLeft01.setRotationPoint(4.7F, 24.5F, -2.6F);
		Butt.addChild(LegLeft01);
		setRotationAngle(LegLeft01, 0.0F, 0.0F, 0.14F);
		LegLeft01.setTextureOffset(0, 84).addBox(-4.6971F, -12.0426F, -3.3105F, 6.0F, 14.0F, 6.0F, 0.0F, true);

		LegLeft02 = new ModelRenderer(this);
		LegLeft02.setRotationPoint(0.0F, 14.0F, -3.0F);
		LegLeft01.addChild(LegLeft02);
		LegLeft02.setTextureOffset(0, 84).addBox(-4.7233F, -15.0953F, -0.289F, 6.0F, 7.0F, 6.0F, 0.0F, true);

		ShoesL = new ModelRenderer(this);
		ShoesL.setRotationPoint(0.0F, 7.0F, 3.0F);
		LegLeft02.addChild(ShoesL);
		ShoesL.setTextureOffset(87, 0).addBox(-5.2233F, -15.0953F, -3.789F, 7.0F, 8.0F, 7.0F, 0.0F, true);

		LegRight01 = new ModelRenderer(this);
		LegRight01.setRotationPoint(-4.7F, 9.5F, -2.6F);
		Butt.addChild(LegRight01);
		setRotationAngle(LegRight01, -0.1047F, 0.0F, -0.14F);
		LegRight01.setTextureOffset(0, 84).addBox(-3.4165F, 2.9726F, -3.0078F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		LegRight02 = new ModelRenderer(this);
		LegRight02.setRotationPoint(0.0F, 29.0F, -3.0F);
		LegRight01.addChild(LegRight02);
		LegRight02.setTextureOffset(0, 84).addBox(-3.3931F, -15.21F, 0.0026F, 6.0F, 7.0F, 6.0F, 0.0F, false);

		ShoesR = new ModelRenderer(this);
		ShoesR.setRotationPoint(0.0F, 7.0F, 3.0F);
		LegRight02.addChild(ShoesR);
		ShoesR.setTextureOffset(87, 0).addBox(-3.8931F, -15.21F, -3.4974F, 7.0F, 8.0F, 7.0F, 0.0F, false);

		ArmRight01 = new ModelRenderer(this);
		ArmRight01.setRotationPoint(-7.8F, -9.3F, -0.7F);
		BodyMain.addChild(ArmRight01);
		setRotationAngle(ArmRight01, 0.2094F, 0.0F, 0.2094F);
		ArmRight01.setTextureOffset(2, 85).addBox(-3.0F, -1.0F, -2.5F, 5.0F, 13.0F, 5.0F, 0.0F, false);

		ArmRight02 = new ModelRenderer(this);
		ArmRight02.setRotationPoint(-3.0F, 27.0F, 2.5F);
		ArmRight01.addChild(ArmRight02);
		ArmRight02.setTextureOffset(24, 83).addBox(-0.0538F, -15.0149F, -5.0222F, 5.0F, 13.0F, 5.0F, 0.0F, false);

		EquipHand01 = new ModelRenderer(this);
		EquipHand01.setRotationPoint(-0.5F, 7.5F, 0.0F);
		ArmRight01.addChild(EquipHand01);
		EquipHand01.setTextureOffset(0, 17).addBox(-3.0978F, 0.0203F, -3.0043F, 6.0F, 5.0F, 6.0F, 0.0F, false);
		EquipHand01.setTextureOffset(0, 17).addBox(-3.0538F, 3.9851F, -3.0222F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, -10.3F, -0.5F);
		BodyMain.addChild(Neck);
		setRotationAngle(Neck, 0.2094F, 0.0F, 0.0F);
		Neck.setTextureOffset(88, 26).addBox(-5.5F, 0.9982F, -5.1047F, 11.0F, 3.0F, 9.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 13.5F, 0.0F);
		Neck.addChild(Head);
		Head.setTextureOffset(44, 101).addBox(-7.0F, -26.4927F, -6.0812F, 14.0F, 14.0F, 13.0F, 0.0F, false);

		HairMain = new ModelRenderer(this);
		HairMain.setRotationPoint(0.0F, -27.686F, -1.6973F);
		Head.addChild(HairMain);
		HairMain.setTextureOffset(48, 55).addBox(-7.5F, 0.0F, 0.0F, 15.0F, 12.0F, 10.0F, 0.0F, false);

		Hair01 = new ModelRenderer(this);
		Hair01.setRotationPoint(0.0F, 9.0F, 1.0F);
		HairMain.addChild(Hair01);
		setRotationAngle(Hair01, 0.2618F, 0.0F, 0.0F);
		Hair01.setTextureOffset(46, 29).addBox(-7.5F, 0.0F, 0.0F, 15.0F, 17.0F, 9.0F, 0.0F, false);

		Hair02 = new ModelRenderer(this);
		Hair02.setRotationPoint(0.0F, 30.0F, 8.5F);
		Hair01.addChild(Hair02);
		setRotationAngle(Hair02, -0.0873F, 0.0F, 0.0F);
		Hair02.setTextureOffset(0, 59).addBox(-8.0F, -15.1494F, -8.9363F, 16.0F, 16.0F, 8.0F, 0.0F, false);

		Hair03 = new ModelRenderer(this);
		Hair03.setRotationPoint(0.0F, 12.5F, -0.1F);
		Hair02.addChild(Hair03);
		setRotationAngle(Hair03, -0.1396F, 0.0F, 0.0F);
		Hair03.setTextureOffset(0, 37).addBox(-8.0F, -14.4542F, -10.5064F, 16.0F, 15.0F, 7.0F, 0.0F, false);

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(0.0F, -20.4921F, 0.4537F);
		Head.addChild(Hair);
		Hair.setTextureOffset(45, 77).addBox(-8.0F, -6.8182F, -7.7416F, 16.0F, 16.0F, 8.0F, 0.0F, false);

		Ahoke = new ModelRenderer(this);
		Ahoke.setRotationPoint(0.0F, -12.517F, 0.9855F);
		Hair.addChild(Ahoke);
		setRotationAngle(Ahoke, 0.0F, 0.5236F, 0.0F);
		Ahoke.setTextureOffset(104, 29).addBox(2.3651F, -4.1047F, -13.5965F, 0.0F, 12.0F, 12.0F, 0.0F, false);

		HairR01 = new ModelRenderer(this);
		HairR01.setRotationPoint(-6.5F, 14.8F, -2.5F);
		Hair.addChild(HairR01);
		setRotationAngle(HairR01, -0.2618F, 0.1745F, 0.1396F);
		HairR01.setTextureOffset(25, 18).addBox(-2.1443F, -7.6687F, -1.9702F, 2.0F, 11.0F, 5.0F, 0.0F, true);

		HairR02 = new ModelRenderer(this);
		HairR02.setRotationPoint(0.2F, 17.5F, 0.0F);
		HairR01.addChild(HairR02);
		setRotationAngle(HairR02, 0.2618F, 0.0F, -0.0524F);
		HairR02.setTextureOffset(25, 18).addBox(-1.3786F, -15.0062F, 2.0618F, 2.0F, 12.0F, 5.0F, 0.0F, true);

		HairL01 = new ModelRenderer(this);
		HairL01.setRotationPoint(6.5F, 14.8F, -2.5F);
		Hair.addChild(HairL01);
		setRotationAngle(HairL01, -0.2618F, -0.1745F, -0.1396F);
		HairL01.setTextureOffset(25, 18).addBox(0.1443F, -7.6687F, -1.9702F, 2.0F, 11.0F, 5.0F, 0.0F, false);

		HairL02 = new ModelRenderer(this);
		HairL02.setRotationPoint(0.0F, 17.5F, 0.0F);
		HairL01.addChild(HairL02);
		setRotationAngle(HairL02, 0.2618F, 0.0F, 0.0873F);
		HairL02.setTextureOffset(25, 18).addBox(-1.3584F, -15.0235F, 1.994F, 2.0F, 12.0F, 5.0F, 0.0F, false);

		ArmLeft01 = new ModelRenderer(this);
		ArmLeft01.setRotationPoint(7.8F, -9.3F, -0.7F);
		BodyMain.addChild(ArmLeft01);
		setRotationAngle(ArmLeft01, 0.2094F, 0.0F, -0.2094F);
		ArmLeft01.setTextureOffset(2, 85).addBox(-2.0F, -1.0F, -2.5F, 5.0F, 13.0F, 5.0F, 0.0F, true);

		ArmLeft02 = new ModelRenderer(this);
		ArmLeft02.setRotationPoint(3.0F, 27.0F, 2.5F);
		ArmLeft01.addChild(ArmLeft02);
		ArmLeft02.setTextureOffset(24, 83).addBox(-4.9621F, -15.4266F, -5.0057F, 5.0F, 13.0F, 5.0F, 0.0F, true);

		GlowBodyMain = new ModelRenderer(this);
		GlowBodyMain.setRotationPoint(0.0F, -15.0F, 0.0F);
		setRotationAngle(GlowBodyMain, -0.1745F, 0.0F, 0.0F);


		GlowNeck = new ModelRenderer(this);
		GlowNeck.setRotationPoint(0.0F, -10.3F, -0.5F);
		GlowBodyMain.addChild(GlowNeck);
		setRotationAngle(GlowNeck, 0.2094F, 0.0F, 0.0F);


		GlowHead = new ModelRenderer(this);
		GlowHead.setRotationPoint(0.0F, -1.5F, 0.0F);
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

		HeadHL = new ModelRenderer(this);
		HeadHL.setRotationPoint(6.4F, -10.6F, 0.8F);
		GlowHead.addChild(HeadHL);
		setRotationAngle(HeadHL, -0.7854F, -0.1745F, -0.3142F);
		HeadHL.setTextureOffset(39, 28).addBox(0.0F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, 0.0F, true);

		HeadHL2 = new ModelRenderer(this);
		HeadHL2.setRotationPoint(3.0F, 0.0F, 0.0F);
		HeadHL.addChild(HeadHL2);
		HeadHL2.setTextureOffset(47, 56).addBox(0.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		HeadHL3 = new ModelRenderer(this);
		HeadHL3.setRotationPoint(1.0F, 0.0F, 0.0F);
		HeadHL2.addChild(HeadHL3);
		HeadHL3.setTextureOffset(43, 30).addBox(0.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		HeadHR = new ModelRenderer(this);
		HeadHR.setRotationPoint(-6.4F, -10.6F, 0.8F);
		GlowHead.addChild(HeadHR);
		setRotationAngle(HeadHR, -0.7854F, 0.1745F, 0.3142F);
		HeadHR.setTextureOffset(39, 28).addBox(-3.0F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, 0.0F, true);

		HeadHR2 = new ModelRenderer(this);
		HeadHR2.setRotationPoint(-3.0F, 0.0F, 0.0F);
		HeadHR.addChild(HeadHR2);
		HeadHR2.setTextureOffset(47, 56).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		HeadHR3 = new ModelRenderer(this);
		HeadHR3.setRotationPoint(-1.0F, 0.0F, 0.0F);
		HeadHR2.addChild(HeadHR3);
		HeadHR3.setTextureOffset(43, 30).addBox(-1.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		GlowEquipBase = new ModelRenderer(this);
		GlowEquipBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		GlowBodyMain.addChild(GlowEquipBase);


		EquipRdL01 = new ModelRenderer(this);
		EquipRdL01.setRotationPoint(5.0F, 0.0F, 6.0F);
		GlowEquipBase.addChild(EquipRdL01);
		setRotationAngle(EquipRdL01, 1.4F, -0.3491F, -0.3491F);
		EquipRdL01.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		EquipRdL02 = new ModelRenderer(this);
		EquipRdL02.setRotationPoint(0.0F, 0.0F, -11.0F);
		EquipRdL01.addChild(EquipRdL02);
		setRotationAngle(EquipRdL02, -0.3491F, 0.0F, 0.0F);
		EquipRdL02.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		EquipRdL03 = new ModelRenderer(this);
		EquipRdL03.setRotationPoint(0.0F, 0.0F, -11.0F);
		EquipRdL02.addChild(EquipRdL03);
		setRotationAngle(EquipRdL03, -0.4363F, 0.0F, 0.0F);
		EquipRdL03.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		EquipRdL04 = new ModelRenderer(this);
		EquipRdL04.setRotationPoint(0.0F, 0.0F, -11.0F);
		EquipRdL03.addChild(EquipRdL04);
		setRotationAngle(EquipRdL04, -0.3491F, 0.0F, 0.0F);
		EquipRdL04.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		EquipRdL05 = new ModelRenderer(this);
		EquipRdL05.setRotationPoint(0.0F, 0.0F, -11.0F);
		EquipRdL04.addChild(EquipRdL05);
		setRotationAngle(EquipRdL05, -0.2618F, 0.0F, 0.0F);
		EquipRdL05.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		EquipRdL06 = new ModelRenderer(this);
		EquipRdL06.setRotationPoint(0.0F, 0.0F, -11.0F);
		EquipRdL05.addChild(EquipRdL06);
		setRotationAngle(EquipRdL06, -0.1745F, 0.0F, 0.0F);
		EquipRdL06.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		EquipRdR01 = new ModelRenderer(this);
		EquipRdR01.setRotationPoint(-5.0F, 0.0F, 6.0F);
		GlowEquipBase.addChild(EquipRdR01);
		setRotationAngle(EquipRdR01, 1.4F, 0.3491F, 0.3491F);
		EquipRdR01.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		EquipRdR02 = new ModelRenderer(this);
		EquipRdR02.setRotationPoint(0.0F, 0.0F, -11.0F);
		EquipRdR01.addChild(EquipRdR02);
		setRotationAngle(EquipRdR02, -0.3491F, 0.0F, 0.0F);
		EquipRdR02.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		EquipRdR03 = new ModelRenderer(this);
		EquipRdR03.setRotationPoint(0.0F, 0.0F, -11.0F);
		EquipRdR02.addChild(EquipRdR03);
		setRotationAngle(EquipRdR03, -0.4363F, 0.0F, 0.0F);
		EquipRdR03.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		EquipRdR04 = new ModelRenderer(this);
		EquipRdR04.setRotationPoint(0.0F, 0.0F, -11.0F);
		EquipRdR03.addChild(EquipRdR04);
		setRotationAngle(EquipRdR04, -0.3491F, 0.0F, 0.0F);
		EquipRdR04.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		EquipRdR05 = new ModelRenderer(this);
		EquipRdR05.setRotationPoint(0.0F, 0.0F, -11.0F);
		EquipRdR04.addChild(EquipRdR05);
		setRotationAngle(EquipRdR05, -0.2618F, 0.0F, 0.0F);
		EquipRdR05.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		EquipRdR06 = new ModelRenderer(this);
		EquipRdR06.setRotationPoint(0.0F, 0.0F, -11.0F);
		EquipRdR05.addChild(EquipRdR06);
		setRotationAngle(EquipRdR06, -0.1745F, 0.0F, 0.0F);
		EquipRdR06.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -12.0F, 7.0F, 1.0F, 12.0F, 0.0F, false);

		getArmForSideEnumHandSide = new ModelRenderer(this);
		getArmForSideEnumHandSide.setRotationPoint(0.0F, 0.0F, 0.0F);
		
	}

	@Override
	public void setRotationAngles(@NotNull Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(@NotNull MatrixStack matrixStack, @NotNull IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		BodyMain.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		GlowBodyMain.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		getArmForSideEnumHandSide.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}