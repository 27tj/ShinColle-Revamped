package com.tj27tj.shinolle_revamped.entity.model.misc;
// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAbyssMissile extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Head;
	private final ModelRenderer Tail;
	private final ModelRenderer Tail1;
	private final ModelRenderer Tail2;

	public ModelAbyssMissile() {
		textureWidth = 32;
		textureHeight = 32;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 14.0F, -1.5F);
		Body.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -5.5F, 4.0F, 4.0F, 11.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(-1.5F, -1.5F, -6.5F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(-1.0F, -1.0F, 5.5F);
		Body.addChild(Tail);
		Tail.setTextureOffset(0, 4).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		Tail1 = new ModelRenderer(this);
		Tail1.setRotationPoint(-0.5F, -2.5F, 5.5F);
		Body.addChild(Tail1);
		Tail1.setTextureOffset(0, 20).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(-2.5F, -0.5F, 5.5F);
		Body.addChild(Tail2);
		Tail2.setTextureOffset(0, 15).addBox(0.0F, 0.0F, 0.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}