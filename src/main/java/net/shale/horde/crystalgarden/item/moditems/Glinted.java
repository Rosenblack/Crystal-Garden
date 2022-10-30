package net.shale.horde.crystalgarden.item.moditems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Glinted extends Item {
    public Glinted(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
