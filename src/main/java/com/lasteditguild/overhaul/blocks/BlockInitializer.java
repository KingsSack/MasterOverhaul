package com.lasteditguild.overhaul.blocks;

import com.lasteditguild.overhaul.blocks.ore.AlexandriteOreRegistry;
import com.lasteditguild.overhaul.blocks.workbench.WorkbenchInitializer;

public class BlockInitializer {

    public static void BlockInit() {
        WorkbenchInitializer.WorkbenchInit();

        AlexandriteOreRegistry.AlexandriteOreInit();
    }

}
