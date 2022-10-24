package net.shale.horde.crystalgarden.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.crystalgarden.block.extend.G_CropBlock;

public class v_t4_crop_prismarine extends G_CropBlock {
    public v_t4_crop_prismarine(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return v_t4_crops.CROP_PRISMARINE;
    }
}
