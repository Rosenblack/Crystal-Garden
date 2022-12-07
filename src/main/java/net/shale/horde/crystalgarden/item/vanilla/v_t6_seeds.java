package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.block.vanilla.v_t6_crops;
import net.shale.horde.crystalgarden.modifiers.aliasedTier;
import net.shale.horde.crystalgarden.util.itemCat;

public class v_t6_seeds {
    public static final Item SEED_DRAGON = registerItem("vanilla/seed_dragon", new
            aliasedTier(v_t6_crops.CROP_DRAGON,
            new FabricItemSettings()
                    .group(itemCat.MAIN),6));
    public static final Item SEED_NETHER_STAR = registerItem("vanilla/seed_nether_star", new
            aliasedTier(v_t6_crops.CROP_NETHER_STAR,
            new FabricItemSettings()
                    .group(itemCat.MAIN),6));
    public static final Item SEED_NETHERITE = registerItem("vanilla/seed_netherite", new
            aliasedTier(v_t6_crops.CROP_NETHERITE,
            new FabricItemSettings()
                    .group(itemCat.MAIN),6));
    public static final Item SEED_SHULKER = registerItem("vanilla/seed_shulker", new
            aliasedTier(v_t6_crops.CROP_SHULKER,
            new FabricItemSettings()
                    .group(itemCat.MAIN),6));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
