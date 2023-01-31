package com.Apothic0n.Enderoids.core.events;

import com.Apothic0n.Enderoids.Enderoids;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.joml.Vector3d;
import org.joml.Vector3dc;
import org.valkyrienskies.core.api.ships.PhysShip;
import org.valkyrienskies.core.api.ships.ServerShip;
import org.valkyrienskies.core.impl.api.ShipForcesInducer;
import org.valkyrienskies.core.impl.datastructures.DenseBlockPosSet;
import org.valkyrienskies.eureka.ship.EurekaShipControl;
import org.valkyrienskies.mod.common.assembly.ShipAssemblyKt;

import java.util.Random;

import static net.minecraft.world.level.block.Block.UPDATE_CLIENTS;

@Mod.EventBusSubscriber(modid = Enderoids.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonModEvents {

    public static BlockState pickBlock(BlockState primary, BlockState secondary, Integer purity, Integer erosion) {
        Random rand = new Random();
        Random rand2 = new Random();
        if (rand.nextInt(100) + 1 < erosion) {
            return Blocks.AIR.defaultBlockState();
        }
        if (rand2.nextInt(100) + 1 < purity) {
            return secondary;
        }
        return primary;
    }

    public static void makeSquare(Level world, BlockPos origin, BlockState primary, BlockState secondary, Integer purity, Integer erosion) {
        world.setBlock(origin, pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
        world.setBlock(origin.north(), pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
        world.setBlock(origin.north().east(), pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
        world.setBlock(origin.north().west(), pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
        world.setBlock(origin.east(), pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
        world.setBlock(origin.south(), pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
        world.setBlock(origin.south().east(), pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
        world.setBlock(origin.south().west(), pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
        world.setBlock(origin.west(), pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
    }

    public static void makeSmallSquare(Level world, BlockPos origin, BlockState primary, BlockState secondary, Integer purity, Integer erosion) {
        world.setBlock(origin, Blocks.END_STONE.defaultBlockState(), UPDATE_CLIENTS);
        world.setBlock(origin.north(), pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
        world.setBlock(origin.east(), pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
        world.setBlock(origin.north().east(), pickBlock(primary, secondary, purity, erosion), UPDATE_CLIENTS);
    }

    private static int enderoidCD = 200;

    @SubscribeEvent
    public static void serverTicked(TickEvent.WorldTickEvent event) {
        Level level = event.world;
        if (!level.isClientSide() && level.dimension() == Level.END) {
            enderoidCD--;
            if (enderoidCD <= 0) {
                enderoidCD = 40;
                ServerLevel serverLevel = level.getServer().getLevel(Level.END);
                if (serverLevel != null) {
                    Iterable<Entity> entities = serverLevel.getEntities().getAll();
                    for (Entity entity : entities) {
                        if (entity.getType() == EntityType.PLAYER && entity.blockPosition().getY() <= 240) {
                            Random rand = new Random();
                            BlockPos enderoidPos = entity.blockPosition().atY(250).north((rand.nextInt(150) + 1)).east((rand.nextInt(150) + 1)).south((rand.nextInt(150) + 1)).west((rand.nextInt(150) + 1));
                            DenseBlockPosSet allBlocks = new DenseBlockPosSet();
                            allBlocks.add(enderoidPos.getX(), enderoidPos.getY(), enderoidPos.getZ());
                            if (rand.nextInt(100) + 1 < 40) { //40% chance to spawn normal-sized enderoid
                                makeSquare(level, enderoidPos.above(), Blocks.STONE.defaultBlockState(), Blocks.ANDESITE.defaultBlockState(), 20, 15);
                                makeSquare(level, enderoidPos, Blocks.ANDESITE.defaultBlockState(), Blocks.TUFF.defaultBlockState(), 60, 0);
                                makeSquare(level, enderoidPos.below(), Blocks.ANDESITE.defaultBlockState(), Blocks.TUFF.defaultBlockState(), 90, 40);

                                allBlocks.add(enderoidPos.above().getX(), enderoidPos.above().getY(), enderoidPos.above().getZ());
                                allBlocks.add(enderoidPos.above().north().getX(), enderoidPos.above().north().getY(), enderoidPos.above().north().getZ());
                                allBlocks.add(enderoidPos.above().east().getX(), enderoidPos.above().east().getY(), enderoidPos.above().east().getZ());
                                allBlocks.add(enderoidPos.above().south().getX(), enderoidPos.above().south().getY(), enderoidPos.above().south().getZ());
                                allBlocks.add(enderoidPos.above().west().getX(), enderoidPos.above().west().getY(), enderoidPos.above().west().getZ());
                                allBlocks.add(enderoidPos.above().north().east().getX(), enderoidPos.above().north().east().getY(), enderoidPos.above().north().east().getZ());
                                allBlocks.add(enderoidPos.above().north().west().getX(), enderoidPos.above().north().west().getY(), enderoidPos.above().north().west().getZ());
                                allBlocks.add(enderoidPos.above().south().east().getX(), enderoidPos.above().north().east().getY(), enderoidPos.above().north().east().getZ());
                                allBlocks.add(enderoidPos.above().south().west().getX(), enderoidPos.above().north().west().getY(), enderoidPos.above().north().west().getZ());

                                allBlocks.add(enderoidPos.north().getX(), enderoidPos.north().getY(), enderoidPos.north().getZ());
                                allBlocks.add(enderoidPos.east().getX(), enderoidPos.east().getY(), enderoidPos.east().getZ());
                                allBlocks.add(enderoidPos.south().getX(), enderoidPos.south().getY(), enderoidPos.south().getZ());
                                allBlocks.add(enderoidPos.west().getX(), enderoidPos.west().getY(), enderoidPos.west().getZ());
                                allBlocks.add(enderoidPos.north().east().getX(), enderoidPos.north().east().getY(), enderoidPos.north().east().getZ());
                                allBlocks.add(enderoidPos.north().west().getX(), enderoidPos.north().west().getY(), enderoidPos.north().west().getZ());
                                allBlocks.add(enderoidPos.south().east().getX(), enderoidPos.north().east().getY(), enderoidPos.north().east().getZ());
                                allBlocks.add(enderoidPos.south().west().getX(), enderoidPos.north().west().getY(), enderoidPos.north().west().getZ());

                                allBlocks.add(enderoidPos.below().getX(), enderoidPos.below().getY(), enderoidPos.below().getZ());
                                allBlocks.add(enderoidPos.below().north().getX(), enderoidPos.below().north().getY(), enderoidPos.below().north().getZ());
                                allBlocks.add(enderoidPos.below().east().getX(), enderoidPos.below().east().getY(), enderoidPos.below().east().getZ());
                                allBlocks.add(enderoidPos.below().south().getX(), enderoidPos.below().south().getY(), enderoidPos.below().south().getZ());
                                allBlocks.add(enderoidPos.below().west().getX(), enderoidPos.below().west().getY(), enderoidPos.below().west().getZ());
                                allBlocks.add(enderoidPos.below().north().east().getX(), enderoidPos.below().north().east().getY(), enderoidPos.below().north().east().getZ());
                                allBlocks.add(enderoidPos.below().north().west().getX(), enderoidPos.below().north().west().getY(), enderoidPos.below().north().west().getZ());
                                allBlocks.add(enderoidPos.below().south().east().getX(), enderoidPos.below().north().east().getY(), enderoidPos.below().north().east().getZ());
                                allBlocks.add(enderoidPos.below().south().west().getX(), enderoidPos.below().north().west().getY(), enderoidPos.below().north().west().getZ());

                                ServerShip ship = ShipAssemblyKt.createNewShipWithBlocks(enderoidPos, allBlocks, serverLevel);
                            } else { //60% chance to spawn smaller sized enderoid
                                makeSmallSquare(level, enderoidPos.above(), Blocks.STONE.defaultBlockState(), Blocks.ANDESITE.defaultBlockState(), 20, 0);
                                makeSmallSquare(level, enderoidPos, Blocks.ANDESITE.defaultBlockState(), Blocks.TUFF.defaultBlockState(), 60, 20);

                                allBlocks.add(enderoidPos.above().getX(), enderoidPos.above().getY(), enderoidPos.above().getZ());
                                allBlocks.add(enderoidPos.above().north().getX(), enderoidPos.above().north().getY(), enderoidPos.above().north().getZ());
                                allBlocks.add(enderoidPos.above().east().getX(), enderoidPos.above().east().getY(), enderoidPos.above().east().getZ());
                                allBlocks.add(enderoidPos.above().north().east().getX(), enderoidPos.above().north().east().getY(), enderoidPos.above().north().east().getZ());

                                allBlocks.add(enderoidPos.north().getX(), enderoidPos.north().getY(), enderoidPos.north().getZ());
                                allBlocks.add(enderoidPos.east().getX(), enderoidPos.east().getY(), enderoidPos.east().getZ());
                                allBlocks.add(enderoidPos.north().east().getX(), enderoidPos.north().east().getY(), enderoidPos.north().east().getZ());

                                ServerShip ship = ShipAssemblyKt.createNewShipWithBlocks(enderoidPos, allBlocks, serverLevel);
                            }
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void blockPlaced(BlockEvent.EntityPlaceEvent event) {
        if (event.getPos().getY() >= 240) {
            if (event.getEntity().getType() == EntityType.PLAYER && event.getEntity().getLevel().dimension() == Level.END) {
                event.setCanceled(true);
                Player plr = (Player) event.getEntity();
                plr.displayClientMessage(new TranslatableComponent("build.tooHighEnd"), true);
                event.getWorld().addFreshEntity(new ItemEntity(plr.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(event.getPlacedBlock().getBlock().asItem(), 1)));
            }
        }
    }

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
                if (entity instanceof ServerPlayer plr) {
                    plr.getCooldowns().addCooldown(Items.INK_SAC, 200);
                }
            }
        }
    }

    @SubscribeEvent
    public static void playerFall(LivingFallEvent event) {
        LivingEntity livingEntity = event.getEntityLiving();
        if (livingEntity instanceof ServerPlayer serverPlayer) {
            if (serverPlayer.getCooldowns().isOnCooldown(Items.INK_SAC)) {
                event.setCanceled(true);
            }
        }
    }
}
