package me.jackears;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.ultimatum.UtilAPI.UtilAPI;

public class MainClass extends JavaPlugin {

	@Override
	public void onEnable() {
		new ListenerClass(this);
		UtilAPI util = new UtilAPI();
		util.loadPlugin(this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("BLANK") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			return true;
			
		}
		
		return false;	
		
	}
	
}