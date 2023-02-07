package com.lasteditguild.overhaul.blocks.workbench;

import com.lasteditguild.overhaul.userinterface.InfusionTableScreenHandler;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.*;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class InfusionTableBlock extends CraftingTableBlock {

    private static final Text SCREEN_TITLE = Text.translatable("container.upgrade");

    public InfusionTableBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> {
            return new InfusionTableScreenHandler(syncId, inventory, ScreenHandlerContext.create(world, pos));
        }, SCREEN_TITLE);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        } else {
            player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
            // player.incrementStat(Stats.INTERACT_WITH_SMITHING_TABLE);
            return ActionResult.CONSUME;
        }
    }

}
