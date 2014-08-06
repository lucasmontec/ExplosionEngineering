package main.java.explosionengineering.blocks;

import main.java.explosionengineering.TileEntity.TileEntityOven;
import main.java.explosionengineering.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * A slow cooking 'furnace' that can cook more than one stack of item.
 * This block has different reciepes.
 * 
 * @author Lucas M Carvalhaes
 * 
 */
public class Oven extends ExEBlock {

	public Oven() {
		super(Material.iron);
		setBlockName(Reference.blockOven);
		setResistance(6.0f);
		setHardness(2.0f);
	}

	@Override
	public boolean hasTileEntity(int meta) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntityOven();
	}
}
