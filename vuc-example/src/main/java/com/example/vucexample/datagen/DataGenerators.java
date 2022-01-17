package com.example.vucexample.datagen;

import com.example.vucexample.ExampleVuc;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ExampleVuc.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new ExvucRecipes(generator));
            generator.addProvider(new ExvucLootTables(generator));
            ExvucBlockTags blockTags = new ExvucBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new ExvucItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new ExvucBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new ExvucItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new ExvucLanguageProvider(generator, "en_us"));
        }
    }
}
