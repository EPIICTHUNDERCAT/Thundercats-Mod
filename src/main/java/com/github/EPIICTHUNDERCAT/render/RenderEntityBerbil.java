package com.github.EPIICTHUNDERCAT.render;

import com.github.EPIICTHUNDERCAT.entity.mobs.EntityBerbil;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntityCheetara;
import com.github.EPIICTHUNDERCAT.entity.models.BerbilModel;
import com.github.EPIICTHUNDERCAT.render.RenderEntityCheetara.Factory;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEntityBerbil extends RenderLiving<EntityBerbil>{

	private static final ResourceLocation BERBIL_TEXTURES = new ResourceLocation("thundercats:textures/entity/berbil.png");
	
	

	   
	public static final Factory FACTORY = new Factory();

	public RenderEntityBerbil(RenderManager rendermanagerIn) {

		super(rendermanagerIn, new BerbilModel(), 0.5F);
	}

	public RenderEntityBerbil(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityBerbil entity) {
		// TODO Auto-generated method stub
		return BERBIL_TEXTURES;
	}
	public static class Factory implements IRenderFactory<EntityBerbil> {

		@Override
		public Render<? super EntityBerbil> createRenderFor(RenderManager manager) {
			return new RenderEntityBerbil(manager);
		}
	}
	

}
