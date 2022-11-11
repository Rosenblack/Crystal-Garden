package net.shale.horde.crystalgarden.item.moditems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;

public class bismuth_bottle {
    public static final Item BISMUTH_0 = registerItem("bismuth_bottle/0", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ZOMBIE_25 = registerItem("bismuth_bottle/zombie_25", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ZOMBIE_50 = registerItem("bismuth_bottle/zombie_50", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item CHICKEN_100 = registerItem("bismuth_bottle/chicken_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item COW_100 = registerItem("bismuth_bottle/cow_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item FISH_100 = registerItem("bismuth_bottle/fish_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item FROG_100 = registerItem("bismuth_bottle/frog_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item PIG_100 = registerItem("bismuth_bottle/pig_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item CREEPER_100 = registerItem("bismuth_bottle/creeper_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item RABBIT_100 = registerItem("bismuth_bottle/rabbit_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SKELETON_100 = registerItem("bismuth_bottle/skeleton_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SLIME_100 = registerItem("bismuth_bottle/slime_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SPIDER_100 = registerItem("bismuth_bottle/spider_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SQUID_100 = registerItem("bismuth_bottle/squid_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item TURTLE_100 = registerItem("bismuth_bottle/turtle_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ZOMBIE_100 = registerItem("bismuth_bottle/zombie_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ENDERMAN_100 = registerItem("bismuth_bottle/enderman_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item BLAZE_100 = registerItem("bismuth_bottle/blaze_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item GHAST_100 = registerItem("bismuth_bottle/ghast_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item WITHER_100 = registerItem("bismuth_bottle/wither_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item DRAGON_100 = registerItem("bismuth_bottle/dragon_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SHULKER_100 = registerItem("bismuth_bottle/shulker_100", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
