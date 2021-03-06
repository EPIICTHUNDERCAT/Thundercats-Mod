package com.github.EPIICTHUNDERCAT.init;

import com.github.EPIICTHUNDERCAT.Thundercats;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntityLiono;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntitySnarf;
import com.github.EPIICTHUNDERCAT.render.RenderEntityLiono;
import com.github.EPIICTHUNDERCAT.render.RenderEntitySnarf;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TCatsModEntities {
	public static void init() {
		
		//SNARF//
		// Every entity in our mod has an ID (local to this mod)
		int id = 1;
		EntityRegistry.registerModEntity(EntitySnarf.class, "Snarf", id++, Thundercats.instance, 64, 3, true,
				0x996600, 0x00ff00);

		// We want our mob to spawn in Plains and ice plains biomes. If you
		// don't add this then it will not spawn automatically
		// but you can of course still make it spawn manually
		EntityRegistry.addSpawn(EntitySnarf.class, 3, 43, 8, EnumCreatureType.CREATURE,
				Biomes.TAIGA, Biomes.PLAINS, Biomes.FOREST, Biomes.SAVANNA, Biomes.BEACH,
				Biomes.EXTREME_HILLS, Biomes.JUNGLE, Biomes.SAVANNA_PLATEAU, Biomes.SWAMPLAND,
				Biomes.ICE_PLAINS, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS,
				Biomes.ROOFED_FOREST);

		// This is the loot table for our mob
		LootTableList.register(EntitySnarf.LOOT);
		
		//LION-O//
		// Every entity in our mod has an ID (local to this mod)
		
		EntityRegistry.registerModEntity(EntityLiono.class, "Liono", id++, Thundercats.instance, 64, 3, true,
				0x996650, 0x04ff00);

		//Where Liono Spawns
		EntityRegistry.addSpawn(EntityLiono.class, 2, 33, 5, EnumCreatureType.CREATURE,
				Biomes.TAIGA, Biomes.PLAINS, Biomes.FOREST, Biomes.SAVANNA, Biomes.BEACH,
				Biomes.EXTREME_HILLS, Biomes.JUNGLE, Biomes.SAVANNA_PLATEAU, Biomes.SWAMPLAND,
				Biomes.ICE_PLAINS, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS,
				Biomes.ROOFED_FOREST);

		// This is the loot table for our mob
		LootTableList.register(EntityLiono.LOOT);
		
		
		
		
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		RenderingRegistry.registerEntityRenderingHandler(EntitySnarf.class, RenderEntitySnarf.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityLiono.class, RenderEntityLiono.FACTORY);
		
	}

	
}

	
	
	
	
	
	
	
	
	
	

