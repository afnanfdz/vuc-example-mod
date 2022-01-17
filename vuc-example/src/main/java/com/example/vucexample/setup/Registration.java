package com.example.vucexample.setup;

import com.example.vucexample.ExampleVuc;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.vucexample.ExampleVuc.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    // Common properties for the blocks and items
    public static final BlockBehaviour.Properties ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    // Register the Items
    public static final RegistryObject<Block> SYED_ORE_OVERWORLD = BLOCKS.register("syed_ore_overworld", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> SYED_ORE_OVERWORLD_ITEM = fromBlock(SYED_ORE_OVERWORLD);

//    public static final RegistryObject<Block> SYED_ORE_DEEPSLATE = BLOCKS.register("syed_ore", () -> new Block(ORE_PROPERTIES));
//    public static final RegistryObject<Item> SYED_ORE_DEEPSLATE_ITEM = fromBlock(SYED_ORE_DEEPSLATE);
//    public static final RegistryObject<Block> SYED_ORE_NETHER = BLOCKS.register("syed_ore", () -> new Block(ORE_PROPERTIES));
//    public static final RegistryObject<Item> SYED_ORE_NETHER_ITEM = fromBlock(SYED_ORE_NETHER);

    public static final RegistryObject<Item> RAW_SYED_CHUNK = ITEMS.register("raw_syed_chunk", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> SYED_INGOT = ITEMS.register("syed_ingot", () -> new Item(ITEM_PROPERTIES));

    // Register the Tags
    public static final Tags.IOptionalNamedTag<Block> SYED_ORE = BlockTags.createOptional(new ResourceLocation(ExampleVuc.MODID, "syed_ore"));
    public static final Tags.IOptionalNamedTag<Item> SYED_ORE_ITEM = ItemTags.createOptional((new ResourceLocation(ExampleVuc.MODID, "syed_ore")));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
