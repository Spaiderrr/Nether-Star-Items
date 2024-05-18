
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package spaider.init;

import spaider.SpaiderMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class SpaiderModTabs {
	public static ResourceKey<CreativeModeTab> TAB_STARITEMSTAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(SpaiderMod.MODID, "staritemstab"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_STARITEMSTAB, FabricItemGroup.builder().title(Component.translatable("item_group." + SpaiderMod.MODID + ".staritemstab")).icon(() -> new ItemStack(SpaiderModItems.STAR)).build());
	}
}
