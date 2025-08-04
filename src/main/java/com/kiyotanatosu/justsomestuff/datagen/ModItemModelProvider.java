package com.kiyotanatosu.justsomestuff.datagen;

import com.kiyotanatosu.justsomestuff.JustSomeStuff;
import com.kiyotanatosu.justsomestuff.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, JustSomeStuff.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ENDERITE_INGOT);
        simpleItem(ModItems.ENDERITE_CHUNK);

        simpleItem(ModItems.ENDERITE_SWORD);
        simpleItem(ModItems.ENDERITE_PICKAXE);
        simpleItem(ModItems.ENDERITE_AXE);
        simpleItem(ModItems.ENDERITE_SHOVEL);
        simpleItem(ModItems.ENDERITE_HOE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(JustSomeStuff.MOD_ID,"item/" + item.getId().getPath()));
    }
}