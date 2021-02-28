package com.github.seanhuang1228.sunnyfood.data;

import com.github.seanhuang1228.sunnyfood.data.recipes.ModRecipeProvider;

import net.minecraft.data.DataGenerator;
//import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

public class DataGenerators {
	private DataGenerators() {}
	
	public static void gatherData(GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
		//ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		
		gen.addProvider(new ModRecipeProvider(gen));
	}
}
