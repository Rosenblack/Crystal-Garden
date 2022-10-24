package net.shale.horde.crystalgarden.item.generic;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.block.generic.g_t0_crops;

public class g_t0_seeds {
    public static final Item SEED_AIR = registerItem("generic/seed_air", new
            AliasedBlockItem(g_t0_crops.CROP_AIR,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_EARTH = registerItem("generic/seed_earth", new
            AliasedBlockItem(g_t0_crops.CROP_EARTH,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_FIRE = registerItem("generic/seed_fire", new
            AliasedBlockItem(g_t0_crops.CROP_FIRE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_WATER = registerItem("generic/seed_water", new
            AliasedBlockItem(g_t0_crops.CROP_WATER,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
