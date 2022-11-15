package net.shale.horde.crystalgarden.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.world.World;

public class sh_combiner extends ScreenHandler {
    private final Inventory inventory;
    private final World world;

    public sh_combiner(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(11));
    }

    public sh_combiner(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(screenhandler_reg.SH_COMBINER, syncId);
        checkSize(inventory, 11);
        this.inventory = inventory;
        this.world = playerInventory.player.world;
        inventory.onOpen(playerInventory.player);

        this.addSlot(new Slot(inventory, 0, 51, 6));
        this.addSlot(new Slot(inventory, 1, 33, 13));
        this.addSlot(new Slot(inventory, 2, 69, 13));
        this.addSlot(new Slot(inventory, 3, 26, 31));
        this.addSlot(new Slot(inventory, 4, 51, 31));
        this.addSlot(new Slot(inventory, 5, 26, 31));
        this.addSlot(new Slot(inventory, 6, 76, 31));
        this.addSlot(new Slot(inventory, 7, 33, 49));
        this.addSlot(new Slot(inventory, 8, 51, 56));
        this.addSlot(new Slot(inventory, 9, 69, 49));

        this.addSlot(new Slot(inventory, 10, 130, 31));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
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
