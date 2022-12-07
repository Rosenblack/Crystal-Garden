package net.shale.horde.crystalgarden.item.moditems;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.crystalgarden.block.extend.G_CropBlock;
import net.shale.horde.crystalgarden.item.generic.g_t0_seeds;

public class rhodonite_crop extends G_CropBlock {
    public rhodonite_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return seeds.SEED_RHODONITE;
    }
}
