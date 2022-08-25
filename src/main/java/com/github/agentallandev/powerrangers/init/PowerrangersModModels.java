
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.powerrangers.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.github.agentallandev.powerrangers.client.model.Modelpower_arrow;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PowerrangersModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelpower_arrow.LAYER_LOCATION, Modelpower_arrow::createBodyLayer);
	}
}
