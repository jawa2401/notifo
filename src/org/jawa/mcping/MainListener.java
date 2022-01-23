package org.jawa.mcping;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class MainListener implements Listener {
	@EventHandler
	public void on_message(AsyncPlayerChatEvent e) {
		Player sender = e.getPlayer();
		Server server=sender.getServer();
		Collection<? extends Player> players=server.getOnlinePlayers();
		for (Player player : players) {
			Main.console.info(player.getName());
			if (player.getUniqueId() != sender.getUniqueId()) {
				player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 100f, 2f-(24f-17f)*0.125f);
				player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 100f, 2f-(24f-10f)*0.125f);
				
				try {
					TimeUnit.MILLISECONDS.sleep(66);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 100f, 2f-(24f-20f)*0.125f);
				player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 100f, 2f-(24f-13f)*0.125f);
				
			}
		}
	}
}
