package com.lasteditguild.overhaul;

import com.lasteditguild.overhaul.blocks.workbench.WorkbenchInitializer;
import com.lasteditguild.overhaul.entities.mobs.drowned.DrownedSkeletonModel;
import com.lasteditguild.overhaul.entities.mobs.drowned.DrownedSkeletonRegistry;
import com.lasteditguild.overhaul.entities.mobs.drowned.DrownedSkeletonRenderer;
import com.lasteditguild.overhaul.userinterface.InfusionTableScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class MainClient implements ClientModInitializer {

    public static final EntityModelLayer MODEL_DROWNED_SKELETON_LAYER = new EntityModelLayer(new Identifier(Main.MOD_ID, "drowned_skeleton"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(DrownedSkeletonRegistry.DROWNED_SKELETON, (context) -> {
            return new DrownedSkeletonRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_DROWNED_SKELETON_LAYER, DrownedSkeletonModel::getTexturedModelData);

        HandledScreens.register(WorkbenchInitializer.INFUSION_TABLE_SCREEN_HANDLER, InfusionTableScreen::new);
    }

}
