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

public class v_t4_crops {
    public static final Block CROP_DYE = registerBlockWithoutBlockItem("vanilla/crop_dye",
            new v_t4_crop_dye(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_EMERALD = registerBlockWithoutBlockItem("vanilla/crop_emerald",
            new v_t4_crop_emerald(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_ENDERMAN = registerBlockWithoutBlockItem("vanilla/crop_enderman",
            new v_t4_crop_enderman(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_EXPERIENCE = registerBlockWithoutBlockItem("vanilla/crop_experience",
            new v_t4_crop_experience(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_GOLD = registerBlockWithoutBlockItem("vanilla/crop_gold",
            new v_t4_crop_gold(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_NATURE = registerBlockWithoutBlockItem("vanilla/crop_nature",
            new v_t4_crop_nature(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_OBSIDIAN = registerBlockWithoutBlockItem("vanilla/crop_obsidian",
            new v_t4_crop_obsidian(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_PRISMARINE = registerBlockWithoutBlockItem("vanilla/crop_prismarine",
            new v_t4_crop_prismarine(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_REDSTONE = registerBlockWithoutBlockItem("vanilla/crop_redstone",
            new v_t4_crop_redstone(FabricBlockSettings.copy(Blocks.WHEAT)
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
