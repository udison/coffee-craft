package com.udison999.coffeecraft.item;

import com.udison999.coffeecraft.CoffeeCraftMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CoffeeCraftMod.MOD_ID);

    public static final DeferredItem<Item> COFFEE_BEAN = ITEMS.register("coffee_bean",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_COFFEE_BEAN = ITEMS.register("raw_coffee_bean",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    
}
