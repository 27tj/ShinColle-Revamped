package com.tj27tj.shinollerevamped.item;

import com.tj27tj.shinollerevamped.ShinColleRevamped;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ShinColleRevampedItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShinColleRevamped.MOD_ID);

    public static final RegistryObject<Item> ABYSSIUM_INGOT = ITEMS.register("abyssium_ingot",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> POLYMETALLIC_NODULES = ITEMS.register("polymetallic_nodules",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> ABYSSIUM_NUGGET = ITEMS.register("abyssium_nugget",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> POLYMETALLIC_NUGGET = ITEMS.register("polymetallic_nugget",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> AMMO = ITEMS.register("ammo",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> AMMO_CONTAINER = ITEMS.register("ammo_container",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> HEAVY_AMMO = ITEMS.register("heavy_ammo",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> HEAVY_AMMO_CONTAINER = ITEMS.register("heavy_ammo_container",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> REPAIR_BUCKET = ITEMS.register("repair_bucket",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
