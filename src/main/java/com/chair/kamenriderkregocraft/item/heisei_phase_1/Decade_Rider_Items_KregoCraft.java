package com.chair.kamenriderkregocraft.item.heisei_phase_1;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.item.base_items.RiderDriverItem;
import com.kelco.kamenridercraft.item.heisei_phase_1.decade.RiderSummonCardItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Decade_Rider_Items_KregoCraft {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(KamenRiderCraftCore.MOD_ID);

    public static final DeferredItem<Item> KREGO_CARD = ITEMS.register("krego_card",
            () -> new RiderSummonCardItem(new Item.Properties(), 1).setSummonBelt((RiderDriverItem) Kuuga_Rider_Items_KregoCraft.ARCLE_ZWEI.get()).addToList(KamenRiderCraftCore.CreativeTabRegistry.DECADE_TAB_ITEM));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
