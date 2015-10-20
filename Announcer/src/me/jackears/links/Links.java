package me.jackears.links;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

import me.ultimatum.UtilAPI.UtilAPI;

public class Links extends JavaPlugin implements Listener {

	public Permission reload = new Permission("links.reload");
	public Permission website = new Permission("links.website");
	
	FileConfiguration config;
    File cfile;
	
	@Override
	public void onEnable() {
		UtilAPI util = new UtilAPI();
		util.loadPlugin(this);
		Bukkit.getPluginManager().registerEvents(this, this);
        saveDefaultConfig();
        cfile = new File(getDataFolder(), "config.yml");
        PluginManager pm = getServer().getPluginManager();
        pm.addPermission(reload);
        pm.addPermission(website);
	}
	
	@Override
	public void onDisable() {
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		//This will allow the player to reload the configuration if needed, with the right permission.
		if (args.length == 1) {
            if (cmd.getName().equalsIgnoreCase("links") && args[0].equalsIgnoreCase("reload") && sender instanceof Player) {
            	
            	if (!sender.hasPermission("links.reload")) {
            		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("Administrator.NoPermission")));
            	} else {
            		reloadConfig();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("Administrator.Reload")));
            	}
            	
            	return true;
            
            // This will allow the player to configure a message when the player typed /links website.
            } else if (args.length == 1) {
				if (cmd.getName().equalsIgnoreCase("links") && args[0].equalsIgnoreCase("website") && sender instanceof Player) {
					
					if (!sender.hasPermission("links.website")) {
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("Administrator.NoPermission")));
					} else {
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("URL.Website")));
					}
					return true;						
				}
            }
		}
		return false;
		
	}
	
}