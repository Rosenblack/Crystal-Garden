package net.shale.horde.crystalgarden.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class recipe_reg {
    public static void register() {
    Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Main.ID, r_combiner.Serializer.ID),
            r_combiner.Serializer.INSTANCE);
    Registry.register(Registry.RECIPE_TYPE, new Identifier(Main.ID, r_combiner.Type.ID),
            r_combiner.Type.INSTANCE);
    }
}
