package com.lasteditguild.overhaul.blocks.ore;

import com.lasteditguild.overhaul.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AlexandriteOreRegistry {

    public static final Block ALEXANDRITE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(28.0f).requiresTool());

    public static void AlexandriteOreInit() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "alexandrite_ore"), ALEXANDRITE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "alexandrite_ore"), new BlockItem(ALEXANDRITE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

}
