package com.CreateMonBadges.CreateMonBadges;

import com.CreateMonBadges.CreateMonBadges.init.ItemInit;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateMonBadges.MODID)
public class CreateMonBadges
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "createmonbadges";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "FELanterns" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "FELanterns" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);


    public CreateMonBadges()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }

    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("createmonbadges.creative") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.season1_badge1.get());
        }
        @Override
        public void fillItemList(net.minecraft.core.NonNullList<ItemStack> stack) {
            stack.add(getColumn(), new ItemStack(ItemInit.season1_badge1.get()));
            stack.add(getColumn(), new ItemStack(ItemInit.season1_badge2.get()));
            stack.add(getColumn(), new ItemStack(ItemInit.season1_badge3.get()));
            stack.add(getColumn(), new ItemStack(ItemInit.season1_badge4.get()));
            stack.add(getColumn(), new ItemStack(ItemInit.season1_badge5.get()));
            stack.add(getColumn(), new ItemStack(ItemInit.season1_badge6.get()));
            stack.add(getColumn(), new ItemStack(ItemInit.season1_badge7.get()));
            stack.add(getColumn(), new ItemStack(ItemInit.season1_badge8.get()));
        }
    };
}
