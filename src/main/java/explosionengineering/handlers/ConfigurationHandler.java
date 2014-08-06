package main.java.explosionengineering.handlers;

import java.io.File;

import main.java.explosionengineering.ExplosionEngineering;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

/**
 * Handle all the mod configurations
 * 
 * @author Lucas M Carvalhaes
 * 
 */
public class ConfigurationHandler {

	public static Configuration	config;

	public static boolean		generateSulfur	= false;

	/**
	 * Initialize the mod configs using the config file
	 * 
	 * @param configFile
	 */
	public static void init(File configFile) {
		// Make a configuration object(forge) from the config file
		if (config == null) {
			config = new Configuration(configFile);
			loadConfiguration();
		}
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent evt) {
		if (evt.modID.equals(ExplosionEngineering.MODID)) {
			// resync config
			loadConfiguration();
		}
	}

	/**
	 * load the config file values
	 */
	private static void loadConfiguration() {
		generateSulfur = config.getBoolean(
				"generateSulfur",
				Configuration.CATEGORY_GENERAL,
				true,
				"Toggles world generation of sulfur");

		if (config.hasChanged()) {
			config.save();
		}
	}
}
