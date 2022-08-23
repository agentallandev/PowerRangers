
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.powerrangers.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PowerrangersModTabs {
	public static CreativeModeTab TAB_MMPR_CREATIVE_TAB;

	public static void load() {
		TAB_MMPR_CREATIVE_TAB = new CreativeModeTab("tabmmpr_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerrangersModItems.MMPR_RED_RANGER_HELMET.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
