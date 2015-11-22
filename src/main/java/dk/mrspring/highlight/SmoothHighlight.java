package dk.mrspring.highlight;

import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

/**
 * Created on 18-11-2015 for 1.8.
 */
@Mod(modid = "smoothHighs", name = "Smooth Highlight", version = "1.0.0", clientSideOnly = true)
public class SmoothHighlight
{
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void highlight(DrawBlockHighlightEvent event)
    {
        GL11.glEnable(GL11.GL_LINE_SMOOTH);
    }
}
