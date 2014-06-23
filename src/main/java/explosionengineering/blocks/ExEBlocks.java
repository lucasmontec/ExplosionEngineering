package main.java.explosionengineering.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * This class handles all block instantiations/registrations
 * 
 * @author Lucas M Carvalhaes
 * 
 */
public class ExEBlocks {

	public static Block	sulfurOre;

	/**
	 * Create all block instances
	 */
	public static void init() {
		sulfurOre = new SulfurOreBlock();
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
