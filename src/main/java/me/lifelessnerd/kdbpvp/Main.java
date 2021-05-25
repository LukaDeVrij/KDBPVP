package me.lifelessnerd.kdbpvp;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("PLUGIN STARTING");
        getServer().getPluginManager().registerEvents(new OnPlayerDeath(), this);
        new OnRespawnEvent(this);
        getServer().getPluginManager().registerEvents(new OnMoveEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
