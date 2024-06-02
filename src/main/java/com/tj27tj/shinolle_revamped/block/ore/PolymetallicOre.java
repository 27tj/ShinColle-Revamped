package com.tj27tj.shinolle_revamped.block.ore;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

import java.util.Random;

public class PolymetallicOre extends Block {
    public PolymetallicOre(Properties properties) {
        super(properties);
    }

    protected int getExperience(Random rand, int fortune) {
        return MathHelper.nextInt(rand, 1,4) * (fortune + 1);
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.getExperience(RANDOM, fortune) : 0;
    }

}
