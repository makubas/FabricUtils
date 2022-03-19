package me.makubas.ftils;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModInit implements ModInitializer {
	public static final String MODID = "ftils";
	public static final Logger LOGGER = LoggerFactory.getLogger("Fabric Utils");

	@Override
	public void onInitialize() {
		LOGGER.info("Fabric Utils in initialising...");
	}
}
