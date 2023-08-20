package de.vepexlegit.nojumpdelaydebug;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = NoJumpDelayDebug.MODID, version = NoJumpDelayDebug.VERSION)
public class NoJumpDelayDebug {
    public static final String MODID = "nojumpdelaydebug";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
