package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class v_t1_essence {
    public static final Item ESSENCE_DEEPSLATE = registerItem("vanilla/essence_deepslate", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_DIRT = registerItem("vanilla/essence_dirt", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_ICE = registerItem("vanilla/essence_ice", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_STONE = registerItem("vanilla/essence_stone", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_WOOD = registerItem("vanilla/essence_wood", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}

