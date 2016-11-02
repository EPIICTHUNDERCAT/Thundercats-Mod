package com.github.EPIICTHUNDERCAT.init;

import java.util.ArrayList;
import java.util.List;

import com.github.EPIICTHUNDERCAT.item.TCatsEntityItem;
import com.github.EPIICTHUNDERCAT.item.TCatsItem;
import com.github.EPIICTHUNDERCAT.item.specialitems.ClawShield;
import com.github.EPIICTHUNDERCAT.item.specialitems.SwordOfOmens;

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
		
		public static Item SWORD_OF_OMENS = new SwordOfOmens("SWORD_OF_OMENS");
		public static Item WAR_STONE = new TCatsItem("WAR_STONE");
		public static Item LIGHTNING = new TCatsEntityItem("LIGHTNING");
		public static Item CHEETARAS_STAFF = new CheetarasStaff(TCatsMaterials.GOLD, "CHEETARAS_STAFF");
		public static Item CLAW_SHIELD = new ClawShield("CLAW_SHIELD");
		public static Item PANTHROS_NUNCHUCKS = new TCatsItem("PANTHROS_NUNCHUCKS");
		public static Item WILYKITS_BOMBS = new TCatsItem("WILYKITS_BOMBS");
		public static Item WILYKATS_BOMBS = new TCatsItem("WILYKATS_BOMBS");
		public static Item WILYKITS_CAPSULES = new TCatsItem("WILYKITS_CAPSULES");
		public static Item WILYKATS_CAPSULES = new TCatsItem("WILYKATS_CAPSULES");
		
		
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
