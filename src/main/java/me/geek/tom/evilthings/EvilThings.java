package me.geek.tom.evilthings;

import me.geek.tom.evilthings.proxy.GuiProxy;
import me.geek.tom.evilthings.proxy.IProxy;
import me.geek.tom.evilthings.worldgen.OreGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nonnull;

@Mod(modid = Reference.MODID, version = "0.1.0.1-SNAPSHOT", name = "Evil Things", acceptedMinecraftVersions = "[1.12]")
public class EvilThings {

    @Mod.Instance
    public static EvilThings instance;
    public static CreativeTabs tab;

    @SidedProxy(serverSide = "me.geek.tom.evilthings.proxy.ServerProxy", clientSide = "me.geek.tom.evilthings.proxy.ClientProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.MODID + ":preInit");
        proxy.preInit(event);
        tab = new CreativeTabs("tabEvilThings") {
            @Override
            @Nonnull
            public ItemStack getTabIconItem() {
                return new ItemStack(EventSubscriber.testItem);
            }
        };
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(Reference.MODID + ":init");
        proxy.init(event);
        GameRegistry.registerWorldGenerator(new OreGen(EventSubscriber.testBlock, 8, 20, 60, 10), 0);
        GameRegistry.addSmelting(new ItemStack(EventSubscriber.testItemBlock), new ItemStack(EventSubscriber.testItem, 2), 1F);
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiProxy());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(Reference.MODID + ":postInit");
        proxy.postInit(event);
    }



}
