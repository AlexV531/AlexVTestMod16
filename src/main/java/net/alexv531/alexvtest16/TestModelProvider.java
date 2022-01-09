package net.alexv531.alexvtest16;

import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelProviderException;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;

public class TestModelProvider implements ModelResourceProvider {

    public static final TestModel TEST_MODEL = new TestModel();
    public static final Identifier TEST_MODEL_BLOCK = new Identifier("alexvtest:block/test_model");
    public static final Identifier TEST_MODEL_ITEM = new Identifier("alexvtest:item/test_model");

    @Override
    public UnbakedModel loadModelResource(Identifier identifier, ModelProviderContext modelProviderContext) throws ModelProviderException {
        if(identifier.equals(TEST_MODEL_BLOCK) || identifier.equals(TEST_MODEL_ITEM)) {
            return TEST_MODEL;
        } else {
            return null;
        }
    }
}
