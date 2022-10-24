package net.shale.horde.crystalgarden.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.crystalgarden.block.extend.G_CropBlock;
import net.shale.horde.crystalgarden.item.generic.g_t0_seeds;
import net.shale.horde.crystalgarden.item.vanilla.v_t1_seeds;

public class v_t1_crop_deepslate extends G_CropBlock {
    public v_t1_crop_deepslate(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return v_t1_seeds.SEED_DEEPSLATE;
    }
}
