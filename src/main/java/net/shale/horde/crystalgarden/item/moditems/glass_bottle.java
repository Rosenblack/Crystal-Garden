package net.shale.horde.crystalgarden.item.moditems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class glass_bottle {
    public static final Item BOTTLE_0 = registerItem("glass_bottle/0", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item NETHER_100 = registerItem("glass_bottle/nether_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item END_100 = registerItem("glass_bottle/end_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item NATURE_100 = registerItem("glass_bottle/nature_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item EXPERIENCE_100 = registerItem("glass_bottle/experience_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item DYE_100 = registerItem("glass_bottle/dye_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item CORAL_100 = registerItem("glass_bottle/coral_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
