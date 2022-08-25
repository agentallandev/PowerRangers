
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.powerrangers.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.github.agentallandev.powerrangers.client.renderer.PowerBowRenderer;
import com.github.agentallandev.powerrangers.client.renderer.DarknessBowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerrangersModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PowerrangersModEntities.POWER_BOW.get(), PowerBowRenderer::new);
		event.registerEntityRenderer(PowerrangersModEntities.DARKNESS_BOW.get(), DarknessBowRenderer::new);
	}
}
