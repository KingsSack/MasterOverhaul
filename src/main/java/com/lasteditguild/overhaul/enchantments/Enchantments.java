package com.lasteditguild.overhaul.enchantments;

import com.lasteditguild.overhaul.Main;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Enchantments {

    public static void EnchantmentInit() {
        Enchantment FROST_ASPECT = Registry.register(
                Registry.ENCHANTMENT,
                new Identifier(Main.MOD_ID, "frost_aspect"),
                new FrostAspect()
        );

        Enchantment LIGHTNING_ASPECT = Registry.register(
                Registry.ENCHANTMENT,
                new Identifier(Main.MOD_ID, "lightning_aspect"),
                new LightningAspect()
        );
    }

}
