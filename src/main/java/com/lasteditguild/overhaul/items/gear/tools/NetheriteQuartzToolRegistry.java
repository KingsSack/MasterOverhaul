package com.lasteditguild.overhaul.items.gear.tools;

import com.lasteditguild.overhaul.Main;
import com.lasteditguild.overhaul.items.gear.tools.axe.NetheriteQuartzAxe;
import com.lasteditguild.overhaul.items.gear.tools.hoe.NetheriteQuartzHoe;
import com.lasteditguild.overhaul.items.gear.tools.pickaxe.NetheriteQuartzPickaxe;
import com.lasteditguild.overhaul.tools.NetheriteQuartzTool;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class NetheriteQuartzToolRegistry {

    public static ToolItem NETHERITE_QUARTZ_SHOVEL = new ShovelItem(NetheriteQuartzTool.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.UNCOMMON));
    public static ToolItem NETHERITE_QUARTZ_SWORD = new SwordItem(NetheriteQuartzTool.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.UNCOMMON));

    public static ToolItem NETHERITE_QUARTZ_PICKAXE = new NetheriteQuartzPickaxe(NetheriteQuartzTool.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.UNCOMMON));
    public static ToolItem NETHERITE_QUARTZ_AXE = new NetheriteQuartzAxe(NetheriteQuartzTool.INSTANCE, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.UNCOMMON));
    public static ToolItem NETHERITE_QUARTZ_HOE = new NetheriteQuartzHoe(NetheriteQuartzTool.INSTANCE, -4, 0.0F, new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.UNCOMMON));

    public static void NetheriteQuartzToolInit() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_shovel"), NETHERITE_QUARTZ_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_sword"), NETHERITE_QUARTZ_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_pickaxe"), NETHERITE_QUARTZ_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_axe"), NETHERITE_QUARTZ_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_quartz_hoe"), NETHERITE_QUARTZ_HOE);
    }

}
