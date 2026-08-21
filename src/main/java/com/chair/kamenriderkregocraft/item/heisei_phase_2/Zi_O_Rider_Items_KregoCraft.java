package com.chair.kamenriderkregocraft.item.heisei_phase_2;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.effects.EffectCore;
import com.kelco.kamenridercraft.item.base_items.RiderDriverItem;
import com.kelco.kamenridercraft.item.base_items.RiderFormChangeItem;
import com.kelco.kamenridercraft.item.heisei_phase_2.ZiORiderItems;
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

import static com.kelco.kamenridercraft.item.heisei_phase_2.ZiORiderItems.BLANK_RIDEWATCH;

public class Zi_O_Rider_Items_KregoCraft {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(KamenRiderCraftCore.MOD_ID);

    public static final DeferredItem<Item> ANOTHER_KREGO_WATCH_YANMA = ITEMS.register("another_krego_watch_yanma",
            () -> new RiderFormChangeItem(new Item.Properties(), "_yanma", "another_krego", "another_krego_belt",
                    new MobEffectInstance(EffectCore.PUNCH, 40, 1,true,false)
                    , new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)) {
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.DARK_RED_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.DARK_BLUE_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            });

    public static final DeferredItem<Item> ANOTHER_KREGO_WATCH = ITEMS.register("another_krego_watch",
            () -> new RiderFormChangeItem(new Item.Properties(), "", "another_krego", "another_krego_belt",
                    new MobEffectInstance(EffectCore.PUNCH, 40, 1,true,false)
                    , new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)) {
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.DARK_RED_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.DARK_BLUE_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.addSwitchForm(ANOTHER_KREGO_WATCH_YANMA.get()).addToList(KamenRiderCraftCore.CreativeTabRegistry.ZI_O_TAB_ITEM));

    public static final DeferredItem<Item> ANOTHER_ARCLE_ZWEI = ITEMS.register("another_krego_belt",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND, "another_krego", ANOTHER_KREGO_WATCH, ZiORiderItems.ZI_O_HELMET, ZiORiderItems.ZI_O_CHESTPLATE, ZiORiderItems.ZI_O_LEGGINGS,
                    new Item.Properties()).addToList(KamenRiderCraftCore.CreativeTabRegistry.ZI_O_TAB_ITEM).changeRepairItem(BLANK_RIDEWATCH.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
