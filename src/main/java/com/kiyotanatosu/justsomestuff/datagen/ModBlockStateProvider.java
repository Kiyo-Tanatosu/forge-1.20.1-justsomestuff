package com.kiyotanatosu.justsomestuff.datagen;

import com.kiyotanatosu.justsomestuff.JustSomeStuff;
import com.kiyotanatosu.justsomestuff.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, JustSomeStuff.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ENDERITE_BLOCK);
        blockWithItem(ModBlocks.ENDERITE_ORE_BLOCK);

        logBlock(((RotatedPillarBlock) ModBlocks.BANANA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BANANA_WOOD.get()), blockTexture(ModBlocks.BANANA_LOG.get()), blockTexture(ModBlocks.BANANA_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BANANA_LOG.get()), blockTexture(ModBlocks.STRIPPED_BANANA_LOG.get()),
                new ResourceLocation(JustSomeStuff.MOD_ID, "block/stripped_banana_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BANANA_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BANANA_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_BANANA_LOG.get()));

        blockItem(ModBlocks.BANANA_LOG);
        blockItem(ModBlocks.STRIPPED_BANANA_LOG);
        blockItem(ModBlocks.BANANA_WOOD);
        blockItem(ModBlocks.STRIPPED_BANANA_WOOD);

        blockWithItem(ModBlocks.BANANA_PLANKS);

        leavesBlock(ModBlocks.BANANA_LEAVES);

        saplingBlock(ModBlocks.BANANA_SAPLING);


    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(JustSomeStuff.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}