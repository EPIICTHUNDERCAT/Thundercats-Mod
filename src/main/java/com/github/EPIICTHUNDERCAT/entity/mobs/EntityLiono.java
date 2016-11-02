package com.github.EPIICTHUNDERCAT.entity.mobs;

import javax.annotation.Nullable;

import com.github.EPIICTHUNDERCAT.Reference;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityLiono extends EntityCreature {
	private int attackTimer;
	private int holdSwordOfOmens;
	// Still need to implement
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.ID, "entities/liono");

	public EntityLiono(World worldIn) {
		super(worldIn);
		// this.setSize(0.6F, 1.95F);
	}

	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, true));
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.applyEntityAI();

	}

	protected void applyEntityAI() {

	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0D);
	}

	protected void entityInit() {
		super.entityInit();

	}

	public EntityAgeable createChild(EntityAgeable ageable) {

		return null;
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
	@SideOnly(Side.CLIENT)
	public int getAttackTimer() {
		
		return this.attackTimer;
	}

	
	  public void getHoldSwordOfOmens(boolean p_70851_1_) {
	  this.holdSwordOfOmens = p_70851_1_ ? 400 : 0;
	  this.worldObj.setEntityState(this, (byte)11); }
	 

	public int getHoldSwordOfOmens() {
		return this.holdSwordOfOmens;
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.attackTimer > 0) {
			--this.attackTimer;
		}

		if (this.holdSwordOfOmens > 0) {
			--this.holdSwordOfOmens;
		}
	}
	public boolean attackEntityAsMob(Entity entityIn)
    {
        this.attackTimer = 10;
        this.worldObj.setEntityState(this, (byte)4);
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));

        if (flag)
        {
            entityIn.motionY += 0.4000000059604645D;
            this.applyEnchantments(this, entityIn);
        }

        this.playSound(SoundEvents.ENTITY_IRONGOLEM_ATTACK, 1.0F, 1.0F);
        return flag;
    }
	protected boolean canDespawn()
    {
        return false;
    }
}
