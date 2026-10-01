package com.blocklegend001.onlyhammers.datagen;

import com.blocklegend001.onlyhammers.OnlyHammers;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, OnlyHammers.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}

