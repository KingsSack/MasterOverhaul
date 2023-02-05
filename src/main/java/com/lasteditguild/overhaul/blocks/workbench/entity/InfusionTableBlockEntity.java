package com.lasteditguild.overhaul.blocks.workbench.entity;

import com.lasteditguild.overhaul.blocks.workbench.WorkbenchInitializer;
import com.lasteditguild.overhaul.userinterface.InfusionTableScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;

public class InfusionTableBlockEntity extends LootableContainerBlockEntity implements ExtendedScreenHandlerFactory {

    private DefaultedList<ItemStack> items = DefaultedList.ofSize(size(), ItemStack.EMPTY);

    public InfusionTableBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(WorkbenchInitializer.INFUSION_TABLE_BlOCK_ENTITY, blockPos, blockState);
    }

    @Override
    protected DefaultedList<ItemStack> getInvStackList() {
        return items;
    }

    @Override
    protected void setInvStackList(DefaultedList<ItemStack> list) {
        this.items = list;
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable(getCachedState().getBlock().getTranslationKey());
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new InfusionTableScreenHandler(syncId, playerInventory, this);
    }

    @Override
    public int size() {
        return 3 * 3;
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(pos);
    }

}
