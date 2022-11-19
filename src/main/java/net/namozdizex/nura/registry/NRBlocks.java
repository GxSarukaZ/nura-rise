package net.namozdizex.nura.registry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.namozdizex.nura.NuraRise;

public class NRBlocks
{
    public static final Block YOKAI_LAMP = new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).requiresCorrectToolForDrops().strength(1.0F,15.5F).noCollission());
    public static final Block SOUL_YOKAI_LAMP = new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).requiresCorrectToolForDrops().strength(1.0F,15.5F).noCollission());

    public static void init()
    {
        register("yokai_lamp", YOKAI_LAMP, new Item.Properties().tab(NuraRise.TAB));
        register("soul_yokai_lamp", SOUL_YOKAI_LAMP, new Item.Properties().tab(NuraRise.TAB));
    }

    public static void register(String key, Block block, Object o)
    {
        register(key, block, null);
    }

    public static void register(String key, Block block, Item.Properties properties)
    {
        Registry.register(Registry.BLOCK, new ResourceLocation(NuraRise.MOD_ID, key), block);

        if (properties != null);
        {
            Registry.register(Registry.ITEM, new ResourceLocation(NuraRise.MOD_ID, key), new BlockItem(block, properties));
        }
    }
    private static Boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType entityType)
    {
        return false;
    }

    private static Boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos)
    {
        return false;
    }
}
