package net.shale.horde.crystalgarden.mixin;

import com.google.gson.JsonObject;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Map;

@Mixin(ShapedRecipe.class)
public interface ShapedRecipeMix {
    @Invoker
    static Map<String, Ingredient> invokeReadSymbols(JsonObject json) {
        throw new AssertionError();
    }

    @Invoker
    static DefaultedList<Ingredient> invokeCreatePatternMatrix(String[] pattern, Map<String, Ingredient> symbols, int width, int height) {
        throw new AssertionError();
    }

    @Invoker
    static String[] invokeRemovePadding(String... pattern) {
        throw new AssertionError();

    }
}