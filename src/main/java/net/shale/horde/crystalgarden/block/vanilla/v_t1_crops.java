package net.shale.horde.crystalgarden.block.vanilla;

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

public class v_t1_crops {
    public static final Block CROP_DEEPSLATE = registerBlockWithoutBlockItem("vanilla/crop_deepslate",
            new v_t1_crop_deepslate(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_DIRT = registerBlockWithoutBlockItem("vanilla/crop_dirt",
            new v_t1_crop_dirt(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_ICE = registerBlockWithoutBlockItem("vanilla/crop_ice",
            new v_t1_crop_ice(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_STONE = registerBlockWithoutBlockItem("vanilla/crop_stone",
            new v_t1_crop_stone(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_WOOD = registerBlockWithoutBlockItem("vanilla/crop_wood",
            new v_t1_crop_wood(FabricBlockSettings.copy(Blocks.WHEAT)
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
                new FabricItemSettings().group(ItemGroup.FOOD)));
    }

    public static void registerBlock() {

    }
}
