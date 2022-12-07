package net.shale.horde.crystalgarden.modifiers;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class fullBismuthItem extends Item {
    private final int Bottle;
    public fullBismuthItem(Settings settings, int Bottle) {
        super(settings);
        this.Bottle = Bottle;
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip,
                              TooltipContext context) {

        switch (Bottle) {
            case 0:
                tooltip.add(Text.literal("(Empty) - 0%").formatted(Formatting.DARK_PURPLE));
                break;
            case 1:
                tooltip.add(Text.literal("(Chicken) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 2:
                tooltip.add(Text.literal("(Cow) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 3:
                tooltip.add(Text.literal("(Fish) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 4:
                tooltip.add(Text.literal("(Frog) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 5:
                tooltip.add(Text.literal("(Pig) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 6:
                tooltip.add(Text.literal("(Creeper) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 7:
                tooltip.add(Text.literal("(Rabbit) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 8:
                tooltip.add(Text.literal("(Skeleton) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 9:
                tooltip.add(Text.literal("(Slime) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 10:
                tooltip.add(Text.literal("(Spider) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 11:
                tooltip.add(Text.literal("(Squid) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 12:
                tooltip.add(Text.literal("(Turtle) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 13:
                tooltip.add(Text.literal("(Zombie) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 14:
                tooltip.add(Text.literal("(Enderman) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 15:
                tooltip.add(Text.literal("(Blaze) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 16:
                tooltip.add(Text.literal("(Ghast) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 17:
                tooltip.add(Text.literal("(Wither) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 18:
                tooltip.add(Text.literal("(Dragon) - 100%").formatted(Formatting.DARK_PURPLE));
                break;
            case 19:
                tooltip.add(Text.literal("(Shulker) - 100%").formatted(Formatting.DARK_PURPLE));
                break;

            default:
                tooltip.add(Text.literal("default").formatted(Formatting.DARK_PURPLE));
                break;
        }
    }
}
