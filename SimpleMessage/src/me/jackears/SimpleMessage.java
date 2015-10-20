package me.jackears;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleMessage extends JavaPlugin {
	
	//Message When Server Is Started To Reasure It's Enabled.
	public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveConfig();
		getLogger().info("SimpleMessage Is Enabled!");
	}
	
	//Message When Server Is Stopped To Reasure It's Disabled.
	public void onDisable() {
		getLogger().info("SimpleMessage Is Disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		//The Varible, Instead Of Using Player We Have Shortend It To p
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("sm")) {
			p.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD +"SimpleMessage " + ChatColor.DARK_GRAY + ">>" + getConfig().getString("messages.msg"));
			return true;
		}
			
		if(cmd.getName().equalsIgnoreCase("setmessage")) {
			if(args.length == 0) {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("sm")));
                return true;
			}
			
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < args.length; i++) {
				str.append(args[i] + " ");
			}
			
			String sm = str.toString();
			getConfig().set("messages.msg", sm);
			saveConfig();
			p.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD +"SimpleMessage " + ChatColor.DARK_GRAY + ">>" + ChatColor.GRAY + " You set the message to: " + sm);
			
			//p.sendMessage(ChatColor.DARK_GRAY + "Message:" + sm);
		}
		
		return true;
	}

}
