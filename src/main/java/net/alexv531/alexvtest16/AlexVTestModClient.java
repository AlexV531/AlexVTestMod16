package net.alexv531.alexvtest16;

import net.alexv531.alexvtest16.registry.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class AlexVTestModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ScreenRegistry.register(ModScreenHandlers.CONTAINER_TEST_SCREEN_HANDLER, ContainerTestScreen::new);

        ModelLoadingRegistry.INSTANCE.registerResourceProvider(rm -> new TestModelProvider());
    }
}
