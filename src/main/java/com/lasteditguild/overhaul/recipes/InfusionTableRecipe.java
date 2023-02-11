package com.lasteditguild.overhaul.recipes;

import com.google.gson.JsonObject;
import com.lasteditguild.overhaul.blocks.workbench.WorkbenchInitializer;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.world.World;

import java.util.stream.Stream;

public class InfusionTableRecipe implements Recipe<Inventory> {
    final Ingredient base;
    final Ingredient addition;
    final ItemStack result;
    private final Identifier id;

    public InfusionTableRecipe(Identifier id, Ingredient base, Ingredient addition, ItemStack result) {
        this.id = id;
        this.base = base;
        this.addition = addition;
        this.result = result;
    }

    public boolean matches(Inventory inventory, World world) {
        return this.base.test(inventory.getStack(0)) && this.addition.test(inventory.getStack(1));
    }

    public ItemStack craft(Inventory inventory) {
        ItemStack itemStack = this.result.copy();
        NbtCompound nbtCompound = inventory.getStack(0).getNbt();
        if (nbtCompound != null) {
            itemStack.setNbt(nbtCompound.copy());
        }

        return itemStack;
    }

    public boolean fits(int width, int height) {
        return width * height >= 2;
    }

    public ItemStack getOutput() {
        return this.result;
    }

    public boolean testAddition(ItemStack stack) {
        return this.addition.test(stack);
    }

    public ItemStack createIcon() {
        return new ItemStack(WorkbenchInitializer.INFUSION_TABLE);
    }

    public Identifier getId() {
        return this.id;
    }

    public RecipeSerializer<?> getSerializer() {
        return Serializer.INFUSION;
    }

    public RecipeType<?> getType() {
        return Type.INFUSION;
    }

    public boolean isEmpty() {
        return Stream.of(this.base, this.addition).anyMatch((ingredient) -> {
            return ingredient.getMatchingStacks().length == 0;
        });
    }

    public static class Type implements RecipeType<InfusionTableRecipe> {
        private Type() { }
        public static final Type INFUSION = new Type();
        public static final String ID = "infusion_table";
    }

    public static class Serializer implements RecipeSerializer<InfusionTableRecipe> {
        public static final Serializer INFUSION = new Serializer();
        public static final String ID = "infusion_table";

        public Serializer() { }

        public InfusionTableRecipe read(Identifier identifier, JsonObject jsonObject) {
            Ingredient ingredient = Ingredient.fromJson(JsonHelper.getObject(jsonObject, "base"));
            Ingredient ingredient2 = Ingredient.fromJson(JsonHelper.getObject(jsonObject, "addition"));
            ItemStack itemStack = ShapedRecipe.outputFromJson(JsonHelper.getObject(jsonObject, "result"));
            return new InfusionTableRecipe(identifier, ingredient, ingredient2, itemStack);
        }

        public InfusionTableRecipe read(Identifier identifier, PacketByteBuf packetByteBuf) {
            Ingredient ingredient = Ingredient.fromPacket(packetByteBuf);
            Ingredient ingredient2 = Ingredient.fromPacket(packetByteBuf);
            ItemStack itemStack = packetByteBuf.readItemStack();
            return new InfusionTableRecipe(identifier, ingredient, ingredient2, itemStack);
        }

        public void write(PacketByteBuf packetByteBuf, InfusionTableRecipe infusionTableRecipe) {
            infusionTableRecipe.base.write(packetByteBuf);
            infusionTableRecipe.addition.write(packetByteBuf);
            packetByteBuf.writeItemStack(infusionTableRecipe.result);
        }
    }
}
