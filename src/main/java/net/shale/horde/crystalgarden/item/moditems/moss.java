package net.shale.horde.crystalgarden.item.moditems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.util.itemCat;

public class moss {
    public static final Item MOSS_AIR = registerItem("moss/air", new Item(new FabricItemSettings().group(itemCat.MAIN)));
    public static final Item MOSS_EARTH = registerItem("moss/earth", new Item(new FabricItemSettings().group(itemCat.MAIN)));
    public static final Item MOSS_FIRE = registerItem("moss/fire", new Item(new FabricItemSettings().group(itemCat.MAIN)));
    public static final Item MOSS_WATER = registerItem("moss/water", new Item(new FabricItemSettings().group(itemCat.MAIN)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
