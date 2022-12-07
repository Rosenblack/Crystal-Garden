package net.shale.horde.crystalgarden.modifiers;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.shale.horde.crystalgarden.recipe.functions.remainder_item;
import net.shale.horde.crystalgarden.util.itemCat;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class unlimitedCatalyst extends remainder_item {
    public unlimitedCatalyst() {
        super(new FabricItemSettings().group(itemCat.MAIN).maxDamage(1000), false);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int i = stack.getMaxDamage() - stack.getDamage();
        //tooltip.add(new LiteralText("Unlimited uses").formatted(Formatting.AQUA));
        tooltip.add(Text.literal("Unlimited uses").formatted(Formatting.AQUA));
    }
}
