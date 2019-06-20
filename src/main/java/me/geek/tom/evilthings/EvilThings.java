package me.geek.tom.evilthings;

import me.geek.tom.evilthings.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = "0.1.0-SNAPSHOT", name = "Evil Things", acceptedMinecraftVersions = "[1.12]")
public class EvilThings {

    @Mod.Instance
    public static EvilThings instance;

    @SidedProxy(serverSide = "me.geek.tom.evilthings.proxy.ServerProxy", clientSide = "me.geek.tom.evilthings.proxy.ClientProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.MODID + ":preInit");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(Reference.MODID + ":init");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(Reference.MODID + ":postInit");
    }



}
