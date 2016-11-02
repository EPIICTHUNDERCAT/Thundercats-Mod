package com.github.EPIICTHUNDERCAT.init;

import com.github.EPIICTHUNDERCAT.Thundercats;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntityBerbil;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntityCheetara;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntityLiono;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntityPanthro;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntitySnarf;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntityWilyKat;
import com.github.EPIICTHUNDERCAT.entity.mobs.EntityWilyKit;
import com.github.EPIICTHUNDERCAT.render.RenderEntityBerbil;
import com.github.EPIICTHUNDERCAT.render.RenderEntityCheetara;
import com.github.EPIICTHUNDERCAT.render.RenderEntityLiono;
import com.github.EPIICTHUNDERCAT.render.RenderEntityPanthro;
import com.github.EPIICTHUNDERCAT.render.RenderEntitySnarf;
import com.github.EPIICTHUNDERCAT.render.RenderEntityWilyKat;
import com.github.EPIICTHUNDERCAT.render.RenderEntityWilyKit;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TCatsModEntities {
	public static void init() {

		// SNARF//
		// Every entity in our mod has an ID (local to this mod)
		int id = 1;
		EntityRegistry.registerModEntity(EntitySnarf.class, "Snarf", id++, Thundercats.instance, 64, 3, true, 0x847294,
				0x18be42);

		// We want our mob to spawn in Plains and ice plains biomes. If you
		// don't add this then it will not spawn automatically
		// but you can of course still make it spawn manually
		EntityRegistry.addSpawn(EntitySnarf.class, 3, 43, 8, EnumCreatureType.CREATURE, Biomes.TAIGA, Biomes.PLAINS,
				Biomes.FOREST, Biomes.SAVANNA, Biomes.BEACH, Biomes.EXTREME_HILLS, Biomes.JUNGLE,
				Biomes.SAVANNA_PLATEAU, Biomes.SWAMPLAND, Biomes.ICE_PLAINS, Biomes.BIRCH_FOREST,
				Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST);

		// This is the loot table for our mob
		LootTableList.register(EntitySnarf.LOOT);

		// LION-O//
		// Every entity in our mod has an ID (local to this mod)

		EntityRegistry.registerModEntity(EntityLiono.class, "Liono", id++, Thundercats.instance, 64, 3, true, 0x439855,
				0x43ee43);

		// Where Liono Spawns
		EntityRegistry.addSpawn(EntityLiono.class, 2, 33, 5, EnumCreatureType.CREATURE, Biomes.TAIGA, Biomes.PLAINS,
				Biomes.FOREST, Biomes.SAVANNA, Biomes.BEACH, Biomes.EXTREME_HILLS, Biomes.JUNGLE,
				Biomes.SAVANNA_PLATEAU, Biomes.SWAMPLAND, Biomes.ICE_PLAINS, Biomes.BIRCH_FOREST,
				Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST);

		// This is the loot table for our mob
		LootTableList.register(EntityLiono.LOOT);

		// CHEETARA//
		// Every entity in our mod has an ID (local to this mod)

		EntityRegistry.registerModEntity(EntityCheetara.class, "Cheetara", id++, Thundercats.instance, 64, 3, true,
				0x483923, 0x43fe24);

		// Where Cheetara Spawns
		EntityRegistry.addSpawn(EntityCheetara.class, 2, 33, 5, EnumCreatureType.CREATURE, Biomes.TAIGA, Biomes.PLAINS,
				Biomes.FOREST, Biomes.SAVANNA, Biomes.BEACH, Biomes.EXTREME_HILLS, Biomes.JUNGLE,
				Biomes.SAVANNA_PLATEAU, Biomes.SWAMPLAND, Biomes.ICE_PLAINS, Biomes.BIRCH_FOREST,
				Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST);

		// This is the loot table for our mob
		LootTableList.register(EntityCheetara.LOOT);

		// Berbil//
		// Every entity in our mod has an ID (local to this mod)

		EntityRegistry.registerModEntity(EntityBerbil.class, "Berbil", id++, Thundercats.instance, 64, 3, true,
				0x8594454, 0x99fe34);

		// Where Cheetara Spawns
		EntityRegistry.addSpawn(EntityBerbil.class, 2, 33, 5, EnumCreatureType.CREATURE, Biomes.TAIGA, Biomes.PLAINS,
				Biomes.FOREST, Biomes.SAVANNA, Biomes.BEACH, Biomes.EXTREME_HILLS, Biomes.JUNGLE,
				Biomes.SAVANNA_PLATEAU, Biomes.SWAMPLAND, Biomes.ICE_PLAINS, Biomes.BIRCH_FOREST,
				Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST);

		// This is the loot table for our mob
		LootTableList.register(EntityBerbil.LOOT);
		
		
		// WilyKat//
				// Every entity in our mod has an ID (local to this mod)

				EntityRegistry.registerModEntity(EntityWilyKat.class, "WilyKat", id++, Thundercats.instance, 64, 3, true,
						0x8594454, 0x99fe34);

				// Where Cheetara Spawns
				EntityRegistry.addSpawn(EntityWilyKat.class, 2, 33, 5, EnumCreatureType.CREATURE, Biomes.TAIGA, Biomes.PLAINS,
						Biomes.FOREST, Biomes.SAVANNA, Biomes.BEACH, Biomes.EXTREME_HILLS, Biomes.JUNGLE,
						Biomes.SAVANNA_PLATEAU, Biomes.SWAMPLAND, Biomes.ICE_PLAINS, Biomes.BIRCH_FOREST,
						Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST);

				// This is the loot table for our mob
				LootTableList.register(EntityWilyKat.LOOT);
				
				// WilyKit//
				// Every entity in our mod has an ID (local to this mod)

				EntityRegistry.registerModEntity(EntityWilyKit.class, "WilyKit", id++, Thundercats.instance, 64, 3, true,
						0x8594454, 0x99fe34);

				// Where Cheetara Spawns
				EntityRegistry.addSpawn(EntityWilyKit.class, 2, 33, 5, EnumCreatureType.CREATURE, Biomes.TAIGA, Biomes.PLAINS,
						Biomes.FOREST, Biomes.SAVANNA, Biomes.BEACH, Biomes.EXTREME_HILLS, Biomes.JUNGLE,
						Biomes.SAVANNA_PLATEAU, Biomes.SWAMPLAND, Biomes.ICE_PLAINS, Biomes.BIRCH_FOREST,
						Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST);

				// This is the loot table for our mob
				LootTableList.register(EntityWilyKit.LOOT);
				
				//Panthro//
				// Every entity in our mod has an ID (local to this mod)

				EntityRegistry.registerModEntity(EntityPanthro.class, "Panthro", id++, Thundercats.instance, 64, 3, true,
						0x8594454, 0x99fe34);

				// Where Cheetara Spawns
				EntityRegistry.addSpawn(EntityPanthro.class, 2, 33, 5, EnumCreatureType.CREATURE, Biomes.TAIGA, Biomes.PLAINS,
						Biomes.FOREST, Biomes.SAVANNA, Biomes.BEACH, Biomes.EXTREME_HILLS, Biomes.JUNGLE,
						Biomes.SAVANNA_PLATEAU, Biomes.SWAMPLAND, Biomes.ICE_PLAINS, Biomes.BIRCH_FOREST,
						Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST);

				// This is the loot table for our mob
				LootTableList.register(EntityPanthro.LOOT);

	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		RenderingRegistry.registerEntityRenderingHandler(EntitySnarf.class, RenderEntitySnarf.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityLiono.class, RenderEntityLiono.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityCheetara.class, RenderEntityCheetara.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityBerbil.class, RenderEntityBerbil.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityWilyKat.class, RenderEntityWilyKat.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityWilyKit.class, RenderEntityWilyKit.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityPanthro.class, RenderEntityPanthro.FACTORY);
	}

}
