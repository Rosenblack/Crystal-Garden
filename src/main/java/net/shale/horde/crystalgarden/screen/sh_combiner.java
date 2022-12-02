package net.shale.horde.crystalgarden.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.world.World;
import net.shale.horde.crystalgarden.screen.slots.resultslot;

public class sh_combiner extends ScreenHandler {
    private final Inventory inventory;
    private final World world;

    private final PropertyDelegate propertyDelegate;

    public sh_combiner(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(10),new ArrayPropertyDelegate(3));
    }

    public sh_combiner(int syncId, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate delegate) {
        super(screenhandler_reg.SH_COMBINER, syncId);
        checkSize(inventory, 10);
        this.inventory = inventory;
        this.world = playerInventory.player.world;
        inventory.onOpen(playerInventory.player);
        propertyDelegate = delegate;

        this.addSlot(new Slot(inventory, 0, 51, 6));
        this.addSlot(new Slot(inventory, 1, 33, 13));
        this.addSlot(new Slot(inventory, 2, 69, 13));
        this.addSlot(new Slot(inventory, 3, 26, 31));
        this.addSlot(new Slot(inventory, 4, 51, 31));
        this.addSlot(new Slot(inventory, 6, 76, 31));
        this.addSlot(new Slot(inventory, 7, 33, 49));
        this.addSlot(new Slot(inventory, 8, 51, 56));
        this.addSlot(new Slot(inventory, 9, 69, 49));

        this.addSlot(new resultslot(inventory, 10, 130, 31));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);

        addProperties(delegate);
    }

    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }

    public int getScaledProgress() {
        int progress = this.propertyDelegate.get(0);
        int maxProgress = this.propertyDelegate.get(1);  // Max Progress
        int progressArrowSize = 26; // This is the width in pixels of your arrow

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    public int getScaledFuelProgress() {
        int fuelProgress = this.propertyDelegate.get(2);
        int maxFuelProgress = this.propertyDelegate.get(3);
        int fuelProgressSize = 14;

        return maxFuelProgress != 0 ? (int)(((float)fuelProgress / (float)maxFuelProgress) * fuelProgressSize) : 0;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
