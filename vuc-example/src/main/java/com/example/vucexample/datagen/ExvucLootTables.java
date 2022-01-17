package com.example.vucexample.datagen;

import com.example.vucexample.setup.Registration;
import net.minecraft.data.DataGenerator;

public class ExvucLootTables extends BaseLootTableProvider {
    public ExvucLootTables(DataGenerator generator) { super(generator); }

    @Override
    protected void addTables() {
        lootTables.put(Registration.SYED_ORE_OVERWORLD.get(), createSilkTouchTable("mysterious_ore_overworld", Registration.SYED_ORE_OVERWORLD.get(), Registration.RAW_SYED_CHUNK.get(), 1, 3));
    }
}
