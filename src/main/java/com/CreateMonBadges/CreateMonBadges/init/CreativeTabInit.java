package com.CreateMonBadges.CreateMonBadges.init;

import com.CreateMonBadges.CreateMonBadges.CreateMonBadges;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = CreateMonBadges.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateMonBadges.MODID);

    public static final RegistryObject<CreativeModeTab> TAB = TABS.register("tab", 
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.createmonbadges.creative"))
            .icon(ItemInit.season1_badge1.get()::getDefaultInstance)
            .displayItems((displayParams, output) -> {
                output.accept(ItemInit.season1_badge1.get());
                output.accept(ItemInit.season1_badge2.get());
                output.accept(ItemInit.season1_badge3.get());
                output.accept(ItemInit.season1_badge4.get());
                output.accept(ItemInit.season1_badge5.get());
                output.accept(ItemInit.season1_badge6.get());
                output.accept(ItemInit.season1_badge7.get());
                output.accept(ItemInit.season1_badge8.get());
            })
            .withSearchBar()
            .build()
        );
}