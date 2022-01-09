package net.alexv531.alexvtest16.registry;

import net.alexv531.alexvtest16.AlienBatteryItem;
import net.alexv531.alexvtest16.AlexVTestMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item ALIEN_BATTERY = new AlienBatteryItem(new Item.Settings().group(ItemGroup.MATERIALS).maxDamage(10));

    //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem CONTAINER_TEST = new BlockItem(ModBlocks.CONTAINER_TEST, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem TEST_MODEL = new BlockItem(ModBlocks.TEST_MODEL, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PAPER_LAMP = new BlockItem(ModBlocks.PAPER_LAMP, new Item.Settings().group(ItemGroup.DECORATIONS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(AlexVTestMod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(AlexVTestMod.MOD_ID, "alien_battery"), ALIEN_BATTERY);

        Registry.register(Registry.ITEM, new Identifier(AlexVTestMod.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AlexVTestMod.MOD_ID, "container_test"), CONTAINER_TEST);
        Registry.register(Registry.ITEM, new Identifier(AlexVTestMod.MOD_ID, "test_model"), TEST_MODEL);
        Registry.register(Registry.ITEM, new Identifier(AlexVTestMod.MOD_ID, "paper_lamp"), PAPER_LAMP);
    }
}
