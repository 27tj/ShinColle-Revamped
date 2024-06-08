package com.tj27tj.shinolle_revamped.entity;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.INameable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ShipInventory implements IInventory, INameable {
    public final NonNullList<ItemStack> mainInventory = NonNullList.withSize(18, ItemStack.EMPTY);
    public final NonNullList<ItemStack> equipmentInventory = NonNullList.withSize(6, ItemStack.EMPTY);
    private final List<NonNullList<ItemStack>> allInventories = ImmutableList.of(this.mainInventory, this.equipmentInventory);
    public int currentItem;
    public final LivingEntity Entity;
    private final ItemStack itemStack = ItemStack.EMPTY;
    private int timesChanged;


    //to do: set ship inventory base on entity.type and equipment type
    public ShipInventory(LivingEntity entity) {
        this.Entity = entity;

    }

    /**
     * Returns the number of slots in the inventory.
     */
    @Override
    public int getSizeInventory() {
        return this.mainInventory.size() + this.equipmentInventory.size();
    }

    @Override
    public boolean isEmpty() {
        for (ItemStack itemstack : this.mainInventory) {
            if (!itemstack.isEmpty()) {
                return false;
            }
        }

        for (ItemStack itemstack1 : this.equipmentInventory) {
            if (!itemstack1.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the stack in the given slot.
     *
     * @param index
     */
    @Override
    public @NotNull ItemStack getStackInSlot(int index) {
        List<ItemStack> list = null;

        for (NonNullList<ItemStack> nonnulllist : this.allInventories) {
            if (index < nonnulllist.size()) {
                list = nonnulllist;
                break;
            }

            index -= nonnulllist.size();
        }

        return list == null ? ItemStack.EMPTY : list.get(index);
    }

    /**
     * Removes up to a specified number of items from an inventory slot and returns them in a new stack.
     *
     * @param index
     * @param count
     */
    @Override
    public @NotNull ItemStack decrStackSize(int index, int count) {
        List<ItemStack> list = null;

        for (NonNullList<ItemStack> nonnulllist : this.allInventories) {
            if (index < nonnulllist.size()) {
                list = nonnulllist;
                break;
            }

            index -= nonnulllist.size();
        }

        return list != null && !list.get(index).isEmpty() ? ItemStackHelper.getAndSplit(list, index, count) : ItemStack.EMPTY;
    }

    /**
     * Removes a stack from the given slot and returns it.
     *
     * @param index
     */
    @Override
    public @NotNull ItemStack removeStackFromSlot(int index) {
        NonNullList<ItemStack> nonnulllist = null;

        for (NonNullList<ItemStack> nonnulllist1 : this.allInventories) {
            if (index < nonnulllist1.size()) {
                nonnulllist = nonnulllist1;
                break;
            }

            index -= nonnulllist1.size();
        }

        if (nonnulllist != null && !nonnulllist.get(index).isEmpty()) {
            ItemStack itemstack = nonnulllist.get(index);
            nonnulllist.set(index, ItemStack.EMPTY);
            return itemstack;
        } else {
            return ItemStack.EMPTY;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     *
     * @param index
     * @param stack
     */
    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        NonNullList<ItemStack> nonnulllist = null;

        for (NonNullList<ItemStack> nonnulllist1 : this.allInventories) {
            if (index < nonnulllist1.size()) {
                nonnulllist = nonnulllist1;
                break;
            }

            index -= nonnulllist1.size();
        }

        if (nonnulllist != null) {
            nonnulllist.set(index, stack);
        }
    }

    /**
     * For tile entities, ensures the chunk containing the tile entity is saved to disk later - the game won't think it
     * hasn't changed and skip it.
     */
    @Override
    public void markDirty() {
        ++this.timesChanged;
    }

    @OnlyIn(Dist.CLIENT)
    public int getTimesChanged() {
        return this.timesChanged;
    }

    /**
     * Don't rename this method to canInteractWith due to conflicts with Container
     *
     * @param player
     */
    @Override
    public boolean isUsableByPlayer(@NotNull PlayerEntity player) {
        if (this.Entity.isAlive()) {
            return true;

        } else {
            return !(player.getDistanceSq(this.Entity) > 10D);
        }
    }

    @Override
    public void clear() {
        for (List<ItemStack> list : this.allInventories) {
            list.clear();
        }

    }

    @Override
    public @NotNull ITextComponent getName() {
        return this.Entity.getName();
    }
}
