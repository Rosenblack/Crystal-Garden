package net.shale.horde.crystalgarden.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.crystalgarden.block.extend.G_CropBlock;

public class v_t2_crop_cow extends G_CropBlock {
    public v_t2_crop_cow(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return v_t2_crops.CROP_COW;
    }
}
