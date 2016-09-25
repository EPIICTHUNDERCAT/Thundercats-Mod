package com.github.EPIICTHUNDERCAT.init;

import java.util.ArrayList;
import java.util.List;

import com.github.EPIICTHUNDERCAT.item.TCatsItem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TCatsItems {
	
	// Items/Materials //
		public static List<Item> items = new ArrayList();
		
		public static Item SWORD_OF_OMENS = new TCatsItem("SWORD_OF_OMENS");
		public static Item NAVI_FLIGHT = new TCatsItem("NAVI_FLIGHT");
		
		
		
		private static List<Item> getItems() {
			return items;
		}
		
		public static void register(FMLPreInitializationEvent preEvent) {
			for (Item item : getItems()) {
				GameRegistry.register(item);
			}
		}

		public static void registerRender(FMLInitializationEvent event) {
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
			for (Item item : getItems()) {
				renderItem.getItemModelMesher().register(item, 0,
						new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
			}
		}

		

}
