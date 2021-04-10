package kb.warp.gui;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import kb.warp.main.Main;

public class Spawn {
	
static Main plugin;
	
	public Spawn(Main m) {
		plugin = m;
	}
	
	public static ItemStack item() {
		ItemStack item = new ItemStack(Material.WOOL);
		ItemMeta itemM = item.getItemMeta();
		
		itemM.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("spawn.name")));
		
		ArrayList<String> lore = new ArrayList<String>();
		
		List<String> itemList = plugin.getConfig().getStringList("spawn.lore");
		
		for(String a : itemList) {
			lore.add(ChatColor.translateAlternateColorCodes('&', a));
		}
		
		itemM.setLore(lore);
		item.setItemMeta(itemM);
		
		return item;
	}

}
