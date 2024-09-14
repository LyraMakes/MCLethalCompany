package info.lbrown.minecraft.lethalcraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LethalCraft implements ModInitializer {
	public static final String MOD_ID = "lethalcraft";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Starting LethalCraft initialization");
		LOGGER.info("Initializing items");
		LethalCraftItems.initialize();
		LOGGER.info("Done initializing items");
		LOGGER.info("Initializing blocks");
		LethalCraftBlocks.initialize();
		LOGGER.info("Done initializing blocks");
		LOGGER.info("Initializing sounds");
		LethalCraftSounds.initialize();
		LOGGER.info("Done initializing sounds");
		LOGGER.info("Initializing effects");
		LethalCraftEffects.initialize();
		LOGGER.info("Done initializing effects");
	}
}