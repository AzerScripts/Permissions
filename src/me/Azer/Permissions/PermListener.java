package me.Azer.Permissions;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PermListener implements Listener
{
	public PermMain plugin;
	
	public PermListener(PermMain instance) {
		plugin = instance;
	}
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		p.sendMessage("The Listener works");
	}
}
