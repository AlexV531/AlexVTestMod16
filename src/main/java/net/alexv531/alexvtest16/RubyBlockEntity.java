package net.alexv531.alexvtest16;

import net.alexv531.alexvtest16.registry.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.collection.DefaultedList;

public class RubyBlockEntity extends BlockEntity implements ImplementedInventory {

    // The list of items in the inventory
    private final DefaultedList<ItemStack> items = DefaultedList.ofSize(2, ItemStack.EMPTY);

    // Some random piece of data
    private int number = 7;

    public RubyBlockEntity() {
        super(ModBlocks.RUBY_BLOCK_ENTITY);
        number = (int)(Math.random()*10+1);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return items;
    }

    public int getNumber() {
        return number;
    }

    // Serialize the BlockEntity
    @Override
    public CompoundTag toTag(CompoundTag tag) {

        Inventories.toTag(tag,items);

        super.toTag(tag);
        // Save the current value of the number to the tag
        tag.putInt("number", number);
        return tag;
    }

    // Deserialize the BlockEntity
    @Override
    public void fromTag(BlockState state, CompoundTag tag) {
        super.fromTag(state, tag);
        Inventories.fromTag(tag,items);
        number = tag.getInt("number");
    }

}
