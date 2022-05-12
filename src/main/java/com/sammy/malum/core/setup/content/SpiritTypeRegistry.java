package com.sammy.malum.core.setup.content;

import com.sammy.malum.MalumMod;
import com.sammy.malum.core.setup.content.item.ItemRegistry;
import com.sammy.malum.core.systems.spirit.MalumSpiritType;
import com.sammy.malum.core.systems.spirit.SpiritTypeProperty;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;
import java.util.HashMap;

@SuppressWarnings("unchecked")
@Mod.EventBusSubscriber(modid= MalumMod.MALUM, value= Dist.CLIENT, bus= Mod.EventBusSubscriber.Bus.MOD)
public class SpiritTypeRegistry {
    public static HashMap<String, MalumSpiritType> SPIRITS = new HashMap<>();

    public static MalumSpiritType SACRED_SPIRIT = create("sacred", new Color(243, 65, 107), ItemRegistry.SACRED_SPIRIT);

    public static MalumSpiritType WICKED_SPIRIT = create("wicked", new Color(178, 29, 232), ItemRegistry.WICKED_SPIRIT);

    public static MalumSpiritType ARCANE_SPIRIT = create("arcane", new Color(212, 55, 255), ItemRegistry.ARCANE_SPIRIT);

    public static MalumSpiritType ELDRITCH_SPIRIT = create("eldritch", new Color(148, 45, 245), new Color(39, 201, 103), ItemRegistry.ELDRITCH_SPIRIT);

    public static MalumSpiritType AERIAL_SPIRIT = create("aerial", new Color(75, 243, 218), ItemRegistry.AERIAL_SPIRIT);

    public static MalumSpiritType AQUEOUS_SPIRIT = create("aqueous", new Color(42, 114, 232), ItemRegistry.AQUEOUS_SPIRIT);

    public static MalumSpiritType INFERNAL_SPIRIT = create("infernal", new Color(210, 134, 39), ItemRegistry.INFERNAL_SPIRIT);

    public static MalumSpiritType EARTHEN_SPIRIT = create("earthen", new Color(73, 234, 27), ItemRegistry.EARTHEN_SPIRIT);

    public static SpiritTypeProperty SPIRIT_TYPE_PROPERTY = new SpiritTypeProperty("spirit_type", SPIRITS.values());

    public static MalumSpiritType create(String identifier, Color color, RegistryObject<Item> splinterItem) {
        MalumSpiritType spiritType = new MalumSpiritType(identifier, color, splinterItem);
        SPIRITS.put(identifier, spiritType);
        return spiritType;
    }

    public static MalumSpiritType create(String identifier, Color color, Color endColor, RegistryObject<Item> splinterItem) {
        MalumSpiritType spiritType = new MalumSpiritType(identifier, color, endColor, splinterItem);
        SPIRITS.put(identifier, spiritType);
        return spiritType;
    }

    @SubscribeEvent
    public static void stitchTextures(TextureStitchEvent.Pre event) {
        if (!event.getAtlas().location().equals(TextureAtlas.LOCATION_BLOCKS)) {
            return;
        }
        SPIRITS.forEach((s, t) -> event.addSprite(t.getOverlayTexture()));
    }
}