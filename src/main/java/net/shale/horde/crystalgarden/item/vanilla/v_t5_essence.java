
package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class v_t5_essence {
    public static final Item ESSENCE_BLAZE = registerItem("vanilla/essence_blaze", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_DIAMOND = registerItem("vanilla/essence_diamond", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_END = registerItem("vanilla/essence_end", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_GHAST = registerItem("vanilla/essence_ghast", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_GLOWSTONE = registerItem("vanilla/essence_glowstone", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_NETHER = registerItem("vanilla/essence_nether", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_NETHER_QUARTZ = registerItem("vanilla/essence_nether_quartz", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_SCULK = registerItem("vanilla/essence_sculk", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_WITHER_SKELETON = registerItem("vanilla/essence_wither_skeleton", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}

