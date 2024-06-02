package com.tj27tj.shinollerevamped.item;

import com.tj27tj.shinollerevamped.ShinColleRevamped;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ShinColleRevampedItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShinColleRevamped.MOD_ID);

    public static final RegistryObject<Item> ABYSSIUMINGOT = ITEMS.register("abyssiumingot",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> POLYMETALLICNODULES = ITEMS.register("polymetallicnodules",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> ABYSSIUMNUGGET = ITEMS.register("abyssiumnugget",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
