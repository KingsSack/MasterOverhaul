package com.lasteditguild.overhaul.blocks.ore;

import com.lasteditguild.overhaul.Main;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

public class OreSpawning {
    private static final ConfiguredFeature<?, ?> ALEXANDRITE_ORE_CONFIGURED = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), AlexandriteOreRegistry.ALEXANDRITE_ORE.getDefaultState(), 9));

    public static PlacedFeature ALEXANDRITE_ORE_PLACED = new PlacedFeature
            (RegistryEntry.of(ALEXANDRITE_ORE_CONFIGURED), Arrays.asList(CountPlacementModifier.of(4), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(45))));


    public static void OreInit() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Main.MOD_ID, "end_alexandrite_ore"), ALEXANDRITE_ORE_CONFIGURED);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Main.MOD_ID, "end_alexandrite_ore"), ALEXANDRITE_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(Main.MOD_ID, "end_alexandrite_ore")));
    }

}
