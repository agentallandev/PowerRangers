
package com.github.agentallandev.powerrangers.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;

import com.github.agentallandev.powerrangers.procedures.ToggleHelmetOverlayOnKeyPressedProcedure;
import com.github.agentallandev.powerrangers.PowerrangersMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ToggleHelmetOverlayMessage {
	int type, pressedms;

	public ToggleHelmetOverlayMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ToggleHelmetOverlayMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ToggleHelmetOverlayMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ToggleHelmetOverlayMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			ToggleHelmetOverlayOnKeyPressedProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerrangersMod.addNetworkMessage(ToggleHelmetOverlayMessage.class, ToggleHelmetOverlayMessage::buffer, ToggleHelmetOverlayMessage::new,
				ToggleHelmetOverlayMessage::handler);
	}
}
