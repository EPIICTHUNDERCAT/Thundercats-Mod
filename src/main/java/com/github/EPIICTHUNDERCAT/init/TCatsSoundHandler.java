package com.github.EPIICTHUNDERCAT.init;

import com.github.EPIICTHUNDERCAT.Reference;
import com.github.EPIICTHUNDERCAT.Thundercats;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TCatsSoundHandler {
	public static final SoundEvent SNARF_SNARF = create("snarf_snarf");
	public static final SoundEvent SNAAARF = create("snaaarf");
	
	
	
	public static SoundEvent create(String name) {
        ResourceLocation resource = new ResourceLocation(Reference.ID, name);
        SoundEvent event = new SoundEvent(resource);
        GameRegistry.register(event, resource);
        return event;
    }

}
