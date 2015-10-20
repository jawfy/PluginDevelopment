package me.jackears;

import org.bukkit.Material;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Pig;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class DropsListener implements Listener {
    
    @SuppressWarnings("unused")
    private Deathdrops deathdrops;
    public DropsListener(Deathdrops core) {
            this.deathdrops = core;
    }
    
 
    //PLAYER DEATH DROP
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.GOLDEN_APPLE, 1));
    }
    
	//ENTITY DROPS //FRIENDLY
    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
            if (e.getEntity() instanceof Sheep) {
                    e.getDrops().clear();
                    e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.COOKED_MUTTON, 2));
            }
            if (e.getEntity() instanceof Cow) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.COOKED_BEEF, 2));
            if (e.getEntity() instanceof Chicken) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.COOKED_CHICKEN, 2));
            }
           
            if (e.getEntity() instanceof Pig) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.GRILLED_PORK, 2));
            }
            
            if (e.getEntity() instanceof Wolf) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.BONE, 2));
            }
            
            if (e.getEntity() instanceof Squid) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.WATER_BUCKET, 1));
            }
            
            if (e.getEntity() instanceof Ocelot) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.COOKED_FISH, 2));
            }
            
            if (e.getEntity() instanceof Horse) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.BREAD, 2));
            }
            
            } else {
            
            if (e.getEntity() instanceof Zombie) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.BAKED_POTATO, 2));
            }
            
            if (e.getEntity() instanceof Skeleton) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.BOW, 1));
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.ARROW, 16));
            }
            
            if (e.getEntity() instanceof Creeper) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.TNT, 1));
            }
            
            if (e.getEntity() instanceof Blaze) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.LAVA_BUCKET, 1));
            }
            
            if (e.getEntity() instanceof Spider) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.WEB, 1));
            }
            
            if (e.getEntity() instanceof Enderman) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.ENDER_PEARL, 1));
            }
            
			if (e.getEntity() instanceof PigZombie) {
				e.getDrops().clear();
				e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.GOLD_INGOT, 1));
			}
            
            if (e.getEntity() instanceof Ghast) {
                e.getDrops().clear();
                e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.GHAST_TEAR, 1));
            }
            }
            }
    }
    
