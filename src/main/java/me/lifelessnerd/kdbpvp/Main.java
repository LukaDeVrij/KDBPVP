package me.lifelessnerd.kdbpvp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
    public void OnEnable() {
        System.out.println("KDB PVP Plugin");
        getServer().getPluginManager().registerEvents(new OnPlayerDeath(), this);

    }
    public void OnDisable() {
        //on shutdown
        //reloads

    }
    // / hello WHASSUP
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        System.out.println("1");
        if (label.equalsIgnoreCase("hello")) {
            System.out.println("2");
            if (sender instanceof Player) {
                //player
                Player player = (Player) sender;
                System.out.println("3");
                if (player.hasPermission("hello.use")) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "hey welcome cunt");
                    //player.sendMessage(ChatColor.translateAlternateColorCodes('&', "have no fun"));
                    return true;
                }
                else {
                    player.sendMessage(ChatColor.DARK_RED + "REEEEEEEEEEEEEEEEEEEEEEEE BAD");
                    return true;
                }
            }
            else {
                //console
                sender.sendMessage("hey BITCH CONSOLE");
                return true;

            }
        }


        return false;
    }
}