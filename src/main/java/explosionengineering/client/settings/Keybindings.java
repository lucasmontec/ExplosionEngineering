package main.java.explosionengineering.client.settings;

import main.java.explosionengineering.reference.Names;
import net.minecraft.client.settings.KeyBinding;

public class Keybindings {

	public static KeyBinding	charge	= new KeyBinding(Names.Keys.CHARGE, org.lwjgl.input.Keyboard.KEY_C,
												Names.Keys.CATEGORY);
	public static KeyBinding	release	= new KeyBinding(Names.Keys.RELEASE, org.lwjgl.input.Keyboard.KEY_R,
												Names.Keys.CATEGORY);
}
