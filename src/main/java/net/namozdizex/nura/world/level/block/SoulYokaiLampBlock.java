package net.namozdizex.nura.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class SoulYokaiLampBlock extends Block {
    public SoulYokaiLampBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE_2 = Stream.of(
            Block.box(3, 1, 3, 13, 15, 13),
            Block.box(4, 0, 4, 12, 1, 12),
            Block.box(4, 15, 4, 12, 16, 12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE_2;
    }
}
