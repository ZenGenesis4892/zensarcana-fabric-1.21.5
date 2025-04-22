package net.zengenesis.zensarcana;

import net.fabricmc.api.ModInitializer;

import net.zengenesis.zensarcana.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZensArcana implements ModInitializer {
	public static final String MOD_ID = "zensarcana";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}