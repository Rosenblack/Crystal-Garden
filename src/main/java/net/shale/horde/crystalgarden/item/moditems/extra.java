package net.shale.horde.crystalgarden.item.moditems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.item.moditems.modifiers.glinted;
import net.shale.horde.crystalgarden.item.moditems.modifiers.limitedCatalyst;
import net.shale.horde.crystalgarden.item.moditems.modifiers.unlimitedCatalyst;

public class extra {
    public static final Item PLACEHOLDER = registerItem("placeholder", new Item(new FabricItemSettings()));
    public static final Item SHARD_STAR = registerItem("extras/star", new glinted(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item SHARD_DRAGON = registerItem("extras/dragon", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item SCALE_DRAGON = registerItem("extras/dragon_scale", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item BONE_WITHER = registerItem("extras/withered_bone", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item DISC_BLANK = registerItem("extras/blank_disc", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item RHODONITE_CATALYST = registerItem("gemstones/rhodonite_catalyst", new limitedCatalyst());
    public static final Item LARIMAR_CATALYST = registerItem("gemstones/larimar_catalyst", new unlimitedCatalyst());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
