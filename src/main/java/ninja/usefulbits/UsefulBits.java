package ninja.usefulbits;
//Copyright ViolentNInjaD 2014

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ninja.usefulbits.init.UBBlocks;
import ninja.usefulbits.init.UBCraftingRecipes;
import ninja.usefulbits.init.UBItems;
import ninja.usefulbits.proxy.IProxy;
import ninja.usefulbits.util.LogHelper;
import ninja.usefulbits.util.VersionChecker;

@Mod(modid = UsefulBits.MOD_ID, name = UsefulBits.MOD_NAME, version = UsefulBits.MOD_VERSION)
public class UsefulBits
{
    public static final String MOD_ID = "UsefulBits";
    public static final String MOD_NAME = "Useful Bits";
    public static final String MOD_VERSION = "1.7.10-03";

    @Mod.Instance
    public static UsefulBits instance;

    @SidedProxy(clientSide = "ninja.usefulbits.proxy.ClientProxy", serverSide = "ninja.usefulbits.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Pre-Initialization has begun :)");

        UBItems.init();
        UBBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization has begun :)");

        new VersionChecker().doYourThing();

        UBCraftingRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-Initialization has begun :)");
    }
}
