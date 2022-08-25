package com.github.agentallandev.powerrangers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import com.github.agentallandev.powerrangers.init.PowerrangersModItems;

public class UnmorphKeybindFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == PowerrangersModItems.MMPR_RED_RANGER_HELMET.get()) {
			MMPRUnmorphRedProcedure.execute(world, x, y, z, entity);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == PowerrangersModItems.MMPR_YELLOW_RANGER_HELMET.get()) {
			MMPRUnmorphYellowProcedure.execute(world, x, y, z, entity);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == PowerrangersModItems.MMPR_BLUE_RANGER_HELMET.get()) {
			MMPRUnmorphBlueProcedure.execute(world, x, y, z, entity);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == PowerrangersModItems.MMPR_BLACK_RANGER_HELMET.get()) {
			MMPRUnmorphBlackProcedure.execute(world, x, y, z, entity);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == PowerrangersModItems.MMPR_PINK_RANGER_HELMET.get()) {
			MMPRUnmorphPinkProcedure.execute(world, x, y, z, entity);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == PowerrangersModItems.MMPR_GREEN_RANGER_HELMET.get()) {
			MMPRUnmorphGreenProcedure.execute(world, x, y, z, entity);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == PowerrangersModItems.MMPR_WHITE_RANGER_HELMET.get()) {
			MMPRUnmorphWhiteProcedure.execute(world, x, y, z, entity);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == PowerrangersModItems.MMPR_LORD_DRAKKON_HELMET.get()) {
			MMPRUnmorphDrakkonProcedure.execute(world, x, y, z, entity);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == PowerrangersModItems.MMPR_LORD_DRAKKON_HELMET.get()) {
			MMPRUnmorphSlayerProcedure.execute(world, x, y, z, entity);
		}
	}
}
