package com.github.EPIICTHUNDERCAT.render;

import com.github.EPIICTHUNDERCAT.mobs.EntityLiono;
import com.github.EPIICTHUNDERCAT.mobs.LionoModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEntityLiono extends RenderLiving<EntityLiono>{
	
	//private static final ResourceLocation LION_O_TEXTURES = new ResourceLocation();
	
	

   
	public static final Factory FACTORY = new Factory();

	public RenderEntityLiono(RenderManager rendermanagerIn) {

		super(rendermanagerIn, new LionoModel(), 0.5F);
	}

	public RenderEntityLiono(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLiono entity) {
		// TODO Auto-generated method stub
		return null;
	}
	public static class Factory implements IRenderFactory<EntityLiono> {

		@Override
		public Render<? super EntityLiono> createRenderFor(RenderManager manager) {
			return new RenderEntityLiono(manager);
		}
	}

}
