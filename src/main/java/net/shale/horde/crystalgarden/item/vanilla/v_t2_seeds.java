package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.block.vanilla.v_t2_crops;
import net.shale.horde.crystalgarden.modifiers.aliasedTier;
import net.shale.horde.crystalgarden.util.itemCat;

public class v_t2_seeds {
    public static final Item SEED_AMETHYST = registerItem("vanilla/seed_amethyst", new
            aliasedTier(v_t2_crops.CROP_AMETHYST,
            new FabricItemSettings()
                    .group(itemCat.MAIN),2));
    public static final Item SEED_CHICKEN = registerItem("vanilla/seed_chicken", new
            aliasedTier(v_t2_crops.CROP_CHICKEN,
            new FabricItemSettings()
                    .group(itemCat.MAIN),2));
    public static final Item SEED_COAL = registerItem("vanilla/seed_coal", new
            aliasedTier(v_t2_crops.CROP_COAL,
            new FabricItemSettings()
                    .group(itemCat.MAIN),2));
    public static final Item SEED_COPPER = registerItem("vanilla/seed_copper", new
            aliasedTier(v_t2_crops.CROP_COPPER,
            new FabricItemSettings()
                    .group(itemCat.MAIN),2));
    public static final Item SEED_COW = registerItem("vanilla/seed_cow", new
            aliasedTier(v_t2_crops.CROP_COW,
            new FabricItemSettings()
                    .group(itemCat.MAIN),2));
    public static final Item SEED_FISH = registerItem("vanilla/seed_fish", new
            aliasedTier(v_t2_crops.CROP_FISH,
            new FabricItemSettings()
                    .group(itemCat.MAIN),2));
    public static final Item SEED_FROG = registerItem("vanilla/seed_frog", new
            aliasedTier(v_t2_crops.CROP_FROG,
            new FabricItemSettings()
                    .group(itemCat.MAIN),2));
    public static final Item SEED_IRON = registerItem("vanilla/seed_iron", new
            aliasedTier(v_t2_crops.CROP_IRON,
            new FabricItemSettings()
                    .group(itemCat.MAIN),2));
    public static final Item SEED_PIG = registerItem("vanilla/seed_pig", new
            aliasedTier(v_t2_crops.CROP_PIG,
            new FabricItemSettings()
                    .group(itemCat.MAIN),2));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
