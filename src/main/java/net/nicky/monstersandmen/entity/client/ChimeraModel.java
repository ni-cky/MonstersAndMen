package net.nicky.monstersandmen.entity.client;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.nicky.monstersandmen.entity.animations.ModAnimationDefinitions;
import net.nicky.monstersandmen.entity.custom.ChimeraEntity;

public class ChimeraModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart chimera;
	private final ModelPart headDragon;
	private final ModelPart headLion;
	private final ModelPart headGoat;


	public ChimeraModel(ModelPart root) {
		this.chimera = root.getChild("chimera");
		this.headDragon = chimera.getChild("shoulders").getChild("heads").getChild("dragon").getChild("neckDragon").getChild("headDragon");
		this.headLion = chimera.getChild("shoulders").getChild("heads").getChild("lion").getChild("neckLion").getChild("headLion");
		this.headGoat = chimera.getChild("shoulders").getChild("heads").getChild("goat").getChild("neckGoat").getChild("headGoat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chimera = partdefinition.addOrReplaceChild("chimera", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, -18.0F));

		PartDefinition shoulders = chimera.addOrReplaceChild("shoulders", CubeListBuilder.create().texOffs(0, 43).addBox(-12.0F, -8.0F, -6.0F, 24.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 6.0F));

		PartDefinition heads = shoulders.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -6.0F));

		PartDefinition dragon = heads.addOrReplaceChild("dragon", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition neckDragon = dragon.addOrReplaceChild("neckDragon", CubeListBuilder.create().texOffs(75, 97).addBox(-2.0F, -3.0F, -7.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -1.0F, 0.0F, -0.5253F, -0.0756F, 0.0437F));

		PartDefinition headDragon = neckDragon.addOrReplaceChild("headDragon", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, -0.1745F, 0.5672F, 0.0F));

		PartDefinition head = headDragon.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 83).addBox(-4.0F, 11.0F, -15.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(20, 14).addBox(1.5F, 9.0F, -12.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-2.5F, 9.0F, -12.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -16.0F, 7.0F));

		PartDefinition snout = headDragon.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(0, 14).addBox(-13.0F, 14.0F, -23.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-8.5F, 13.5F, -22.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 19).addBox(-12.5F, 13.5F, -22.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(10.0F, -16.0F, 7.0F));

		PartDefinition jaw = headDragon.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(62, 112).addBox(-3.0F, -1.0F, -8.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -8.0F));

		PartDefinition lion = heads.addOrReplaceChild("lion", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neckLion = lion.addOrReplaceChild("neckLion", CubeListBuilder.create().texOffs(66, 80).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.7494F, 0.1284F, 0.1186F));

		PartDefinition headLion = neckLion.addOrReplaceChild("headLion", CubeListBuilder.create().texOffs(106, 94).addBox(-6.0F, -7.0F, -1.0F, 12.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.5672F, -0.2618F, 0.0F));

		PartDefinition head2 = headLion.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(24, 97).addBox(-4.25F, -3.0F, -4.5F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(24, 83).addBox(-2.75F, -0.03F, -6.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(92, 26).addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(40, 83).addBox(-3.5F, -5.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -4.0F));

		PartDefinition goat = heads.addOrReplaceChild("goat", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition neckGoat = goat.addOrReplaceChild("neckGoat", CubeListBuilder.create().texOffs(84, 119).addBox(-2.0F, -3.0F, -7.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -1.0F, 1.0F, -0.132F, 0.1298F, -0.0172F));

		PartDefinition headGoat = neckGoat.addOrReplaceChild("headGoat", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4645F, -4.7358F, -8.1404F, 0.0F, -0.1309F, 0.0F));

		PartDefinition nose_r1 = headGoat.addOrReplaceChild("nose_r1", CubeListBuilder.create().texOffs(92, 26).addBox(-2.7708F, -3.1891F, -4.9715F, 5.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2354F, 1.9249F, -1.8881F, 0.5236F, 0.2094F, -0.0873F));

		PartDefinition right_horn_r1 = headGoat.addOrReplaceChild("right_horn_r1", CubeListBuilder.create().texOffs(16, 0).addBox(0.2292F, -20.0184F, -15.1018F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2354F, 17.7542F, 8.2422F, -0.4344F, 0.2534F, -0.0867F));

		PartDefinition left_horn_r1 = headGoat.addOrReplaceChild("left_horn_r1", CubeListBuilder.create().texOffs(0, 43).addBox(3.2292F, -20.0184F, -15.1018F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 9).addBox(5.2292F, -15.0184F, -15.1018F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(-2.7708F, -15.0184F, -15.1018F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2354F, 17.7542F, 8.2422F, -0.4518F, 0.2534F, -0.0867F));

		PartDefinition head_r1 = headGoat.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8491F, -4.0986F, -4.4674F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3137F, 7.8344F, -2.3922F, -0.2249F, 0.2534F, -0.0867F));

		PartDefinition rightFrontLeg = shoulders.addOrReplaceChild("rightFrontLeg", CubeListBuilder.create().texOffs(75, 80).addBox(-4.0F, -3.0F, -4.5F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0F, 0.0F, -3.5F, 2.2689F, 0.0F, 0.0F));

		PartDefinition rFLowerLeg = rightFrontLeg.addOrReplaceChild("rFLowerLeg", CubeListBuilder.create().texOffs(86, 97).addBox(-2.0F, -4.0F, -11.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, -3.5F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rFPaw = rFLowerLeg.addOrReplaceChild("rFPaw", CubeListBuilder.create().texOffs(40, 121).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -10.5F, -1.1882F, 0.0861F, -0.1473F));

		PartDefinition leftFrontLeg = shoulders.addOrReplaceChild("leftFrontLeg", CubeListBuilder.create().texOffs(41, 80).addBox(-4.0F, -3.0F, -4.5F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.0F, -3.5F, 2.2689F, 0.0F, 0.0F));

		PartDefinition lFLowerLeg = leftFrontLeg.addOrReplaceChild("lFLowerLeg", CubeListBuilder.create().texOffs(56, 97).addBox(-2.0F, -4.0F, -11.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, -3.5F, -1.0908F, 0.0F, 0.0F));

		PartDefinition lFPaw = lFLowerLeg.addOrReplaceChild("lFPaw", CubeListBuilder.create().texOffs(14, 99).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -10.5F, -1.1882F, -0.0861F, 0.1473F));

		PartDefinition torso = shoulders.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -7.0F, -14.0F, 18.0F, 15.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 20.0F));

		PartDefinition rightBackLeg = torso.addOrReplaceChild("rightBackLeg", CubeListBuilder.create().texOffs(30, 111).addBox(-6.0F, -4.0F, -3.0F, 10.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -1.0F, 9.0F, 0.0F, 0.7418F, -1.5708F));

		PartDefinition rBLowerLeg = rightBackLeg.addOrReplaceChild("rBLowerLeg", CubeListBuilder.create().texOffs(108, 117).addBox(-9.0F, -3.0F, -2.5F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -1.0F, 0.5F, 0.0F, -1.7017F, 0.0F));

		PartDefinition rBHoove = rBLowerLeg.addOrReplaceChild("rBHoove", CubeListBuilder.create().texOffs(26, 121).addBox(-4.0F, -3.0F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 0.0F, 0.0F, 0.0F, 0.9599F, 0.0F));

		PartDefinition leftBackLeg = torso.addOrReplaceChild("leftBackLeg", CubeListBuilder.create().texOffs(110, 107).addBox(-4.0F, -4.0F, -3.0F, 10.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -1.0F, 9.0F, 0.0F, -0.7418F, 1.5708F));

		PartDefinition lBLowerLeg = leftBackLeg.addOrReplaceChild("lBLowerLeg", CubeListBuilder.create().texOffs(0, 117).addBox(0.0F, -3.0F, -2.5F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -1.0F, 0.5F, 0.0F, 1.7017F, 0.0F));

		PartDefinition lBHoove = lBLowerLeg.addOrReplaceChild("lBHoove", CubeListBuilder.create().texOffs(48, 97).addBox(0.0F, -3.0F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 0.0F, 0.0F, 0.0F, -0.9599F, 0.0F));

		PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 14.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition middleTail = tail.addOrReplaceChild("middleTail", CubeListBuilder.create().texOffs(112, 26).addBox(-15.0F, -1.0F, 0.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.0F, 0.0F, -0.3054F, 0.6981F));

		PartDefinition tipTail = middleTail.addOrReplaceChild("tipTail", CubeListBuilder.create().texOffs(0, 99).addBox(-2.0F, -1.0F, -10.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, 0.0F, 0.0F, -0.2084F, 0.0651F, 0.2986F));

		PartDefinition rightWing = shoulders.addOrReplaceChild("rightWing", CubeListBuilder.create().texOffs(82, 115).addBox(-13.0F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(109, 85).addBox(-13.0F, 0.0F, 1.0F, 13.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, -5.0F, 3.0F, 0.0F, 0.6545F, 0.6981F));

		PartDefinition cube_r1 = rightWing.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(104, 73).addBox(-13.0F, -1.0F, -5.0F, 15.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition rightWingTip = rightWing.addOrReplaceChild("rightWingTip", CubeListBuilder.create().texOffs(64, 4).addBox(-42.0F, -1.0F, -1.0F, 42.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(60, 48).addBox(-42.0F, 0.0F, 1.0F, 41.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(64, 20).addBox(-40.0F, 0.0F, 5.0F, 41.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 17).addBox(-37.0F, 0.0F, 11.0F, 41.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 11).addBox(-34.0F, 0.0F, 17.0F, 41.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 70).addBox(-39.0F, 0.0F, 7.0F, 37.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(72, 58).addBox(-36.0F, 0.0F, 13.0F, 31.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, 0.0F, 0.0F, 1.6806F, -0.6516F, -1.6376F));

		PartDefinition cube_r2 = rightWingTip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(100, 85).addBox(-2.0F, 1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-44.0F, -1.0F, -2.0F, 0.6117F, -0.6002F, -0.8929F));

		PartDefinition cube_r3 = rightWingTip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(78, 70).addBox(-2.5F, -0.5F, 2.0F, 23.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.5F, 0.5F, 21.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r4 = rightWingTip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 75).addBox(-2.5F, -0.5F, -2.0F, 23.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.5F, 0.5F, 21.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition leftWing = shoulders.addOrReplaceChild("leftWing", CubeListBuilder.create().texOffs(0, 111).addBox(0.0F, 0.0F, 1.0F, 13.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(112, 30).addBox(0.0F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, -5.0F, 3.0F, 0.0F, -0.6545F, -0.6981F));

		PartDefinition cube_r5 = leftWing.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(100, 80).addBox(-2.0F, -1.0F, -5.0F, 15.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition leftWingTip = leftWing.addOrReplaceChild("leftWingTip", CubeListBuilder.create().texOffs(64, 0).addBox(0.0F, -1.0F, -1.0F, 42.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 23).addBox(-7.0F, 0.0F, 17.0F, 41.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(60, 43).addBox(1.0F, 0.0F, 1.0F, 41.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(64, 14).addBox(-1.0F, 0.0F, 5.0F, 41.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(68, 65).addBox(2.0F, 0.0F, 7.0F, 37.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(64, 8).addBox(-4.0F, 0.0F, 11.0F, 41.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 53).addBox(5.0F, 0.0F, 13.0F, 31.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 0.0F, 0.0F, 1.6806F, 0.6516F, 1.6376F));

		PartDefinition cube_r6 = leftWingTip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(44.0F, -1.0F, -2.0F, 0.6117F, 0.6002F, 0.8929F));

		PartDefinition cube_r7 = leftWingTip.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 75).addBox(-20.5F, -0.5F, -2.0F, 23.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(29.5F, 0.5F, 21.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r8 = leftWingTip.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 80).addBox(-20.5F, -0.5F, 2.0F, 23.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(29.5F, 0.5F, 21.0F, 0.0F, 0.48F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw,headPitch,ageInTicks);

		this.animateWalk(ModAnimationDefinitions.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((ChimeraEntity) entity).idleAnimationState, ModAnimationDefinitions.IDLE, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks){
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);


		this.headDragon.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.headLion.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.headGoat.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.headDragon.xRot = pHeadPitch * ((float)Math.PI / 180F);
		this.headLion.xRot = pHeadPitch * ((float)Math.PI / 180F);
		this.headGoat.xRot = pHeadPitch * ((float)Math.PI / 180F);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		chimera.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return chimera;
	}

}