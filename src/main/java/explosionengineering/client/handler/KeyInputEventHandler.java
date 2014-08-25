package main.java.explosionengineering.client.handler;

import main.java.explosionengineering.client.settings.Keybindings;
import main.java.explosionengineering.reference.Key;
import main.java.explosionengineering.util.Log;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyInputEventHandler {

	public static Key getPressedKeybinding() {
		if (Keybindings.charge.isPressed()) {
			return Key.CHARGE;
		} else if (Keybindings.release.isPressed()) {
			return Key.RELEASE;
		} else {
			return Key.UNKNOWN;
		}
	}

	@SubscribeEvent
	public void handleKeyInputEvent(KeyInputEvent evt) {
		Log.info(getPressedKeybinding());
	}

}
