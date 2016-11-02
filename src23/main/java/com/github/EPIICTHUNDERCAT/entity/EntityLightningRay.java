package com.github.EPIICTHUNDERCAT.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityLightningRay extends EntityThrowable {

	public static boolean entity;
	public static boolean player;
	public static boolean block;
	private EntityLivingBase shootingEntity;

	public EntityLightningRay(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}

	public EntityLightningRay(World worldIn, EntityLivingBase shooter) {
		this(worldIn, shooter.posX, shooter.posY + (double) shooter.getEyeHeight() - 0.10000000149011612D,
				shooter.posZ);
		this.shootingEntity = shooter;
	}

	public EntityLightningRay(World worldIn, double x, double y, double z) {
		this(worldIn);
		this.setPosition(x, y, z);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		World world = this.worldObj;
		int x = this.ticksExisted;
		if ((this.ticksExisted % 2) == 0) {
			world.spawnParticle(EnumParticleTypes.REDSTONE, this.posX, this.posY, this.posZ, 0.1, 1.0, 0.3);
		}

	}

	protected float getGravityVelocity() {
		return 0.0F;

	}

	@Override
	protected void onImpact(RayTraceResult result) {
		World world = this.worldObj;
		if (result.typeOfHit.equals(result.typeOfHit.ENTITY)) {
			if (result.entityHit instanceof EntityPlayer && player) {
				EntityLivingBase entity = (EntityLivingBase) result.entityHit;
				if (!world.isRemote) {
					entity.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 100, 1, false, false));
					entity.addPotionEffect(new PotionEffect(Potion.getPotionById(25), 200, 1, false, false));
					entity.addPotionEffect(new PotionEffect(Potion.getPotionById(24), 300, 1, false, false));
					entity.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 500, 5, false, false));
				}
			}
		}
	}
}