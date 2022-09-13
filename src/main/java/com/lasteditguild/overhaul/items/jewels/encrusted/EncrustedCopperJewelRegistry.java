package com.lasteditguild.overhaul.items.jewels.encrusted;

import com.lasteditguild.overhaul.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class EncrustedCopperJewelRegistry {

    public static final Item ENCRUSTED_COPPER_JEWEL = new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.RARE));

    public static void EncrustedCopperJewelInit() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "encrusted_copper_jewel"), ENCRUSTED_COPPER_JEWEL);
    }

}