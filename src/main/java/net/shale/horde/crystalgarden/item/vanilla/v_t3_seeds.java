package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.block.vanilla.v_t3_crops;
import net.shale.horde.crystalgarden.modifiers.aliasedTier;

public class v_t3_seeds {
    public static final Item SEED_CORAL = registerItem("vanilla/seed_coral", new
            aliasedTier(v_t3_crops.CROP_CORAL,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));
    public static final Item SEED_CREEPER = registerItem("vanilla/seed_creeper", new
            aliasedTier(v_t3_crops.CROP_CREEPER,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));
    public static final Item SEED_HONEY = registerItem("vanilla/seed_honey", new
            aliasedTier(v_t3_crops.CROP_HONEY,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));
    public static final Item SEED_LAPIS = registerItem("vanilla/seed_lapis", new
            aliasedTier(v_t3_crops.CROP_LAPIS,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));
    public static final Item SEED_RABBIT = registerItem("vanilla/seed_rabbit", new
            aliasedTier(v_t3_crops.CROP_RABBIT,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));
    public static final Item SEED_SHEEP = registerItem("vanilla/seed_sheep", new
            aliasedTier(v_t3_crops.CROP_SHEEP,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));
    public static final Item SEED_SKELETON = registerItem("vanilla/seed_skeleton", new
            aliasedTier(v_t3_crops.CROP_SKELETON,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));
    public static final Item SEED_SLIME = registerItem("vanilla/seed_slime", new
            aliasedTier(v_t3_crops.CROP_SLIME,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));
    public static final Item SEED_SPIDER = registerItem("vanilla/seed_spider", new
            aliasedTier(v_t3_crops.CROP_SPIDER,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));
    public static final Item SEED_SQUID = registerItem("vanilla/seed_squid", new
            aliasedTier(v_t3_crops.CROP_SQUID,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));
    public static final Item SEED_TURTLE = registerItem("vanilla/seed_turtle", new
            aliasedTier(v_t3_crops.CROP_TURTLE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));
    public static final Item SEED_ZOMBIE = registerItem("vanilla/seed_zombie", new
            aliasedTier(v_t3_crops.CROP_ZOMBIE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),3));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
