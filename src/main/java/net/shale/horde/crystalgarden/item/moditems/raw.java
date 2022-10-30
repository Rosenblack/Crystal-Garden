package net.shale.horde.crystalgarden.item.moditems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class raw {
    public static final Item AVENTURINE = registerItem("raw/aventurine", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ARAGONITE = registerItem("raw/aragonite", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item SPINEL = registerItem("raw/spinel", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item LARIMAR = registerItem("raw/larimar", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item CHAORITE = registerItem("raw/chaorite", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
