package me.lifelessnerd.kdbpvp;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;

public class OnPlayerDeath implements Listener {

	HashMap<String, Integer> killStreaks = new HashMap<String, Integer>();

	@EventHandler
	public void onDeath(PlayerDeathEvent event){
	  	Player player = event.getEntity();
		Player killer = player.getKiller();

		// Killstreaks probeersel
		if (killer instanceof Player) {
			if (killStreaks.containsKey(killer.getName())) {
				killStreaks.replace(killer.getName(), killStreaks.get(killer.getName() + 1));
				for(Player p : Bukkit.getOnlinePlayers()){
					if(p.getWorld().getName().equals("pvp")){
						p.sendMessage(Color.RED + killer.getName() + " heeft een killstreak van " + killStreaks.get(killer.getName()));
					}
				}
			} else {
				killStreaks.put(killer.getName(), 1);
			}
		}



		// Potion
		ItemStack potionItem = new ItemStack(Material.SPLASH_POTION, 1);
		PotionMeta potionMeta = (PotionMeta) potionItem.getItemMeta();
		PotionEffect potEffect = new PotionEffect(PotionEffectType.HEAL, 2, 1, true, true);
        assert potionMeta != null; //idk wat dit is maar IntelliJ wilde het
        potionMeta.addCustomEffect(potEffect, true);
		potionItem.setItemMeta(potionMeta);

		//Arrow
		ItemStack arrowItem = new ItemStack(Material.ARROW, 2);

		if (event.getEntity().getKiller() instanceof Player && event.getEntity().getWorld().getName().equalsIgnoreCase("pvp")) {

			Inventory killerInventory = killer.getInventory();
			killerInventory.addItem(potionItem);
			if (killerInventory.contains(Material.BOW)) {
				killerInventory.addItem(arrowItem);
			}


			switch (killer.getInventory().getItem(17).getItemMeta().getDisplayName()) {
				case "RamboExtreme":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Spider":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Fireman":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Rambo":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Tank":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Witch":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Archer":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Wizard":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Snowman":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Stray":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Gladiator":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "King":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Blaze":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Enderman":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Soldier":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Ghost":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Aquaman":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Aerialist":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Skeleton":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Golem":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Marksman":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Phoenix":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;
				case "Pillager":
					Bukkit.broadcastMessage(killer.getInventory().getItem(17).getItemMeta().getDisplayName());
					//
					break;


			}

		}
	}
}
