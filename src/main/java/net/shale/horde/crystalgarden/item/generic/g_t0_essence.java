package net.shale.horde.crystalgarden.item.generic;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.util.itemCat;

public class g_t0_essence {
    public static final Item ESSENCE_AIR = registerItem("generic/essence_air", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_EARTH = registerItem("generic/essence_earth", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_FIRE = registerItem("generic/essence_fire", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_WATER = registerItem("generic/essence_water", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}

