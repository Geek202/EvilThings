package me.geek.tom.evilthings.util;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TextureStitcher {
    @SubscribeEvent
    public void stitcherEventPre(TextureStitchEvent.Pre event) {
        ResourceLocation flameRL = new ResourceLocation("evilthings:particle/test");
        event.getMap().registerSprite(flameRL);
    }
}
