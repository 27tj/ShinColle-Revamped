package com.tj27tj.shinolle_revamped.item;

import com.tj27tj.shinolle_revamped.ShinColleRevamped;
import com.tj27tj.shinolle_revamped.item.ammo.Ammo;
import com.tj27tj.shinolle_revamped.item.ammo.AmmoContainer;
import com.tj27tj.shinolle_revamped.item.ammo.HeavyAmmo;
import com.tj27tj.shinolle_revamped.item.ammo.HeavyAmmoContainer;
import com.tj27tj.shinolle_revamped.item.combat_ration.*;
import com.tj27tj.shinolle_revamped.item.miscellaneous.RepairBucket;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ShinColleRevampedItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShinColleRevamped.MOD_ID);

    //Materials
    public static final RegistryObject<Item> ABYSSIUM_INGOT = ITEMS.register("abyssium_ingot",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> POLYMETALLIC_NODULES = ITEMS.register("polymetallic_nodules",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> ABYSSIUM_NUGGET = ITEMS.register("abyssium_nugget",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> POLYMETALLIC_NUGGET = ITEMS.register("polymetallic_nugget",
            () -> new Item(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));

    //Ammo
    public static final RegistryObject<Item> AMMO = ITEMS.register("ammo",
            () -> new Ammo(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> HEAVY_AMMO = ITEMS.register("heavy_ammo",
            () -> new HeavyAmmo(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> AMMO_CONTAINER = ITEMS.register("ammo_container",
            () -> new AmmoContainer(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> HEAVY_AMMO_CONTAINER = ITEMS.register("heavy_ammo_container",
            () -> new HeavyAmmoContainer(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));

    //Combat Rations
    public static final RegistryObject<Item> RICEBALLS = ITEMS.register("rice_balls",
            () -> new RiceBalls(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> GRUDGEFLAVOURRICEBALLS = ITEMS.register("grudge_flavour_rice_balls",
            () -> new GrudgeFlavourRiceBalls(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> RICEBALLXL = ITEMS.register("rice_ball_xl",
            () -> new RiceBallXL(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> GRUDGEFLAVOURRICEBALLXL = ITEMS.register("grudge_flavour_rice_ball_xl",
            () -> new GrudgeFlavourRiceBallXL(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> ICECREAM = ITEMS.register("ice_cream",
            () -> new IceCream(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    public static final RegistryObject<Item> GRUDGEFLAVOURICECREAM = ITEMS.register("grudge_flavour_ice_cream",
            () -> new GrudgeFlavourIceCream(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));


    //Miscellaneous
    public static final RegistryObject<Item> REPAIR_BUCKET = ITEMS.register("repair_bucket",
            () -> new RepairBucket(new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
