package com.github.seanhuang1228.sunnyfood.item;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class CreamBottle extends Item{
	public CreamBottle(){
		super((new Item.Properties())
				.maxStackSize(16)
				.rarity(Rarity.COMMON));
	}
}
