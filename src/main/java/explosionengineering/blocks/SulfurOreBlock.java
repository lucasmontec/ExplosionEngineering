package main.java.explosionengineering.blocks;

import java.util.ArrayList;

import main.java.explosionengineering.items.ExEItems;
import main.java.explosionengineering.reference.Strings;
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
		setBlockName(Strings.SulfurOreBlockName);
		ExEBlocks.register(this);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		int randomMult = (fortune > 0 ? fortune : 1);
		int amount = randomMult * (random.nextInt(4) + 1);
		ArrayList<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(ExEItems.sulfur, amount));
		return items;
	}

	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
		return random.nextInt(2) + 1;
	}

}
