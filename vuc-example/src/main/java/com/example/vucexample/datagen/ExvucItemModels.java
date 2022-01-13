package com.example.vucexample.datagen;

import com.example.vucexample.ExampleVuc;
import com.example.vucexample.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ExvucItemModels extends ItemModelProvider {

    public ExvucItemModels(DataGenerator generator, ExistingFileHelper helper) { super(generator, ExampleVuc.MODID, helper); }

    @Override
    protected void registerModels() {
        // Item takes on the model of the Block
        withExistingParent(Registration.SYED_ORE.get().getRegistryName().getPath(), modLoc("block/syed_ore"));
    }
}
