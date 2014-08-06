package main.java.explosionengineering.client.gui;

import main.java.explosionengineering.ExplosionEngineering;
import main.java.explosionengineering.handlers.ConfigurationHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig {

	public ModGuiConfig(GuiScreen guiScreen) {
		super(guiScreen, new ConfigElement(
				ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				ExplosionEngineering.MODID, false, false, GuiConfig
						.getAbridgedConfigPath(ConfigurationHandler.config.toString()));
	}
}
