package Limesly.mods.N1C4C0CKmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = N1C4C0CK.MODID, name = N1C4C0CK.NAME, version = N1C4C0CK.VERSION, acceptedMinecraftVersions = "[1.12, 1.13)", useMetadata=true)
public class N1C4C0CK
{
    public static final String MODID = "nicecock";
    public static final String NAME = "N1C4C0CK Mod";
    public static final String VERSION = "1.0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
