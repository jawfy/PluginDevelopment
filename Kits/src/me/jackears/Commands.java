package me.jackears;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
 
public class Commands implements CommandExecutor {
       
        @SuppressWarnings("unused")
        private Main main;
        public Commands(Main main) {
                this.main = main;
        }
       
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
               
        	Player p = (Player) sender;
        	
        	    //Kits Command
                if(cmd.getName().equalsIgnoreCase("kits")) {
                	p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Kits" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "Tank, Archery");
            }
                
                //Help Command
    		    if (cmd.getName().equalsIgnoreCase("help")) {
    					p.sendMessage(ChatColor.DARK_GRAY + "----- " + ChatColor.AQUA + ChatColor.BOLD + "Help" + ChatColor.DARK_GRAY + " -----");
    					p.sendMessage(ChatColor.DARK_GRAY + ">> " + ChatColor.AQUA + ChatColor.BOLD + "/kits Help");
    					p.sendMessage(ChatColor.DARK_GRAY + ">> " + ChatColor.AQUA + ChatColor.BOLD + "/kit Tank");
    					p.sendMessage(ChatColor.DARK_GRAY + ">> " + ChatColor.AQUA + ChatColor.BOLD + "/kit Archery");
    					p.sendMessage(ChatColor.DARK_GRAY + ">> " + ChatColor.AQUA + ChatColor.BOLD + "/Heal");
    					p.sendMessage(ChatColor.DARK_GRAY + ">> " + ChatColor.AQUA + ChatColor.BOLD + "/Feed");
    					p.sendMessage(ChatColor.DARK_GRAY + ">> " + ChatColor.AQUA + ChatColor.BOLD + "/Warp");
    					p.sendMessage(ChatColor.DARK_GRAY + ">> " + ChatColor.AQUA + ChatColor.BOLD + "/Menu");
    					p.sendMessage(ChatColor.DARK_GRAY + ">> " + ChatColor.AQUA + ChatColor.BOLD + "/1v1");
    					p.sendMessage(ChatColor.DARK_GRAY + "----- " + ChatColor.AQUA + ChatColor.BOLD + "Kits Help" + ChatColor.DARK_GRAY + " -----");
          
    				   }
    		    if(cmd.getName().equalsIgnoreCase("clearinventory")) {
    			    PlayerInventory pi = p.getInventory();
    			    
    			    p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Kits" + ChatColor.DARK_GRAY + "] " + ChatColor.GREEN + "Inventory Cleared!");
    			    pi.clear();
    			    
    		    }
    		    
    		    return true;
        }
            
}
                
