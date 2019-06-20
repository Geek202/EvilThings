package me.geek.tom.evilthings.blocks;

import me.geek.tom.evilthings.EvilThings;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TestGuiBlock extends BlockBasic {
    public TestGuiBlock(String name, Material material) {
        super(name, material);
    }
    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            return true;
        }

        player.openGui(EvilThings.instance, 0, world, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }
}
