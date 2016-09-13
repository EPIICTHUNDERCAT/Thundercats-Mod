package com.github.EPIICTHUNDERCAT.render;

import javax.annotation.Nonnull;

import com.github.EPIICTHUNDERCAT.mobs.EntitySnarf;

import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEntitySnarf extends RenderLiving<EntitySnarf> {

	private static final ResourceLocation SNARF_TEXTURES = new ResourceLocation(
			"thundercats:textures/entity/Snarf/snarf.png");
	private static final ResourceLocation TAMED_SNARF_TEXTURES = new ResourceLocation(
			"thundercats:textures/entity/Snarf/snarf_tame.png");
	private static final ResourceLocation ANRGY_SNARF_TEXTURES = new ResourceLocation(
			"thundercats:textures/entity/Snarf/snarf_angry.png");

	public static final Factory FACTORY = new Factory();

	public RenderEntitySnarf(RenderManager rendermanagerIn) {

		super(rendermanagerIn, new ModelWolf(), 0.5F);
	}

	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntitySnarf entity) {
		return entity.isTamed() ? TAMED_SNARF_TEXTURES : (entity.isAngry() ? ANRGY_SNARF_TEXTURES : SNARF_TEXTURES);
	}

	public static class Factory implements IRenderFactory<EntitySnarf> {

		@Override
		public Render<? super EntitySnarf> createRenderFor(RenderManager manager) {
			return new RenderEntitySnarf(manager);
		}
	}
}
/*
 * protected void preRenderCallBack(EntityLivingBase entity, float f) {
 * preRenderCallbackSnarf((EntitySnarf) entity, f); }
 * 
 * private void preRenderCallbackSnarf(EntitySnarf entity, float f) {
 * 
 * }
 */

/*
 * protected ResourceLocation getEntityTexture(EntitySnarf entity) { return
 * entity.isTamed() ? TAMED_SNARF_TEXTURES : (entity.isAngry() ?
 * ANRGY_SNARF_TEXTURES : SNARF_TEXTURES); }
 */
