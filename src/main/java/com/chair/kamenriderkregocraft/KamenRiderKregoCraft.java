package com.chair.kamenriderkregocraft;

import com.chair.kamenriderkregocraft.Item.Decade_Rider_Items_KregoCraft;
import com.chair.kamenriderkregocraft.Item.Kuuga_Rider_Items_KregoCraft;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(KamenRiderKregoCraft.MODID)
public class KamenRiderKregoCraft {
    public static final String MODID = "kamenriderkregocraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public KamenRiderKregoCraft(IEventBus modEventBus, ModContainer modContainer)
    {
        Kuuga_Rider_Items_KregoCraft.register(modEventBus);
        Decade_Rider_Items_KregoCraft.register(modEventBus);
    }
}
