package com.kiyotanatosu.justsomestuff.datagen;

import com.kiyotanatosu.justsomestuff.JustSomeStuff;
import com.kiyotanatosu.justsomestuff.block.ModBlocks;
import com.kiyotanatosu.justsomestuff.item.ModItems;
import com.kiyotanatosu.justsomestuff.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> ENDERITE_SMELTABLES = List.of(ModItems.ENDERITE_CHUNK.get(),
            ModBlocks.ENDERITE_ORE_BLOCK.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, ENDERITE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDERITE_INGOT.get(), 0.25f, 200, "enderite");
        oreBlasting(pWriter, ENDERITE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDERITE_INGOT.get(), 0.25f, 100, "enderite");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENDERITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ENDERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERITE_INGOT.get(), 9)
                .requires(ModBlocks.ENDERITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ENDERITE_BLOCK.get()), has(ModBlocks.ENDERITE_BLOCK.get()))
                .save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_SWORD.get())
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" S ")
                .define('E', ModItems.ENDERITE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_PICKAXE.get())
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', ModItems.ENDERITE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_AXE.get())
                .pattern("EE ")
                .pattern("ES ")
                .pattern(" S ")
                .define('E', ModItems.ENDERITE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_SHOVEL.get())
                .pattern(" E ")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', ModItems.ENDERITE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_HOE.get())
                .pattern("EE ")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', ModItems.ENDERITE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_HELMET.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("   ")
                .define('E', ModItems.ENDERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_CHESTPLATE.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModItems.ENDERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_LEGGINGS.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .define('E', ModItems.ENDERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_BOOTS.get())
                .pattern("E E")
                .pattern("E E")
                .pattern("   ")
                .define('E', ModItems.ENDERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BANANA_PLANKS.get(), 4)
                .requires(ModBlocks.BANANA_LOG.get())
                .unlockedBy(getHasName(ModBlocks.BANANA_LOG.get()), has(ModBlocks.BANANA_LOG.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BANANA_WOOD.get(), 3)
                .pattern("WW ")
                .pattern("WW ")
                .pattern("   ")
                .define('W', ModBlocks.BANANA_LOG.get())
                .unlockedBy(getHasName(ModBlocks.BANANA_LOG.get()), has(ModBlocks.BANANA_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_BANANA_WOOD.get(), 3)
                .pattern("WW ")
                .pattern("WW ")
                .pattern("   ")
                .define('W', ModBlocks.STRIPPED_BANANA_LOG.get())
                .unlockedBy(getHasName(ModBlocks.STRIPPED_BANANA_LOG.get()), has(ModBlocks.STRIPPED_BANANA_LOG.get()))
                .save(pWriter);

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  JustSomeStuff.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}