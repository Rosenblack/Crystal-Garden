package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.util.itemCat;

public class v_t2_essence {
    public static final Item ESSENCE_AMETHYST = registerItem("vanilla/essence_amethyst", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_CHICKEN = registerItem("vanilla/essence_chicken", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_COAL = registerItem("vanilla/essence_coal", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_COPPER = registerItem("vanilla/essence_copper", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_COW = registerItem("vanilla/essence_cow", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_FISH = registerItem("vanilla/essence_fish", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_FROG = registerItem("vanilla/essence_frog", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_IRON = registerItem("vanilla/essence_iron", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item ESSENCE_PIG = registerItem("vanilla/essence_pig", new Item(new FabricItemSettings()
            .group(itemCat.MAIN)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}

