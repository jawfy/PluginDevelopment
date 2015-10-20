package me.jackears;

import java.io.File;
import java.io.IOException;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class FrontierSmelt extends JavaPlugin
  implements Listener
{
  
  @EventHandler
  private void BlockBreak(BlockBreakEvent event)
  {
    Player Player = event.getPlayer();
    File PlayerFile = new File("plugins/PrisonUtils/PlayerData/" + Player.getUniqueId() + ".yml");
    YamlConfiguration LoadPlayerFile = YamlConfiguration.loadConfiguration(PlayerFile);
    Material Block = event.getBlock().getType();
    Location Location = event.getBlock().getLocation();
    LoadPlayerFile.set("PlayerData.Blocks_Mined", Integer.valueOf(LoadPlayerFile.getInt("PlayerData.Blocks_Mined") + 1));
    LoadPlayerFile.save(PlayerFile);
    ScoreboardSystem.SetScoreboard(Player);
    if ((Player.hasPermission("PrisonSmelter.Smelt")) && (
      (Block.equals(Material.IRON_ORE)) || (Block.equals(Material.GOLD_ORE)) || (Block.equals(Material.STONE))))
    {
      ItemStack ItemStack = null;
      if (Player.getGameMode().equals(GameMode.SURVIVAL)) {
        if (Block.equals(Material.IRON_ORE)) {
          ItemStack = new ItemStack(Material.IRON_INGOT);
        } else if (Block.equals(Material.GOLD_ORE)) {
          ItemStack = new ItemStack(Material.GOLD_INGOT);
        } else if ((Block.equals(Material.STONE)) && (event.getBlock().getData() == 0)) {
          ItemStack = new ItemStack(Material.STONE);
        }
      }
      if (ItemStack != null)
      {
        event.setCancelled(true);
        event.getBlock().setType(Material.AIR);
        Item Item = event.getBlock().getWorld().dropItemNaturally(Location.add(0.5D, 0.5D, 0.5D), ItemStack);
        Item.setVelocity(new Vector(0, 0, 0));
      }
    }
  }