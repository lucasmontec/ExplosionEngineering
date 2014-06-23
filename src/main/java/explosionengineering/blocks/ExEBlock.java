package main.java.explosionengineering.blocks;

import java.util.Random;

import main.java.explosionengineering.ExplosionEngineering;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * This is the mod 'backbone' block class.
 * This class provides implementation of stuff that should be in forge by default.
 * Also adds stuff to our blocks that this mod needs!
 * 
 * @author Lucas M Carvalhaes
 * 
 */
public class ExEBlock extends Block {

	/**
	 * Random helper
	 */
	protected Random	random	= new Random();

	/**
	 * Default constructor defaults material to {@link Material#rock};
	 */
	public ExEBlock() {
		super(Material.rock);
	}

	public ExEBlock(Material mat) {
		super(mat);
	}

	{
		setCreativeTab(ExplosionEngineering.getCreativeTab());
	}

	/**
	 * Automatically remove the .tile from the block name
	 * 
	 * @param unlocalizedName
	 *            The block name without localization tags
	 * @return The pure block name
	 */
	public String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

	@Override
	public String getUnlocalizedName() {
		return "tile." + ExplosionEngineering.RESOURCESPREFIX
				+ getUnwrappedUnlocalizedName(super.getUnlocalizedName());
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * Automagically register our block textures
	 */
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(ExplosionEngineering.RESOURCESPREFIX
				+ getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
}
