package com.Apothic0n.Enderoids.api.biome.features.types;

import com.mojang.serialization.Codec;
import com.simibubi.create.content.logistics.block.belts.tunnel.BeltTunnelBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.world.level.block.Block.UPDATE_NONE;

public class EndShipFeature extends Feature<NoneFeatureConfiguration> {
    public EndShipFeature(Codec<NoneFeatureConfiguration> pContext) {super(pContext);}
    private static final BlockPos SHIP_OFFSET = new BlockPos(420, 64, 0);
    private static final ChunkPos SHIP_ORIGIN_CHUNK = new ChunkPos(SHIP_OFFSET);
    
    private final BlockState Balloon = Registry.BLOCK.get(new ResourceLocation("eureka", "balloon")).defaultBlockState();
    private final BlockState PurPillar = Blocks.PURPUR_PILLAR.defaultBlockState();
    private final BlockState PurPur = Blocks.PURPUR_BLOCK.defaultBlockState();
    private final BlockState PurStairs = Blocks.PURPUR_STAIRS.defaultBlockState();

    private static int checkerboardDistance(int chunkX, int chunkZ, int originX, int originZ) {
        return Math.max(Math.abs(chunkX - originX), Math.abs(chunkZ - originZ));
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {
        WorldGenLevel worldgenlevel = pContext.level();
        ChunkPos chunkPos = new ChunkPos(pContext.origin());
        if (checkerboardDistance(chunkPos.x, chunkPos.z, SHIP_ORIGIN_CHUNK.x, SHIP_ORIGIN_CHUNK.z) > 1) {
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

            worldgenlevel.setBlock(new BlockPos(426, 65, 2), PurStairs.setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 65, 2), PurStairs.setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 65, 2), PurStairs.setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(426, 65, -2), PurStairs.setValue(BlockStateProperties.FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 65, -2), PurStairs.setValue(BlockStateProperties.FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 65, -2), PurStairs.setValue(BlockStateProperties.FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);



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

            worldgenlevel.setBlock(new BlockPos(430, 66, 3), PurStairs.setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 66, 3), PurStairs.setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 66, 3), PurStairs.setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 66, 3), PurStairs.setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 66, -3), PurStairs.setValue(BlockStateProperties.FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 66, -3), PurStairs.setValue(BlockStateProperties.FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 66, -3), PurStairs.setValue(BlockStateProperties.FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 66, -3), PurStairs.setValue(BlockStateProperties.FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);



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

            worldgenlevel.setBlock(new BlockPos(430, 67, 4), PurStairs.setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 67, 4), PurStairs.setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 67, 4), PurStairs.setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 67, 4), PurStairs.setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 67, -4), PurStairs.setValue(BlockStateProperties.FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 67, -4), PurStairs.setValue(BlockStateProperties.FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(422, 67, -4), PurStairs.setValue(BlockStateProperties.FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(418, 67, -4), PurStairs.setValue(BlockStateProperties.FACING, Direction.SOUTH).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);



            worldgenlevel.setBlock(new BlockPos(431, 68, 0), PurStairs.setValue(BlockStateProperties.FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(430, 68, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, 0), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, 0), PurStairs.setValue(BlockStateProperties.FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(419, 68, 0), PurPillar.setValue(BlockStateProperties.AXIS, Direction.Axis.Y), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 68, 0), Blocks.SHULKER_BOX.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.UP), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 68, 0), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(410, 68, 0), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, 1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, 1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, 1), PurStairs.setValue(BlockStateProperties.FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 68, 1), Blocks.CHEST.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 68, 1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, -1), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, -1), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, -1), PurStairs.setValue(BlockStateProperties.FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 68, -1), Blocks.CHEST.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.EAST), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(411, 68, -1), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, 2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, 2), PurStairs.setValue(BlockStateProperties.FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 68, 2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 68, 2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, -2), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, -2), PurStairs.setValue(BlockStateProperties.FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(413, 68, -2), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(412, 68, -2), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, 3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, 3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, 3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, 3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, 3), PurStairs.setValue(BlockStateProperties.FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 68, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 68, 3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 68, 3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(430, 68, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(428, 68, -3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(427, 68, -3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(426, 68, -3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(425, 68, -3), Balloon, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(424, 68, -3), PurStairs.setValue(BlockStateProperties.FACING, Direction.EAST).setValue(BlockStateProperties.HALF, Half.BOTTOM).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(416, 68, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(415, 68, -3), PurPur, UPDATE_NONE);
            worldgenlevel.setBlock(new BlockPos(414, 68, -3), PurPur, UPDATE_NONE);

            worldgenlevel.setBlock(new BlockPos(431, 68, 4), PurStairs.setValue(BlockStateProperties.FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
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

            worldgenlevel.setBlock(new BlockPos(431, 68, -4), PurStairs.setValue(BlockStateProperties.FACING, Direction.WEST).setValue(BlockStateProperties.HALF, Half.TOP).setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT), UPDATE_NONE);
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





            return true;
        }
    }
}
