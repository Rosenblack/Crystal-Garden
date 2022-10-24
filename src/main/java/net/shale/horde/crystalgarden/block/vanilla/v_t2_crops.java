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

public class v_t2_crops {
    public static final Block CROP_AMETHYST = registerBlockWithoutBlockItem("vanilla/crop_amethyst",
            new v_t2_crop_amethyst(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_CHICKEN = registerBlockWithoutBlockItem("vanilla/crop_chicken",
            new v_t2_crop_chicken(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_COAL = registerBlockWithoutBlockItem("vanilla/crop_coal",
            new v_t2_crop_coal(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_COPPER = registerBlockWithoutBlockItem("vanilla/crop_copper",
            new v_t2_crop_copper(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_COW = registerBlockWithoutBlockItem("vanilla/crop_cow",
            new v_t2_crop_cow(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_FISH = registerBlockWithoutBlockItem("vanilla/crop_fish",
            new v_t2_crop_fish(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_IRON = registerBlockWithoutBlockItem("vanilla/crop_iron",
            new v_t2_crop_iron(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_PIG = registerBlockWithoutBlockItem("vanilla/crop_pig",
            new v_t2_crop_pig(FabricBlockSettings.copy(Blocks.WHEAT)
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
