package com.github.EPIICTHUNDERCAT.proxy;

import com.github.EPIICTHUNDERCAT.Thundercats;
import com.github.EPIICTHUNDERCAT.entity.EntityLightningRay;
import com.github.EPIICTHUNDERCAT.init.TCatsBlocks;
import com.github.EPIICTHUNDERCAT.init.TCatsItems;
import com.github.EPIICTHUNDERCAT.init.TCatsModEntities;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy {
	
	
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		register(preEvent);
	
	
        TCatsModEntities.init();
	

	}

	public void init(FMLInitializationEvent event) {
		registerRenders(event);
		
		
	
		
	}
	


	public void register(FMLPreInitializationEvent preEvent) {
		TCatsItems.register(preEvent);
		TCatsBlocks.register(preEvent);
		registerEntities(preEvent);
		

	}

	public void registerRenders(FMLInitializationEvent event) {
		
	}

	public void VersionCheck(PlayerTickEvent event) {
		
	}
	public void registerEntities(FMLPreInitializationEvent preEvent) {
		int id = 0;
		EntityRegistry.registerModEntity(EntityLightningRay.class, "lightning", id++, Thundercats.instance, 64, 2, true);
	}
	
	

}
