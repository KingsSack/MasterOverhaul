package com.lasteditguild.overhaul.items.gear.armor;

import com.lasteditguild.overhaul.Main;
import com.lasteditguild.overhaul.armor.NetheriteQuartzArmor;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class NetheriteQuartzArmorRegistry {

    public static final ArmorMaterial NETHERITE_QUARTZ = new NetheriteQuartzArmor();
    //public static final Item NETHERITE_QUARTZ = new NetheriteQuartzArmor(new Item.Settings().group(ItemGroup.COMBAT));
    // If you made a new material, this is where you would note it.
    public static final Item NETHERITE_QUARTZ_HELMET = new ArmorItem(NETHERITE_QUARTZ, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.UNCOMMON));
    public static final Item NETHERITE_QUARTZ_CHESTPLATE = new ArmorItem(NETHERITE_QUARTZ, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.UNCOMMON));
    public static final Item NETHERITE_QUARTZ_LEGGINGS = new ArmorItem(NETHERITE_QUARTZ, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.UNCOMMON));
    public static final Item NETHERITE_QUARTZ_BOOTS = new ArmorItem(NETHERITE_QUARTZ, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.UNCOMMON));

    public static void NetheriteQuartzArmorInit() {
        //Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz"), NETHERITE_QUARTZ);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_helmet"), NETHERITE_QUARTZ_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_chestplate"), NETHERITE_QUARTZ_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_leggings"), NETHERITE_QUARTZ_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_boots"), NETHERITE_QUARTZ_BOOTS);
    }

}