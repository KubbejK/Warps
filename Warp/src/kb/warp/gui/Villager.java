package kb.warp.gui;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import kb.warp.main.Main;

public class Villager {

static Main plugin;
	
	public Villager(Main m) {
		plugin = m;
	}
	
	public static ItemStack item() {
		ItemStack item = new ItemStack(Material.EMERALD);
		ItemMeta itemM = item.getItemMeta();
		
		itemM.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("villager.name")));
		
		ArrayList<String> lore = new ArrayList<String>();
		
		List<String> itemList = plugin.getConfig().getStringList("villager.lore");
		
		for(String a : itemList) {
			lore.add(ChatColor.translateAlternateColorCodes('&', a));
		}
		
		itemM.setLore(lore);
		item.setItemMeta(itemM);
		
		return item;
	}

}