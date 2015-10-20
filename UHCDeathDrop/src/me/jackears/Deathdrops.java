package me.jackears;

import org.bukkit.plugin.java.JavaPlugin;

public class Deathdrops extends JavaPlugin {
	
	public void onEnable() {
		getLogger().info("Deathdrops Has Been Enabled!");
	    getServer().getPluginManager().registerEvents(new DropsListener(this), this);
	}
	
	public void onDisable() {
		getLogger().info("Deathdrops Has Been Disabled!");
	}
	
}
	


