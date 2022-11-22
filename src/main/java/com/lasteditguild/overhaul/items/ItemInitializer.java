package com.lasteditguild.overhaul.items;

import com.lasteditguild.overhaul.items.gear.armor.quartz.netherite.NetheriteQuartzArmorRegistry;
import com.lasteditguild.overhaul.items.gear.tools.NetheriteQuartzToolRegistry;
import com.lasteditguild.overhaul.items.gems.CopperGemRegistry;
import com.lasteditguild.overhaul.items.gems.EmeraldGemRegistry;
import com.lasteditguild.overhaul.items.gems.NetherQuartzGemRegistry;
import com.lasteditguild.overhaul.items.ingots.AlexandriteIngotRegistry;
import com.lasteditguild.overhaul.items.jewels.CopperJewelRegistry;
import com.lasteditguild.overhaul.items.jewels.encrusted.EncrustedCopperJewelRegistry;

public class ItemInitializer {

    public static void ItemInit() {
        NetherQuartzGemRegistry.NetherQuartzGemInit();
        EmeraldGemRegistry.EmeraldGemInit();
        CopperGemRegistry.CopperGemInit();

        CopperJewelRegistry.CopperJewelInit();

        EncrustedCopperJewelRegistry.EncrustedCopperJewelInit();

        AlexandriteIngotRegistry.AlexandriteIngotInit();

        NetheriteQuartzArmorRegistry.NetheriteQuartzArmorInit();

        NetheriteQuartzToolRegistry.NetheriteQuartzToolInit();
    }

}
