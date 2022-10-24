package net.shale.horde.crystalgarden.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.crystalgarden.block.extend.G_CropBlock;
import net.shale.horde.crystalgarden.item.vanilla.v_t1_seeds;

public class v_t1_crop_ice extends G_CropBlock {
    public v_t1_crop_ice(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return v_t1_seeds.SEED_ICE;
    }
}
