package com.example.vucexample.datagen;

import com.example.vucexample.ExampleVuc;
import com.example.vucexample.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.example.vucexample.setup.ModSetup.TAB_NAME;

public class ExvucLanguageProvider extends LanguageProvider {

    public ExvucLanguageProvider(DataGenerator generator, String locale) {
        super(generator, ExampleVuc.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        // Name the Creative Mode tab
        add("itemGroup." + TAB_NAME, "Vuc's Syed Mod");

        // Name the items
        add(Registration.SYED_ORE_OVERWORLD.get(), "Syed Ore");
        add(Registration.RAW_SYED_CHUNK.get(), "Syed Ore Chunk");
        add(Registration.SYED_INGOT.get(), "Syed Ingot");
    }
}
