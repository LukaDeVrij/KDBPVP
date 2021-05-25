package me.lifelessnerd.kdbpvp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class OnArrowHit implements Listener {

    @EventHandler
    public void OnDamageByEntity(EntityDamageByEntityEvent event){
        if (event.getEntity() instanceof Player){
            Player player = (Player) event.getEntity();
            Bukkit.broadcastMessage(event.getDamager().toString());
            if (player.getWorld().getName().equalsIgnoreCase("pvp") && event.getDamager() instanceof Arrow){
                System.out.println("Damaged: " + player.getName());
                Arrow arrow = (Arrow) event.getDamager();
                if (arrow.getShooter() instanceof Player) {
                    Player shooter = (Player) arrow.getShooter();
                    if (shooter.getInventory().contains(Material.BOW)){
                        Inventory shooterInventory = shooter.getInventory();
                        ItemStack arrowItem = new ItemStack(Material.ARROW, 1);
                        shooterInventory.addItem(arrowItem);
                    }
                }
            }
        }
    }
}