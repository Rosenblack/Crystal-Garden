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

public class v_t5_crops {
    public static final Block CROP_BlAZE = registerBlockWithoutBlockItem("vanilla/crop_blaze",
            new v_t5_crop_blaze(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_DIAMOND = registerBlockWithoutBlockItem("vanilla/crop_diamond",
            new v_t5_crop_diamond(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_END = registerBlockWithoutBlockItem("vanilla/crop_end",
            new v_t5_crop_end(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_GHAST = registerBlockWithoutBlockItem("vanilla/crop_ghast",
            new v_t5_crop_ghast(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_GLOWSTONE = registerBlockWithoutBlockItem("vanilla/crop_glowstone",
            new v_t5_crop_glowstone(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_NETHER = registerBlockWithoutBlockItem("vanilla/crop_nether",
            new v_t5_crop_nether(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_NETHER_QUARTZ = registerBlockWithoutBlockItem("vanilla/crop_nether_quartz",
            new v_t5_crop_nether_quartz(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_WITHER_SKELETON = registerBlockWithoutBlockItem("vanilla/crop_wither_skeleton",
            new v_t5_crop_wither_skeleton(FabricBlockSettings.copy(Blocks.WHEAT)
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
