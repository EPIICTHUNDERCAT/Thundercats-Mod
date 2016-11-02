package com.github.EPIICTHUNDERCAT.proxy;

import com.github.EPIICTHUNDERCAT.entity.EntityLightningRay;
import com.github.EPIICTHUNDERCAT.init.TCatsBlocks;
import com.github.EPIICTHUNDERCAT.init.TCatsItems;
import com.github.EPIICTHUNDERCAT.init.TCatsModEntities;
import com.github.EPIICTHUNDERCAT.render.RenderLightning;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ClientProxy extends CommonProxy{
	private static final Minecraft MC = Minecraft.getMinecraft();
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
		
		TCatsModEntities.initModels();
		
		
	
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
	
	}
	public void register(FMLPreInitializationEvent preEvent){
		super.register(preEvent);
	}
	
	@Override
	public void registerRenders(FMLInitializationEvent event) {
		TCatsItems.registerRender(event);
		TCatsBlocks.registerRender(event);
		
		
	
	}
	public static void playSound(ISound sound) {
        MC.getSoundHandler().playSound(sound);
    }

    public static void stopSound(ISound sound) {
        MC.getSoundHandler().stopSound(sound);
    }
	
	@Override
	public void VersionCheck(PlayerTickEvent event) {

		
	}
	@Override
	public void registerEntities(FMLPreInitializationEvent preEvent) {
		super.registerEntities(preEvent);
		RenderingRegistry.registerEntityRenderingHandler(EntityLightningRay.class, new IRenderFactory<EntityLightningRay>() {
            @Override public RenderLightning createRenderFor (RenderManager manager) {
                return new RenderLightning(manager, TCatsItems.LIGHTNING);
            }
        });
	}

}
