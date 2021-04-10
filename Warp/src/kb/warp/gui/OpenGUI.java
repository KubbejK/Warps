package kb.warp.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class OpenGUI {

	
	public static void OpenGUI(Player p) {
		Inventory i = Bukkit.createInventory(null, 54, ChatColor.DARK_GRAY + "Warpy");
		
		ItemStack pvp = PvP.item();
		ItemStack stoniarki = Stoniarki.item();
		ItemStack spawn = Spawn.item();
		ItemStack swagger = Swagger.item();
		ItemStack drzewkarki = Drzewkarki.item();
		ItemStack grupowe = Grupowe.item();
		ItemStack villager = Villager.item();
		ItemStack regulamin = Regulamin.item();
		
		i.setItem(11, pvp);
		i.setItem(13, grupowe);
		i.setItem(15, drzewkarki);
		i.setItem(20, regulamin);
		i.setItem(21, stoniarki);
		i.setItem(23, villager);
		i.setItem(24, spawn);
		i.setItem(31, swagger);
		
		p.openInventory(i);
	}

}
