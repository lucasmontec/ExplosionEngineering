package main.java.explosionengineering.world;

import java.util.Random;

import main.java.explosionengineering.blocks.ExEBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ExEOreGenerator implements IWorldGenerator {

	public static void register() {
		GameRegistry.registerWorldGenerator(new ExEOreGenerator(), 1);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
			case 0:
				generateSurface(random, chunkX * 16, chunkZ * 16, world);
				break;
			case 1:
				generateEnd(random, chunkX * 16, chunkZ * 16, world);
				break;
			case -1:
				generateNether(random, chunkX * 16, chunkZ * 16, world);
				break;
			default:
				;
		}
	}

	@SuppressWarnings("unused")
	private void generateNether(Random random, int i, int j, World world) {
		// Someday
	}

	@SuppressWarnings("unused")
	private void generateEnd(Random random, int i, int j, World world) {
		// Someday
	}

	/**
	 * Method to generate ores in the surface. Called from within the dimension switch on the
	 * {@link #generate(Random, int, int, World, IChunkProvider, IChunkProvider)} method.
	 * 
	 * @param random
	 *            The random object
	 * @param chunkX
	 *            The chunkX coordinate
	 * @param chunkZ
	 *            The chunkY coordinate
	 * @param world
	 *            The world beeing generated
	 */
	private void generateSurface(Random random, int chunkX, int chunkZ, World world) {
		addOreSpawn(ExEBlocks.sulfurOre, world, random, chunkX, chunkZ, 4, 6, 3, 8, 30);
	}

	/**
	 * Helper to add a ore spawn to the world.
	 * 
	 * @param block
	 *            The ore to spawn
	 * @param world
	 *            The world to modify
	 * @param random
	 *            The seed provider (MC random obj)
	 * @param blockXPos
	 *            the blockXpos of a chunk
	 * @param blockZPos
	 *            the blockZpos of a chunk
	 * @param minVainSize
	 *            The minimum vein size
	 * @param maxVainSize
	 *            The maximum vein size
	 * @param chancesToSpawn
	 *            How many veins per chunk
	 * @param minY
	 *            The min Y to start vein spawn (lowest point)
	 * @param maxY
	 *            The max Y to start vein spawn (highest point)
	 */
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos,
			int minVainSize, int maxVainSize, int chancesToSpawn, int minY, int maxY) {
		for (int i = 0; i < chancesToSpawn; i++) {
			int posX = blockXPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(16);
			new WorldGenMinable(block, (minVainSize + random.nextInt(maxVainSize - minVainSize)),
					Blocks.stone).generate(world, random, posX, posY, posZ);
		}
	}

}
