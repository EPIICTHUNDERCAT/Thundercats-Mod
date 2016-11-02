package com.github.EPIICTHUNDERCAT.render;

import com.github.EPIICTHUNDERCAT.entity.mobs.EntityCheetara;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntityLiono;
import com.github.EPIICTHUNDERCAT.entity.models.CheetaraModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEntityCheetara extends RenderLiving<EntityCheetara>{
	
	private static final ResourceLocation CHEETARA_TEXTURES = new ResourceLocation("thundercats:textures/entity/cheetara.png");
	
	

   
	public static final Factory FACTORY = new Factory();

	public RenderEntityCheetara(RenderManager rendermanagerIn) {

		super(rendermanagerIn, new CheetaraModel(), 0.5F);
	}

	public RenderEntityCheetara(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCheetara entity) {
		// TODO Auto-generated method stub
		return CHEETARA_TEXTURES;
	}
	public static class Factory implements IRenderFactory<EntityCheetara> {

		@Override
		public Render<? super EntityCheetara> createRenderFor(RenderManager manager) {
			return new RenderEntityCheetara(manager);
		}
	}

}


