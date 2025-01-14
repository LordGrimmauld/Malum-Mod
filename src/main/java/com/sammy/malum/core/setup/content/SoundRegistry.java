package com.sammy.malum.core.setup.content;

import com.sammy.malum.core.helper.DataHelper;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.sammy.malum.MalumMod.MODID;

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID);

    public static final RegistryObject<SoundEvent> SOULSTONE_BREAK = register(new SoundEvent(DataHelper.prefix("soulstone_break")));
    public static final RegistryObject<SoundEvent> SOULSTONE_PLACE = register(new SoundEvent(DataHelper.prefix("soulstone_place")));
    public static final RegistryObject<SoundEvent> SOULSTONE_STEP = register(new SoundEvent(DataHelper.prefix("soulstone_step")));
    public static final RegistryObject<SoundEvent> SOULSTONE_HIT = register(new SoundEvent(DataHelper.prefix("soulstone_hit")));

    public static final RegistryObject<SoundEvent> DEEPSLATE_SOULSTONE_BREAK = register(new SoundEvent(DataHelper.prefix("deepslate_soulstone_break")));
    public static final RegistryObject<SoundEvent> DEEPSLATE_SOULSTONE_PLACE = register(new SoundEvent(DataHelper.prefix("deepslate_soulstone_place")));
    public static final RegistryObject<SoundEvent> DEEPSLATE_SOULSTONE_STEP = register(new SoundEvent(DataHelper.prefix("deepslate_soulstone_step")));
    public static final RegistryObject<SoundEvent> DEEPSLATE_SOULSTONE_HIT = register(new SoundEvent(DataHelper.prefix("deepslate_soulstone_hit")));

    public static final RegistryObject<SoundEvent> BRILLIANCE_BREAK = register(new SoundEvent(DataHelper.prefix("brilliance_break")));
    public static final RegistryObject<SoundEvent> BRILLIANCE_PLACE = register(new SoundEvent(DataHelper.prefix("brilliance_place")));

    public static final RegistryObject<SoundEvent> BLAZING_QUARTZ_ORE_BREAK = register(new SoundEvent(DataHelper.prefix("blazing_quartz_ore_break")));
    public static final RegistryObject<SoundEvent> BLAZING_QUARTZ_ORE_PLACE = register(new SoundEvent(DataHelper.prefix("blazing_quartz_ore_place")));

    public static final RegistryObject<SoundEvent> BLAZING_QUARTZ_BLOCK_BREAK = register(new SoundEvent(DataHelper.prefix("blazing_quartz_block_break")));
    public static final RegistryObject<SoundEvent> BLAZING_QUARTZ_BLOCK_PLACE = register(new SoundEvent(DataHelper.prefix("blazing_quartz_block_place")));
    public static final RegistryObject<SoundEvent> BLAZING_QUARTZ_BLOCK_STEP = register(new SoundEvent(DataHelper.prefix("blazing_quartz_block_step")));
    public static final RegistryObject<SoundEvent> BLAZING_QUARTZ_BLOCK_HIT = register(new SoundEvent(DataHelper.prefix("blazing_quartz_block_hit")));

    public static final RegistryObject<SoundEvent> ARCANE_CHARCOAL_BLOCK_BREAK = register(new SoundEvent(DataHelper.prefix("arcane_charcoal_block_break")));
    public static final RegistryObject<SoundEvent> ARCANE_CHARCOAL_BLOCK_PLACE = register(new SoundEvent(DataHelper.prefix("arcane_charcoal_block_place")));
    public static final RegistryObject<SoundEvent> ARCANE_CHARCOAL_BLOCK_STEP = register(new SoundEvent(DataHelper.prefix("arcane_charcoal_block_step")));
    public static final RegistryObject<SoundEvent> ARCANE_CHARCOAL_BLOCK_HIT = register(new SoundEvent(DataHelper.prefix("arcane_charcoal_block_hit")));

    public static final RegistryObject<SoundEvent> TAINTED_ROCK_BREAK = register(new SoundEvent(DataHelper.prefix("tainted_rock_break")));
    public static final RegistryObject<SoundEvent> TAINTED_ROCK_PLACE = register(new SoundEvent(DataHelper.prefix("tainted_rock_place")));
    public static final RegistryObject<SoundEvent> TAINTED_ROCK_STEP = register(new SoundEvent(DataHelper.prefix("tainted_rock_step")));
    public static final RegistryObject<SoundEvent> TAINTED_ROCK_HIT = register(new SoundEvent(DataHelper.prefix("tainted_rock_hit")));

    public static final RegistryObject<SoundEvent> HALLOWED_GOLD_BREAK = register(new SoundEvent(DataHelper.prefix("hallowed_gold_break")));
    public static final RegistryObject<SoundEvent> HALLOWED_GOLD_HIT = register(new SoundEvent(DataHelper.prefix("hallowed_gold_hit")));
    public static final RegistryObject<SoundEvent> HALLOWED_GOLD_PLACE = register(new SoundEvent(DataHelper.prefix("hallowed_gold_place")));
    public static final RegistryObject<SoundEvent> HALLOWED_GOLD_STEP = register(new SoundEvent(DataHelper.prefix("hallowed_gold_step")));

    public static final RegistryObject<SoundEvent> SOUL_STAINED_STEEL_BREAK = register(new SoundEvent(DataHelper.prefix("soul_stained_steel_break")));
    public static final RegistryObject<SoundEvent> SOUL_STAINED_STEEL_HIT = register(new SoundEvent(DataHelper.prefix("soul_stained_steel_hit")));
    public static final RegistryObject<SoundEvent> SOUL_STAINED_STEEL_PLACE = register(new SoundEvent(DataHelper.prefix("soul_stained_steel_place")));
    public static final RegistryObject<SoundEvent> SOUL_STAINED_STEEL_STEP = register(new SoundEvent(DataHelper.prefix("soul_stained_steel_step")));

    public static final RegistryObject<SoundEvent> ETHER_PLACE = register(new SoundEvent(DataHelper.prefix("ether_place")));
    public static final RegistryObject<SoundEvent> ETHER_BREAK = register(new SoundEvent(DataHelper.prefix("ether_break")));

    public static final RegistryObject<SoundEvent> SCYTHE_CUT = register(new SoundEvent(DataHelper.prefix("scythe_cut")));
    public static final RegistryObject<SoundEvent> SPIRIT_HARVEST = register(new SoundEvent(DataHelper.prefix("spirit_harvest")));

    public static final RegistryObject<SoundEvent> TOTEM_CHARGE = register(new SoundEvent(DataHelper.prefix("totem_charge")));
    public static final RegistryObject<SoundEvent> TOTEM_ACTIVATED = register(new SoundEvent(DataHelper.prefix("totem_activated")));
    public static final RegistryObject<SoundEvent> TOTEM_CANCELLED = register(new SoundEvent(DataHelper.prefix("totem_cancelled")));
    public static final RegistryObject<SoundEvent> TOTEM_ENGRAVE = register(new SoundEvent(DataHelper.prefix("totem_engrave")));

    public static final RegistryObject<SoundEvent> ALTAR_CRAFT = register(new SoundEvent(DataHelper.prefix("altar_craft")));
    public static final RegistryObject<SoundEvent> ALTAR_LOOP = register(new SoundEvent(DataHelper.prefix("altar_loop")));
    public static final RegistryObject<SoundEvent> ALTAR_CONSUME = register(new SoundEvent(DataHelper.prefix("altar_consume")));
    public static final RegistryObject<SoundEvent> ALTAR_SPEED_UP = register(new SoundEvent(DataHelper.prefix("altar_speed_up")));

    public static final RegistryObject<SoundEvent> CRUCIBLE_CRAFT = register(new SoundEvent(DataHelper.prefix("crucible_craft")));
    public static final RegistryObject<SoundEvent> CRUCIBLE_LOOP = register(new SoundEvent(DataHelper.prefix("crucible_loop")));
    public static final RegistryObject<SoundEvent> IMPETUS_CRACK = register(new SoundEvent(DataHelper.prefix("impetus_crack")));

    public static final RegistryObject<SoundEvent> SINISTER_EQUIP = register(new SoundEvent(DataHelper.prefix("sinister_equip")));
    public static final RegistryObject<SoundEvent> HOLY_EQUIP = register(new SoundEvent(DataHelper.prefix("holy_equip")));

    public static final RegistryObject<SoundEvent> VOID_SLASH = register(new SoundEvent(DataHelper.prefix("void_slash")));

    public static final RegistryObject<SoundEvent> SOUL_WARD_HIT = register(new SoundEvent(DataHelper.prefix("soul_ward_hit")));
    public static final RegistryObject<SoundEvent> SOUL_WARD_GROW = register(new SoundEvent(DataHelper.prefix("soul_ward_grow")));
    public static final RegistryObject<SoundEvent> SOUL_WARD_CHARGE = register(new SoundEvent(DataHelper.prefix("soul_ward_charge")));

    public static final RegistryObject<SoundEvent> HEART_OF_STONE_HIT = register(new SoundEvent(DataHelper.prefix("heart_of_stone_hit")));
    public static final RegistryObject<SoundEvent> HEART_OF_STONE_GROW = register(new SoundEvent(DataHelper.prefix("heart_of_stone_grow")));

    public static final RegistryObject<SoundEvent> SUSPICIOUS_SOUND = register(new SoundEvent(DataHelper.prefix("suspicious_sound")));

    public static final SoundType SOULSTONE = new ForgeSoundType(1.0F, 1.0F, SOULSTONE_BREAK, SOULSTONE_STEP, SOULSTONE_PLACE, SOULSTONE_HIT, () -> SoundEvents.STONE_FALL);
    public static final SoundType DEEPSLATE_SOULSTONE = new ForgeSoundType(1.0F, 1.0F, DEEPSLATE_SOULSTONE_BREAK, DEEPSLATE_SOULSTONE_STEP, DEEPSLATE_SOULSTONE_PLACE, DEEPSLATE_SOULSTONE_HIT, () -> SoundEvents.DEEPSLATE_FALL);
    public static final SoundType BRILLIANCE = new ForgeSoundType(1.0F, 1.0F, BRILLIANCE_BREAK, ()->SoundEvents.STONE_STEP, BRILLIANCE_PLACE, ()->SoundEvents.STONE_HIT, () -> SoundEvents.STONE_FALL);
    public static final SoundType BLAZING_QUARTZ_ORE = new ForgeSoundType(1.0F, 1.0F, BLAZING_QUARTZ_ORE_BREAK, () -> SoundEvents.NETHER_ORE_STEP, BLAZING_QUARTZ_ORE_PLACE, () -> SoundEvents.NETHER_ORE_HIT, () -> SoundEvents.NETHER_GOLD_ORE_FALL);
    public static final SoundType BLAZING_QUARTZ_BLOCK = new ForgeSoundType(1.0F, 1.25f, BLAZING_QUARTZ_BLOCK_BREAK, BLAZING_QUARTZ_BLOCK_STEP, BLAZING_QUARTZ_BLOCK_PLACE, BLAZING_QUARTZ_BLOCK_HIT, () -> SoundEvents.NETHER_GOLD_ORE_FALL);
    public static final SoundType ARCANE_CHARCOAL_BLOCK = new ForgeSoundType(1.0F, 0.9f, ARCANE_CHARCOAL_BLOCK_BREAK, ARCANE_CHARCOAL_BLOCK_STEP, ARCANE_CHARCOAL_BLOCK_PLACE, ARCANE_CHARCOAL_BLOCK_HIT, () -> SoundEvents.NETHER_GOLD_ORE_FALL);
    public static final SoundType TAINTED_ROCK = new ForgeSoundType(1.0F, 1.1F, TAINTED_ROCK_BREAK, TAINTED_ROCK_STEP, TAINTED_ROCK_PLACE, TAINTED_ROCK_HIT, () -> SoundEvents.BASALT_FALL);
    public static final SoundType TWISTED_ROCK = new ForgeSoundType(1.0F, 0.85F, TAINTED_ROCK_BREAK, TAINTED_ROCK_STEP, TAINTED_ROCK_PLACE, TAINTED_ROCK_HIT, () -> SoundEvents.BASALT_FALL);
    public static final SoundType HALLOWED_GOLD = new ForgeSoundType(1.0F, 1.0F, HALLOWED_GOLD_BREAK, HALLOWED_GOLD_STEP, HALLOWED_GOLD_PLACE, HALLOWED_GOLD_HIT, () -> SoundEvents.METAL_FALL);
    public static final SoundType SOUL_STAINED_STEEL = new ForgeSoundType(1.0F, 1.0F, SOUL_STAINED_STEEL_BREAK, SOUL_STAINED_STEEL_STEP, SOUL_STAINED_STEEL_PLACE, SOUL_STAINED_STEEL_HIT, () -> SoundEvents.METAL_FALL);
    public static final SoundType ETHER = new ForgeSoundType(1.0F, 1.0F, ETHER_BREAK, () -> SoundEvents.WOOL_STEP, ETHER_PLACE, () -> SoundEvents.ANCIENT_DEBRIS_HIT, () -> SoundEvents.WOOL_FALL);

    public static RegistryObject<SoundEvent> register(SoundEvent soundEvent) {
        return SOUNDS.register(soundEvent.getLocation().getPath(), () -> soundEvent);
    }
}