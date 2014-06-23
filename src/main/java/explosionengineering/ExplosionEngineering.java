package main.java.explosionengineering;

import main.java.explosionengineering.blocks.ExEBlocks;
import main.java.explosionengineering.core.proxy.CommonProxy;
import main.java.explosionengineering.items.ExEItems;
import main.java.explosionengineering.reference.Strings;
import main.java.explosionengineering.world.ExEOreGenerator;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExplosionEngineering.MODID, name = ExplosionEngineering.MODNAME, version = ExplosionEngineering.VERSION)
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

	@SidedProxy(clientSide = Strings.CLIENTPROXYLOCATION, serverSide = Strings.COMMONPROXYLOCATION)
	public static CommonProxy			proxy;

	/*
	 * Provide a 'safe' instance singleton to the entire mod structure
	 */
	@Instance
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

		/*
		 * Instantiate our blocks
		 */
		ExEBlocks.init();
		ExEItems.init();
		ExEOreGenerator.register();
		proxy.registerTileEntities();
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
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		/*
		 * Wrap things up after other mods
		 */
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
