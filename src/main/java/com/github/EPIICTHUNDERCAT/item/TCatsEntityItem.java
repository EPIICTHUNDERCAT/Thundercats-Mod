package com.github.EPIICTHUNDERCAT.item;

import com.github.EPIICTHUNDERCAT.init.TCatsItems;
import com.github.EPIICTHUNDERCAT.misc.TCatsCreativeTabs;

import net.minecraft.item.Item;

public class TCatsEntityItem extends Item{
	
	public TCatsEntityItem(String name) {
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name.toLowerCase());
		this.setCreativeTab(TCatsCreativeTabs.TCats);
		addToItems(this);
	}


	private void addToItems(Item item) {
		TCatsItems.items.add(item);
	}

}
