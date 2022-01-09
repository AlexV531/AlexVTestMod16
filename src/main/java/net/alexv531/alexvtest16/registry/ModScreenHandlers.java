package net.alexv531.alexvtest16.registry;

import net.alexv531.alexvtest16.ContainerTestScreenHandler;
import net.alexv531.alexvtest16.AlexVTestMod;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {

    public static ScreenHandlerType<ContainerTestScreenHandler> CONTAINER_TEST_SCREEN_HANDLER;

    public static void registerScreenHandlers() {
        CONTAINER_TEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(AlexVTestMod.MOD_ID, "container_test"), ContainerTestScreenHandler::new);
    }

}
