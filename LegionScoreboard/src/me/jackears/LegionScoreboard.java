package me.jackears;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import net.md_5.bungee.api.ChatColor;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
public class LegionScoreboard extends JavaPlugin implements Listener {

	static ArrayList<String> A = new ArrayList<String>();
	
	/*
	 * text: Programmed by JaapaGamerz
	 * @return
	 */
	
    private static final Logger log = Logger.getLogger("Minecraft");
    public static Economy econ = null;
    public static Permission perms = null;
    public static Chat chat = null;

    @Override
    public void onDisable() {
        log.info(String.format("[%s] Disabled Version %s", getDescription().getName(), getDescription().getVersion()));
    }

    @Override
    public void onEnable() {
        if (!setupEconomy() ) {
            log.severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
    		Bukkit.getPluginManager().registerEvents(this, this);
    		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "AnimateScoreboard is now enabled - Version Using: " + getDescription().getVersion());
            return;
        }
        setupPermissions();
        setupChat();
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

    private boolean setupChat() {
        RegisteredServiceProvider<Chat> rsp = getServer().getServicesManager().getRegistration(Chat.class);
        chat = rsp.getProvider();
        return chat != null;
    }

    private boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp = getServer().getServicesManager().getRegistration(Permission.class);
        perms = rsp.getProvider();
        return perms != null;
    }
	
	public void add(final Player player) {
		final ScoreboardManager manager = Bukkit.getScoreboardManager();
		final Scoreboard board = manager.getNewScoreboard();
		
		final Objective objective = board.registerNewObjective("Scoreboard", "dummy");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		
		Score spacer = objective.getScore(ChatColor.translateAlternateColorCodes('&',"&b"));
		spacer.setScore(2);
		
		Score score = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&bWelcome"));
		Score score1 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&8>> &7" + player.getName()));
		score.setScore(1);
		score1.setScore(0);
		
		Score score2 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&bBalance"));
		@SuppressWarnings({ "deprecation", "unused" })
		double r = econ.getBalance(player.getName());
		Score score3 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&8>> &7"));
		score2.setScore(-1);
		score3.setScore(-2);
		
		A.clear();
		A.add("1");
		
		BukkitScheduler Scheduler = Bukkit.getServer().getScheduler();
		Scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@Override
			public void run() {
				Integer i = A.size();
				
				if(i == 1) {
					objective.setDisplayName(Format("&8>> &b&lLegionPvP &8<<"));
					A.add("A");
				}
				if(i == 2) {
					objective.setDisplayName(Format("&8>> &3&lLegionPvP &8<<"));
					A.add("B");
				}
				if(i == 3) {
					objective.setDisplayName(Format("&8>> &9&lLegionPvP &8<<"));
					A.add("C");
				}
				if(i == 3) {
				 // Clear Messages and Start One Message
					A.clear();
					A.add("1");
				}
			}
		}, 0, 5);
		player.setScoreboard(board);
	}
	
	public static String Format(String text) {
		return text.replaceAll("&", "\u00a7");
	}
	
	@EventHandler
	public void PlayerJoinEvent(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		this.add(p);
	}
	
}