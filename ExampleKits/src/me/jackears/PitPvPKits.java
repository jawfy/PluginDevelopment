package me.jackears;

import org.bukkit.Bukkit;
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

public class PitPvPKits extends JavaPlugin {
	
	public void onEnabel() {
		Bukkit.getServer().getLogger().info("Kits Is Enabled!");
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info("Kits Was Disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.GOLD + "Only Players Get Kits!");
			
		}
			
			Player p = (Player) sender;
			PlayerInventory pi = p.getInventory();
			if (args.length == 1)
			
			if (cmd.getName().equalsIgnoreCase("tank")) {
				sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + ChatColor.BOLD + "Kits" + ChatColor.DARK_GRAY + "]" + ChatColor.DARK_GRAY + "You Sucsefully Recived The Tank Kit!");
				
				
				
				//Stone Sword
				ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
				ItemMeta swordMeta = sword.getItemMeta();
				swordMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + " Tank Sword " + ChatColor.DARK_GRAY + "]");
				sword.setItemMeta(swordMeta);
				sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
				sword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				pi.addItem(sword);
				
				//Bow
				ItemStack b = new ItemStack(Material.BOW, 1);
				ItemMeta bMeta = b.getItemMeta();
				bMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " Bow " + ChatColor.DARK_GRAY + "]");
				b.setItemMeta(bMeta);
				pi.addItem(b);
				
				//Diamond Helmet
				ItemStack dhelm = new ItemStack(Material.IRON_HELMET, 1);
				ItemMeta dhelmMeta = dhelm.getItemMeta();
				dhelmMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + " Iron Helmet " + ChatColor.DARK_GRAY + "]");
				dhelm.setItemMeta(dhelmMeta);
				dhelm.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
				dhelm.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
				pi.addItem(dhelm);
				
				//Diamond Chest
				ItemStack dchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
				ItemMeta dchestMeta = dchest.getItemMeta();
				dchestMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + " Iron ChestPlate " + ChatColor.DARK_GRAY + "]");
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
			
			if (cmd.getName().equalsIgnoreCase("MCSG")) {
				sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Kit" + ChatColor.DARK_GRAY + "]" + ChatColor.GOLD + "You Sucsefully Recived The Pyro Class!");
				
				
				
				//Stone Sword
				ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
				ItemMeta swordMeta = sword.getItemMeta();
				swordMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " MCSG Sword " + ChatColor.DARK_GRAY + "]");
				sword.setItemMeta(swordMeta);
				sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
				pi.addItem(sword);
				
				//Rod
				ItemStack r = new ItemStack(Material.FISHING_ROD, 1);
				ItemMeta rMeta = r.getItemMeta();
				rMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " MCSG Pole " + ChatColor.DARK_GRAY + "]");
				r.setItemMeta(rMeta);
				r.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
				pi.addItem(r);
				
				//Flint And Steel
				ItemStack s = new ItemStack(Material.FLINT_AND_STEEL, 1);
				ItemMeta sMeta = s.getItemMeta();
				sMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " MCSG Fire Ligher " + ChatColor.DARK_GRAY + "]");
				s.setItemMeta(sMeta);
				pi.addItem(s);
				
				//Crapple
				ItemStack c = new ItemStack(Material.GOLDEN_APPLE, 1);
				ItemMeta cMeta = c.getItemMeta();
				cMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " MCSG Life Saver " + ChatColor.DARK_GRAY + "]");
				s.setItemMeta(cMeta);
				pi.addItem(c);
				
				//Bow
				ItemStack b = new ItemStack(Material.BOW, 1);
				ItemMeta bMeta = b.getItemMeta();
				bMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " MCSG Bow " + ChatColor.DARK_GRAY + "]");
				b.setItemMeta(bMeta);
				pi.addItem(b);
				
				//Gold Helmet
				ItemStack dhelm = new ItemStack(Material.IRON_HELMET, 1);
				ItemMeta dhelmMeta = dhelm.getItemMeta();
				dhelmMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " Iron Helmet " + ChatColor.DARK_GRAY + "]");
				dhelm.setItemMeta(dhelmMeta);
				dhelm.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
				dhelm.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				pi.addItem(dhelm);
				
				//Diamond Chest
				ItemStack dchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
				ItemMeta dchestMeta = dchest.getItemMeta();
				dchestMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " Iron ChestPlate " + ChatColor.DARK_GRAY + "]");
				dchest.setItemMeta(dchestMeta);
				dchest.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
				dchest.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 2);
				pi.addItem(dchest);
				
				//Diamond Legs
				ItemStack dlegs = new ItemStack(Material.IRON_LEGGINGS, 1);
				ItemMeta dlegsMeta = dlegs.getItemMeta();
				dlegsMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " Iron Leggings " + ChatColor.DARK_GRAY + "]");
				dlegs.setItemMeta(dlegsMeta);
				dlegs.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
				dlegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				pi.addItem(dlegs);
				
				//Diamond Boots
				ItemStack dboots = new ItemStack(Material.IRON_BOOTS, 1);
				ItemMeta dbootsMeta = dboots.getItemMeta();
				dbootsMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " Iron Boots " + ChatColor.DARK_GRAY + "]");
				dboots.setItemMeta(dbootsMeta);
				dboots.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
				dboots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				pi.addItem(dboots);
				
				//Healing
				Potion potion = new Potion(PotionType.INSTANT_HEAL, 1);
				potion.setSplash(true);
                pi.addItem(potion.toItemStack(1));
                p.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 0));
                
                //Arrows
				ItemStack a = new ItemStack(Material.ARROW, 16);
				ItemMeta aMeta = a.getItemMeta();
				aMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " MCSG Ammo " + ChatColor.DARK_GRAY + "]");
				a.setItemMeta(aMeta);
				pi.addItem(a);
                
                	
                }
			if (cmd.getName().equalsIgnoreCase("Pyro")) {
				sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Kit" + ChatColor.DARK_GRAY + "]" + ChatColor.GOLD + "You Sucsefully Recived The Pyro Class!");
			
			
			//Stone Sword
			ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
			ItemMeta swordMeta = sword.getItemMeta();
			swordMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " Pyro Sword " + ChatColor.DARK_GRAY + "]");
			sword.setItemMeta(swordMeta);
			sword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
			sword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
			pi.addItem(sword);
			
			//Gold Helmet
			ItemStack dhelm = new ItemStack(Material.IRON_HELMET, 1);
			ItemMeta dhelmMeta = dhelm.getItemMeta();
			dhelmMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " Iron Helmet " + ChatColor.DARK_GRAY + "]");
			dhelm.setItemMeta(dhelmMeta);
			dhelm.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			dhelm.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 2);
			pi.addItem(dhelm);
			
			//Diamond Chest
			ItemStack dchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
			ItemMeta dchestMeta = dchest.getItemMeta();
			dchestMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " Iron ChestPlate " + ChatColor.DARK_GRAY + "]");
			dchest.setItemMeta(dchestMeta);
			dchest.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			dchest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			pi.addItem(dchest);
			
			//Diamond Legs
			ItemStack dlegs = new ItemStack(Material.IRON_LEGGINGS, 1);
			ItemMeta dlegsMeta = dlegs.getItemMeta();
			dlegsMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " Iron Leggings " + ChatColor.DARK_GRAY + "]");
			dlegs.setItemMeta(dlegsMeta);
			dlegs.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			dlegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			pi.addItem(dlegs);
			
			//Diamond Boots
			ItemStack dboots = new ItemStack(Material.IRON_BOOTS, 1);
			ItemMeta dbootsMeta = dboots.getItemMeta();
			dbootsMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + " Iron Boots " + ChatColor.DARK_GRAY + "]");
			dboots.setItemMeta(dbootsMeta);
			dboots.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
			dboots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			pi.addItem(dboots);
				
			} 
			if (cmd.getName().equalsIgnoreCase("Menu")) {
				
				//Menu
				ItemStack m = new ItemStack(Material.CHEST, 1);
				ItemMeta mMeta = m.getItemMeta();
				mMeta.setDisplayName(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + " Class Selector " + ChatColor.DARK_GRAY + "]");
				m.setItemMeta(mMeta);
				m.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
				pi.addItem(m);
					
				}
			
			if (cmd.getName().equalsIgnoreCase("help")) {
				sender.sendMessage(ChatColor.BOLD + ">-------------" + ChatColor.GRAY + "[" + ChatColor.GOLD + "PitPvP" + ChatColor.GRAY + "]" + ChatColor.WHITE + ChatColor.BOLD + "-------------<");
				sender.sendMessage(ChatColor.GOLD + "Plugins:" + ChatColor.GRAY + ChatColor.BOLD + " PitPvP ");
				sender.sendMessage(ChatColor.GOLD + "1." + ChatColor.GRAY + ChatColor.BOLD + " /Hub " + ChatColor.GOLD + "Sends You Back To The Hub!");
				sender.sendMessage(ChatColor.GOLD + "2." + ChatColor.GRAY + ChatColor.BOLD + " /Spawn " + ChatColor.GOLD + "Sends You Back To The Spawn!");
				sender.sendMessage(ChatColor.GOLD + "3." + ChatColor.GRAY + ChatColor.BOLD + " /Balance " + ChatColor.GOLD + "Shows Your Balance!");
				sender.sendMessage(ChatColor.GOLD + "4." + ChatColor.GRAY + ChatColor.BOLD + " /Bal " + ChatColor.GOLD + "Shows Your Balance!");
				sender.sendMessage(ChatColor.GOLD + "5." + ChatColor.GRAY + ChatColor.BOLD + " /Money " + ChatColor.GOLD + "Shows Your Balance!");
				sender.sendMessage(ChatColor.GOLD + "6." + ChatColor.GRAY + ChatColor.BOLD + " /Balance " + ChatColor.GOLD + "Shows Your Balance!");
				sender.sendMessage(ChatColor.GOLD + "7." + ChatColor.GRAY + ChatColor.BOLD + " /Help " + ChatColor.GOLD + "See A List Of Commands!");
				sender.sendMessage(ChatColor.BOLD + ">-------------" + ChatColor.GRAY + "[" + ChatColor.GOLD + "PitPvP" + ChatColor.GRAY + "]" + ChatColor.WHITE + ChatColor.BOLD + "-------------<"); 
					
				}
				if (cmd.getName().equalsIgnoreCase("pl")) {
					sender.sendMessage(ChatColor.WHITE + "Plugins (1): " + ChatColor.GREEN + "PitPvP"); 
						
					}
				if (cmd.getName().equalsIgnoreCase("?")) {
					sender.sendMessage(ChatColor.WHITE + "Plugins (1): " + ChatColor.GREEN + "PitPvP");
				}
			
			
		return true;
	}

}
