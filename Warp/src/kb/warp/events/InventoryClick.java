package kb.warp.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

import kb.warp.main.Main;

public class InventoryClick implements Listener{
	
	Main plugin;
	
	public InventoryClick(Main m) {
		plugin = m;
	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		if(!ChatColor.stripColor(e.getInventory().getName()).equalsIgnoreCase("Warpy"))
			return;
		Player p = (Player) e.getWhoClicked();
		
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR || !e.getCurrentItem().hasItemMeta()) {
			p.closeInventory();
			return;
		}
		
		switch(e.getCurrentItem().getType()) {
		case DIAMOND_SWORD:
			
			int x1 = plugin.getConfig().getInt("pvp.x");
			int y1 = plugin.getConfig().getInt("pvp.y");
			int z1 = plugin.getConfig().getInt("pvp.z");
			
			p.teleport(new Location(Bukkit.getWorld("world"), x1, y1, z1));
			
			p.closeInventory();
			break;
		case STONE:
			
			int x2 = plugin.getConfig().getInt("stoniarki.x");
			int y2 = plugin.getConfig().getInt("stoniarki.y");
			int z2 = plugin.getConfig().getInt("stoniarki.z");
			
			p.teleport(new Location(Bukkit.getWorld("world"), x2, y2, z2));
			
			break;
		case BEACON:
			
			int x3 = plugin.getConfig().getInt("spawn.x");
			int y3 = plugin.getConfig().getInt("spawn.y");
			int z3 = plugin.getConfig().getInt("spawn.z");
			
			p.teleport(new Location(Bukkit.getWorld("world"), x3, y3, z3));
			
			break;
		case WOOL:

			int x4 = plugin.getConfig().getInt("swagger.x");
			int y4 = plugin.getConfig().getInt("swagger.y");
			int z4 = plugin.getConfig().getInt("swagger.z");
			
			p.teleport(new Location(Bukkit.getWorld("world"), x4, y4, z4));
			
			break;
		case WOOD_AXE:

			int x5 = plugin.getConfig().getInt("drzewkarki.x");
			int y5 = plugin.getConfig().getInt("drzewkarki.y");
			int z5 = plugin.getConfig().getInt("drzewkarki.z");
			
			p.teleport(new Location(Bukkit.getWorld("world"), x5, y5, z5));
			
			break;
		case SPONGE:

			int x6 = plugin.getConfig().getInt("grupowe.x");
			int y6 = plugin.getConfig().getInt("grupowe.y");
			int z6 = plugin.getConfig().getInt("grupowe.z");
			
			p.teleport(new Location(Bukkit.getWorld("world"), x6, y6, z6));
			
			break;
		case EMERALD:

			int x7 = plugin.getConfig().getInt("villager.x");
			int y7 = plugin.getConfig().getInt("villager.y");
			int z7 = plugin.getConfig().getInt("villager.z");
			
			p.teleport(new Location(Bukkit.getWorld("world"), x7, y7, z7));
			
			break;
		case PAPER:

			int x8 = plugin.getConfig().getInt("regulamin.x");
			int y8 = plugin.getConfig().getInt("regulamin.y");
			int z8 = plugin.getConfig().getInt("regulamin.z");
			
			p.teleport(new Location(Bukkit.getWorld("world"), x8, y8, z8));
			
			break;
		default:
			p.closeInventory();
			break;
		}
	}
}