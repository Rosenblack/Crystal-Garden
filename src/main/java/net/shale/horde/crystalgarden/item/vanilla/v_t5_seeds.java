package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.block.vanilla.v_t4_crops;
import net.shale.horde.crystalgarden.block.vanilla.v_t5_crops;

public class v_t5_seeds {
    public static final Item SEED_BLAZE = registerItem("vanilla/seed_blaze", new
            AliasedBlockItem(v_t5_crops.CROP_BlAZE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_DIAMOND = registerItem("vanilla/seed_diamond", new
            AliasedBlockItem(v_t5_crops.CROP_DIAMOND,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_END = registerItem("vanilla/seed_end", new
            AliasedBlockItem(v_t5_crops.CROP_END,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_GHAST = registerItem("vanilla/seed_ghast", new
            AliasedBlockItem(v_t5_crops.CROP_GHAST,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_GLOWSTONE = registerItem("vanilla/seed_glowstone", new
            AliasedBlockItem(v_t5_crops.CROP_GLOWSTONE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_NETHER = registerItem("vanilla/seed_nether", new
            AliasedBlockItem(v_t5_crops.CROP_NETHER,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_NETHER_QUARTZ = registerItem("vanilla/seed_nether_quartz", new
            AliasedBlockItem(v_t5_crops.CROP_NETHER_QUARTZ,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_WITHER_SKELETON = registerItem("vanilla/seed_wither_skeleton", new
            AliasedBlockItem(v_t5_crops.CROP_WITHER_SKELETON,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
