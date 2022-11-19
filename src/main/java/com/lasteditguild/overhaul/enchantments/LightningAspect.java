package com.lasteditguild.overhaul.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;

public class LightningAspect extends Enchantment {

    public LightningAspect() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            LightningEntity lightning = new LightningEntity(EntityType.LIGHTNING_BOLT, target.world); // Create the lightning bolt
            lightning.setPosition(target.getPos()); // Set its position. This will make the lightning bolt strike the player (probably not what you want)
            target.world.spawnEntity(lightning); // Spawn the lightning entity
        }

        super.onTargetDamaged(user, target, level);
    }

}
