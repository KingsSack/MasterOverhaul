package com.lasteditguild.overhaul.items.gems;

import com.lasteditguild.overhaul.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class CopperGemRegistry {

    public static final Item COPPER_GEM = new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON));

    public static void CopperGemInit() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "copper_gem"), COPPER_GEM);
    }

}