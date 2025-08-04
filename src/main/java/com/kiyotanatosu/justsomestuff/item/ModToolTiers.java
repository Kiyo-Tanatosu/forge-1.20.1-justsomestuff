package com.kiyotanatosu.justsomestuff.item;

import com.kiyotanatosu.justsomestuff.JustSomeStuff;
import com.kiyotanatosu.justsomestuff.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier ENDERITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2500, 10f, 5f, 17,
                    ModTags.Blocks.NEEDS_ENDERITE_TOOL, () -> Ingredient.of(ModItems.ENDERITE_INGOT.get())),
            new ResourceLocation(JustSomeStuff.MOD_ID, "enderite"), List.of(Tiers.NETHERITE), List.of());

}