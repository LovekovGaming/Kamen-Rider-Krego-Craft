package com.chair.kamenriderkregocraft.Item;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.item.base_items.RiderDriverItem;
import com.kelco.kamenridercraft.item.base_items.RiderFormChangeItem;
import com.kelco.kamenridercraft.item.heisei_phase_1.Kuuga_Rider_Items;
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

public class Kuuga_Rider_Items_KregoCraft {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(KamenRiderCraftCore.MOD_ID);

    public static final DeferredItem<Item> KREGO = ITEMS.register("krego",
            () -> new RiderFormChangeItem(new Item.Properties(),"","krego","krego_belt",
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)){
                public void OnTransformation(ItemStack itemstack, LivingEntity player) {
                    super.OnTransformation(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.IsGlowing().IsBeltGlowing().AddToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KREGO_BELT = ITEMS.register("krego_belt",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"krego", KREGO, Kuuga_Rider_Items.KUUGAHELMET, Kuuga_Rider_Items.KUUGACHESTPLATE, Kuuga_Rider_Items.KUUGALEGGINGS, new Item.Properties())
                    .Dont_show_belt_form_info().AddToTabList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM).ChangeRepairItem(Kuuga_Rider_Items.KUUGA_GROWING.get()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
