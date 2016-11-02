package com.github.EPIICTHUNDERCAT.item.specialitems;

import javax.annotation.Nullable;

import com.github.EPIICTHUNDERCAT.init.TCatsItems;
import com.github.EPIICTHUNDERCAT.misc.TCatsCreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClawShield extends ItemShield{
	public ClawShield(String name) {
		this.maxStackSize = 1;
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name.toLowerCase());
		addToItems(this);
		this.setMaxDamage(1000);
		this.addPropertyOverride(new ResourceLocation("blocking"), new IItemPropertyGetter() {
			@SideOnly(Side.CLIENT)
			public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
				return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F
						: 0.0F;
			}
		});
	}

	private void addToItems(Item item) {
		TCatsItems.items.add(item);
	}


	@Override
	@SideOnly(Side.CLIENT)
	public CreativeTabs getCreativeTab() {
		return TCatsCreativeTabs.TCats;
	}
	
	

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		if (toRepair.getItem() == TCatsItems.CLAW_SHIELD) {
			return repair.getItem() == Items.GOLD_INGOT;}
		return false;
		
		
	}
}
