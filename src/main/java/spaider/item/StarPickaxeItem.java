
package spaider.item;

import spaider.init.SpaiderModTabs;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class StarPickaxeItem extends PickaxeItem {
	public StarPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2800;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.NETHER_STAR));
			}
		}, 1, -2.6f, new Item.Properties().fireResistant());
		ItemGroupEvents.modifyEntriesEvent(SpaiderModTabs.TAB_STARITEMSTAB).register(content -> content.accept(this));
	}

	@Override
	@Environment(EnvType.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
