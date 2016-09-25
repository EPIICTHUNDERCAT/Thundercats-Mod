package com.github.EPIICTHUNDERCAT.proxy;

import com.github.EPIICTHUNDERCAT.init.TCatsBlocks;
import com.github.EPIICTHUNDERCAT.init.TCatsItems;
import com.github.EPIICTHUNDERCAT.init.TCatsModEntities;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class CommonProxy {
	
	
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		register(preEvent);
	
	
        TCatsModEntities.init();
	

	}

	public void init(FMLInitializationEvent event) {
		registerRenders(event);
		
		
	
		
	}
	


	private void register(FMLPreInitializationEvent preEvent) {
		TCatsItems.register(preEvent);
		TCatsBlocks.register(preEvent);
		

	}

	public void registerRenders(FMLInitializationEvent event) {
		
	}

	public void VersionCheck(PlayerTickEvent event) {
		
	}
	
	

}
