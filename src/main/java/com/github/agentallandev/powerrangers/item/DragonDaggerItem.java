
package com.github.agentallandev.powerrangers.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import com.github.agentallandev.powerrangers.init.PowerrangersModTabs;

public class DragonDaggerItem extends SwordItem {
	public DragonDaggerItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -1f, new Item.Properties().tab(PowerrangersModTabs.TAB_MMPR_CREATIVE_TAB));
	}
}
