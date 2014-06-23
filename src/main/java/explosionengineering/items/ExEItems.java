package main.java.explosionengineering.items;

import main.java.explosionengineering.blocks.ExEBlocks;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Just like {@link ExEBlocks}! A Item instantiator/register.
 * 
 * @author Lucas M Carvalhaes
 * 
 */
public class ExEItems {

	public static ExEItem	sulfur;

	/**
	 * Create all item instances.
	 */
	public static void init() {
		sulfur = new Sulfur();
	}

	/**
	 * Useful method to register a item to the {@link GameRegistry}.
	 * 
	 * @param item
	 *            Register a {@link ExEItem} using proper code.
	 */
	public static void register(ExEItem item) {
		GameRegistry.registerItem(item, item.getUnwrappedUnlocalizedName(item.getUnlocalizedName()));
	}

}
