package main.java.explosionengineering.core.proxy;

import main.java.explosionengineering.TileEntity.TileEntityOven;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityOven.class, "TileEntityOven");
	}

}
