package net.alexv531.alexvtest16.registry;

import net.alexv531.alexvtest16.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block TEST_MODEL = new Block(FabricBlockSettings.copyOf(Blocks.GLASS));

    public static final PaperLampBlock PAPER_LAMP = new PaperLampBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK));

    public static final RubyBlock RUBY_BLOCK = new RubyBlock(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0f)
            .sounds(BlockSoundGroup.METAL)
            .luminance(15));

    public static BlockEntityType<RubyBlockEntity> RUBY_BLOCK_ENTITY;

    public static final Block CONTAINER_TEST = new ContainerTest(FabricBlockSettings.copyOf(Blocks.CHEST));

    public static BlockEntityType<ContainerTestEntity> CONTAINER_TEST_ENTITY;

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(AlexVTestMod.MOD_ID, "test_model"), TEST_MODEL);

        Registry.register(Registry.BLOCK, new Identifier(AlexVTestMod.MOD_ID, "paper_lamp"), PAPER_LAMP);

        Registry.register(Registry.BLOCK, new Identifier(AlexVTestMod.MOD_ID, "ruby_block"), RUBY_BLOCK);
        RUBY_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AlexVTestMod.MOD_ID, "ruby_block"), BlockEntityType.Builder.create(RubyBlockEntity::new, RUBY_BLOCK).build(null));

        Registry.register(Registry.BLOCK, new Identifier(AlexVTestMod.MOD_ID, "container_test"), CONTAINER_TEST);
        CONTAINER_TEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AlexVTestMod.MOD_ID, "container_test"), BlockEntityType.Builder.create(ContainerTestEntity::new, CONTAINER_TEST).build(null));

    }
}


