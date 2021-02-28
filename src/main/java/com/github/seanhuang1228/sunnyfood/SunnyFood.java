package com.github.seanhuang1228.sunnyfood;

import com.github.seanhuang1228.sunnyfood.init.RegistryHandler;

import net.minecraftforge.fml.common.Mod;

@Mod(SunnyFood.MODID)
public class SunnyFood {
	public static final String MODID = "sunnyfood";
	public static final String NAME = "Food Legend Mod";
	
	public SunnyFood() {
		RegistryHandler.registAll();
	}
}

//15:27