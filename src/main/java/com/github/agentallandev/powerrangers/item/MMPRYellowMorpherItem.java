
package com.github.agentallandev.powerrangers.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import com.github.agentallandev.powerrangers.procedures.MMPRMorphYellowProcedure;
import com.github.agentallandev.powerrangers.init.PowerrangersModTabs;

public class MMPRYellowMorpherItem extends Item {
	public MMPRYellowMorpherItem() {
		super(new Item.Properties().tab(PowerrangersModTabs.TAB_MMPR_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MMPRMorphYellowProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
