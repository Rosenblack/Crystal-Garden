package net.shale.horde.crystalgarden.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shale.horde.crystalgarden.screen.sh_combiner;
import net.shale.horde.crystalgarden.util.ImplementedInventory;
import org.jetbrains.annotations.Nullable;

public class e_combiner extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(11,ItemStack.EMPTY);
    public e_combiner(BlockPos pos, BlockState state) {
        super(entity_reg.E_COMBINER, pos, state);
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("");
    }


    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new sh_combiner(syncId, inv, this);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    public static void tick(World world, BlockPos pos, BlockState state, e_combiner entity) {
//        if(hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
//            craftItem(entity);
//        }
    }
}
