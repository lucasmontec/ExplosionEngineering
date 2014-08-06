package main.java.explosionengineering.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ExERecipes {

	public static void init() {
		/**
		 * This is temporary.
		 */
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.gunpowder, 8), new ItemStack(
				Blocks.sand), new ItemStack(Items.coal), "sulfurDust", "sulfurDust", new ItemStack(
				Items.water_bucket)));
	}

}
