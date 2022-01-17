package com.example.vucexample.datagen;

import com.example.vucexample.ExampleVuc;
import com.example.vucexample.setup.Registration;
import net.minecraft.data.DataGenerator;

import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ExvucBlockStates extends BlockStateProvider {

    public ExvucBlockStates(DataGenerator generator, ExistingFileHelper helper) { super(generator, ExampleVuc.MODID, helper); }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.SYED_ORE_OVERWORLD.get());
    }
}
