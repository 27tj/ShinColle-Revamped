package com.tj27tj.shinolle_revamped.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ShinColleRevampedItemGroup {

    public static final ItemGroup SHINCOLLE_REVAMPED_GROUP = new ItemGroup("shincolleRevampedTab") {
        @Override
        public ItemStack createIcon() {

            return new ItemStack(ShinColleRevampedItems.GRUDGE.get());
        }
    };
    public static final ItemGroup SHINCOLLE_REVAMPED_EQUIP_GROUP = new ItemGroup("shincolleRevampedEquipTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ShinColleRevampedItems.GRUDGE.get());
        }
    };

    public static final ItemGroup SHINCOLLE_REVAMPED_SPAWN_EGG_GROUP = new ItemGroup("shincolleRevampedSpawnEggTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ShinColleRevampedItems.GRUDGE.get());
        }
    };

}
