package com.github.EPIICTHUNDERCAT.render;

import com.github.EPIICTHUNDERCAT.entity.mobs.EntityTygra;
import com.github.EPIICTHUNDERCAT.entity.models.TygraModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEntityTygra extends RenderLiving<EntityTygra> {

	private static final ResourceLocation TYGRA_TEXTURES = new ResourceLocation(
			"thundercats:textures/entity/tygra.png");

	public static final Factory FACTORY = new Factory();

	public RenderEntityTygra(RenderManager rendermanagerIn) {

		super(rendermanagerIn, new TygraModel(), 0.5F);
	}

	public RenderEntityTygra(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);

	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTygra entity) {

		return TYGRA_TEXTURES;
	}

	public static class Factory implements IRenderFactory<EntityTygra> {

		@Override
		public Render<? super EntityTygra> createRenderFor(RenderManager manager) {
			return new RenderEntityTygra(manager);
		}
	}

}
