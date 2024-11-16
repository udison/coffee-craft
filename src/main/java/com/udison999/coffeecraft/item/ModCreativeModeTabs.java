package com.udison999.coffeecraft.item;

import com.udison999.coffeecraft.CoffeeCraftMod;
import com.udison999.coffeecraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoffeeCraftMod.MOD_ID);
    
    public static final Supplier<CreativeModeTab> COFFEE_CRAFT_TAB = CREATIVE_MODE_TAB.register("coffee_craft_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.COFFEE_BEAN.get()))
                    .title(Component.translatable("creativetab.coffeecraft.coffee_craft_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.COFFEE_BEAN);
                        output.accept(ModItems.RAW_COFFEE_BEAN);
                        output.accept(ModBlocks.ROASTER);
                    })
                    .build());
    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
