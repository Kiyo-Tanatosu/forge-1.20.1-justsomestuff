package com.kiyotanatosu.justsomestuff.datagen;

import com.kiyotanatosu.justsomestuff.JustSomeStuff;
import com.kiyotanatosu.justsomestuff.block.ModBlocks;
import com.kiyotanatosu.justsomestuff.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagsProvider.TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, JustSomeStuff.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ENDERITE_HELMET.get(),
                        ModItems.ENDERITE_CHESTPLATE.get(),
                        ModItems.ENDERITE_LEGGINGS.get(),
                        ModItems.ENDERITE_BOOTS.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.BANANA_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BANANA_LOG.get().asItem())
                .add(ModBlocks.BANANA_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BANANA_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.BANANA_PLANKS.get().asItem());

    }
}