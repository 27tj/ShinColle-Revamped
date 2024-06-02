package com.tj27tj.shinollerevamped.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ShinColleRevampedItemGroup {

    public static final ItemGroup SHINCOLLE_REVAMPED_GROUP = new ItemGroup("shincolleRevampedTab") {
        @Override
        public ItemStack createIcon() {

            return new ItemStack(ShinColleRevampedItems.ABYSSIUM_INGOT.get());
        }
    };

}
