package net.shale.horde.crystalgarden.item.moditems.modifiers;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.shale.horde.crystalgarden.recipe.functions.remainder_item;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class limitedCatalyst extends remainder_item {
    public limitedCatalyst() {
        super(new FabricItemSettings().group(ItemGroup.MATERIALS).maxDamage(1000), true);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int i = stack.getMaxDamage() - stack.getDamage();
        //tooltip.add(new LiteralText(i + " uses left").formatted(Formatting.LIGHT_PURPLE));
        tooltip.add(Text.literal(i + " uses left").formatted(Formatting.LIGHT_PURPLE));
    }
}
