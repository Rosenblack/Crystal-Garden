package net.shale.horde.crystalgarden.item.moditems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class seeds {
    public static final Item SEED_RHODONITE = registerItem("seeds/seed_rhodonite", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item SEED_BISMUTH = registerItem("seeds/seed_bismuth", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item SEED_DRAGONSTONE_OVERWORLD = registerItem("seeds/seed_dragonstone_overworld", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item SEED_DRAGONSTONE_NETHER = registerItem("seeds/seed_dragonstone_nether", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item SEED_DRAGONSTONE_END = registerItem("seeds/seed_dragonstone_end", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
