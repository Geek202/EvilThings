package me.geek.tom.evilthings;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class EventSubscriber {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        EvilThings.proxy.registerItems(event);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        EvilThings.proxy.registerBlocks(event);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerRender(ModelRegistryEvent event) {
        EvilThings.proxy.registerRenders(event);
    }
}
