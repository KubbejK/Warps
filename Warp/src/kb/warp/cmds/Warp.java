package kb.warp.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import kb.warp.gui.OpenGUI;
import kb.warp.main.Main;

public class Warp implements CommandExecutor {
	
	Main plugin;
	
	public Warp(Main m) {
		plugin = m;
		m.getCommand("warp").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		Player p =(Player) sender;
		OpenGUI.OpenGUI(p);
		return false;
	}
	
	

}
