
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newermcversions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewerMcVersionsModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("newer_mc_versions", "mud_break"), new SoundEvent(new ResourceLocation("newer_mc_versions", "mud_break")));
		REGISTRY.put(new ResourceLocation("newer_mc_versions", "mud_step"), new SoundEvent(new ResourceLocation("newer_mc_versions", "mud_step")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
