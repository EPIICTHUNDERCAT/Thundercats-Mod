package com.github.EPIICTHUNDERCAT.render;

import com.github.EPIICTHUNDERCAT.entity.mobs.EntityCheetara;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntityWilyKat;
import com.github.EPIICTHUNDERCAT.entity.models.WilyKatModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEntityWilyKat extends RenderLiving<EntityWilyKat>{
	
	private static final ResourceLocation WilyKat_TEXTURES = new ResourceLocation("thundercats:textures/entity/wilykat.png");
	
	

   
	public static final Factory FACTORY = new Factory();

	public RenderEntityWilyKat(RenderManager rendermanagerIn) {

		super(rendermanagerIn, new WilyKatModel(), 0.5F);
	}

	public RenderEntityWilyKat(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWilyKat entity) {
		// TODO Auto-generated method stub
		return WilyKat_TEXTURES;
	}
	public static class Factory implements IRenderFactory<EntityWilyKat> {

		@Override
		public Render<? super EntityWilyKat> createRenderFor(RenderManager manager) {
			return new RenderEntityWilyKat(manager);
		}
	}

}


