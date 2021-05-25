package me.lifelessnerd.kdbpvp;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class OnMoveEvent implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        Location loc = player.getLocation();
        double yLevel = loc.getY();
        if (yLevel <= -60) {
            player.performCommand("suicide");
            return;
        }
        else;
    }
}
