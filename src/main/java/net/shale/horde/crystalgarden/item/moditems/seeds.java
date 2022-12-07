package net.shale.horde.crystalgarden.item.moditems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.block.generic.g_t0_crops;
import net.shale.horde.crystalgarden.block.vanilla.v_t1_crops;
import net.shale.horde.crystalgarden.modifiers.aliasedTier;
import net.shale.horde.crystalgarden.modifiers.craftingItem;
import net.shale.horde.crystalgarden.util.itemCat;

public class seeds {
    public static final Item SEED_RHODONITE = registerItem("generic/seed_rhodonite", new
            aliasedTier(g_t0_crops.CROP_RHODONITE,
            new FabricItemSettings()
                    .group(itemCat.MAIN),0));
    public static final Item SEED_BISMUTH = registerItem("seeds/seed_bismuth", new craftingItem(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item SEED_DRAGONSTONE_OVERWORLD = registerItem("seeds/seed_dragonstone_overworld", new craftingItem(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item SEED_DRAGONSTONE_NETHER = registerItem("seeds/seed_dragonstone_nether", new craftingItem(new FabricItemSettings()
            .group(itemCat.MAIN)));
    public static final Item SEED_DRAGONSTONE_END = registerItem("seeds/seed_dragonstone_end", new craftingItem(new FabricItemSettings()
            .group(itemCat.MAIN)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
