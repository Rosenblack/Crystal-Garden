
package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class v_t6_essence {
    public static final Item ESSENCE_DRAGON = registerItem("vanilla/essence_dragon", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_NETHER_STAR = registerItem("vanilla/essence_nether_star", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_NETHERITE = registerItem("vanilla/essence_netherite", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_SHULKER = registerItem("vanilla/essence_shulker", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
