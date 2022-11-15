package net.shale.horde.crystalgarden.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.crystalgarden.Main;
import net.shale.horde.crystalgarden.block.moditems.machines;

public class entity_reg {
    public static BlockEntityType<e_combiner> E_COMBINER;

    public static void regEntity() {
        E_COMBINER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Main.ID, "machines/combiner"),
                FabricBlockEntityTypeBuilder.create(e_combiner::new,
                        machines.COMBINER).build(null));
    }
}
