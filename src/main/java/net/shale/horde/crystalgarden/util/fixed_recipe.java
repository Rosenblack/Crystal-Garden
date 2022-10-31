package net.shale.horde.crystalgarden.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import net.shale.horde.crystalgarden.mixin.ShapedRecipeMix;

import java.util.Map;

public class fixed_recipe extends damageable_recipe {
    public fixed_recipe(Identifier id, String group, int width, int height, DefaultedList<Ingredient> input, ItemStack output) {
        super(id, group, width, height, input, output);
    }

    public static String[] getPattern(JsonArray json) {
        String[] strings = new String[json.size()];
        if (strings.length > 3) {
            throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
        } else if (strings.length == 0) {
            throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
        } else {
            for (int i = 0; i < strings.length; ++i) {
                String string = JsonHelper.asString(json.get(i), "pattern[" + i + "]");
                if (string.length() > 3) {
                    throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
                }

                if (i > 0 && strings[0].length() != string.length()) {
                    throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
                }

                strings[i] = string;
            }

            return strings;
        }
    }

    @Override
    public boolean matches(CraftingInventory inventory, World world) {
        for (int i = 0; i <= inventory.getWidth() - this.getWidth(); i++) {
            for (int j = 0; j <= inventory.getHeight() - this.getHeight(); j++) {
                if (this.checkMatch(inventory, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return recipe_manager.CRAFTING_FIXED;
    }

    private boolean checkMatch(CraftingInventory inventory, int x, int y) {
        for (int i = 0; i < inventory.getWidth(); ++i) {
            for (int j = 0; j < inventory.getHeight(); ++j) {
                int k = i - x;
                int l = j - y;
                Ingredient ingredient = Ingredient.EMPTY;
                if (k >= 0 && l >= 0 && k < this.getWidth() && l < this.getHeight()) {
                    ingredient = this.getIngredients().get(k + l * this.getWidth());
                }

                if (!ingredient.test(inventory.getStack(i + j * inventory.getWidth()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static class Serializer extends ShapedRecipe.Serializer {
        @Override
        public ShapedRecipe read(Identifier identifier, JsonObject jsonObject) {
            String s = JsonHelper.getString(jsonObject, "group", "");
            Map<String, Ingredient> map = ShapedRecipeMix.invokeReadSymbols(JsonHelper.getObject(jsonObject, "key"));
            String[] astring = fixed_recipe.getPattern(JsonHelper.getArray(jsonObject, "pattern"));
            int i = astring[0].length();
            int j = astring.length;
            DefaultedList<Ingredient> nonnulllist = ShapedRecipeMix.invokeCreatePatternMatrix(astring, map, i, j);
            ItemStack itemstack = ShapedRecipe.getItem(JsonHelper.getObject(jsonObject, "result")).getDefaultStack();
            return new fixed_recipe(identifier, s, i, j, nonnulllist, itemstack);
        }

        @Override
        public ShapedRecipe read(Identifier identifier, PacketByteBuf packetByteBuf) {
            int i = packetByteBuf.readVarInt();
            int j = packetByteBuf.readVarInt();
            String s = packetByteBuf.readString(32767);
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(i * j, Ingredient.EMPTY);

            for (int k = 0; k < inputs.size(); ++k) {
                inputs.set(k, Ingredient.fromPacket(packetByteBuf));
            }

            ItemStack output = packetByteBuf.readItemStack();
            return new fixed_recipe(identifier, s, i, j, inputs, output);
        }


        @Override
        public void write(PacketByteBuf packetByteBuf, ShapedRecipe shapedRecipe) {
            packetByteBuf.writeVarInt(shapedRecipe.getWidth());
            packetByteBuf.writeVarInt(shapedRecipe.getHeight());
            packetByteBuf.writeString(shapedRecipe.getGroup());

            for (Ingredient ingredient : shapedRecipe.getIngredients()) {
                ingredient.write(packetByteBuf);
            }

            packetByteBuf.writeItemStack(shapedRecipe.getOutput());
        }
    }
}
