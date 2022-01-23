package org.jawa.mcping;



import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static Logger console;
	@Override
	public void onEnable() {
		console = Bukkit.getServer().getLogger();
		System.out.println("digo mi se");
		getServer().getPluginManager().registerEvents(new MainListener(), this);
	}
}
