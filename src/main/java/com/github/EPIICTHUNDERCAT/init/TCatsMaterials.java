package com.github.EPIICTHUNDERCAT.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TCatsMaterials {
	public static ToolMaterial WAR_STONE = EnumHelper.addToolMaterial("WAR_STONE", 3, 1200,
			14.0F, 4.0F, 30);
	public static ToolMaterial GOLD = EnumHelper.addToolMaterial("GOLD", 3, 1200,
			14.0F, 4.0F, 30);
	
	public float getDamageVsEntity() {
		
		return 0;
	}
	public int getMaxUses() {
	
		return 0;
	}

}
