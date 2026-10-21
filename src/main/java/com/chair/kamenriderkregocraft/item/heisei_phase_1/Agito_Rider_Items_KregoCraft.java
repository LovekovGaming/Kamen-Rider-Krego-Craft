package com.chair.kamenriderkregocraft.item.heisei_phase_1;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.effects.EffectCore;
import com.kelco.kamenridercraft.item.KRCCreativeTabs;
import com.kelco.kamenridercraft.item.base_items.RiderDriverItem;
import com.kelco.kamenridercraft.item.base_items.RiderFormChangeItem;
import com.kelco.kamenridercraft.item.heisei_phase_1.AgitoRiderItems;
import com.kelco.kamenridercraft.particle.ModParticles;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Agito_Rider_Items_KregoCraft {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(KamenRiderCraftCore.MOD_ID);

    public static final DeferredItem<Item> ARTIFICIAL_KREGO_CHIP = ITEMS.register("artificial_krego",
            () -> new RiderFormChangeItem(new Item.Properties(),"","artificial_krego","g_buckle_belt",
                    new MobEffectInstance(EffectCore.PUNCH, 40, 1,true,false)
                    , new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)) {
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.WHITE_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.isGlowing().IsBeltGlowing().addToList(KRCCreativeTabs.AGITO_TAB_ITEM));

    public static final DeferredItem<Item> G_BUCKLE_ARTIFICIAL_KREGO = ITEMS.register("artificial_krego_belt",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"artificial_krego", ARTIFICIAL_KREGO_CHIP, AgitoRiderItems.AGITOHELMET, AgitoRiderItems.AGITOCHESTPLATE, AgitoRiderItems.AGITOLEGGINGS, new Item.Properties())
                    .hideBeltFormInfo().addToList(KRCCreativeTabs.AGITO_TAB_ITEM).changeRepairItem(AgitoRiderItems.BLANK_G_SYSTEM_CHIP.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
