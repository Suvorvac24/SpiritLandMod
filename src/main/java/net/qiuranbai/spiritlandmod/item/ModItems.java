package net.qiuranbai.spiritlandmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.qiuranbai.spiritlandmod.SpiritLandMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpiritLandMod.MOD_ID);

    public static final RegistryObject<Item> COLD_IRON_INGOT = ITEMS.register("cold_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COLD_IRON_INGOT = ITEMS.register("raw_cold_iron_ingot",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);;
    }
}
