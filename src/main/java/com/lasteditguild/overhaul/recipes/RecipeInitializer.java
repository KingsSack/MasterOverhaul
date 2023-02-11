package com.lasteditguild.overhaul.recipes;

import com.lasteditguild.overhaul.Main;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RecipeInitializer <T extends Recipe<?>> {

    public static void RecipeInit() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Main.MOD_ID, InfusionTableRecipe.Serializer.ID), InfusionTableRecipe.Serializer.INFUSION);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Main.MOD_ID, InfusionTableRecipe.Type.ID), InfusionTableRecipe.Type.INFUSION);
    }

}
