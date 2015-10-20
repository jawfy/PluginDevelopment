package me.jackears;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

import me.ultimatum.UtilAPI.UtilAPI;

public class KitsPlus extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("UtillTest Enabled");
		UtilAPI util = new UtilAPI();
		util.loadPlugin(this);
	}
	
	@Override
	public void onDisable() {
		getLogger().info("UtillTest Disabled");
	}
	

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
            UtilAPI util = new UtilAPI();
            Player p = (Player) sender;
            PlayerInventory pi = p.getInventory();
            
            if(cmd.getName().equalsIgnoreCase("clearinventory")) {
            	if(sender.hasPermission("kitsplus.clearinventory")) {
            		
            		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bKits &8>> " +"&b"+ sender.getName() + "&b's&7, " + "&7inventory was cleared!"));
            		
            		pi.clear();
            		return true;
            		
            	} else {
            		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lSorry! &7You don't have access to that command!"));
            	}
            }
            
            if(cmd.getName().equalsIgnoreCase("kit")) {
            if(args.length == 1){
                    if(util.kitManager.checkKits(args[0])) {
                            if(sender.hasPermission("kitsplus."+ args[0])) {
                                    util.kitManager.giveKit(args[0], (Player) sender);
                                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bKits &8>> &7You have recived the kit, &b"+args[0]+"&7!"));
                                    return true;
                    } else {
                    	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lSorry! &7You do not have permission!"));
                    	return true;
                    }
                    
                    } else {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lSorry! &7The kit, " + "&c" + args[0] +" &7was not found!"));
                            return true;
                    }
                    
       
    }
            }

            return true;
    }
}
