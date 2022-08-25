
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.powerrangers.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import com.github.agentallandev.powerrangers.network.UnmorphKeybindMessage;
import com.github.agentallandev.powerrangers.network.ToggleHelmetOverlayMessage;
import com.github.agentallandev.powerrangers.PowerrangersMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PowerrangersModKeyMappings {
	public static final KeyMapping TOGGLE_HELMET_OVERLAY = new KeyMapping("key.powerrangers.toggle_helmet_overlay", GLFW.GLFW_KEY_C,
			"key.categories.misc");
	public static final KeyMapping UNMORPH_KEYBIND = new KeyMapping("key.powerrangers.unmorph_keybind", GLFW.GLFW_KEY_V, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(TOGGLE_HELMET_OVERLAY);
		ClientRegistry.registerKeyBinding(UNMORPH_KEYBIND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == TOGGLE_HELMET_OVERLAY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						PowerrangersMod.PACKET_HANDLER.sendToServer(new ToggleHelmetOverlayMessage(0, 0));
						ToggleHelmetOverlayMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == UNMORPH_KEYBIND.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						PowerrangersMod.PACKET_HANDLER.sendToServer(new UnmorphKeybindMessage(0, 0));
						UnmorphKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
