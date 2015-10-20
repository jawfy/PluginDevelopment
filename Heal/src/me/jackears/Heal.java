package me.jackears;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Heal extends JavaPlugin {
	
	public void onEnable() {
		getLogger().info("PlayerHealth Has Been Enabled!");
	}
	
	public void onDisable() {
		getLogger().info("PlayerHealth Has Been Disabled");
	}
	
	public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
		Player p = (Player) sender;
		   if (alias.equalsIgnoreCase("heal")) {
		   if (args.length == 0) {
		   //Player only typed '/heal' so lets heal them back!
		   p.setHealth(20.0);
		   } else {
			   
			   
		   //Player typed something more
		   Player target = Bukkit.getPlayerExact(args[0]);
		   if (target == null) {
			   
			   
		   //Target is not online
		   p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Sorry! " + ChatColor.GRAY + "The player " + ChatColor.RED + args[0] + ChatColor.GRAY +" is not online!");
		   } else {
		   //Targets online
		   p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "WooHoo! " + ChatColor.GRAY + " You've Healed " + ChatColor.GREEN + args[0] + ChatColor.GRAY + "!"); 
		   target.setHealth(20.0);
		}
		   }
		   }
	return true;
}
}
