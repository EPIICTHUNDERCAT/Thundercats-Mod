package com.github.EPIICTHUNDERCAT.init;

import com.github.EPIICTHUNDERCAT.misc.TCatsCreativeTabs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;

public class SwordofOmensItemSword extends ItemSword {

	public SwordofOmensItemSword(ToolMaterial material, String name) {
		super(material);
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name.toLowerCase());
		this.setCreativeTab(TCatsCreativeTabs.TCats);
		addToItems(this);
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		stack.damageItem(1, attacker);
		if (target instanceof EntityLivingBase) {
			if (stack.getItem() == TCatsItems.SWORD_OF_OMENS) {
				((EntityLivingBase) target).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 600, 5, false, true));
			}
		}
		return true;
		}
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		if (toRepair.getItem() == TCatsItems.SWORD_OF_OMENS) {
			return repair.getItem() == TCatsItems.WAR_STONE;}
		return false;
		}
	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		return (TextFormatting.BLUE + I18n.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name"))
				.trim();
	}

	private void addToItems(Item item) {

		TCatsItems.items.add(item);

	}

}
