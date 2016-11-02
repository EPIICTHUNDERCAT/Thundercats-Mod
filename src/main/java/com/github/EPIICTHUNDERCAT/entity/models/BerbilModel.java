package com.github.EPIICTHUNDERCAT.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * RO-Bear - epiic
 * Created using Tabula 5.1.0
 */
public class BerbilModel extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftEar;
    public ModelRenderer RightEar;

    public BerbilModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.Body.addBox(-7.1F, 0.0F, -4.6F, 14, 14, 9, 0.0F);
        this.RightArm = new ModelRenderer(this, 41, 41);
        this.RightArm.mirror = true;
        this.RightArm.setRotationPoint(-7.4F, 1.3F, -0.9F);
        this.RightArm.addBox(-3.1F, -1.4F, -2.3F, 4, 12, 5, 0.0F);
        this.setRotateAngle(RightArm, 0.0F, 0.0F, 0.11397000015522972F);
        this.LeftLeg = new ModelRenderer(this, 0, 41);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(3.6F, 13.1F, -0.6F);
        this.LeftLeg.addBox(-2.8F, -0.8F, -2.3F, 6, 12, 6, 0.0F);
        this.LeftArm = new ModelRenderer(this, 41, 41);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(7.4F, 1.3F, -0.9F);
        this.LeftArm.addBox(-1.1F, -1.5F, -2.3F, 4, 12, 5, 0.0F);
        this.setRotateAngle(LeftArm, 0.0F, 0.0F, -0.11397000015522972F);
        this.Head = new ModelRenderer(this, 0, 24);
        this.Head.setRotationPoint(-0.3F, 0.0F, -0.3F);
        this.Head.addBox(-4.8F, -8.2F, -3.8F, 10, 9, 8, 0.0F);
        this.RightEar = new ModelRenderer(this, 42, 26);
        this.RightEar.setRotationPoint(-3.6F, -7.4F, 0.2F);
        this.RightEar.addBox(-3.7F, -3.5F, -0.7F, 4, 4, 2, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 41);
        this.RightLeg.mirror = true;
        this.RightLeg.setRotationPoint(-3.6F, 13.1F, -0.6F);
        this.RightLeg.addBox(-2.8F, -0.8F, -2.3F, 6, 12, 6, 0.0F);
        this.LeftEar = new ModelRenderer(this, 48, 14);
        this.LeftEar.setRotationPoint(4.2F, -7.4F, 0.5F);
        this.LeftEar.addBox(-0.4F, -3.6F, -1.1F, 4, 4, 2, 0.0F);
        this.Body.addChild(this.RightArm);
        this.Body.addChild(this.LeftLeg);
        this.Body.addChild(this.LeftArm);
        this.Body.addChild(this.Head);
        this.Head.addChild(this.RightEar);
        this.Body.addChild(this.RightLeg);
        this.Head.addChild(this.LeftEar);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
    	this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        this.Body.render(scale);
       
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
