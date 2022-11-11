package net.shale.horde.crystalgarden;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.shale.horde.crystalgarden.block.generic.g_t0_crops;
import net.shale.horde.crystalgarden.block.vanilla.*;
import net.shale.horde.crystalgarden.block.vanillaplus.blocks;
import net.shale.horde.crystalgarden.item.generic.g_t0_essence;
import net.shale.horde.crystalgarden.item.generic.g_t0_seeds;
import net.shale.horde.crystalgarden.item.moditems.*;
import net.shale.horde.crystalgarden.item.vanilla.*;
import net.shale.horde.crystalgarden.util.tags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String ID = "crystal-garden";
	public static Identifier id(String path) {
		return new Identifier(ID, path);
	}

	@Override
	public void onInitialize() {
		g_t0_crops.registerBlock();
		g_t0_seeds.registerModItems();
		g_t0_essence.registerModItems();
		v_t1_crops.registerBlock();
		v_t1_seeds.registerModItems();
		v_t1_essence.registerModItems();
		v_t2_crops.registerBlock();
		v_t2_seeds.registerModItems();
		v_t2_essence.registerModItems();
		v_t3_crops.registerBlock();
		v_t3_seeds.registerModItems();
		v_t3_essence.registerModItems();
		v_t4_crops.registerBlock();
		v_t4_seeds.registerModItems();
		v_t4_essence.registerModItems();
		v_t5_crops.registerBlock();
		v_t5_seeds.registerModItems();
		v_t5_essence.registerModItems();
		v_t6_crops.registerBlock();
		v_t6_seeds.registerModItems();
		v_t6_essence.registerModItems();

		gemstones.registerModItems();
		seeds.registerModItems();
		raw.registerModItems();
		moss.registerModItems();
		extra.registerModItems();
		bismuth_bottle.registerModItems();
		//souls.registerModItems();
		//Vanilla plus
		blocks.registerBlock();
	}
}
