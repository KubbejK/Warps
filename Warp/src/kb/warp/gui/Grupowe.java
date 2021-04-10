package kb.warp.gui;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import kb.warp.main.Main;

public class Grupowe {
	
static Main plugin;
	
	public Grupowe(Main m) {
		plugin = m;
	}
	
	public static ItemStack item() {
		ItemStack item = new ItemStack(Material.SPONGE);
		ItemMeta itemM = item.getItemMeta();
		
		itemM.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("grupowe.name")));
		
		ArrayList<String> lore = new ArrayList<String>();
		
		List<String> itemList = plugin.getConfig().getStringList("grupowe.lore");
		
		for(String a : itemList) {
			lore.add(ChatColor.translateAlternateColorCodes('&', a));
		}
		
		itemM.setLore(lore);
		item.setItemMeta(itemM);
		
		return item;
	}

}