
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.powerrangers.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerrangersModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("powerrangers", "mm_dragon_roar"), new SoundEvent(new ResourceLocation("powerrangers", "mm_dragon_roar")));
		REGISTRY.put(new ResourceLocation("powerrangers", "mm_mastadon_roar"),
				new SoundEvent(new ResourceLocation("powerrangers", "mm_mastadon_roar")));
		REGISTRY.put(new ResourceLocation("powerrangers", "mm_pteradactyl_roar"),
				new SoundEvent(new ResourceLocation("powerrangers", "mm_pteradactyl_roar")));
		REGISTRY.put(new ResourceLocation("powerrangers", "mm_triceratops_roar"),
				new SoundEvent(new ResourceLocation("powerrangers", "mm_triceratops_roar")));
		REGISTRY.put(new ResourceLocation("powerrangers", "mm_sabertooth_roar"),
				new SoundEvent(new ResourceLocation("powerrangers", "mm_sabertooth_roar")));
		REGISTRY.put(new ResourceLocation("powerrangers", "mm_trex_roar"), new SoundEvent(new ResourceLocation("powerrangers", "mm_trex_roar")));
		REGISTRY.put(new ResourceLocation("powerrangers", "mm_tiger_roar"), new SoundEvent(new ResourceLocation("powerrangers", "mm_tiger_roar")));
		REGISTRY.put(new ResourceLocation("powerrangers", "mm_theme_music"), new SoundEvent(new ResourceLocation("powerrangers", "mm_theme_music")));
		REGISTRY.put(new ResourceLocation("powerrangers", "mm_morph"), new SoundEvent(new ResourceLocation("powerrangers", "mm_morph")));
		REGISTRY.put(new ResourceLocation("powerrangers", "mm_power_down"), new SoundEvent(new ResourceLocation("powerrangers", "mm_power_down")));
		REGISTRY.put(new ResourceLocation("powerrangers", "mm_blaster_fire"),
				new SoundEvent(new ResourceLocation("powerrangers", "mm_blaster_fire")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
