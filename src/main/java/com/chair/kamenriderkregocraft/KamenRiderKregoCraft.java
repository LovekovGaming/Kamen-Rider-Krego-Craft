package com.chair.kamenriderkregocraft;

import com.chair.kamenriderkregocraft.item.heisei_phase_1.Decade_Rider_Items_KregoCraft;
import com.chair.kamenriderkregocraft.item.heisei_phase_1.Kuuga_Rider_Items_KregoCraft;
import com.chair.kamenriderkregocraft.item.heisei_phase_2.Zi_O_Rider_Items_KregoCraft;
import com.mojang.logging.LogUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(KamenRiderKregoCraft.MODID)
public class KamenRiderKregoCraft {
    public static final String MODID = "kamenriderkregocraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public KamenRiderKregoCraft(IEventBus modEventBus, ModContainer modContainer, Dist dist) {
        Kuuga_Rider_Items_KregoCraft.register(modEventBus);
        Decade_Rider_Items_KregoCraft.register(modEventBus);
        Zi_O_Rider_Items_KregoCraft.register(modEventBus);
    }
}
