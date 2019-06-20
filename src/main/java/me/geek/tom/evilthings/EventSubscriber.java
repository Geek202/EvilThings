package me.geek.tom.evilthings;

import me.geek.tom.evilthings.blocks.BlockBasic;
import me.geek.tom.evilthings.blocks.TestGuiBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class EventSubscriber {

    public static Item testItem = new Item().setRegistryName("green_crystal").setUnlocalizedName("green_crystal");
    public static Block testBlock = new BlockBasic("green_crystal_ore", Material.ROCK);
    public static Block testGuiBlock = new TestGuiBlock("testgui", Material.ROCK);
    public static Item testItemBlock;
    public static Item testGuiItemBlock;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        // System.out.println("register items!");
        event.getRegistry().registerAll(testItem);
        testItem.setCreativeTab(EvilThings.tab);
        testItemBlock = new ItemBlock(testBlock).setRegistryName("green_crystal_ore");
        event.getRegistry().register(testItemBlock);
        testGuiItemBlock = new ItemBlock(testGuiBlock).setRegistryName("testguiblock");
        event.getRegistry().register(testGuiItemBlock);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(testBlock);
        testBlock.setCreativeTab(EvilThings.tab);
        event.getRegistry().register(testGuiBlock);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerRender(ModelRegistryEvent event) {
        EvilThings.proxy.registerRenders(event);
    }
}
