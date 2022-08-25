
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.powerrangers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.github.agentallandev.powerrangers.entity.PowerBowEntity;
import com.github.agentallandev.powerrangers.entity.DarknessBowEntity;
import com.github.agentallandev.powerrangers.PowerrangersMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerrangersModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, PowerrangersMod.MODID);
	public static final RegistryObject<EntityType<PowerBowEntity>> POWER_BOW = register("projectile_power_bow",
			EntityType.Builder.<PowerBowEntity>of(PowerBowEntity::new, MobCategory.MISC).setCustomClientFactory(PowerBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DarknessBowEntity>> DARKNESS_BOW = register("projectile_darkness_bow",
			EntityType.Builder.<DarknessBowEntity>of(DarknessBowEntity::new, MobCategory.MISC).setCustomClientFactory(DarknessBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
