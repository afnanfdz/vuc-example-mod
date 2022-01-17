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
        withExistingParent(Registration.SYED_ORE_OVERWORLD.get().getRegistryName().getPath(), modLoc("block/syed_ore_overworld"));

        //
        singleTexture(
                Registration.RAW_SYED_CHUNK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_syed_chunk")
                );
        singleTexture(
                Registration.SYED_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/syed_ingot")
        );
    }
}
