package com.github.agentallandev.powerrangers.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import com.github.agentallandev.powerrangers.network.PowerrangersModVariables;

public class RangerEffectsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double rangerMultipler = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.is(ItemTags.create(new ResourceLocation("forge:mmpr_helmet")))
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.is(ItemTags.create(new ResourceLocation("forge:mmpr_chest")))
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.is(ItemTags.create(new ResourceLocation("forge:mmpr_pants")))
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.is(ItemTags.create(new ResourceLocation("forge:mmpr_boots")))) {
			rangerMultipler = (entity.getCapability(PowerrangersModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerrangersModVariables.PlayerVariables())).RangerTier;
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10, (int) rangerMultipler, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10, (int) rangerMultipler, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 10, (int) rangerMultipler, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, (int) (Math.floor(rangerMultipler) / 2), (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 10, (int) (Math.ceil(rangerMultipler) * 2), (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 10, (int) (Math.floor(rangerMultipler) / 2), (true), (false)));
		}
	}
}
