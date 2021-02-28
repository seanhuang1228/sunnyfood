package com.github.seanhuang1228.sunnyfood.item;

import net.minecraft.item.Rarity;
import net.minecraft.item.Item;

public class Butter extends Item{
	public Butter() {
		super((new Item.Properties())
				.maxStackSize(64)
				.rarity(Rarity.COMMON));
	}
}
