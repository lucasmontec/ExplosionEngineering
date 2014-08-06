package main.java.explosionengineering.proxy;

import main.java.explosionengineering.TileEntity.TileEntityOven;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class CommonProxy implements IProxy {

	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityOven.class, "TileEntityOven");
	}

}
