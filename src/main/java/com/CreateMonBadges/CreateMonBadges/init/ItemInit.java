package com.CreateMonBadges.CreateMonBadges.init;

import net.minecraft.world.entity.EquipmentSlot;

import com.CreateMonBadges.CreateMonBadges.CreateMonBadges;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateMonBadges.MODID);

    public static final RegistryObject<Item> season1_badge1 = ITEMS.register("season1_badge1",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> season1_badge2 = ITEMS.register("season1_badge2",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        
    public static final RegistryObject<Item> season1_badge3 = ITEMS.register("season1_badge3",
    () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> season1_badge4 = ITEMS.register("season1_badge4",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> season1_badge5 = ITEMS.register("season1_badge5",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> season1_badge6 = ITEMS.register("season1_badge6",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> season1_badge7 = ITEMS.register("season1_badge7",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> season1_badge8 = ITEMS.register("season1_badge8",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static class ModCreativeTab extends CreativeModeTab {
        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "CreateMon Badges");
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(season1_badge1.get());
        }
    }
}