package net.shale.horde.crystalgarden.item.moditems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class bismuth_bottle {
    public static final Item BISMUTH_0 = registerItem("bismuth_bottle/0", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ZOMBIE_25 = registerItem("bismuth_bottle/zombie_25", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ZOMBIE_50 = registerItem("bismuth_bottle/zombie_50", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ZOMBIE_100 = registerItem("bismuth_bottle/zombie_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
