package net.shale.horde.crystalgarden.block.generic;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.crystalgarden.block.extend.G_CropBlock;
import net.shale.horde.crystalgarden.item.generic.g_t0_seeds;

public class g_t0_crop_water extends G_CropBlock {
    public g_t0_crop_water(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return g_t0_seeds.SEED_WATER;
    }
}
