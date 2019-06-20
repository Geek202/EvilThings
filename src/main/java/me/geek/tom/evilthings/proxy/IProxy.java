package me.geek.tom.evilthings.proxy;

import net.minecraftforge.client.event.ModelRegistryEvent;

public interface IProxy {
    void registerRenders(ModelRegistryEvent event);

}
