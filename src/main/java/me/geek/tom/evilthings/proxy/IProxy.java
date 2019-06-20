package me.geek.tom.evilthings.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;

public interface IProxy {
    public void registerBlocks(RegistryEvent.Register<Block> event);
    public void registerItems(RegistryEvent.Register<Item> event);
    public void registerRenders(ModelRegistryEvent event);

}
