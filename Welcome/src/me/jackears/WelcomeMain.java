package me.jackears;

import org.bukkit.plugin.java.JavaPlugin;

public class WelcomeMain extends JavaPlugin {
	
	public void onEnable() {
		getLogger().info("Welcome Has Enabled...");
	    getServer().getPluginManager().registerEvents(new Welcome(this), this);
	}
	
	public void onDisable() {
		getLogger().info("Welcome has disabled...");
	}

}
