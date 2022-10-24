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

public class v_t3_crops {
    public static final Block CROP_CORAL = registerBlockWithoutBlockItem("vanilla/crop_coral",
            new v_t3_crop_coral(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_CREEPER = registerBlockWithoutBlockItem("vanilla/crop_creeper",
            new v_t3_crop_creeper(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_HONEY = registerBlockWithoutBlockItem("vanilla/crop_honey",
            new v_t3_crop_honey(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_LAPIS = registerBlockWithoutBlockItem("vanilla/crop_lapis",
            new v_t3_crop_lapis(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_RABBIT = registerBlockWithoutBlockItem("vanilla/crop_rabbit",
            new v_t3_crop_rabbit(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_SHEEP = registerBlockWithoutBlockItem("vanilla/crop_sheep",
            new v_t3_crop_sheep(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_SKELETON = registerBlockWithoutBlockItem("vanilla/crop_skeleton",
            new v_t3_crop_skeleton(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_SLIME = registerBlockWithoutBlockItem("vanilla/crop_slime",
            new v_t3_crop_slime(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_SPIDER = registerBlockWithoutBlockItem("vanilla/crop_spider",
            new v_t3_crop_spider(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_SQUID = registerBlockWithoutBlockItem("vanilla/crop_squid",
            new v_t3_crop_squid(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_TURTLE = registerBlockWithoutBlockItem("vanilla/crop_turtle",
            new v_t3_crop_turtle(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_ZOMBIE = registerBlockWithoutBlockItem("vanilla/crop_zombie",
            new v_t3_crop_zombie(FabricBlockSettings.copy(Blocks.WHEAT)
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
