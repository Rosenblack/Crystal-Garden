package net.shale.horde.crystalgarden.block.generic;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.item.moditems.rhodonite_crop;

public class g_t0_crops {
    public static final Block CROP_RHODONITE = registerBlockWithoutBlockItem("seeds/crop_rhodonite",
            new rhodonite_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_AIR = registerBlockWithoutBlockItem("generic/crop_air",
            new g_t0_crop_air(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_EARTH = registerBlockWithoutBlockItem("generic/crop_earth",
            new g_t0_crop_earth(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_FIRE = registerBlockWithoutBlockItem("generic/crop_fire",
            new g_t0_crop_fire(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_WATER = registerBlockWithoutBlockItem("generic/crop_water",
            new g_t0_crop_water(FabricBlockSettings.copy(Blocks.WHEAT)
            ));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), new BlockItem(block,
                new FabricItemSettings().group(ItemGroup.MISC)));
    }

    public static void registerBlock() {

    }
}
