package net.shale.horde.crystalgarden.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class v_t4_essence {
    public static final Item ESSENCE_DYE = registerItem("vanilla/essence_dye", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_EMERALD = registerItem("vanilla/essence_emerald", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_ENDERMAN = registerItem("vanilla/essence_enderman", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_EXPERIENCE = registerItem("vanilla/essence_experience", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_GOLD = registerItem("vanilla/essence_gold", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_NATURE = registerItem("vanilla/essence_nature", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_OBSIDIAN = registerItem("vanilla/essence_obsidian", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_PRISMARINE = registerItem("vanilla/essence_prismarine", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item ESSENCE_REDSTONE = registerItem("vanilla/essence_redstone", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}

