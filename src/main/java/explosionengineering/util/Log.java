package main.java.explosionengineering.util;

import main.java.explosionengineering.ExplosionEngineering;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;

/**
 * Explosion Engineering Logger
 */
public class Log {

	public static void log(Level level, Object log) {
		FMLLog.log(ExplosionEngineering.MODID, level, String.valueOf(log));
	}

	/*
	 * SPECIFIC LEVELS
	 */

	/**
	 * Log event for informational purpouses
	 * 
	 * @param log
	 */
	public static void info(Object log) {
		log(Level.INFO, log);
	}

	/**
	 * Possibly recoverable error
	 * 
	 * @param log
	 */
	public static void error(Object log) {
		log(Level.ERROR, log);
	}

	/**
	 * General debugging event
	 * 
	 * @param log
	 */
	public static void debug(Object log) {
		log(Level.DEBUG, log);
	}

	/**
	 * Non recoverable error
	 * 
	 * @param log
	 */
	public static void fatal(Object log) {
		log(Level.FATAL, log);
	}

	/**
	 * Fine debug information (inner method workings)
	 * 
	 * @param log
	 */
	public static void trace(Object log) {
		log(Level.TRACE, log);
	}

	/**
	 * Something that may generate an error
	 * 
	 * @param log
	 */
	public static void warn(Object log) {
		log(Level.WARN, log);
	}

	/*
	 * GENERIC LEVELS
	 */

	public static void off(Object log) {
		log(Level.OFF, log);
	}

	public static void all(Object log) {
		log(Level.ALL, log);
	}
}
