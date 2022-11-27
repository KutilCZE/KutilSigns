package com.kutil.kutilsigns.util;

import com.kutil.kutilsigns.KutilSigns;
import com.kutil.kutilsigns.blocks.BlockItemBase;
import com.kutil.kutilsigns.blocks.SloupBlock;
import com.kutil.kutilsigns.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, KutilSigns.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, KutilSigns.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> SLOUP = ITEMS.register("sloup", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> SLOUP_BLOCK = BLOCKS.register("sloup_block", SloupBlock::new);

    // Block Items
    public static final RegistryObject<Item> SLOUP_BLOCK_ITEM = ITEMS.register("sloup_block", () -> new BlockItemBase(SLOUP_BLOCK.get()));
}
