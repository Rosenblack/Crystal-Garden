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

public class v_t6_crops {
    public static final Block CROP_DRAGON = registerBlockWithoutBlockItem("vanilla/crop_dragon",
            new v_t6_crop_dragon(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_NETHER_STAR = registerBlockWithoutBlockItem("vanilla/crop_nether_star",
            new v_t6_crop_nether_star(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_NETHERITE = registerBlockWithoutBlockItem("vanilla/crop_netherite",
            new v_t6_crop_netherite(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_SHULKER = registerBlockWithoutBlockItem("vanilla/crop_shulker",
            new v_t6_crop_shulker(FabricBlockSettings.copy(Blocks.WHEAT)
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
