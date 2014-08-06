package main.java.explosionengineering.blocks;

import java.util.ArrayList;

import main.java.explosionengineering.init.ExEItems;
import main.java.explosionengineering.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SulfurOreBlock extends ExEBlock {

	public SulfurOreBlock() {
		super(Material.rock);
		setStepSound(soundTypeStone);
		setHardness(5.0f);
		setResistance(2.0f);
		setBlockName(Reference.SulfurOreBlockName);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		// Increase drop if fortune
		int randomMult = (fortune > 0 ? fortune : 1);
		// drop 1 to 4 * fotune increase
		int amount = randomMult * (random.nextInt(4) + 1);
		// Make the drop
		ArrayList<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(ExEItems.sulfur, amount));
		return items;
	}

	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
		// Drop 1 to 2 XP
		return random.nextInt(2) + 1;
	}

}
