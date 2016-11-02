package com.github.EPIICTHUNDERCAT.render;

import com.github.EPIICTHUNDERCAT.entity.mobs.EntityWilyKat;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntityWilyKit;
import com.github.EPIICTHUNDERCAT.entity.models.WilyKitModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEntityWilyKit extends RenderLiving<EntityWilyKit>{
	
	private static final ResourceLocation WilyKit_TEXTURES = new ResourceLocation("thundercats:textures/entity/wilykit.png");
	
	

   
	public static final Factory FACTORY = new Factory();

	public RenderEntityWilyKit(RenderManager rendermanagerIn) {

		super(rendermanagerIn, new WilyKitModel(), 0.5F);
	}

	public RenderEntityWilyKit(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWilyKit entity) {
		// TODO Auto-generated method stub
		return WilyKit_TEXTURES;
	}
	public static class Factory implements IRenderFactory<EntityWilyKit> {

		@Override
		public Render<? super EntityWilyKit> createRenderFor(RenderManager manager) {
			return new RenderEntityWilyKit(manager);
		}
	}
}

