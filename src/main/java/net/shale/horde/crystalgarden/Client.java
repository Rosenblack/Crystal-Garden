package net.shale.horde.crystalgarden;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.shale.horde.crystalgarden.screen.s_combiner;
import net.shale.horde.crystalgarden.screen.screenhandler_reg;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(screenhandler_reg.SH_COMBINER, s_combiner::new);
    }
}
