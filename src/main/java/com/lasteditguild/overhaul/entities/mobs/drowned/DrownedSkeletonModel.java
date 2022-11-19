package com.lasteditguild.overhaul.entities.mobs.drowned;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public class DrownedSkeletonModel extends EntityModel<DrownedSkeletonEntity> {

    private final ModelPart waist;

    public DrownedSkeletonModel(ModelPart root) {
        this.waist = root.getChild("waist");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        ModelPartData waist = modelPartData.addChild("waist", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.0F, 0.0F));
        ModelPartData body = waist.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));
        ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData hat = head.addChild("hat", ModelPartBuilder.create().uv(32, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData rightArm = body.addChild("rightArm", ModelPartBuilder.create().uv(40, 16).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));
        ModelPartData rightItem = rightArm.addChild("rightItem", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F, 7.0F, 1.0F));
        ModelPartData leftArm = body.addChild("leftArm", ModelPartBuilder.create().uv(40, 16).mirrored().cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.0F, 2.0F, 0.0F));
        ModelPartData leftItem = leftArm.addChild("leftItem", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, 7.0F, 1.0F));
        ModelPartData rightLeg = body.addChild("rightLeg", ModelPartBuilder.create().uv(0, 16).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
        ModelPartData leftLeg = body.addChild("leftLeg", ModelPartBuilder.create().uv(0, 16).mirrored().cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

        return TexturedModelData.of(modelData, 64, 32);
    }

    @Override
    public void setAngles(DrownedSkeletonEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.waist).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
    }

}
