package net.shale.horde.crystalgarden.mixin;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.shale.horde.crystalgarden.recipe.functions.remainder_item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public abstract class ItemMix<C extends Inventory> {
    @Inject(method = "getRecipeRemainder", at = @At("RETURN"), cancellable = true)
    private void magic(CallbackInfoReturnable<Item> cir) {
        if (((Object) this instanceof remainder_item)) {
            if (((remainder_item) (Object) this).hasRecipeRemainderActual()) {
                cir.setReturnValue(((remainder_item) (Object) this).getRecipeRemainderActual());
            }
        }
    }
}