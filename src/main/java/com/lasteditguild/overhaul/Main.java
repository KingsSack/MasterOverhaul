package com.lasteditguild.overhaul;

import com.lasteditguild.overhaul.blocks.BlockInitializer;
import com.lasteditguild.overhaul.blocks.ore.OreSpawning;
import com.lasteditguild.overhaul.enchantments.Enchantments;
import com.lasteditguild.overhaul.entities.mobs.MobInitializer;
import com.lasteditguild.overhaul.items.ItemInitializer;
import com.lasteditguild.overhaul.recipes.RecipeInitializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	public static final String MOD_ID = "overhaul";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		LOGGER.info("Initialized MasterOverhaul Mod!");

		Register();
	}

	void Register() {
		OreSpawning.OreInit();

		ItemInitializer.ItemInit();

		BlockInitializer.BlockInit();

		RecipeInitializer.RecipeInit();

		MobInitializer.MobInit();

		Enchantments.EnchantmentInit();
	}

}
