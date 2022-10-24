package net.shale.horde.crystalgarden.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.crystalgarden.block.extend.G_CropBlock;
import net.shale.horde.crystalgarden.item.vanilla.v_t5_seeds;

public class v_t5_crop_nether extends G_CropBlock {
    public v_t5_crop_nether(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return v_t5_seeds.SEED_NETHER;
    }
}
