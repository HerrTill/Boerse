package de.HerrTill.boerse;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by herrtill on 04.11.15.
 */

@Mod(modid = "boerse", name = "Boerse", version = "1.0")
public class Boerse {

    @Instance
    public static Boerse instance = new Boerse();

    @EventHandler
    public void preInit (FMLPreInitializationEvent e){
        System.out.println("preInit-Methode geladen!");
    }

    @EventHandler
    public void init (FMLInitializationEvent e) {
        System.out.println("init-Methode geladen!");
    }

    @EventHandler
    public void postInit (FMLPostInitializationEvent e){
        System.out.println("postInit-Methode geladen!");
    }
}
