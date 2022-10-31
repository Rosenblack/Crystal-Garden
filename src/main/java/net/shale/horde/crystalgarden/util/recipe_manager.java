package net.shale.horde.crystalgarden.util;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class recipe_manager {
    public static final RecipeSerializer<?> CRAFTING_FIXED = new fixed_recipe.Serializer();

    public static void registerRecipeSerializers() {
        Registry.register(Registry.RECIPE_SERIALIZER, Main.id("fixed"), CRAFTING_FIXED);
    }
}
