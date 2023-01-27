package com.Apothic0n.Enderoids.api.biome.features.types;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import static net.minecraft.world.level.block.Block.UPDATE_NONE;

public class EndShipFeature extends Feature<NoneFeatureConfiguration> {
    public EndShipFeature(Codec<NoneFeatureConfiguration> pContext) {super(pContext);}
    private static final BlockPos SHIP_OFFSET = new BlockPos(420, 64, 0);
    private static final ChunkPos SHIP_ORIGIN_CHUNK = new ChunkPos(SHIP_OFFSET);
    
    private final BlockState Balloon = Registry.BLOCK.get(new ResourceLocation("vs_eureka", "balloon")).defaultBlockState();
    private final BlockState PurPillar = Blocks.PURPUR_PILLAR.defaultBlockState();
    private final BlockState PurPur = Blocks.PURPUR_BLOCK.defaultBlockState();
    private final BlockState PurStairs = Blocks.PURPUR_STAIRS.defaultBlockState();
    private final BlockState PurSlab = Blocks.PURPUR_SLAB.defaultBlockState();
    private final BlockState EndRod = Blocks.END_ROD.defaultBlockState();
    private final BlockState EndBrick = Blocks.END_STONE_BRICKS.defaultBlockState();
    private final BlockState Glass = Blocks.MAGENTA_STAINED_GLASS.defaultBlockState();
    private final BlockState Ladder = Blocks.LADDER.defaultBlockState();

    private static int checkerboardDistance(int chunkX, int chunkZ, int originX, int originZ) {
        return Math.max(Math.abs(chunkX - originX), Math.abs(chunkZ - originZ));
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {
        WorldGenLevel worldgenlevel = pContext.level();
        ChunkPos chunkPos = new ChunkPos(pContext.origin());
        if (checkerboardDistance(chunkPos.x, chunkPos.z, SHIP_ORIGIN_CHUNK.x, SHIP_ORIGIN_CHUNK.z) > 1 || !worldgenlevel.getBlockState(new BlockPos(428, 64, 0)).isAir()) {
            return true;
        } else {
            worldgenlevel.setBlock(new BlockPos(428, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 64, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(429, 65, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 65, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 65, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 65, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 65, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 65, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 65, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 65, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 65, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 65, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 65, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 65, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 65, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 65, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 65, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 65, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 65, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(429, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 65, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 65, 1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(429, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 65, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 65, -1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(426, 65, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 65, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 65, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(426, 65, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 65, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 65, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(430, 66, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 66, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 66, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 66, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 66, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 66, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 66, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 66, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 66, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 66, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 66, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 66, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 66, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 66, 1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 66, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 66, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 66, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 66, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 66, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 66, -1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 66, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 66, 2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 66, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 66, -2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 66, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 66, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 66, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 66, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 66, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 66, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 66, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 66, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(430, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 67, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 67, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 67, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 67, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 67, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 67, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 67, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(410, 67, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 67, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 67, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 67, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 67, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 67, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 67, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 67, 1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 67, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 67, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 67, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 67, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 67, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 67, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 67, -1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 67, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 67, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 67, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 67, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 67, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 67, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 67, 2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 67, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 67, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 67, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 67, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 67, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 67, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 67, -2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 67, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 67, 3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 67, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 67, -3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 67, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 67, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 67, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 67, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 67, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 67, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 67, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 67, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(431, 68, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 68, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 68, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 68, 0), Blocks.SHULKER_BOX.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 68, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(410, 68, 0), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 68, 1), Blocks.CHEST.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 68, 1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, -1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 68, -1), Blocks.CHEST.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 68, -1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 68, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 68, 2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 68, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 68, -2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, 3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, 3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, 3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, 3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 68, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 68, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 68, 3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, -3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, -3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, -3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, -3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 68, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 68, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 68, -3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 68, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 68, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 68, 4), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 68, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 68, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 68, -4), PurPur, UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(432, 69, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 69, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 69, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 69, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 69, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 69, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 69, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 69, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 69, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 69, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            ItemFrame itemframe = new ItemFrame(worldgenlevel.getLevel(), new BlockPos(412, 69, 0), Direction.EAST);
            itemframe.setItem(new ItemStack(Items.ELYTRA), false);
            worldgenlevel.getLevel().addFreshEntity(itemframe);
            worldgenlevel.setBlock(new BlockPos(411, 69, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(410, 69, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(409, 69, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 69, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 69, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 69, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 69, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 69, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 69, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 69, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 69, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 69, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 69, 1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 69, -1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 69, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 69, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 69, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 69, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 69, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 69, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 69, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 69, -1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 69, -1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 69, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 69, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 69, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 69, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 69, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 69, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 69, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 69, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 69, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 69, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 69, 2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 69, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 69, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 69, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 69, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 69, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 69, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 69, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 69, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 69, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 69, -2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 69, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 69, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 69, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 69, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 69, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 69, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 69, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 69, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 69, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 69, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 69, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 69, 3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 69, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 69, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 69, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 69, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 69, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 69, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 69, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 69, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 69, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 69, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 69, -3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 69, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 69, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 69, 4), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 69, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 69, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 69, -4), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 69, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_LEFT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 69, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 69, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 69, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 69, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 69, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 69, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 69, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_LEFT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 69, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 69, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 69, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_LEFT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 69, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 69, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 69, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 69, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 69, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 69, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 69, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_RIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 69, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 69, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(431, 70, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 70, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 70, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 70, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 70, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 70, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 70, 0), EndRod.setValue(BlockStateProperties.FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(410, 70, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(409, 70, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(408, 70, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 70, 1), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 70, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 70, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 70, 1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 70, -1), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 70, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 70, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 70, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 70, -1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 70, 2), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 70, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 70, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 70, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 70, 2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 70, -2), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 70, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 70, -2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 70, 3), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 70, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 70, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 70, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 70, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 70, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 70, 3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 70, -3), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 70, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 70, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 70, -3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 70, 4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 70, 4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 70, 4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 70, 4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 70, 4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 70, 4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 70, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 70, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 70, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 70, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 70, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 70, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 70, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 70, 4), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 70, -4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 70, -4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 70, -4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 70, -4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 70, -4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 70, -4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 70, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 70, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 70, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 70, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 70, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 70, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 70, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 70, -4), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 70, 5), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 70, 5), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 70, -5), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 70, -5), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(431, 71, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 71, 0), Blocks.BREWING_STAND.defaultBlockState(), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 71, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 71, 0), Glass, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(410, 71, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(409, 71, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(408, 71, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(407, 71, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(406, 71, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 71, 1), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 71, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 71, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(410, 71, 1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 71, -1), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 71, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(410, 71, -1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 71, 2), Glass, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 71, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 71, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 71, 2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 71, -2), Glass, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 71, -2), PurSlab.setValue(BlockStateProperties.SLAB_TYPE, SlabType.TOP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 71, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 71, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 71, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 71, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 71, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 71, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 71, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 71, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 71, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 71, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 71, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 71, -2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 71, 3), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 71, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 71, 3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 71, -3), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 71, -3), PurSlab.setValue(BlockStateProperties.SLAB_TYPE, SlabType.TOP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 71, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 71, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 71, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 71, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 71, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 71, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 71, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 71, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 71, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 71, -3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 71, 4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 71, 4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 71, 4), Glass, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 71, 4), Glass, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 71, 4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 71, 4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 71, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 71, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 71, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 71, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 71, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 71, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 71, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 71, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 71, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 71, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 71, 4), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 71, -4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 71, -4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 71, -4), Glass, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 71, -4), Glass, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 71, -4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 71, -4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 71, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 71, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 71, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 71, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 71, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 71, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 71, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 71, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 71, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 71, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 71, -4), PurPur, UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(431, 72, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 72, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 72, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 72, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 72, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 72, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 72, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 72, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(409, 72, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(406, 72, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(405, 72, 0), Blocks.DRAGON_WALL_HEAD.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 72, 1), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(410, 72, 1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 72, -1), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 72, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 72, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(410, 72, -1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 72, 2), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 72, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.INNER_LEFT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 72, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 72, 2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 72, -2), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 72, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 72, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 72, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 72, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.INNER_RIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 72, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 72, -2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 72, 3), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 72, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 72, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 72, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.INNER_LEFT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 72, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 72, 3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 72, -3), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 72, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 72, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 72, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 72, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.INNER_RIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 72, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 72, -3), PurPur, UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(431, 72, 4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 72, 4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 72, 4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 72, 4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 72, 4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 72, 4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 72, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 72, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 72, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 72, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 72, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 72, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 72, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 72, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 72, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 72, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 72, 4), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 72, -4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 72, -4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 72, -4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 72, -4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 72, -4), EndBrick, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 72, -4), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 72, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 72, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(423, 72, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 72, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 72, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 72, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 72, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 72, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 72, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 72, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 72, -4), PurPur, UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(433, 73, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 73, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 73, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 73, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 73, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 73, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 73, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(409, 73, 0), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, -1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 73, -1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 73, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 73, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 73, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 73, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 73, 4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 73, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 73, 4), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 73, -4), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 73, -4), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, 5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, 5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, 5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, 5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, 5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, 5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, 5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 73, 5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 73, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, -5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, -5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, -5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, -5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, -5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, -5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, -5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 73, -5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 73, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, 6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_RIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, 6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, 6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, 6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, 6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, 6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, 6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, 6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 73, 6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 73, 6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_RIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(433, 73, -6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_RIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(432, 73, -6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 73, -6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 73, -6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 73, -6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 73, -6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 73, -6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 73, -6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 73, -6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 73, -6), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_RIGHT), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(432, 74, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 74, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 74, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.INNER_RIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 74, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 74, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 74, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 74, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 74, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 74, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 74, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 74, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 74, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 74, -1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 74, -1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 74, -1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 74, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 74, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_RIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 74, 2), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 74, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 74, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 74, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_LEFT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 74, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 74, 3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.INNER_LEFT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 74, 3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 74, -3), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 74, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 74, 4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 74, -4), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 74, -4), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 74, 5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 74, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 74, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 74, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 74, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 74, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 74, 5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 74, 5), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 74, -5), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(431, 74, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 74, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(429, 74, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 74, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 74, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 74, -5), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 74, -5), PurPur, UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 75, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 75, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 75, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(410, 75, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(409, 75, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(427, 75, 2), Registry.BLOCK.get(new ResourceLocation("vs_eureka", "crimson_ship_helm")).defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 75, 5), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 75, 5), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(432, 75, -5), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 75, -5), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 76, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 76, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(409, 76, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(408, 76, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(407, 76, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.X), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 77, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 77, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(407, 77, 0), PurSlab.setValue(BlockStateProperties.SLAB_TYPE, SlabType.BOTTOM), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 78, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 78, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 79, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 79, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 80, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 80, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 81, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 81, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 82, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 82, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 83, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 83, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 84, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 84, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 84, 0), PurSlab.setValue(BlockStateProperties.SLAB_TYPE, SlabType.TOP), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 84, 1), PurSlab.setValue(BlockStateProperties.SLAB_TYPE, SlabType.TOP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 84, 1), PurSlab.setValue(BlockStateProperties.SLAB_TYPE, SlabType.TOP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 84, 1), PurSlab.setValue(BlockStateProperties.SLAB_TYPE, SlabType.TOP), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 84, -1), PurSlab.setValue(BlockStateProperties.SLAB_TYPE, SlabType.TOP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 84, -1), PurSlab.setValue(BlockStateProperties.SLAB_TYPE, SlabType.TOP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 84, -1), PurSlab.setValue(BlockStateProperties.SLAB_TYPE, SlabType.TOP), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(421, 85, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 85, 0), Ladder.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 85, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 85, 0), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(421, 85, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 85, 1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(421, 85, -1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 85, -1), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(421, 85, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_RIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 85, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 85, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 85, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 85, 2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_LEFT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(421, 85, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_LEFT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(420, 85, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 85, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 85, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 85, -2), PurStairs.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.OUTER_RIGHT), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(419, 86, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(421, 86, 2), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 86, 2), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(421, 86, -2), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 86, -2), EndRod.setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(419, 87, 0), PurPur, UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 88, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 88, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 88, 0), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 88, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 88, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 88, 1), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 88, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 88, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 88, -1), Balloon, UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 89, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 89, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 89, 0), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 89, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 89, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 89, 1), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 89, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 89, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 89, -1), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 89, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 89, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 89, 2), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 89, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 89, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 89, -2), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(421, 89, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 89, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 89, 1), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(417, 89, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 89, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 89, 1), Balloon, UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 90, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 90, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 90, 0), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 90, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 90, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 90, 1), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 90, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 90, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 90, -1), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 90, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 90, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 90, 2), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 90, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 90, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 90, -2), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(421, 90, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 90, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 90, 1), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(417, 90, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 90, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 90, 1), Balloon, UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 91, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 91, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 91, 0), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 91, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 91, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 91, 1), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 91, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 91, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 91, -1), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 91, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 91, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 91, 2), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 91, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 91, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 91, -2), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(421, 91, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 91, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(421, 91, 1), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(417, 91, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 91, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(417, 91, 1), Balloon, UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(420, 92, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 92, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 92, 0), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 92, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 92, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 92, 1), Balloon, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(420, 92, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 92, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 92, -1), Balloon, UPDATE_NONE);

            return true;
        }
    }
}
