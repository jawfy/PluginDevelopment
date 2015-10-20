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
 
public class Listeners implements Listener {
       
        @SuppressWarnings("unused")
        private Main main;
        public Listeners(Main core) {
                this.main = core;
        }
       
        @EventHandler
        public void onPlayerJoin(PlayerJoinEvent e) {
                Player p = e.getPlayer();
                PlayerInventory pi = p.getInventory();
                p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "+" + ChatColor.DARK_GRAY + "] " + ChatColor.AQUA +p.getDisplayName() + "");
                
    			ItemStack gap = new ItemStack(Material.GOLDEN_APPLE, 1);
    			ItemMeta gapMeta = gap.getItemMeta();
    			gap.setItemMeta(gapMeta);
    			pi.addItem(gap);
        }
 
}
