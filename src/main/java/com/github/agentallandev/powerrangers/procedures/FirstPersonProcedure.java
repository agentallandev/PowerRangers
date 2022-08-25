package com.github.agentallandev.powerrangers.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import com.github.agentallandev.powerrangers.network.PowerrangersModVariables;

@Mod.EventBusSubscriber
public class FirstPersonProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		boolean WasActive = false;
		{
			boolean _setval = Minecraft.getInstance().options.getCameraType().isFirstPerson();
			entity.getCapability(PowerrangersModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.FirstPerson = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (entity.getCapability(PowerrangersModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerrangersModVariables.PlayerVariables())).FirstPerson
					&& (entity.getCapability(PowerrangersModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerrangersModVariables.PlayerVariables())).overlayToggled;
			entity.getCapability(PowerrangersModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.HelmetOverlay = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
