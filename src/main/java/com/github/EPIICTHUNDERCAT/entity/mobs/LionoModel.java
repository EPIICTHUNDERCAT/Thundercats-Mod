package com.github.EPIICTHUNDERCAT.entity.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

/**
 * LionoTest2 - EPIIC
 * Created using Tabula 5.1.0
 */
public class LionoModel extends ModelBase {
    public ModelRenderer MainBody;
    public ModelRenderer HairHead;
    public ModelRenderer Head;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;

    public LionoModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.HairHead = new ModelRenderer(this, 0, 0);
        this.HairHead.setRotationPoint(0.0F, -4.7F, 2.0F);
        this.HairHead.addBox(-4.1F, -8.0F, -3.7F, 8, 8, 8, 0.5F);
        this.Head = new ModelRenderer(this, 0, 48);
        this.Head.setRotationPoint(4.1F, -0.2F, 1.9F);
        this.Head.addBox(-4.1F, -7.9F, -3.7F, 8, 8, 8, 0.0F);
        this.LeftArm = new ModelRenderer(this, 18, 31);
        this.LeftArm.setRotationPoint(8.8F, 1.6F, 1.7F);
        this.LeftArm.addBox(-0.9F, -1.6F, -1.7F, 3, 13, 4, 0.0F);
        this.setRotateAngle(LeftArm, 0.0F, 0.0F, -0.045553093477052F);
        this.MainBody = new ModelRenderer(this, 40, 0);
        this.MainBody.setRotationPoint(-4.0F, -4.3F, 0.0F);
        this.MainBody.addBox(0.0F, 0.0F, 0.0F, 8, 13, 4, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 0, 29);
        this.LeftLeg.setRotationPoint(5.7F, 12.6F, 2.1F);
        this.LeftLeg.addBox(-1.7F, 0.3F, -2.1F, 4, 15, 4, 0.0F);
        this.setRotateAngle(LeftLeg, 0.0F, 0.0F, -0.045553093477052F);
        this.RightArm = new ModelRenderer(this, 18, 31);
        this.RightArm.setRotationPoint(-0.9F, 1.4F, 2.0F);
        this.RightArm.addBox(-1.9F, -1.6F, -2.1F, 3, 13, 4, 0.0F);
        this.setRotateAngle(RightArm, 0.0F, 0.0F, 0.045553093477052F);
        this.RightLeg = new ModelRenderer(this, 0, 29);
        this.RightLeg.setRotationPoint(1.3F, 12.6F, 1.3F);
        this.RightLeg.addBox(-1.3F, 0.3F, -1.3F, 4, 15, 4, 0.0F);
        this.setRotateAngle(RightLeg, 0.0F, 0.0F, 0.045553093477052F);
        this.MainBody.addChild(this.LeftArm);
        this.MainBody.addChild(this.Head);
        this.MainBody.addChild(this.LeftLeg);
        this.MainBody.addChild(this.RightArm);
        this.MainBody.addChild(this.RightLeg);
    }
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
    {
        EntityLiono entityliono = (EntityLiono)entitylivingbaseIn;
        int i = entityliono.getAttackTimer();

        if (i > 0)
        {
            this.RightArm.rotateAngleX = -2.0F + 1.5F * this.triangleWave((float)i - partialTickTime, 10.0F);
            this.LeftArm.rotateAngleX = -2.0F + 1.5F * this.triangleWave((float)i - partialTickTime, 10.0F);
        }
        else
        {
            int j = entityliono.getHoldSwordOfOmens();

            if (j > 0)
            {
                this.RightArm.rotateAngleX = -0.8F + 0.025F * this.triangleWave((float)j, 70.0F);
                this.LeftArm.rotateAngleX = 0.0F;
            }
            else
            {
                this.RightArm.rotateAngleX = (-0.2F + 1.5F * this.triangleWave(p_78086_2_, 13.0F)) * p_78086_3_;
                this.LeftArm.rotateAngleX = (-0.2F - 1.5F * this.triangleWave(p_78086_2_, 13.0F)) * p_78086_3_;
            }
        }
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        this.MainBody.render(scale);
       
    }
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.Head.rotateAngleX = headPitch * 0.017453292F;
        this.LeftLeg.rotateAngleX = -1.5F * this.triangleWave(limbSwing, 13.0F) * limbSwingAmount;
        this.RightLeg.rotateAngleX = 1.5F * this.triangleWave(limbSwing, 13.0F) * limbSwingAmount;
        this.LeftLeg.rotateAngleY = 0.0F;
        this.RightLeg.rotateAngleY = 0.0F;
        
        
        /*float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
        this.RightArm.rotateAngleZ = 0.0F;
        this.LeftArm.rotateAngleZ = 0.0F;
        this.RightArm.rotateAngleY = 0.0f;
        this.LeftArm.rotateAngleY = 0.0f;
        this.RightArm.rotateAngleX = -((float)Math.PI / 2F);
        this.LeftArm.rotateAngleX = -((float)Math.PI / 2F);
        this.RightArm.rotateAngleX = 1.0f;
        this.LeftArm.rotateAngleX = 1.0F;
        this.RightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.LeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.RightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.LeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;*/
    }
    private float triangleWave(float p_78172_1_, float p_78172_2_)
    {
        return (Math.abs(p_78172_1_ % p_78172_2_ - p_78172_2_ * 0.5F) - p_78172_2_ * 0.25F) / (p_78172_2_ * 0.25F);
    }
/*
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.HairHead.render(f5);
        this.MainBody.render(f5);
    }
*/
    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
