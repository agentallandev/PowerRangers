package com.github.agentallandev.powerrangers.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import com.github.agentallandev.powerrangers.network.PowerrangersModVariables;
import com.github.agentallandev.powerrangers.init.PowerrangersModItems;

public class MMPRWearingHelmetRedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(PowerrangersModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerrangersModVariables.PlayerVariables())).HelmetOverlay
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == PowerrangersModItems.MMPR_RED_RANGER_HELMET.get();
	}
}
