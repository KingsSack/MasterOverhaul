package com.lasteditguild.overhaul.items.gear.armor.quartz.netherite;

import com.lasteditguild.overhaul.Main;
import com.lasteditguild.overhaul.armor.NetheriteQuartzArmor;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class NetheriteQuartzArmorRegistry {

    public static final ArmorMaterial NETHERITE_QUARTZ = new NetheriteQuartzArmor();
    public static final NetheriteQuartzHelmet NETHERITE_QUARTZ_HELMET = new NetheriteQuartzHelmet(NETHERITE_QUARTZ, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.UNCOMMON));
    public static final NetheriteQuartzChestplate NETHERITE_QUARTZ_CHESTPLATE = new NetheriteQuartzChestplate(NETHERITE_QUARTZ, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.UNCOMMON));
    public static final NetheriteQuartzLeggings NETHERITE_QUARTZ_LEGGINGS = new NetheriteQuartzLeggings(NETHERITE_QUARTZ, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.UNCOMMON));
    public static final NetheriteQuartzBoots NETHERITE_QUARTZ_BOOTS = new NetheriteQuartzBoots(NETHERITE_QUARTZ, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.UNCOMMON));

    public static void NetheriteQuartzArmorInit() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_helmet"), NETHERITE_QUARTZ_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_chestplate"), NETHERITE_QUARTZ_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_leggings"), NETHERITE_QUARTZ_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_boots"), NETHERITE_QUARTZ_BOOTS);
    }

}