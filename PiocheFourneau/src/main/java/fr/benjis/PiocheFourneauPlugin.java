package fr.benjis;

import org.bukkit.plugin.java.JavaPlugin;

public class PiocheFourneauPlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		getCommand("piochefourneau").setExecutor(new CommandPiocheFourneau());
	}

}
