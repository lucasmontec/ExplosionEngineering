package main.java.explosionengineering.items;

import main.java.explosionengineering.ExplosionEngineering;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ExEItem extends Item {

	{
		setCreativeTab(ExplosionEngineering.getCreativeTab());
	}

	/**
	 * Automatically remove the .item from the item name
	 * 
	 * @param unlocalizedName
	 *            The item name without localization tags
	 * @return The pure item name
	 */
	public String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

	@Override
	public String getUnlocalizedName() {
		return "item." + ExplosionEngineering.RESOURCESPREFIX
				+ getUnwrappedUnlocalizedName(super.getUnlocalizedName());
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return "item." + ExplosionEngineering.RESOURCESPREFIX
				+ getUnwrappedUnlocalizedName(super.getUnlocalizedName());
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * Automagically register our item textures
	 */
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(ExplosionEngineering.RESOURCESPREFIX
				+ getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

}
