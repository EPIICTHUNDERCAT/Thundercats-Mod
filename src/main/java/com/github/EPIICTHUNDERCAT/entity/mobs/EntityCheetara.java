package com.github.EPIICTHUNDERCAT.entity.mobs;

import javax.annotation.Nullable;

import com.github.EPIICTHUNDERCAT.Reference;
import com.github.EPIICTHUNDERCAT.init.TCatsItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityCheetara extends EntityCreature {

	private int attackTimer;
	private int holdStaffTick;
	// Still need to implement
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.ID, "entities/cheetara");

	public EntityCheetara(World worldIn) {
		super(worldIn);

	}

	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, true));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.applyEntityAI();

	}

	protected void applyEntityAI() {

	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.75D);
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0D);
	}

	protected void entityInit() {
		super.entityInit();

	}

	protected int getExperiencePoints(EntityPlayer player) {
		this.experienceValue = (int) ((float) this.experienceValue * 2.5F);

		return super.getExperiencePoints(player);
	}

	// Still Need Sounds
	protected SoundEvent getAmbientSound() {
		return null;

	}

	// Still Need Sounds
	protected SoundEvent getHurtSound() {
		return null;

	}

	// Still Need Sounds
	protected SoundEvent getDeathSound() {
		return null;
	}

	// Still Need Sounds
	protected void playStepSound(BlockPos pos, Block blockIn) {

	}

	protected float getSoundVolume() {
		return 0.4F;
	}

	@Override
	public int getMaxSpawnedInChunk() {
		return 2;
	}

	@Override
	@Nullable
	protected ResourceLocation getLootTable() {
		return LOOT;
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.attackTimer > 0) {
			--this.attackTimer;
		}

		if (this.holdStaffTick > 0) {
			--this.holdStaffTick;
		}

		if (this.motionX * this.motionX + this.motionZ * this.motionZ > 2.500000277905201E-7D
				&& this.rand.nextInt(5) == 0) {
			int i = MathHelper.floor_double(this.posX);
			int j = MathHelper.floor_double(this.posY - 0.20000000298023224D);
			int k = MathHelper.floor_double(this.posZ);
			IBlockState iblockstate = this.worldObj.getBlockState(new BlockPos(i, j, k));

			if (iblockstate.getMaterial() != Material.AIR) {
				this.worldObj.spawnParticle(EnumParticleTypes.BLOCK_CRACK,
						this.posX + ((double) this.rand.nextFloat() - 0.5D) * (double) this.width,
						this.getEntityBoundingBox().minY + 0.1D,
						this.posZ + ((double) this.rand.nextFloat() - 0.5D) * (double) this.width,
						4.0D * ((double) this.rand.nextFloat() - 0.5D), 0.5D,
						((double) this.rand.nextFloat() - 0.5D) * 4.0D, new int[] { Block.getStateId(iblockstate) });
			}
		}
	}

	public int getHoldStaff() {
		return this.holdStaffTick;
	}

	/*
	 * public void getHoldStaff(boolean p_70851_1_) {
	 * 
	 * this.holdStaffTick = p_70851_1_ ? 400 : 0;
	 * this.worldObj.setEntityState(this, (byte) 11); }
	 */

	@SideOnly(Side.CLIENT)
	public int getAttackTimer() {

		return this.attackTimer;
	}

	@SideOnly(Side.CLIENT)
	public void handleStatusUpdate(byte id) {
		if (id == 4) {
			this.attackTimer = 10;
			this.playSound(SoundEvents.BLOCK_ANVIL_FALL, 1.0F, 1.0F);
		} else if (id == 11) {
			this.holdStaffTick = 400;
		} else {
			super.handleStatusUpdate(id);
		}
	}

	public boolean attackEntityAsMob(Entity entityIn) {
		this.attackTimer = 10;
		this.worldObj.setEntityState(this, (byte) 4);
		boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this),
				(float) (7 + this.rand.nextInt(15)));

		if (flag) {
			entityIn.motionY += 0.4000000059604645D;
			this.applyEnchantments(this, entityIn);
		}

		this.playSound(SoundEvents.BLOCK_ANVIL_USE, 1.0F, 1.0F);
		return flag;
	}

	protected boolean canDespawn() {
		return false;
	}

}
