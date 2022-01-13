//package com.example.vucexample.datagen;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import net.minecraft.data.DataGenerator;
//import net.minecraft.data.loot.LootTableProvider;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraft.world.level.storage.loot.LootPool;
//import net.minecraft.world.level.storage.loot.LootTable;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;
//
//public abstract class BaseLootTableProvider extends LootTableProvider {
//
//    private static final Logger LOGGER = LogManager.getLogger();
//    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
//
//    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
//    private final DataGenerator generator;
//
//    public BaseLootTableProvider(DataGenerator generator) {
//        super(generator);
//        this.generator = new DataGenerator();
//    }
//
//    protected abstract void addTables();
//
//    protected LootTable.Builder createStandardTable(String name, Block block, BlockEntityType<?> type) {
//        LootPool.Builder builder = LootPool.lootPool()
//                .name();
//    }
//}
