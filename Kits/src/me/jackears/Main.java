package me.jackears;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		getLogger().info("Kits Has Been Enabled!");
	    getServer().getPluginManager().registerEvents(new Listeners(this), this);
        getCommand("kits").setExecutor(new Commands(this));
        getCommand("help").setExecutor(new Commands(this));
        getCommand("clearinventory").setExecutor(new Commands(this));
	}
	
	public void onDisable() {
		getLogger().info("Kits Has Been Disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
	    Player p = (Player) sender;
	    PlayerInventory pi = p.getInventory();
	    
	    if(args.length == 0) {
	    	p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Kits" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + "Please specify a kit!");

	    }
	    
	    if(args.length == 1) {
			if (cmd.getName().equalsIgnoreCase("kit") && args[0].equalsIgnoreCase("tank")) {
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Kits" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " You Sucsefully Recived The " + ChatColor.AQUA + ChatColor.BOLD + "Tank " + ChatColor.GRAY + "kit!");
				
				
			//Stone Sword
			ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
			ItemMeta swordMeta = sword.getItemMeta();
			swordMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Tank Sword" + ChatColor.DARK_GRAY + "]");
			sword.setItemMeta(swordMeta);
			sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
			sword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
			pi.addItem(sword);
			
			//Bow
			ItemStack b = new ItemStack(Material.BOW, 1);
			ItemMeta bMeta = b.getItemMeta();
			bMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Bow" + ChatColor.DARK_GRAY + "]");
			b.setItemMeta(bMeta);
			pi.addItem(b);
			
			//Diamond Helmet
			ItemStack dhelm = new ItemStack(Material.IRON_HELMET, 1);
			ItemMeta dhelmMeta = dhelm.getItemMeta();
			dhelmMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Iron Helmet" + ChatColor.DARK_GRAY + "]");
			dhelm.setItemMeta(dhelmMeta);
			dhelm.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			dhelm.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			pi.addItem(dhelm);
			
			//Diamond Chest
			ItemStack dchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
			ItemMeta dchestMeta = dchest.getItemMeta();
			dchestMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Iron ChestPlate" + ChatColor.DARK_GRAY + "]");
			dchest.setItemMeta(dchestMeta);
			dchest.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			dchest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			pi.addItem(dchest);
			
			//Diamond Legs
			ItemStack dlegs = new ItemStack(Material.IRON_LEGGINGS, 1);
			ItemMeta dlegsMeta = dlegs.getItemMeta();
			dlegsMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + " Iron Leggings " + ChatColor.DARK_GRAY + "]");
			dlegs.setItemMeta(dlegsMeta);
			dlegs.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			dlegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			pi.addItem(dlegs);
			
			//Diamond Boots
			ItemStack dboots = new ItemStack(Material.IRON_BOOTS, 1);
			ItemMeta dbootsMeta = dboots.getItemMeta();
			dbootsMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + " Iron Boots " + ChatColor.DARK_GRAY + "]");
			dboots.setItemMeta(dbootsMeta);
			dboots.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			dboots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			pi.addItem(dboots);
			
			//Healing
			Potion potion = new Potion(PotionType.INSTANT_HEAL, 1);
			potion.setSplash(true);
            pi.addItem(potion.toItemStack(1));
            p.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 0));
            
            //Arrow
			ItemStack a = new ItemStack(Material.ARROW, 16);
			ItemMeta aMeta = a.getItemMeta();
			aMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " Arrows " + ChatColor.DARK_GRAY + "]");
			a.setItemMeta(aMeta);
			pi.addItem(a); 
				}
		    
				
			if (cmd.getName().equalsIgnoreCase("kit") && args[0].equalsIgnoreCase("archery")) {
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Kits" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " You Sucsefully Recived The " + ChatColor.AQUA + ChatColor.BOLD + "Archery " + ChatColor.GRAY + "kit!"); {
		

			//Stone Sword
			ItemStack as = new ItemStack(Material.STONE_SWORD, 1);
			ItemMeta asMeta = as.getItemMeta();
			asMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Archery Sword" + ChatColor.DARK_GRAY + "]");
			as.setItemMeta(asMeta);
			pi.addItem(as);
			
			//Bow
			ItemStack ba = new ItemStack(Material.BOW, 1);
			ItemMeta baMeta = ba.getItemMeta();
			baMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Bow" + ChatColor.DARK_GRAY + "]");
			ba.setItemMeta(baMeta);
			ba.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
			ba.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 1);
			pi.addItem(ba);
			
			//Diamond Helmet
			ItemStack dhelma = new ItemStack(Material.IRON_HELMET, 1);
			ItemMeta dhelmaMeta = dhelma.getItemMeta();
			dhelmaMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Iron Helmet" + ChatColor.DARK_GRAY + "]");
			dhelma.setItemMeta(dhelmaMeta);
			dhelma.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			pi.addItem(dhelma);
			
			//Diamond Chest
			ItemStack dchesta = new ItemStack(Material.IRON_CHESTPLATE, 1);
			ItemMeta dchestaMeta = dchesta.getItemMeta();
			dchestaMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Iron Chestplate" + ChatColor.DARK_GRAY + "]");
			dchesta.setItemMeta(dchestaMeta);
			dchesta.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			pi.addItem(dchesta);
			
			//Diamond Legs
			ItemStack dlegsa = new ItemStack(Material.IRON_LEGGINGS, 1);
			ItemMeta dlegsaMeta = dlegsa.getItemMeta();
			dlegsaMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Iron Leggings" + ChatColor.DARK_GRAY + "]");
			dlegsa.setItemMeta(dlegsaMeta);
			dlegsa.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			pi.addItem(dlegsa);
			
			//Diamond Boots
			ItemStack dbootsa = new ItemStack(Material.IRON_BOOTS, 1);
			ItemMeta dbootsaMeta = dbootsa.getItemMeta();
			dbootsaMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Iron Boots " + ChatColor.DARK_GRAY + "]");
			dbootsa.setItemMeta(dbootsaMeta);
			dbootsa.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			pi.addItem(dbootsa);
			
			//Speed
			p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000, 1));
            
            //Arrow
			ItemStack aa = new ItemStack(Material.ARROW, 1);
			ItemMeta aaMeta = aa.getItemMeta();
			aaMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Arrows" + ChatColor.DARK_GRAY + "]");
			aa.setItemMeta(aaMeta);
			pi.addItem(aa);
				
					}
		      }
	    }

		return false;
}
}

	

		    
	

