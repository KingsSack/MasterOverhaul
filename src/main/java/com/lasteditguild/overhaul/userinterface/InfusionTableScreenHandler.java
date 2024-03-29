package com.lasteditguild.overhaul.userinterface;


import com.lasteditguild.overhaul.blocks.workbench.WorkbenchInitializer;
import com.lasteditguild.overhaul.recipes.InfusionTableRecipe;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ForgingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class InfusionTableScreenHandler extends ForgingScreenHandler {

    private final World world;
    @Nullable
    private InfusionTableRecipe currentRecipe;
    private final List<InfusionTableRecipe> recipes;

    public InfusionTableScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, ScreenHandlerContext.EMPTY);
    }

    public InfusionTableScreenHandler(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(ScreenHandlerType.SMITHING, syncId, playerInventory, context);
        this.world = playerInventory.player.world;
        this.recipes = this.world.getRecipeManager().listAllOfType(InfusionTableRecipe.Type.INFUSION);
    }

    protected boolean canUse(BlockState state) {
        return state.isOf(WorkbenchInitializer.INFUSION_TABLE);
    }

    protected boolean canTakeOutput(PlayerEntity player, boolean present) {
        return this.currentRecipe != null && this.currentRecipe.matches(this.input, this.world);
    }

    protected void onTakeOutput(PlayerEntity player, ItemStack stack) {
        stack.onCraft(player.world, player, stack.getCount());
        this.output.unlockLastRecipe(player);
        this.decrementStack(0);
        this.decrementStack(1);
        this.context.run((world, pos) -> {
            world.syncWorldEvent(1044, pos, 0);
        });
    }

    private void decrementStack(int slot) {
        ItemStack itemStack = this.input.getStack(slot);
        itemStack.decrement(1);
        this.input.setStack(slot, itemStack);
    }

    public void updateResult() {
        List<InfusionTableRecipe> list = this.world.getRecipeManager().getAllMatches(InfusionTableRecipe.Type.INFUSION, this.input, this.world);
        if (list.isEmpty()) {
            this.output.setStack(0, ItemStack.EMPTY);
        } else {
            this.currentRecipe = (InfusionTableRecipe) list.get(0);
            ItemStack itemStack = this.currentRecipe.craft(this.input);
            this.output.setLastRecipe(this.currentRecipe);
            this.output.setStack(0, itemStack);
        }

    }

    protected boolean isUsableAsAddition(ItemStack stack) {
        return this.recipes.stream().anyMatch((recipe) -> {
            return recipe.testAddition(stack);
        });
    }

    public boolean canInsertIntoSlot(ItemStack stack, Slot slot) {
        return slot.inventory != this.output && super.canInsertIntoSlot(stack, slot);
    }

    @Override
    public ScreenHandlerType<?> getType() {
        return WorkbenchInitializer.INFUSION_TABLE_SCREEN_HANDLER;
    }

}
