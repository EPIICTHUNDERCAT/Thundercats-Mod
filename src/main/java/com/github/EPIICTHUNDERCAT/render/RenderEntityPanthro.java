package com.github.EPIICTHUNDERCAT.render;

import com.github.EPIICTHUNDERCAT.entity.mobs.EntityPanthro;
import com.github.EPIICTHUNDERCAT.entity.models.PanthroModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEntityPanthro extends RenderLiving<EntityPanthro> {

	private static final ResourceLocation PANTHRO_TEXTURES = new ResourceLocation(
			"thundercats:textures/entity/panthro.png");

	public static final Factory FACTORY = new Factory();

	public RenderEntityPanthro(RenderManager rendermanagerIn) {

		super(rendermanagerIn, new PanthroModel(), 0.5F);
	}

	public RenderEntityPanthro(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);

	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPanthro entity) {

		return PANTHRO_TEXTURES;
	}

	public static class Factory implements IRenderFactory<EntityPanthro> {

		@Override
		public Render<? super EntityPanthro> createRenderFor(RenderManager manager) {
			return new RenderEntityPanthro(manager);
		}
	}

}
