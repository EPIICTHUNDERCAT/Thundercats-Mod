package com.github.EPIICTHUNDERCAT.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WilyKatModel extends ModelBase {
    public ModelRenderer MainBody;
    public ModelRenderer LeftArm;
    public ModelRenderer LeftFoot;
    public ModelRenderer InnerHead;
    public ModelRenderer RightFoot;
    public ModelRenderer RightArm;
    public ModelRenderer OuterHead;

    public WilyKatModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.LeftArm = new ModelRenderer(this, 24, 0);
        this.LeftArm.setRotationPoint(4.6F, 2.0F, -0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.InnerHead = new ModelRenderer(this, 0, 16);
        this.InnerHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.InnerHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.LeftFoot = new ModelRenderer(this, 40, 0);
        this.LeftFoot.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.LeftFoot.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.MainBody = new ModelRenderer(this, 0, 0);
        this.MainBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MainBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.OuterHead = new ModelRenderer(this, 0, 32);
        this.OuterHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OuterHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.RightFoot = new ModelRenderer(this, 32, 16);
        this.RightFoot.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.RightFoot.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RightArm = new ModelRenderer(this, 44, 28);
        this.RightArm.setRotationPoint(-4.6F, 2.0F, 0.0F);
        this.RightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.MainBody.addChild(this.LeftArm);
        this.MainBody.addChild(this.InnerHead);
        this.MainBody.addChild(this.LeftFoot);
        this.MainBody.addChild(this.OuterHead);
        this.MainBody.addChild(this.RightFoot);
        this.MainBody.addChild(this.RightArm);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.MainBody.render(f5);
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