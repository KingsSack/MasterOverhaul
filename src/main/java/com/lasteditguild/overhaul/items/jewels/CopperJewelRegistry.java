package com.lasteditguild.overhaul.items.jewels;

import com.lasteditguild.overhaul.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class CopperJewelRegistry {

    public static final Item COPPER_JEWEL = new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.RARE));

    public static void CopperJewelInit() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "copper_jewel"), COPPER_JEWEL);
    }

}