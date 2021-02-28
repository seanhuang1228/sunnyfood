package com.github.seanhuang1228.sunnyfood.init;

import com.github.seanhuang1228.sunnyfood.data.DataGenerators;
import com.github.seanhuang1228.sunnyfood.item.ModItems;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RegistryHandler {
	private static IEventBus BUS = FMLJavaModLoadingContext.get().getModEventBus();
	
	public static void registAll() {
		BUS.addListener(DataGenerators::gatherData);
		
		ModItems.getRegister().register(RegistryHandler.BUS);
	}
}
