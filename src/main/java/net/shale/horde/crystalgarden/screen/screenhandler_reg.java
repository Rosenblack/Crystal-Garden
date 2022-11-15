package net.shale.horde.crystalgarden.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.shale.horde.crystalgarden.Main;

public class screenhandler_reg {
    public static ScreenHandlerType<sh_combiner> SH_COMBINER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Main.ID, "machines/combiner"),
                    sh_combiner::new);
}
