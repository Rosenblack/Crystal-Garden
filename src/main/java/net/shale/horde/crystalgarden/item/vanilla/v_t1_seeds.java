package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.block.vanilla.v_t1_crops;
import net.shale.horde.crystalgarden.modifiers.aliasedTier;
import net.shale.horde.crystalgarden.util.itemCat;

public class v_t1_seeds {
    public static final Item SEED_DEEPSLATE = registerItem("vanilla/seed_deepslate", new
            aliasedTier(v_t1_crops.CROP_DEEPSLATE,
            new FabricItemSettings()
                    .group(itemCat.MAIN),1));
    public static final Item SEED_DIRT = registerItem("vanilla/seed_dirt", new
            aliasedTier(v_t1_crops.CROP_DIRT,
            new FabricItemSettings()
                    .group(itemCat.MAIN),1));
    public static final Item SEED_ICE = registerItem("vanilla/seed_ice", new
            aliasedTier(v_t1_crops.CROP_ICE,
            new FabricItemSettings()
                    .group(itemCat.MAIN),1));
    public static final Item SEED_STONE = registerItem("vanilla/seed_stone", new
            aliasedTier(v_t1_crops.CROP_STONE,
            new FabricItemSettings()
                    .group(itemCat.MAIN),1));
    public static final Item SEED_WOOD = registerItem("vanilla/seed_wood", new
            aliasedTier(v_t1_crops.CROP_WOOD,
            new FabricItemSettings()
                    .group(itemCat.MAIN),1));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
