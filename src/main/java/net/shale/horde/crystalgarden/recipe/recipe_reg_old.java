package net.shale.horde.crystalgarden.recipe;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class recipe_reg_old {
    public static final RecipeSerializer<?> CRAFTING_FIXED = new r_fixed.Serializer();

    public static void registerRecipeSerializers() {
        Registry.register(Registry.RECIPE_SERIALIZER, Main.id("fixed"), CRAFTING_FIXED);
    }
}
