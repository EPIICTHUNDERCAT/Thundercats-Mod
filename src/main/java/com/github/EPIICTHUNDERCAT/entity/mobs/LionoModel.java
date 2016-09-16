package com.github.EPIICTHUNDERCAT.entity.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class LionoModel extends ModelBase {
	public ModelRenderer Body;
	public ModelRenderer Body1;
	public ModelRenderer Neck;
	public ModelRenderer Arm1;
	public ModelRenderer Arm2;
	public ModelRenderer Leg1;
	public ModelRenderer Leg2;
	public ModelRenderer Body2;
	public ModelRenderer Body3;
	public ModelRenderer Body4;
	public ModelRenderer Head;
	public ModelRenderer Hair;
	public ModelRenderer Hair_1;
	public ModelRenderer Hair_2;
	public ModelRenderer Hair_3;
	public ModelRenderer Hair_4;
	public ModelRenderer ArmBottom;
	public ModelRenderer ArmHand;
	public ModelRenderer ArmBottom_1;
	public ModelRenderer ArmHand_1;
	public ModelRenderer LegMuscle;
	public ModelRenderer RestOfLeg;
	public ModelRenderer Foot;
	public ModelRenderer LegMuscle_1;
	public ModelRenderer RestOfLeg_1;
	public ModelRenderer Foot_1;
	
	

	public LionoModel() {
	        this.textureWidth = 1024;
	        this.textureHeight = 512;
	        
	        this.LegMuscle = new ModelRenderer(this, 0, 0);
	        this.LegMuscle.setRotationPoint(0.0F, 2.5F, 0.2F);
	        this.LegMuscle.addBox(-2.1F, -1.3F, -1.7F, 4, 6, 4, 0.0F);
	        
	        this.Foot_1 = new ModelRenderer(this, 0, 0);
	        this.Foot_1.setRotationPoint(0.2F, 6.6F, -1.0F);
	        this.Foot_1.addBox(-1.9F, 0.1F, -3.8F, 4, 1, 5, 0.0F);
	        
	        this.Leg2 = new ModelRenderer(this, 0, 0);
	        this.Leg2.setRotationPoint(-3.5F, 8.9F, 1.5F);
	        this.Leg2.addBox(-1.4F, 0.0F, -1.7F, 3, 8, 3, 0.0F);
	        
	        this.Body2 = new ModelRenderer(this, 102, 0);
	        this.Body2.setRotationPoint(-0.1F, 0.0F, 4.8F);
	        this.Body2.addBox(0.0F, 0.0F, 0.0F, 1, 15, 4, 0.0F);
	        this.setRotateAngle(Body2, 0.0F, 0.9930923443847736F, -0.005235987755982988F);
	        
	        this.Hair = new ModelRenderer(this, 0, 0);
	        this.Hair.setRotationPoint(0.2F, -7.0F, -0.3F);
	        this.Hair.addBox(-2.8F, -0.3F, -2.9F, 6, 3, 6, 0.0F);
	        
	        this.Body1 = new ModelRenderer(this, 90, 0);
	        this.Body1.setRotationPoint(-4.3F, -6.3F, -3.2F);
	        this.Body1.addBox(0.0F, 0.0F, 0.0F, 1, 15, 5, 0.0F);
	        this.setRotateAngle(Body1, 0.0F, -0.41643555952584704F, 0.0F);
	        
	        this.RestOfLeg_1 = new ModelRenderer(this, 0, 0);
	        this.RestOfLeg_1.setRotationPoint(-0.2F, 7.3F, 0.6F);
	        this.RestOfLeg_1.addBox(-1.3F, 0.0F, -2.0F, 3, 7, 3, 0.0F);
	        this.setRotateAngle(RestOfLeg_1, 0.091106186954104F, -0.024434609527920613F, 0.0F);
	        
	        this.ArmBottom_1 = new ModelRenderer(this, 162, 0);
	        this.ArmBottom_1.setRotationPoint(-2.6F, 5.9F, -1.8F);
	        this.ArmBottom_1.addBox(0.0F, -3.7F, 0.0F, 4, 8, 4, 0.0F);
	        
	        this.ArmHand_1 = new ModelRenderer(this, 178, 0);
	        this.ArmHand_1.setRotationPoint(1.5F, 6.3F, 2.9F);
	        this.ArmHand_1.addBox(-1.1F, 0.0F, -2.0F, 3, 8, 3, 0.0F);
	        this.setRotateAngle(ArmHand_1, -0.27314402793711257F, 0.06422811647339133F, 0.0F);
	        
	        this.RestOfLeg = new ModelRenderer(this, 0, 0);
	        this.RestOfLeg.setRotationPoint(-0.3F, 5.5F, -0.1F);
	        this.RestOfLeg.addBox(-1.3F, 0.1F, -1.3F, 3, 7, 3, 0.0F);
	        this.setRotateAngle(RestOfLeg, 0.091106186954104F, -0.024434609527920613F, 0.0F);
	        
	        this.Arm1 = new ModelRenderer(this, 34, 0);
	        this.Arm1.setRotationPoint(4.1F, -6.2F, 0.0F);
	        this.Arm1.addBox(-0.1F, -0.2F, -1.5F, 3, 12, 3, 0.0F);
	        this.setRotateAngle(Arm1, 0.0F, 0.091106186954104F, -0.27314402793711257F);
	        
	        this.Hair_4 = new ModelRenderer(this, 0, 0);
	        this.Hair_4.setRotationPoint(5.6F, 3.0F, -0.1F);
	        this.Hair_4.addBox(0.0F, 0.0F, -3.1F, 1, 1, 6, 0.0F);
	        this.setRotateAngle(Hair_4, 0.0F, 0.0F, 1.2747884856566583F);
	        
	        this.Foot = new ModelRenderer(this, 0, 0);
	        this.Foot.setRotationPoint(0.2F, 6.6F, 0.3F);
	        this.Foot.addBox(-1.9F, 0.1F, -3.8F, 4, 1, 5, 0.0F);
	        
	        this.Hair_3 = new ModelRenderer(this, 0, 0);
	        this.Hair_3.setRotationPoint(0.7F, -0.2F, 3.1F);
	        this.Hair_3.addBox(-0.4F, -0.1F, -3.1F, 1, 1, 6, 0.0F);
	        this.setRotateAngle(Hair_3, 0.0F, 0.0F, -0.5462880558742251F);
	        
	        this.ArmHand = new ModelRenderer(this, 150, 0);
	        this.ArmHand.setRotationPoint(1.7F, 6.5F, 1.6F);
	        this.ArmHand.addBox(-1.1F, 0.0F, -1.0F, 3, 8, 3, 0.0F);
	        this.setRotateAngle(ArmHand, -0.27314402793711257F, 0.0F, 0.0F);
	        
	        this.Leg1 = new ModelRenderer(this, 0, 0);
	        this.Leg1.setRotationPoint(2.8F, 8.7F, 0.9F);
	        this.Leg1.addBox(-1.6F, 0.2F, -0.9F, 3, 8, 3, 0.0F);
	        
	        this.Body4 = new ModelRenderer(this, 124, 0);
	        this.Body4.setRotationPoint(3.9F, 0.0F, 1.4F);
	        this.Body4.addBox(-0.3F, 0.0F, -0.5F, 1, 15, 4, 0.0F);
	        this.setRotateAngle(Body4, 0.0F, -1.9865337546199457F, 0.0F);
	        
	        this.Neck = new ModelRenderer(this, 46, 0);
	        this.Neck.setRotationPoint(0.2F, -7.4F, 0.6F);
	        this.Neck.addBox(-4.0F, 0.3F, -3.8F, 8, 1, 8, 0.0F);
	        
	        this.Head = new ModelRenderer(this, 0, 0);
	        this.Head.setRotationPoint(-0.4F, -0.1F, 0.2F);
	        this.Head.addBox(-3.1F, -6.5F, -3.5F, 7, 7, 7, 0.0F);
	        
	        this.Body3 = new ModelRenderer(this, 112, 0);
	        this.Body3.setRotationPoint(11.3F, 0.0F, 7.1F);
	        this.Body3.addBox(0.0F, 0.0F, -4.5F, 1, 15, 5, 0.0F);
	        this.setRotateAngle(Body3, 0.0F, 2.030865117620602F, 0.0F);
	        
	        this.ArmBottom = new ModelRenderer(this, 134, 0);
	        this.ArmBottom.setRotationPoint(-0.8F, 5.2F, -1.9F);
	        this.ArmBottom.addBox(0.0F, -3.7F, 0.0F, 4, 8, 4, 0.0F);
	        
	        this.Hair_1 = new ModelRenderer(this, 0, 0);
	        this.Hair_1.setRotationPoint(3.4F, 2.2F, 0.1F);
	        this.Hair_1.addBox(0.0F, -2.0F, -3.0F, 1, 5, 6, 0.0F);
	        
	        this.LegMuscle_1 = new ModelRenderer(this, 0, 0);
	        this.LegMuscle_1.setRotationPoint(0.0F, 0.6F, -0.5F);
	        this.LegMuscle_1.addBox(-1.9F, -0.1F, -1.8F, 4, 6, 4, 0.0F);
	        
	        this.Arm2 = new ModelRenderer(this, 78, 0);
	        this.Arm2.setRotationPoint(-3.8F, -7.1F, -0.5F);
	        this.Arm2.addBox(-2.2F, 0.4F, -1.0F, 3, 12, 3, 0.0F);
	        this.setRotateAngle(Arm2, -0.136659280431156F, 0.091106186954104F, 0.21694442602289515F);
	        
	        this.Body = new ModelRenderer(this, 0, 0);
	        this.Body.setRotationPoint(-2.0F, -1.4F, -0.6F);
	        this.Body.addBox(-4.2F, -6.3F, -3.2F, 9, 15, 8, 0.0F);
	        
	        this.Hair_2 = new ModelRenderer(this, 0, 0);
	        this.Hair_2.setRotationPoint(-7.3F, -1.9F, -3.0F);
	        this.Hair_2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 6, 0.0F);
	        
	        this.Leg1.addChild(this.LegMuscle);
	        this.RestOfLeg_1.addChild(this.Foot_1);
	        this.Body.addChild(this.Leg2);
	        this.Body1.addChild(this.Body2);
	        this.Head.addChild(this.Hair);
	        this.Body.addChild(this.Body1);
	        this.LegMuscle_1.addChild(this.RestOfLeg_1);
	        this.Arm2.addChild(this.ArmBottom_1);
	        this.ArmBottom_1.addChild(this.ArmHand_1);
	        this.LegMuscle.addChild(this.RestOfLeg);
	        this.Body.addChild(this.Arm1);
	        this.Hair_3.addChild(this.Hair_4);
	        this.RestOfLeg.addChild(this.Foot);
	        this.Hair_2.addChild(this.Hair_3);
	        this.ArmBottom.addChild(this.ArmHand);
	        this.Body.addChild(this.Leg1);
	        this.Body3.addChild(this.Body4);
	        this.Body.addChild(this.Neck);
	        this.Neck.addChild(this.Head);
	        this.Body2.addChild(this.Body3);
	        this.Arm1.addChild(this.ArmBottom);
	        this.Hair.addChild(this.Hair_1);
	        this.Leg2.addChild(this.LegMuscle_1);
	        this.Body.addChild(this.Arm2);
	        this.Hair_1.addChild(this.Hair_2);
	    }
/*
	@Override
	public void render(Entity entity, float time, float limbSwingAmount, float ageInTicks, float HeadY, float headX, float Ytrans) {
		this.setRotationAngles(time, limbSwingAmount, ageInTicks, HeadY, headX, Ytrans, entity);
		if(this.isChild){
			float div = 2.0F;
			GlStateManager.pushMatrix();
			GlStateManager.scale(1.0f, 1.0F, 1.0F);
			GlStateManager.translate(0, 1.25, 0);
			
			this.Arm1.render(Ytrans);
			this.Arm2.render(Ytrans);
			this.ArmBottom.render(Ytrans);
			this.ArmBottom_1.render(Ytrans);
			this.ArmHand.render(Ytrans);
			this.ArmHand_1.render(Ytrans);
			this.Body.render(Ytrans);
			this.Body1.render(Ytrans);
			this.Body2.render(Ytrans);
			this.Body3.render(Ytrans);
			this.Body4.render(Ytrans);
			this.Foot.render(Ytrans);
			this.Foot_1.render(Ytrans);
			this.Hair.render(Ytrans);
			this.Hair_1.render(Ytrans);
			this.Hair_2.render(Ytrans);
			this.Hair_3.render(Ytrans);
			this.Hair_4.render(Ytrans);
			this.Head.render(Ytrans);
			this.Leg1.render(Ytrans);
			this.Leg2.render(Ytrans);
			this.LegMuscle.render(Ytrans);
			this.LegMuscle_1.render(Ytrans);
			this.Neck.render(Ytrans);
			this.RestOfLeg.render(Ytrans);
			this.RestOfLeg_1.render(Ytrans);
			GlStateManager.popMatrix();	
		}
		else
		{
			this.Arm1.render(Ytrans);
			this.Arm2.render(Ytrans);
			this.ArmBottom.render(Ytrans);
			this.ArmBottom_1.render(Ytrans);
			this.ArmHand.render(Ytrans);
			this.ArmHand_1.render(Ytrans);
			this.Body.render(Ytrans);
			this.Body1.render(Ytrans);
			this.Body2.render(Ytrans);
			this.Body3.render(Ytrans);
			this.Body4.render(Ytrans);
			this.Foot.render(Ytrans);
			this.Foot_1.render(Ytrans);
			this.Hair.render(Ytrans);
			this.Hair_1.render(Ytrans);
			this.Hair_2.render(Ytrans);
			this.Hair_3.render(Ytrans);
			this.Hair_4.render(Ytrans);
			this.Head.render(Ytrans);
			this.Leg1.render(Ytrans);
			this.Leg2.render(Ytrans);
			this.LegMuscle.render(Ytrans);
			this.LegMuscle_1.render(Ytrans);
			this.Neck.render(Ytrans);
			this.RestOfLeg.render(Ytrans);
			this.RestOfLeg_1.render(Ytrans);
		}
		
	}*/
	@Override
    public void render(Entity entity, float time, float limbSwingAmount, float ageInTicks, float HeadY, float headX, float Ytrans) {
        this.setRotationAngles(time, limbSwingAmount, ageInTicks, HeadY, headX, Ytrans, entity);
    
            this.Arm1.render(Ytrans);
            this.Arm2.render(Ytrans);
            this.ArmBottom.render(Ytrans);
            this.ArmBottom_1.render(Ytrans);
            this.ArmHand.render(Ytrans);
            this.ArmHand_1.render(Ytrans);
            this.Body.render(Ytrans);
            this.Body1.render(Ytrans);
            this.Body2.render(Ytrans);
            this.Body3.render(Ytrans);
            this.Body4.render(Ytrans);
            this.Foot.render(Ytrans);
            this.Foot_1.render(Ytrans);
            this.Hair.render(Ytrans);
            this.Hair_1.render(Ytrans);
            this.Hair_2.render(Ytrans);
            this.Hair_3.render(Ytrans);
            this.Hair_4.render(Ytrans);
            this.Head.render(Ytrans);
            this.Leg1.render(Ytrans);
            this.Leg2.render(Ytrans);
            this.LegMuscle.render(Ytrans);
            this.LegMuscle_1.render(Ytrans);
            this.Neck.render(Ytrans);
            this.RestOfLeg.render(Ytrans);
            this.RestOfLeg_1.render(Ytrans);
        
    }
	public void setRotationAngles(float time, float limbSwingAmount, float ageInTicks, float headY, float headX, float scaleFactor, Entity entityIn)
    {
		
		this.Head.rotateAngleX = headX / (0.0F / (float)Math.PI);
		this.Head.rotateAngleY = headY / (0.0F / (float)Math.PI);
		/*this.Head.rotateAngleX = headX / (360F / (float)Math.PI);
		this.Head.rotateAngleY = headY / (360F / (float)Math.PI);
		*/
		
		this.Body.rotateAngleX = ((float)Math.PI);
		//this.Body.rotateAngleX = ((float)Math.PI / 2.0F);
	
		this.Leg1.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * limbSwingAmount;
		this.Leg2.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * limbSwingAmount;
		
		this.Arm1.rotateAngleX = MathHelper.cos(time * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.Arm2.rotateAngleX = MathHelper.cos(time * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }
	//public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale){
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}
