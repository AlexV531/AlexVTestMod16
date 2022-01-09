package net.alexv531.alexvtest16;

import net.fabricmc.api.ModInitializer;

public class AlexVTestMod implements ModInitializer {

	public static final String MOD_ID = "alexvtest16";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		net.alexv531.alexvtest16.registry.ModItems.registerItems();
		net.alexv531.alexvtest16.registry.ModBlocks.registerBlocks();
		net.alexv531.alexvtest16.registry.ModScreenHandlers.registerScreenHandlers();
	}
}
