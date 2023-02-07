package com.lasteditguild.overhaul.blocks.workbench;

import com.lasteditguild.overhaul.Main;
import com.lasteditguild.overhaul.userinterface.InfusionTableScreenHandler;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WorkbenchInitializer {

    public static final InfusionTableBlock INFUSION_TABLE = new InfusionTableBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f));
    // public static final BlockEntityType<InfusionTableBlockEntity> INFUSION_TABLE_BlOCK_ENTITY = FabricBlockEntityTypeBuilder.create(InfusionTableBlockEntity::new, INFUSION_TABLE).build();
    public static final ScreenHandlerType<InfusionTableScreenHandler> INFUSION_TABLE_SCREEN_HANDLER = new ScreenHandlerType<>(InfusionTableScreenHandler::new);

    public static void WorkbenchInit() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "infusion_table"), INFUSION_TABLE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "infusion_table"), new BlockItem(INFUSION_TABLE, new FabricItemSettings().group(ItemGroup.MISC)));
        // Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Main.MOD_ID, "infusion_table"), INFUSION_TABLE_BlOCK_ENTITY);
        Registry.register(Registry.SCREEN_HANDLER, new Identifier(Main.MOD_ID, "infusion_table"), INFUSION_TABLE_SCREEN_HANDLER);
    }

}
