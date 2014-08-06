package main.java.explosionengineering.init;

import main.java.explosionengineering.ExplosionEngineering;
import main.java.explosionengineering.blocks.ExEBlock;
import main.java.explosionengineering.blocks.SulfurOreBlock;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * This class handles all block instantiations/registrations
 * 
 * @author Lucas M Carvalhaes
 * 
 */
@GameRegistry.ObjectHolder(ExplosionEngineering.MODID)
public class ExEBlocks {

	public static final ExEBlock	sulfurOre	= new SulfurOreBlock();

	/**
	 * Create all block instances
	 */
	public static void init() {
		register(sulfurOre);
	}

	/**
	 * Registers the block at the GameRegistry.
	 * This registers using the name provided by the {@link ExEBlock#getUnwrappedUnlocalizedName(String)}.
	 * This passes to that method the method {@link ExEBlock#getUnlocalizedName()}.
	 * 
	 * @param block
	 *            The block to be registered
	 */
	public static void register(ExEBlock block) {
		GameRegistry.registerBlock(block, block.getUnwrappedUnlocalizedName(block.getUnlocalizedName()));
	}

}
