package com.Apothic0n.Enderoids.core.events;

import com.Apothic0n.Enderoids.Enderoids;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Enderoids.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonModEvents {
    @SubscribeEvent
    public static void respondToDamage(LivingHurtEvent event) {
        LivingEntity entity = event.getEntityLiving();
        Level level = entity.getLevel();
        float hp = entity.getHealth();
        float dmg = event.getAmount();
        int heartsLost = (int) Math.floor((Math.min(hp, dmg))*0.5);
        if (event.getSource().equals(DamageSource.FALL)) { //Cover the ground with your bones!
            ItemStack stackOfBones = new ItemStack(Items.BONE, heartsLost);
            ItemEntity boneStackEntity = new ItemEntity(level, entity.getX(), entity.getY(), entity.getZ(), stackOfBones);
            boneStackEntity.setDefaultPickUpDelay();
            level.addFreshEntity(boneStackEntity);
        } else if (event.getSource().equals(DamageSource.OUT_OF_WORLD)) {
            if (level.dimension().equals(Level.END)) {
                entity.teleportTo(entity.getX(), 321, entity.getZ());
            } else {
                entity.changeDimension(entity.getServer().getLevel(Level.END));
                entity.teleportTo(428, 75, 2);
            }
        }
    }
}
