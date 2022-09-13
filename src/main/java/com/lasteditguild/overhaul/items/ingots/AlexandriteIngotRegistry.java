package com.lasteditguild.overhaul.items.ingots;

import com.lasteditguild.overhaul.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AlexandriteIngotRegistry {

    public static final Item ALEXANDRITE_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static void AlexandriteIngotInit() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "alexandrite_ingot"), ALEXANDRITE_INGOT);
    }

}
