package net.shale.horde.crystalgarden.util;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import net.shale.horde.crystalgarden.item.moditems.extra;

public class mob_drops {
    private static final Identifier WITHER_SKELETON = new Identifier("minecraft", "entities/wither_skeleton");
    private static final Identifier DRAGON = new Identifier("minecraft", "entities/ender_dragon");

        public static void modifyLootTables() {
            LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
                if (WITHER_SKELETON.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.33f))
                            .with(ItemEntry.builder(extra.BONE_WITHER));
                    tableBuilder.pool(poolBuilder);
                }
            });
            LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
                if (DRAGON.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(4))
                            .conditionally(RandomChanceLootCondition.builder(1f))
                            .with(ItemEntry.builder(extra.SCALE_DRAGON));
                    tableBuilder.pool(poolBuilder);
                }
            });
        }
    }

