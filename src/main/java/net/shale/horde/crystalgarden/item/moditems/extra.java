package net.shale.horde.crystalgarden.item.moditems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.item.moditems.modifiers.glinted;

public class extra {
    public static final Item PLACEHOLDER = registerItem("placeholder", new Item(new FabricItemSettings()));
    public static final Item SHARD_STAR = registerItem("extras/star", new glinted(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item SHARD_DRAGON = registerItem("extras/dragon", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
