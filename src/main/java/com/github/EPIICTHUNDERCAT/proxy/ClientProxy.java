package com.github.EPIICTHUNDERCAT.proxy;

import com.github.EPIICTHUNDERCAT.Thundercats;
import com.github.EPIICTHUNDERCAT.init.TCatsBlocks;
import com.github.EPIICTHUNDERCAT.init.TCatsItems;
import com.github.EPIICTHUNDERCAT.mobs.EntitySnarf;
import com.github.EPIICTHUNDERCAT.render.RenderEntitySnarf;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy{
	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
		
		RenderManager rm = Minecraft.getMinecraft().getRenderManager();
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySnarf.class, RenderEntitySnarf::new);
		
		
		//RenderingRegistry.registerEntityRenderingHandler(EntitySnarf.class, new RenderEntitySnarf(Minecraft.getMinecraft().getRenderManager()));
		
	
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
	
	}
	
	@Override
	public void registerRenders(FMLInitializationEvent event) {
		TCatsItems.registerRender(event);
		TCatsBlocks.registerRender(event);
		
		
	}
	
	@Override
	public void VersionCheck(PlayerTickEvent event) {

		
	}
}
