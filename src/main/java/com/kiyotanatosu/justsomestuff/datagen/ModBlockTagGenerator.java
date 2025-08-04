package com.kiyotanatosu.justsomestuff.datagen;

import com.kiyotanatosu.justsomestuff.JustSomeStuff;
import com.kiyotanatosu.justsomestuff.block.ModBlocks;
import com.kiyotanatosu.justsomestuff.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, JustSomeStuff.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ENDERITE_BLOCK.get(),
                        ModBlocks.ENDERITE_ORE_BLOCK.get());


        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.ENDERITE_ORE_BLOCK.get());

        this.tag(ModTags.Blocks.NEEDS_ENDERITE_TOOL)
                .add(ModBlocks.ENDERITE_BLOCK.get());


    }
}