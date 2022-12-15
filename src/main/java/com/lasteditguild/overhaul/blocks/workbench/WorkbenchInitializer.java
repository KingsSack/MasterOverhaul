package com.lasteditguild.overhaul.blocks.workbench;

import com.lasteditguild.overhaul.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WorkbenchInitializer {

    public static final InfusionTableBlock INFUSION_TABLE = new InfusionTableBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f));

    public static void WorkbenchInit() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "infusion_table"), INFUSION_TABLE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "infusion_table"), new BlockItem(INFUSION_TABLE, new FabricItemSettings().group(ItemGroup.MISC)));
    }

}
