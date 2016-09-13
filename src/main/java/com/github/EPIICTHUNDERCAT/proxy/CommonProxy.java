package com.github.EPIICTHUNDERCAT.proxy;

import com.github.EPIICTHUNDERCAT.init.TCatsItems;
import com.github.EPIICTHUNDERCAT.init.TCatsModEntities;

import net.minecraft.init.Items;
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
