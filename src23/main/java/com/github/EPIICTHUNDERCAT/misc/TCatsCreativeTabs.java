package com.github.EPIICTHUNDERCAT.misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TCatsCreativeTabs extends CreativeTabs{
	
	public TCatsCreativeTabs(int index, String label) {
		super(index, label);
	}

	
	
	public static final TCatsCreativeTabs TCats = new TCatsCreativeTabs(CreativeTabs.getNextID(), "tcats") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Items.APPLE;
		}
	};
	
	@Override
	public Item getTabIconItem() {
		return null;
	}
}
