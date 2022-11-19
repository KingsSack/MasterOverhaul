package com.lasteditguild.overhaul.entities.mobs.drowned;

import com.lasteditguild.overhaul.Main;
import com.lasteditguild.overhaul.MainClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class DrownedSkeletonRenderer extends MobEntityRenderer<DrownedSkeletonEntity, DrownedSkeletonModel> {

    public DrownedSkeletonRenderer(EntityRendererFactory.Context context) {
        super(context, new DrownedSkeletonModel(context.getPart(MainClient.MODEL_DROWNED_SKELETON_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(DrownedSkeletonEntity entity) {
        return new Identifier(Main.MOD_ID, "textures/entities/drowned_skeleton.png");
    }

}
