package com.github.EPIICTHUNDERCAT.proxy;

import com.github.EPIICTHUNDERCAT.init.TCatsBlocks;
import com.github.EPIICTHUNDERCAT.init.TCatsItems;
import com.github.EPIICTHUNDERCAT.init.TCatsModEntities;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ClientProxy extends CommonProxy{
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
		
		//RenderManager rm = Minecraft.getMinecraft().getRenderManager();
		
		TCatsModEntities.initModels();
		
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
