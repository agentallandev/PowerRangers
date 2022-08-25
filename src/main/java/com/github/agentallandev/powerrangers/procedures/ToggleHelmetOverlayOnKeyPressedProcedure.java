package com.github.agentallandev.powerrangers.procedures;

import net.minecraft.world.entity.Entity;

import com.github.agentallandev.powerrangers.network.PowerrangersModVariables;

public class ToggleHelmetOverlayOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = !(entity.getCapability(PowerrangersModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerrangersModVariables.PlayerVariables())).overlayToggled;
			entity.getCapability(PowerrangersModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.overlayToggled = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
