package kb.warp.main;

import org.bukkit.plugin.java.JavaPlugin;

import kb.warp.cmds.Warp;
import kb.warp.events.InventoryClick;
import kb.warp.gui.Drzewkarki;
import kb.warp.gui.Grupowe;
import kb.warp.gui.PvP;
import kb.warp.gui.Regulamin;
import kb.warp.gui.Spawn;
import kb.warp.gui.Stoniarki;
import kb.warp.gui.Swagger;
import kb.warp.gui.Villager;

public class Main extends JavaPlugin{
	
	public static Main main;
	
	public void onEnable() {
		
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		main = this;
		
		new InventoryClick(this);
		
		new PvP(this);
		new Stoniarki(this);
		new Spawn(this);
		new Swagger(this);
		new Drzewkarki(this);
		new Grupowe(this);
		new Villager(this);
		new Regulamin(this);
		
		new Warp(this);
		
		getServer().getPluginManager().registerEvents(new InventoryClick(this), this);
	}
	
	public static Main getMain() {
		return main;
	}

}
