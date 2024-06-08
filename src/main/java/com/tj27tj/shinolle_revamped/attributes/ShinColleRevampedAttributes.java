package com.tj27tj.shinolle_revamped.attributes;

import com.tj27tj.shinolle_revamped.ShinColleRevamped;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ShinColleRevampedAttributes {
    public static DeferredRegister<Attribute> ATTRIBUTES =
            DeferredRegister.create(ForgeRegistries.ATTRIBUTES, ShinColleRevamped.MOD_ID);


    public static void register(IEventBus eventBus) {
        ATTRIBUTES.register(eventBus);
    }
}
