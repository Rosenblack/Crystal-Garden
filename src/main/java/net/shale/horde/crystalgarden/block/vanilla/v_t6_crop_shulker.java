package net.shale.horde.crystalgarden.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.crystalgarden.block.extend.G_CropBlock;
import net.shale.horde.crystalgarden.item.vanilla.v_t6_seeds;

public class v_t6_crop_shulker extends G_CropBlock {
    public v_t6_crop_shulker(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return v_t6_seeds.SEED_SHULKER;
    }
}
