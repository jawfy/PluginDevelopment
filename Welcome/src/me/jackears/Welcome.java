package me.jackears;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class Welcome implements Listener {
	
    @SuppressWarnings("unused")
    private WelcomeMain welcomemain;
    public Welcome(WelcomeMain core) {
            this.welcomemain = core;
    }
	
    PlayerInventory pi = player.getInventory();
     
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
      if(!event.getPlayer().hasPlayedBefore()) {
        event.getPlayer().sendMessage("Message Here");
        pi.addItem("")
      }
			
    }

}
