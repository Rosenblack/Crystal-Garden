package net.shale.horde.crystalgarden.modifiers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class glinted extends Item {
    public glinted(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
