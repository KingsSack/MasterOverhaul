package com.lasteditguild.overhaul.entities.mobs.drowned;

import com.lasteditguild.overhaul.Main;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DrownedSkeletonRegistry {

    public static final EntityType<DrownedSkeletonEntity> DROWNED_SKELETON = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(Main.MOD_ID, "drowned_skeleton"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DrownedSkeletonEntity::new).dimensions(EntityDimensions.fixed(0.65f, 1.95f)).build()
            // FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DrownedSkeletonEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

}
