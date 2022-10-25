package net.shale.horde.crystalgarden.item.moditems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class gemstones {
    public static final Item BISMUTH = registerItem("gemstones/bismuth", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item DRAGONSTONE_OVERWORLD = registerItem("gemstones/dragonstone_overworld", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item DRAGONSTONE_NETHER = registerItem("gemstones/dragonstone_nether", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item DRAGONSTONE_END = registerItem("gemstones/dragonstone_end", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item BLOODSTONE = registerItem("gemstones/bloodstone", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item RHODONITE = registerItem("gemstones/rhodonite", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item AVENTURINE = registerItem("gemstones/aventurine", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ARAGONITE = registerItem("gemstones/aragonite", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item SPINEL = registerItem("gemstones/spinel", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item CHAORITE = registerItem("gemstones/chaorite", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
