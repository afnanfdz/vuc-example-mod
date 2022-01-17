package com.example.vucexample.datagen;

import com.example.vucexample.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ExvucRecipes extends RecipeProvider {

    public ExvucRecipes(DataGenerator generator) { super(generator); }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(
                    Ingredient.of(Registration.SYED_ORE_ITEM),
                    Registration.SYED_INGOT.get(),
                    100f,
                    100
                )
                .unlockedBy("has_ore", has(Registration.SYED_ORE_ITEM))
                .save(consumer, "syed_ingot_from_ore");

        SimpleCookingRecipeBuilder.smelting(
                    Ingredient.of(Registration.RAW_SYED_CHUNK.get()),
                    Registration.SYED_INGOT.get(),
                    100f,
                    100
                )
                .unlockedBy("has_chunk", has(Registration.RAW_SYED_CHUNK.get()))
                .save(consumer, "syed_ingot_from_chunk");
    }
}