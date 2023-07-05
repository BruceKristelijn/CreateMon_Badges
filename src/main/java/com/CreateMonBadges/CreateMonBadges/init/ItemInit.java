package com.CreateMonBadges.CreateMonBadges.init;

import com.CreateMonBadges.CreateMonBadges.CreateMonBadges;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.Item;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateMonBadges.MODID);

    public static final RegistryObject<Item> season1_badge1 = ITEMS.register("season1_badge1",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> season1_badge2 = ITEMS.register("season1_badge2",
        () -> new Item(new Item.Properties()));
        
    public static final RegistryObject<Item> season1_badge3 = ITEMS.register("season1_badge3",
    () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> season1_badge4 = ITEMS.register("season1_badge4",
        () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> season1_badge5 = ITEMS.register("season1_badge5",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> season1_badge6 = ITEMS.register("season1_badge6",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> season1_badge7 = ITEMS.register("season1_badge7",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> season1_badge8 = ITEMS.register("season1_badge8",
        () -> new Item(new Item.Properties()));
}