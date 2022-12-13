package net.shale.horde.crystalgarden.util;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.shale.horde.crystalgarden.block.generic.g_t0_crops;
import net.shale.horde.crystalgarden.block.vanilla.*;

public class crop_renderer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(g_t0_crops.CROP_RHODONITE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(g_t0_crops.CROP_AIR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(g_t0_crops.CROP_EARTH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(g_t0_crops.CROP_FIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(g_t0_crops.CROP_WATER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(v_t1_crops.CROP_DEEPSLATE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t1_crops.CROP_DIRT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t1_crops.CROP_ICE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t1_crops.CROP_STONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t1_crops.CROP_WOOD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(v_t2_crops.CROP_AMETHYST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t2_crops.CROP_CHICKEN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t2_crops.CROP_COAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t2_crops.CROP_COPPER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t2_crops.CROP_COW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t2_crops.CROP_FISH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t2_crops.CROP_FROG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t2_crops.CROP_IRON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t2_crops.CROP_PIG, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_CREEPER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_HONEY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_LAPIS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_RABBIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_SHEEP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_SKELETON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_SLIME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_SPIDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_SQUID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_TURTLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t3_crops.CROP_ZOMBIE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(v_t4_crops.CROP_DYE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t4_crops.CROP_EMERALD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t4_crops.CROP_ENDERMAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t4_crops.CROP_EXPERIENCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t4_crops.CROP_GOLD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t4_crops.CROP_NATURE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t4_crops.CROP_OBSIDIAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t4_crops.CROP_PRISMARINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t4_crops.CROP_REDSTONE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(v_t5_crops.CROP_BlAZE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t5_crops.CROP_DIAMOND, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t5_crops.CROP_END, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t5_crops.CROP_GHAST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t5_crops.CROP_GLOWSTONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t5_crops.CROP_NETHER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t5_crops.CROP_NETHER_QUARTZ, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t5_crops.CROP_SCULK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t5_crops.CROP_WITHER_SKELETON, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(v_t6_crops.CROP_DRAGON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t6_crops.CROP_NETHER_STAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t6_crops.CROP_NETHERITE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(v_t6_crops.CROP_SHULKER, RenderLayer.getCutout());
    }
}
