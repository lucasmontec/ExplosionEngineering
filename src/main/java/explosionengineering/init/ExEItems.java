package main.java.explosionengineering.init;

import main.java.explosionengineering.ExplosionEngineering;
import main.java.explosionengineering.items.ExEItem;
import main.java.explosionengineering.items.Sulfur;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Just like {@link ExEBlocks}! A Item instantiator/register.
 * 
 * @author Lucas M Carvalhaes
 * 
 */
@GameRegistry.ObjectHolder(ExplosionEngineering.MODID)
public class ExEItems {

	public static final ExEItem	sulfur	= new Sulfur();

	/**
	 * Create all item instances.
	 */
	public static void init() {
		register(sulfur);
		OreDictionary.registerOre("sulfurDust", sulfur);
		OreDictionary.registerOre("sulfurDust", new ItemStack(sulfur));
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
