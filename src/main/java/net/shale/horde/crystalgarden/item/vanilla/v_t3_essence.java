package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.util.itemCat;

public class v_t3_essence {
    public static final Item ESSENCE_CORAL = registerItem("vanilla/essence_coral", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_CREEPER = registerItem("vanilla/essence_creeper", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_HONEY = registerItem("vanilla/essence_honey", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_LAPIS = registerItem("vanilla/essence_lapis", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_RABBIT = registerItem("vanilla/essence_rabbit", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_SHEEP = registerItem("vanilla/essence_sheep", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_SKELETON = registerItem("vanilla/essence_skeleton", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_SLIME = registerItem("vanilla/essence_slime", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_SPIDER = registerItem("vanilla/essence_spider", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_SQUID = registerItem("vanilla/essence_squid", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_TURTLE = registerItem("vanilla/essence_turtle", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_ZOMBIE = registerItem("vanilla/essence_zombie", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}

