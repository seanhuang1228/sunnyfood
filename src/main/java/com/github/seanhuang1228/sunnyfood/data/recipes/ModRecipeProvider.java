package com.github.seanhuang1228.sunnyfood.data.recipes;

import java.util.function.Consumer;

import com.github.seanhuang1228.sunnyfood.item.ModItems;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;

public class ModRecipeProvider extends RecipeProvider{
	
	public ModRecipeProvider(DataGenerator gen) {
		super(gen);
	}
	
	@Override
	public String getName() {
		return "Sunny Food - Recipe";
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		ShapelessRecipeBuilder.shapelessRecipe(ModItems.CREAM_BOTTLE)
		.addIngredient(Items.GLASS_BOTTLE)
		.addIngredient(Items.MILK_BUCKET)
		.build(consumer);
	}
}
