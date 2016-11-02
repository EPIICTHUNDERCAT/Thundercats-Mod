package com.github.EPIICTHUNDERCAT.entity.mobs;

import java.util.UUID;

import javax.annotation.Nullable;

import com.github.EPIICTHUNDERCAT.Reference;
import com.github.EPIICTHUNDERCAT.Thundercats;
import com.github.EPIICTHUNDERCAT.init.TCatsSoundHandler;
import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIBeg;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntitySnarf extends EntityWolf {

	private static final DataParameter<Float> DATA_HEALTH_ID = EntityDataManager.<Float>createKey(EntitySnarf.class,
			DataSerializers.FLOAT);
	private static final DataParameter<Boolean> BEGGING = EntityDataManager.<Boolean>createKey(EntitySnarf.class,
			DataSerializers.BOOLEAN);
	private static final DataParameter<Integer> COLLAR_COLOR = EntityDataManager.<Integer>createKey(EntitySnarf.class,
			DataSerializers.VARINT);
	//public SoundEvent snarfNoise;

	public static final ResourceLocation LOOT = new ResourceLocation(Reference.ID, "entities/snarf");

	public EntitySnarf(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 0.85F);

	}

	@Override
	protected SoundEvent getAmbientSound() {

		return TCatsSoundHandler.SNAAARF;

	}
	@Override
	protected SoundEvent getHurtSound() {
		return TCatsSoundHandler.SNARF_SNARF;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_WOLF_DEATH;
	}
	/*
	 * @Override protected void applyEntityAttributes() {
	 * super.applyEntityAttributes();
	 * this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(5.0D)
	 * ; this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).
	 * setBaseValue(0.30000001192092896D);
	 * 
	 * if (this.isTamed()) {
	 * this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(
	 * 20.0D); } else {
	 * this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(
	 * 8.0D); }
	 * 
	 * this.getAttributeMap().registerAttribute(SharedMonsterAttributes.
	 * ATTACK_DAMAGE).setBaseValue(2.0D); }
	 */

	/**
	 * Will return how many at most can spawn in a chunk at once.
	 */
	@Override
	public int getMaxSpawnedInChunk() {
		return 4;
	}

	@Override
	@Nullable
	protected ResourceLocation getLootTable() {
		return LOOT;
	}

	public EntitySnarf createChild(EntityAgeable ageable) {
		EntitySnarf entitysnarf = new EntitySnarf(this.worldObj);
		UUID uuid = this.getOwnerId();

		if (uuid != null) {
			entitysnarf.setOwnerId(uuid);
			entitysnarf.setTamed(true);
		}

		return entitysnarf;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getTailRotation() {
		return this.isAngry() ? 1.5393804F
				: (this.isTamed() ? (0.55F
						- (this.getMaxHealth() - ((Float) this.dataManager.get(DATA_HEALTH_ID)).floatValue()) * 0.02F)
						* (float) Math.PI : ((float) Math.PI / 5F));
	}

	protected int getExperiencePoints(EntityPlayer player) {
		this.experienceValue = (int) ((float) this.experienceValue * 2.5F);

		return super.getExperiencePoints(player);
	}

	/*
	 * 
	 * protected Item getDropItem() { return TutorialItems.grimdark_essence; }
	 * 
	 */
	protected boolean canDespawn() {
		return false;
	}

}
