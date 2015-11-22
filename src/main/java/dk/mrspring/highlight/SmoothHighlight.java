package dk.mrspring.highlight;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.opengl.GL11;

/**
 * Created on 18-11-2015 for 1.8.
 */
@Mod(modid = "smoothHighs", name = "Smooth Highlight", version = "1.0.0")
public class SmoothHighlight
{
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        if (event.getSide() == Side.CLIENT)
            MinecraftForge.EVENT_BUS.register(this);
        else System.err.println("You are trying to load Smooth Highlight on a server!");
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void highlight(DrawBlockHighlightEvent event)
    {
        GL11.glEnable(GL11.GL_LINE_SMOOTH);
    }
}
