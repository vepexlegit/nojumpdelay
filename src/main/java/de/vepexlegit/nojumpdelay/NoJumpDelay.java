package de.vepexlegit.nojumpdelay;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = NoJumpDelay.MODID, version = NoJumpDelay.VERSION)
public class NoJumpDelay {
    public static final String MODID = "nojumpdelay";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
