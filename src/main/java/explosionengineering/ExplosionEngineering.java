package main.java.explosionengineering;

import main.java.explosionengineering.client.handler.KeyInputEventHandler;
import main.java.explosionengineering.handlers.ConfigurationHandler;
import main.java.explosionengineering.init.ExEBlocks;
import main.java.explosionengineering.init.ExEItems;
import main.java.explosionengineering.init.ExERecipes;
import main.java.explosionengineering.proxy.IProxy;
import main.java.explosionengineering.reference.Reference;
import main.java.explosionengineering.util.Log;
import main.java.explosionengineering.world.ExEOreGenerator;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExplosionEngineering.MODID, name = ExplosionEngineering.MODNAME, version = ExplosionEngineering.VERSION, guiFactory = Reference.GUIFACTORYCLASS)
public class ExplosionEngineering {

	/*
	 * Mod INFO
	 */
	public static final String			MODID			= "explosionengineering";
	public static final String			MODNAME			= "Explosion Engineering";
	public static final String			VERSION			= "1.7.2-0.1";
	public static final String			RESOURCESPREFIX	= MODID.toLowerCase() + ":";

	/**
	 * A creative tab for this mod
	 */
	private static CreativeTabs			exeTab			= new ExECreativeTab(CreativeTabs.getNextID(), MODID);

	@SidedProxy(clientSide = Reference.CLIENTPROXYLOCATION, serverSide = Reference.SERVERPROXYLOCATION)
	public static IProxy				proxy;

	/*
	 * Provide a 'safe' instance singleton to the entire mod structure
	 */
	@Instance(MODID)
	public static ExplosionEngineering	_instance;

	/*
	 * Those 3 event handlers run simultaneously with all mods
	 * All mods run those states at the same time
	 */

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		/*
		 * This is where you load:
		 * Network handeling
		 * Mod config
		 * Init items/blocks
		 */

		// Load configuration file (suggested name from forge)
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		proxy.registerKeyBindings();

		/*
		 * Instantiate our blocks
		 */
		ExEBlocks.init();
		ExEItems.init();
		ExEOreGenerator.register();
		// proxy.registerTileEntities();

		Log.info("Mod started loading (preinit complete). Preparing for explosions.");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		/*
		 * This is where you register:
		 * GUIs
		 * TileEntities
		 * CraftingRecipies
		 * 'General event handlers
		 */

		ExERecipes.init();

		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

		Log.info("Mod started loading (init complete). Warming up.");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		/*
		 * Wrap things up after other mods
		 */

		Log.info("Mod loaded! (postinit complete). BOOOOM.");
	}

	/**
	 * Get the mod creative tab
	 * 
	 * @return The mod active creative tab
	 */
	public static CreativeTabs getCreativeTab() {
		return exeTab;
	}
}
