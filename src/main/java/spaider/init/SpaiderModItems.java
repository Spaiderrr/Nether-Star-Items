/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package spaider.init;

import spaider.item.StarSwordItem;
import spaider.item.StarShovelItem;
import spaider.item.StarPickaxeItem;
import spaider.item.StarItem;
import spaider.item.StarHoeItem;
import spaider.item.StarAxeItem;

import spaider.SpaiderMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class SpaiderModItems {
	public static Item STAR_SWORD;
	public static Item STAR;
	public static Item STAR_PICKAXE;
	public static Item STAR_AXE;
	public static Item STAR_SHOVEL;
	public static Item STAR_HOE;

	public static void load() {
		STAR_SWORD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SpaiderMod.MODID, "star_sword"), new StarSwordItem());
		STAR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SpaiderMod.MODID, "star"), new StarItem());
		STAR_PICKAXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SpaiderMod.MODID, "star_pickaxe"), new StarPickaxeItem());
		STAR_AXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SpaiderMod.MODID, "star_axe"), new StarAxeItem());
		STAR_SHOVEL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SpaiderMod.MODID, "star_shovel"), new StarShovelItem());
		STAR_HOE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SpaiderMod.MODID, "star_hoe"), new StarHoeItem());
	}

	public static void clientLoad() {
	}
}
