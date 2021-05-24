package me.lifelessnerd.kdbpvp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
    public void OnEnable() {
        //on startup
        //reloads
    }

    public void OnDisable() {
        //on shutdown
        //reloads

    }
    // / hello WHASSUP
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("hello")) {
            if (sender instanceof Player) {
                //player
                Player player = (Player) sender;
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