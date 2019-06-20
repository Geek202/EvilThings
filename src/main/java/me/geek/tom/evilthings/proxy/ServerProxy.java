package me.geek.tom.evilthings.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;

public class ServerProxy implements IProxy {

    private Item testItem = new Item().setRegistryName("green_crystal").setUnlocalizedName("green_crystal");

    @Override
    public void registerBlocks(RegistryEvent.Register<Block> event) {

    }

    @Override
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(testItem);
    }

    @Override
    public void registerRenders(ModelRegistryEvent event) {

    }
}
