package com.github.EPIICTHUNDERCAT.render;

import com.github.EPIICTHUNDERCAT.mobs.EntitySnarf;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.ResourceLocation;

public class RenderEntitySnarf extends RenderWolf {

	private static final ResourceLocation SNARF_TEXTURES = new ResourceLocation("thundercats:textures/entity/Snarf/snarf.png");
	private static final ResourceLocation TAMED_SNARF_TEXTURES = new ResourceLocation("thundercats:textures/entity/Snarf/snarf_tame.png");
	private static final ResourceLocation ANRGY_SNARF_TEXTURES = new ResourceLocation("thundercats:textures/entity/Snarf/snarf_angry.png");

	public RenderEntitySnarf(RenderManager renderManager) {
		super(renderManager, new ModelWolf(), 0);

	}

	protected void preRenderCallBack(EntityLivingBase entity, float f) {
		preRenderCallbackSnarf((EntitySnarf) entity, f);
	}

	private void preRenderCallbackSnarf(EntitySnarf entity, float f) {

	
	}
	 protected ResourceLocation getEntityTexture(EntityWolf entity)
	    {
	        return entity.isTamed() ? TAMED_SNARF_TEXTURES : (entity.isAngry() ? ANRGY_SNARF_TEXTURES : SNARF_TEXTURES);
	    }
}
