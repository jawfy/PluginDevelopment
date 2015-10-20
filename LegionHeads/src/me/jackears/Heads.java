package me.jackears;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
	
	public class Heads extends JavaPlugin implements Listener {
		
		public static Economy econ = null;
	    
        public void onEnable() {
            Bukkit.getServer().getPluginManager().registerEvents(this, this);
            if (!setupEconomy() ) {
                getLogger().severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
                getServer().getPluginManager().disablePlugin(this);
                return;
           
            }
        }
        
        private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }
    
	    @EventHandler
        public void onPlayerDeathEvent(PlayerDeathEvent e) {
                ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
               
                SkullMeta meta = (SkullMeta) skull.getItemMeta();
                meta.setOwner(e.getEntity().getName());
                meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b" +  e.getEntity().getName() + "&b's Head"));
                skull.setItemMeta(meta);
                
                
				@SuppressWarnings("unused")
				EconomyResponse r1 = econ.withdrawPlayer(e.getEntity(), 50);
                e.getEntity().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lUh Oh! &7You have lost &c$50 &7because you died!"));
                e.getDrops().add(skull);
                e.getEntity().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&l(!) &c" + e.getEntity().getName() + " &7has just died!" ));
                
	    }
	    	
               
               
        }


