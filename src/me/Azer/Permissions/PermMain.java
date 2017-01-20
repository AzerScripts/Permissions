package me.Azer.Permissions;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PermMain extends JavaPlugin
{
	
	@Override
	public void onEnable() {
		Logger.getLogger("Server").info("[Permissions] has been Enabled!");
		Bukkit.getServer().getPluginManager().registerEvents(new PermListener(this), this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player p = (Player) sender;
		if (args[0].equalsIgnoreCase("permissions")) {
			p.sendMessage("The plugin works");
		}
		return false;
	}
	
}
