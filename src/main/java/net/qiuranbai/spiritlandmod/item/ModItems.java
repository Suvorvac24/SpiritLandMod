package net.qiuranbai.spiritlandmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.qiuranbai.spiritlandmod.SpiritLandMod;
import net.qiuranbai.spiritlandmod.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpiritLandMod.MOD_ID);

    public static final RegistryObject<Item> COLD_IRON_INGOT = ITEMS.register("cold_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COLD_IRON_INGOT = ITEMS.register("raw_cold_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties()));
    public static final RegistryObject<Item> COOKED_SAUSAGE = ITEMS.register("cooked_sausage",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_SAUSAGE)));
    public static final RegistryObject<Item> RAW_SAUSAGE = ITEMS.register("raw_sausage",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_SAUSAGE)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);;
    }
}
