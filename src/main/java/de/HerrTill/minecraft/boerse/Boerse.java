package de.HerrTill.minecraft.boerse;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by herrtill on 04.11.15.
 */

@Mod(modid = "boerse", name = "Börse", version = "1.0")
public class Boerse {

    @Instance
    public static Boerse instance = new Boerse();

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {

    }

    @EventHandler
    public void init(FMLInitializationEvent e) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }

}
