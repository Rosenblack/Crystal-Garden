package net.shale.horde.crystalgarden.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.crystalgarden.block.extend.G_CropBlock;

public class v_t3_crop_squid extends G_CropBlock {
    public v_t3_crop_squid(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return v_t3_crops.CROP_SQUID;
    }
}
