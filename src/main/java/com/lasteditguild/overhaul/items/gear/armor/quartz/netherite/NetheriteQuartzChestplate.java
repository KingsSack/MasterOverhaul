package com.lasteditguild.overhaul.items.gear.armor.quartz.netherite;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class NetheriteQuartzChestplate extends ArmorItem {

    public NetheriteQuartzChestplate(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable(("lore.overhaul.blank")));
        tooltip.add(Text.translatable("lore.overhaul.full_set").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("lore.overhaul.netherite_quartz_helmet1").formatted(Formatting.BLUE));
    }

}
