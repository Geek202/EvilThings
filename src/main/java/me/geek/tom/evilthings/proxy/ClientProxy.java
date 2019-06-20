package me.geek.tom.evilthings.proxy;

import me.geek.tom.evilthings.EventSubscriber;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements IProxy {
    @Override
    public void registerRenders(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(EventSubscriber.testItem, 0, new ModelResourceLocation( EventSubscriber.testItem.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(EventSubscriber.testItemBlock, 0, new ModelResourceLocation( EventSubscriber.testItemBlock.getRegistryName(), "inventory"));
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
