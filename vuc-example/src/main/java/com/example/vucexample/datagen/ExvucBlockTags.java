package com.example.vucexample.datagen;

import com.example.vucexample.ExampleVuc;
import com.example.vucexample.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ExvucBlockTags extends BlockTagsProvider {
    public ExvucBlockTags(DataGenerator generator, ExistingFileHelper helper) { super(generator, ExampleVuc.MODID, helper); }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(Registration.SYED_ORE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(Registration.SYED_ORE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.SYED_ORE.get());
    }
}
