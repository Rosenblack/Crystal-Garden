package net.shale.horde.crystalgarden.util;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.item.moditems.seeds;

public class itemCat {
    public static final ItemGroup MAIN = FabricItemGroupBuilder.build(new Identifier(Main.ID, "main"),
            () -> new ItemStack(seeds.SEED_RHODONITE));
}
