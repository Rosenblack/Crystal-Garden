package net.shale.horde.crystalgarden.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.crystalgarden.block.extend.G_CropBlock;

public class v_t4_crop_enderman extends G_CropBlock {
    public v_t4_crop_enderman(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return v_t4_crops.CROP_ENDERMAN;
    }
}
