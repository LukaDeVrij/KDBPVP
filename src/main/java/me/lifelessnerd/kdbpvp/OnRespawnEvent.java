package me.lifelessnerd.kdbpvp;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class OnRespawnEvent implements Listener {

    private Main plugin;

    public OnRespawnEvent(Main plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);

    }
    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {
        Player player = event.getPlayer();
        if (player.getWorld().getName().equalsIgnoreCase("pvp")) {
            player.getInventory().clear();
            player.getActivePotionEffects().clear();
            Bukkit.getScheduler().runTaskLater(plugin, () -> player.chat("/kit"), 1L);
        }
    }
}
