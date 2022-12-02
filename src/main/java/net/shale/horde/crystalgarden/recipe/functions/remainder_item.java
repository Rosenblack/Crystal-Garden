package net.shale.horde.crystalgarden.recipe.functions;

import net.minecraft.item.Item;

public class remainder_item extends Item {

    private final boolean canTakeDamage;

    public remainder_item(Settings settings) {
        super(settings);
        this.canTakeDamage = false;
    }

    public remainder_item(Settings settings, boolean canTakeDamage) {
        super(settings);
        this.canTakeDamage = canTakeDamage;
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }

    public boolean hasRecipeRemainderActual() {
        return true;
    }

    public Item getRecipeRemainderActual() {
        return this;
    }

    public boolean canTakeDamage() {
        return this.canTakeDamage;
    }
}
