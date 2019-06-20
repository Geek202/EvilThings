package me.geek.tom.evilthings.proxy;

import me.geek.tom.evilthings.blocks.BlockBasic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

public class ClientProxy implements IProxy {

    private Item testItem = new Item().setRegistryName("green_crystal").setUnlocalizedName("green_crystal");
    private Block testBlock = new BlockBasic("green_crystal_ore", Material.ROCK);
    private Item testItemBlock;

    @Override
    public void registerBlocks(RegistryEvent.Register<Block> event) {

    }

    @Override
    public void registerItems(RegistryEvent.Register<Item> event) {
        System.out.println("register items!");
        event.getRegistry().registerAll(testItem);
        testItemBlock = new ItemBlock(testBlock).setRegistryName("green_crystal_ore");
        event.getRegistry().register(testItemBlock);
    }

    @Override
    public void registerRenders(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(testItem, 0, new ModelResourceLocation( testItem.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(testItemBlock, 0, new ModelResourceLocation( testItemBlock.getRegistryName(), "inventory"));
    }
}
