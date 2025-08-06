package net.qiuranbai.spiritlandmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.qiuranbai.spiritlandmod.SpiritLandMod;
import net.qiuranbai.spiritlandmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpiritLandMod.MOD_ID);

    public  static final RegistryObject<CreativeModeTab> SPIRIT_LAND_TAB = CREATIVE_MODE_TABS.register("spirit_land_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COLD_IRON_INGOT.get()))
                    .title(Component.translatable("creativetab.spirit_land_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // Items
                        output.accept(ModItems.COLD_IRON_INGOT.get());
                        output.accept(ModItems.RAW_COLD_IRON_INGOT.get());

                        //Blocks
                        output.accept(ModBlocks.COLD_IRON_BLOCK.get());
                        output.accept(ModBlocks.RAW_COLD_IRON_BLOCK.get());
                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
