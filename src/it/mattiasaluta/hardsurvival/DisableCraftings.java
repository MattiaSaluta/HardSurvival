package it.mattiasaluta.hardsurvival;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

public class DisableCraftings {
	    public void DisableCraftItem(PrepareItemCraftEvent e) {
	        Material itemType = e.getRecipe().getResult().getType();
	        Byte itemData = e.getRecipe().getResult().getData().getData();
	        if(itemType==Material.TNT||itemType==Material.ANVIL||itemType==Material.ENCHANTMENT_TABLE) {
	            e.getInventory().setResult(new ItemStack(Material.AIR));
	            for(HumanEntity he:e.getViewers()) {
	                if(he instanceof Player) {
	                    ((Player)he).sendMessage(ChatColor.RED+"Non puoi craftare questo item!");
	                }
	            }
	        }
	    }
}
