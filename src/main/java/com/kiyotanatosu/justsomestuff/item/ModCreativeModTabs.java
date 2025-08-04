package com.kiyotanatosu.justsomestuff.item;

import com.kiyotanatosu.justsomestuff.JustSomeStuff;
import com.kiyotanatosu.justsomestuff.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JustSomeStuff.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JUST_SOME_STUFF_TAB = CREATIVE_MODE_TABS.register("just_some_stuff_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDERITE_INGOT.get()))
                    .title(Component.translatable("creativetab.just_some_stuff_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.ENDERITE_INGOT.get());
                        pOutput.accept(ModItems.ENDERITE_CHUNK.get());
                        pOutput.accept(ModBlocks.ENDERITE_BLOCK.get());
                        pOutput.accept(ModBlocks.ENDERITE_ORE_BLOCK.get());

                        pOutput.accept(ModItems.ENDERITE_SWORD.get());
                        pOutput.accept(ModItems.ENDERITE_PICKAXE.get());
                        pOutput.accept(ModItems.ENDERITE_AXE.get());
                        pOutput.accept(ModItems.ENDERITE_SHOVEL.get());
                        pOutput.accept(ModItems.ENDERITE_HOE.get());



                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}