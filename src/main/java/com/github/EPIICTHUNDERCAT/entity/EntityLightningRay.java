package com.github.EPIICTHUNDERCAT.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
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
			world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, this.posX, this.posY, this.posZ, 0.1, 1.0, 0.3);
		}

	}

	protected float getGravityVelocity() {
		return 0.0F;

	}
	
	//protected EntityLightningBolt Bolt = new EntityLightningBolt(World, lastTickPosX, lastTickPosX, lastTickPosX, inGround);

	@Override
	protected void onImpact(RayTraceResult result) {
		getEntityWorld().addWeatherEffect(new EntityLightningBolt(getEntityWorld(),posX,posY,posZ,false));
		
		if (result.entityHit != null && result.entityHit != this.shootingEntity) {
			result.entityHit.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer) this.shootingEntity), 10.0F);
			for (int j = 0; j < 4; ++j) {
				this.worldObj.spawnParticle(EnumParticleTypes.SWEEP_ATTACK, this.posX, this.posY, this.posZ, 0.0D, 0.0D,
						0.0D);
			}
		}
		if (!this.worldObj.isRemote) {
			this.setDead();
		}
	}

	

	//private static void addWeatherEffect(EntityLightningBolt entityLightningBolt) {
		
		
	//}
}