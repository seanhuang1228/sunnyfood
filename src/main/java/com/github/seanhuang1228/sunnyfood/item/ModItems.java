package com.github.seanhuang1228.sunnyfood.item;

import com.github.seanhuang1228.sunnyfood.SunnyFood;
import com.github.seanhuang1228.sunnyfood.lib.SunnyItemTier;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraft.item.SwordItem;

@ObjectHolder(SunnyFood.MODID)
public class ModItems {
	public static final CreamBottle CREAM_BOTTLE = null;
	
	public static DeferredRegister<Item> getRegister(){
		return ModItems.ItemRegistry.REGISTER;
	}
	
	@SuppressWarnings("unused")
	public static class ItemRegistry{
		public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, SunnyFood.MODID);
		
		//items
		public static final RegistryObject<Item> CREAM_BOTTLE = ItemRegistry.REGISTER.register("cream_bottle", () -> new CreamBottle());
		public static final RegistryObject<Item> BUTTER = ItemRegistry.REGISTER.register("butter", () -> new Butter());
		public static final RegistryObject<Item> BREAD_SWORD = ItemRegistry.REGISTER.register("bread_sword", () -> new SwordItem(SunnyItemTier.BREAD, 2, -2.4f, new Item.Properties()));
	}
}
