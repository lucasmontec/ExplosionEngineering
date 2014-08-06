package main.java.explosionengineering;

import main.java.explosionengineering.init.ExEItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Lets add a nice creative tab to our mod.
 * This defines a tab for this mod.
 * 
 * @author Lucas M Carvalhaes
 * 
 */
public class ExECreativeTab extends CreativeTabs {

	public ExECreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public Item getTabIconItem() {
		return ExEItems.sulfur;
	}

}
