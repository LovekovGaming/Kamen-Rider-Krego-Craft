package com.chair.kamenriderkregocraft.item.heisei_phase_1;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.effects.EffectCore;
import com.kelco.kamenridercraft.item.base_items.RiderDriverItem;
import com.kelco.kamenridercraft.item.base_items.RiderFormChangeItem;
import com.kelco.kamenridercraft.item.heisei_phase_1.KuugaRiderItems;
import com.kelco.kamenridercraft.particle.ModParticles;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Kuuga_Rider_Items_KregoCraft {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(KamenRiderCraftCore.MOD_ID);

    public static final DeferredItem<Item> KREGO = ITEMS.register("krego",
            () -> new RiderFormChangeItem(new Item.Properties(),"","krego","krego_belt",
                new MobEffectInstance(EffectCore.PUNCH, 40, 1,true,false)
                , new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)) {
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.isGlowing().IsBeltGlowing().addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM));
    
    public static final DeferredItem<Item> KREGO_DRAGON = ITEMS.register("krego_dragon",
            () -> new RiderFormChangeItem(new Item.Properties(),"_dragon","krego","krego_belt_d",
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)){
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_SPARK_PARTICLES.get(),
                            player.getX(), player.getY()+1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.changeModel("krego.geo.json").IsBeltGlowing().isGlowing().addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KREGO_PEGASUS = ITEMS.register("krego_pegasus",
            () -> new RiderFormChangeItem(new Item.Properties(),"_pegasus","krego","krego_belt_p",
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(EffectCore.RADAR, 40, 0,true,false),
                    new MobEffectInstance(EffectCore.SHOT_BOOST, 40, 1,true,false)) {
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_SPARK_PARTICLES.get(),
                            player.getX(), player.getY()+1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.changeModel("krego.geo.json").IsBeltGlowing().isGlowing().addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KREGO_TITAN = ITEMS.register("krego_titan",
            () -> new RiderFormChangeItem(new Item.Properties(),"_titan","krego","krego_belt_t",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
                    new MobEffectInstance(EffectCore.SLASH, 40, 1,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)) {
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.PURPLE_SPARK_PARTICLES.get(),
                            player.getX(), player.getY()+1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.changeModel("krego.geo.json").IsBeltGlowing().isGlowing().addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM));
    
    public static final DeferredItem<Item> KREGO_BURNING = ITEMS.register("krego_burning",
            () -> new RiderFormChangeItem(new Item.Properties().rarity(Rarity.UNCOMMON),"_burning","krego","krego_belt_b",
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)){
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
                            player.getX(), player.getY()+1,
                            player.getZ(), 200, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.BLACK_SPARK_PARTICLES.get(),
                            player.getX(), player.getY()+1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.isGlowing().IsBeltGlowing().addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KREGO_SHINING_ULTIMATE = ITEMS.register("krego_shining_ultimate",
            () -> new RiderFormChangeItem(new Item.Properties().rarity(Rarity.UNCOMMON),"_shining_ultimate","krego","krego_belt_su",
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(EffectCore.PUNCH, 40, 3,true,false),
					new MobEffectInstance(EffectCore.FIRE_ARMOR, 40, 3,true,false)){
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
                            player.getX(), player.getY()+1,
                            player.getZ(), 50, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.BLACK_SPARK_PARTICLES.get(),
                            player.getX(), player.getY()+1,
                            player.getZ(), 50, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
                            player.getX(), player.getY()+1,
                            player.getZ(), 200, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.WHITE_SPARK_PARTICLES.get(),
                            player.getX(), player.getY()+1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.changeModel("krego.geo.json").isGlowing().IsBeltGlowing().addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> OGERK = ITEMS.register("ogerk",
            () -> new RiderFormChangeItem(new Item.Properties(),"","ogerk","ogerk_belt",
                    new MobEffectInstance(EffectCore.PUNCH, 40, 1,true,false)
                    , new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)) {
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.setSlotOneAbility("rider_punch", 1).setSlotTwoAbility("rider_kick", 1).changeModel("krego.geo.json").isGlowing().IsBeltGlowing().addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KREGO_BLACK = ITEMS.register("krego_black",
            () -> new RiderFormChangeItem(new Item.Properties(),"","krego_black","krego_black_belt",
                    new MobEffectInstance(EffectCore.PUNCH, 40, 1,true,false)
                    , new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)) {
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.BLACK_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.setSlotOneAbility("rider_punch", 1).setSlotTwoAbility("rider_kick", 1).changeModel("krego.geo.json").isGlowing().IsBeltGlowing().addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> MANGA_KREGO = ITEMS.register("manga_krego",
            () -> new RiderFormChangeItem(new Item.Properties(),"","krego_manga","krego_belt_manga",
                    new MobEffectInstance(EffectCore.PUNCH, 40, 1,true,false)
                    , new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)
                    ,new MobEffectInstance(EffectCore.FLAT, 40, 0,true,false))
                    .setSlotOneAbility("rider_punch", 1).setSlotTwoAbility("rider_kick", 1).changeModel("krego.geo.json").isGlowing().IsBeltGlowing());

    public static final DeferredItem<Item> CHAIR_KREGO = ITEMS.register("chair_krego",
            () -> new RiderFormChangeItem(new Item.Properties(),"","krego_chair","krego_belt_c",
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(EffectCore.RADAR, 40, 0,true,false),
                    new MobEffectInstance(EffectCore.SHOT_BOOST, 40, 1,true,false)) {
                public void transformationEffect(ItemStack itemstack, LivingEntity player) {
                    super.transformationEffect(itemstack, player);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.CYAN_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                    ((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_SPARK_PARTICLES.get(),
                            player.getX(), player.getY() + 1,
                            player.getZ(), 100, 0, 0, 0, 1);
                }
            }.changeModel("krego.geo.json").isGlowing().IsBeltGlowing());

    public static final DeferredItem<Item> ARCLE_ZWEI = ITEMS.register("krego_belt",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"krego", KREGO, KuugaRiderItems.KUUGAHELMET, KuugaRiderItems.KUUGACHESTPLATE, KuugaRiderItems.KUUGALEGGINGS, new Item.Properties())
                    .addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM).changeRepairItem(KuugaRiderItems.KUUGA_GROWING.get()));

    public static final DeferredItem<Item> OGERK_BELT = ITEMS.register("ogerk_belt",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ogerk", OGERK, KuugaRiderItems.KUUGAHELMET, KuugaRiderItems.KUUGACHESTPLATE, KuugaRiderItems.KUUGALEGGINGS, new Item.Properties())
                    .hideBeltFormInfo().addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM).changeRepairItem(KuugaRiderItems.KUUGA_GROWING.get()));

    public static final DeferredItem<Item> KREGO_BLACK_BELT = ITEMS.register("krego_black_belt",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"krego_black", KREGO_BLACK, KuugaRiderItems.KUUGAHELMET, KuugaRiderItems.KUUGACHESTPLATE, KuugaRiderItems.KUUGALEGGINGS, new Item.Properties())
                    .hideBeltFormInfo().addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM).changeRepairItem(KuugaRiderItems.KUUGA_GROWING.get()));

    public static final DeferredItem<Item> MANGA_ARCLE_ZWEI = ITEMS.register("manga_krego_belt",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"krego_manga", MANGA_KREGO ,KuugaRiderItems.KUUGAHELMET, KuugaRiderItems.KUUGACHESTPLATE, KuugaRiderItems.KUUGALEGGINGS, new Item.Properties()
                    .rarity(Rarity.UNCOMMON)).hideBeltFormInfo().addToList(KamenRiderCraftCore.CreativeTabRegistry.KUUGA_TAB_ITEM).changeRepairItem(KuugaRiderItems.KUUGA_GROWING.get()));

    public static final DeferredItem<Item> CHAIR_KREGO_BELT = ITEMS.register("chair_krego_belt",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"krego_chair", CHAIR_KREGO ,KuugaRiderItems.KUUGAHELMET, KuugaRiderItems.KUUGACHESTPLATE, KuugaRiderItems.KUUGALEGGINGS, new Item.Properties()
                    .rarity(Rarity.RARE)).hideBeltFormInfo().changeRepairItem(KuugaRiderItems.KUUGA_GROWING.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
