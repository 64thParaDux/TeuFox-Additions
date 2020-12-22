// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelstaticfluff extends EntityModel<Entity> {
	private final ModelRenderer max;private final ModelRenderer 4;private final ModelRenderer 3;private final ModelRenderer 2;
	private final ModelRenderer low;
	private final ModelRenderer hub;
	private final ModelRenderer particle;
	private final ModelRenderer particle2;
	private final ModelRenderer face;

	public Modelstaticfluff() {
		textureWidth = 32;
		textureHeight = 32;

		max = new ModelRenderer(this);
		max.setRotationPoint(0.0F, 16.5F, 0.0F);
		max.setTextureOffset(0, 0).addBox(-8.0F, -0.5F, -8.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		max.setTextureOffset(0, 16).addBox(-8.0F, -0.5F, 7.0F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		max.setTextureOffset(0, 0).addBox(7.0F, -0.5F, -7.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		max.setTextureOffset(0, 16).addBox(-7.0F, -0.5F, -8.0F, 15.0F, 1.0F, 1.0F, 0.0F, false);

		4 = new ModelRenderer(this);
		4.setRotationPoint(0.0F, 16.5F, 0.0F);
		4.setTextureOffset(2, 2).addBox(-7.0F, -0.5F, -7.0F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		4.setTextureOffset(2, 16).addBox(-7.0F, -0.5F, 6.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		4.setTextureOffset(2, 2).addBox(6.0F, -0.5F, -6.0F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		4.setTextureOffset(2, 16).addBox(-6.0F, -0.5F, -7.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);

		3 = new ModelRenderer(this);
		3.setRotationPoint(0.0F, 16.5F, 0.0F);
		3.setTextureOffset(4, 4).addBox(-6.0F, -0.5F, -5.0F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		3.setTextureOffset(4, 16).addBox(-5.0F, -0.5F, 5.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		3.setTextureOffset(4, 4).addBox(5.0F, -0.5F, -6.0F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		3.setTextureOffset(4, 16).addBox(-6.0F, -0.5F, -6.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		2 = new ModelRenderer(this);
		2.setRotationPoint(0.0F, 16.5F, 0.0F);
		2.setTextureOffset(6, 6).addBox(-5.0F, -0.5F, -5.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
		2.setTextureOffset(5, 16).addBox(-5.0F, -0.5F, 4.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		2.setTextureOffset(7, 7).addBox(4.0F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		2.setTextureOffset(6, 16).addBox(-4.0F, -0.5F, -5.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);

		low = new ModelRenderer(this);
		low.setRotationPoint(0.0F, 16.5F, 0.0F);
		low.setTextureOffset(9, 9).addBox(-4.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		low.setTextureOffset(8, 16).addBox(-4.0F, -0.5F, 3.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		low.setTextureOffset(7, 7).addBox(3.0F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		low.setTextureOffset(8, 16).addBox(-4.0F, -0.5F, -4.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		hub = new ModelRenderer(this);
		hub.setRotationPoint(0.0F, 16.5F, 0.0F);
		hub.setTextureOffset(20, 18).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		particle = new ModelRenderer(this);
		particle.setRotationPoint(0.0F, 0.0F, 0.0F);
		hub.addChild(particle);
		particle.setTextureOffset(0, 24).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, 0.0F, false);

		particle2 = new ModelRenderer(this);
		particle2.setRotationPoint(0.0F, 0.0F, 0.0F);
		hub.addChild(particle2);
		particle2.setTextureOffset(0, 16).addBox(0.0F, -4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);

		face = new ModelRenderer(this);
		face.setRotationPoint(0.0F, 16.5F, 0.0F);
		face.setTextureOffset(16, 24).addBox(-4.0F, -4.5F, 9.0F, 8.0F, 8.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		max.render(matrixStack, buffer, packedLight, packedOverlay);
		4.render(matrixStack, buffer, packedLight, packedOverlay);
		3.render(matrixStack, buffer, packedLight, packedOverlay);
		2.render(matrixStack, buffer, packedLight, packedOverlay);
		low.render(matrixStack, buffer, packedLight, packedOverlay);
		hub.render(matrixStack, buffer, packedLight, packedOverlay);
		face.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}