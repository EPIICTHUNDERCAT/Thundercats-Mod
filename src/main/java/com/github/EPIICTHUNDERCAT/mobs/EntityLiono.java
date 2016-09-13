package com.github.EPIICTHUNDERCAT.mobs;

import javax.annotation.Nullable;

import com.github.EPIICTHUNDERCAT.Reference;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityLiono extends EntityCreature {
	
	//Still need to implement
	  public static final ResourceLocation LOOT = new ResourceLocation(Reference.ID, "entities/liono");


	public EntityLiono(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 1.95F);
	}

	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.applyEntityAI();

	}

	protected void applyEntityAI() {
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(3.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}
	protected void entityInit(){
		
	}

	public EntityAgeable createChild(EntityAgeable ageable) {
		
		return null;
	}
	//Still Need Sounds
	protected SoundEvent getAmbientSound(){
		return null;
		
	}
	//Still Need Sounds
	protected SoundEvent getHurtSound(){
		return null;
		
	}
	//Still Need Sounds
	protected SoundEvent getDeathSound(){
		return null;
	}
	//Still Need Sounds
	protected void playStepSound(BlockPos pos, Block blockIn)
    {
        
    }
	protected float getSoundVolume()
    {
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
	
	
	
	
	
	
	
}
