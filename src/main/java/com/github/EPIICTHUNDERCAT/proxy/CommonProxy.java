package com.github.EPIICTHUNDERCAT.proxy;

import net.minecraft.entity.EntityList;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.github.EPIICTHUNDERCAT.Thundercats;
import com.github.EPIICTHUNDERCAT.mobs.EntitySnarf;
import com.github.EPIICTHUNDERCAT.render.RenderEntitySnarf;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.*;

public class CommonProxy {
	
	
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		register(preEvent);
	
		
	

	}

	public void init(FMLInitializationEvent event) {
		registerRenders(event);
		
		
	
		
	}
	
	/*private static int entityId;
	

	private void registerModEntityWithEgg(Class class1, String string, int i, int j) {
		
	EntityRegistry.registerModEntity(class1, string, ++entityId, Thundercats.instance, 64, 3, true, i, j);
		
	}
*/

	private void register(FMLPreInitializationEvent preEvent) {

		

	}

	public void registerRenders(FMLInitializationEvent event) {
		
	}

	public void VersionCheck(PlayerTickEvent event) {
		
	}
	
	

}
