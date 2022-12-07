package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.block.vanilla.v_t4_crops;
import net.shale.horde.crystalgarden.modifiers.aliasedTier;

public class v_t4_seeds {
    public static final Item SEED_DYE = registerItem("vanilla/seed_dye", new
            aliasedTier(v_t4_crops.CROP_DYE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),4));
    public static final Item SEED_EMERALD = registerItem("vanilla/seed_emerald", new
            aliasedTier(v_t4_crops.CROP_EMERALD,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),4));
    public static final Item SEED_ENDERMAN = registerItem("vanilla/seed_enderman", new
            aliasedTier(v_t4_crops.CROP_ENDERMAN,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),4));
    public static final Item SEED_EXPERIENCE = registerItem("vanilla/seed_experience", new
            aliasedTier(v_t4_crops.CROP_EXPERIENCE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),4));
    public static final Item SEED_GOLD = registerItem("vanilla/seed_gold", new
            aliasedTier(v_t4_crops.CROP_GOLD,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),4));
    public static final Item SEED_NATURE = registerItem("vanilla/seed_nature", new
            aliasedTier(v_t4_crops.CROP_NATURE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),4));
    public static final Item SEED_OBSIDIAN = registerItem("vanilla/seed_obsidian", new
            aliasedTier(v_t4_crops.CROP_OBSIDIAN,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),4));
    public static final Item SEED_PRISMARINE = registerItem("vanilla/seed_prismarine", new
            aliasedTier(v_t4_crops.CROP_PRISMARINE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),4));
    public static final Item SEED_REDSTONE = registerItem("vanilla/seed_redstone", new
            aliasedTier(v_t4_crops.CROP_REDSTONE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD),4));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
