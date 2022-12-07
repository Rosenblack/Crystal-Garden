package net.shale.horde.crystalgarden.modifiers;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class aliasedTier extends AliasedBlockItem {
    private final int Tier;
    public aliasedTier(Block block, Settings settings, int Tier) {
        super(block, settings);this.Tier = Tier;
    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        switch (Tier) {
            case 0:
                tooltip.add(Text.literal("Elemental").formatted(Formatting.YELLOW));
                break;
            case 1:
                tooltip.add(Text.literal("Tier: 1").formatted(Formatting.LIGHT_PURPLE));
                break;
            case 2:
                tooltip.add(Text.literal("Tier: 2").formatted(Formatting.DARK_GREEN));
                break;
            case 3:
                tooltip.add(Text.literal("Tier: 3").formatted(Formatting.RED));
                break;
            case 4:
                tooltip.add(Text.literal("Tier: 4").formatted(Formatting.DARK_RED));
                break;
            case 5:
                tooltip.add(Text.literal("Tier: 5").formatted(Formatting.AQUA));
                break;
            case 6:
                tooltip.add(Text.literal("Tier: 6").formatted(Formatting.DARK_PURPLE));
                break;
            default:
                tooltip.add(Text.literal("default").formatted(Formatting.OBFUSCATED));
                break;
        }
    }
}
