package it.mattiasaluta.hardsurvival;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.*;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class DestroyTools {
    

	public void DestroyTools(EntityDamageEvent e){
	        if(e instanceof EntityDamageByEntityEvent){
	            EntityDamageByEntityEvent event = (EntityDamageByEntityEvent) e;
	            Player p = (Player) event.getDamager();

	            	if(p.getItemInHand().getType().equals(Material.STONE_PICKAXE) || p.getItemInHand().getType().equals(Material.WOOD_PICKAXE) || p.getItemInHand().getType().equals(Material.STONE_SWORD) || p.getItemInHand().getType().equals(Material.WOOD_SWORD) || p.getItemInHand().getType().equals(Material.IRON_SWORD) || p.getItemInHand().getType().equals(Material.GOLD_SWORD) ||  p.getItemInHand().getType().equals(Material.DIAMOND_SWORD) || p.getItemInHand().getType().equals(Material.IRON_PICKAXE) || p.getItemInHand().getType().equals(Material.GOLD_PICKAXE) || p.getItemInHand().getType().equals(Material.DIAMOND_PICKAXE) || p.getItemInHand().getType().equals(Material.WOOD_AXE) || p.getItemInHand().getType().equals(Material.STONE_AXE) || p.getItemInHand().getType().equals(Material.GOLD_AXE) || p.getItemInHand().getType().equals(Material.IRON_AXE) || p.getItemInHand().getType().equals(Material.DIAMOND_AXE) || p.getItemInHand().getType().equals(Material.WOOD_SPADE) || p.getItemInHand().getType().equals(Material.STONE_SPADE) || p.getItemInHand().getType().equals(Material.GOLD_SPADE) || p.getItemInHand().getType().equals(Material.IRON_SPADE) || p.getItemInHand().getType().equals(Material.DIAMOND_SPADE) || p.getItemInHand().getType().equals(Material.WOOD_HOE) || p.getItemInHand().getType().equals(Material.STONE_HOE) || p.getItemInHand().getType().equals(Material.IRON_HOE) || p.getItemInHand().getType().equals(Material.GOLD_HOE) || p.getItemInHand().getType().equals(Material.DIAMOND_HOE)|| p.getItemInHand().getType().equals(Material.FISHING_ROD) )
	            			{
	 	         p.getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
	 	         p.playSound(p.getLocation(), Sound.ITEM_BREAK, 10, 10);
	 	         
	            	}
	            	}
	        }
	
	public void onEntityShootBow(EntityShootBowEvent event) {
        if(event.isCancelled()) { 
            return;
        }
        if(!(event.getEntity() instanceof Player)) {
            return;
        }
        Player p = (Player) event.getEntity();
        p.getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
        p.playSound(p.getLocation(), Sound.ITEM_BREAK, 10, 10);
}
	public void DestroyFishingRod(PlayerInteractEvent e){
		if(!(e.getAction() == Action.RIGHT_CLICK_AIR)) return;
		if(!(e.getItem().getType() == Material.FISHING_ROD)) return; 
		Player p = e.getPlayer();
		p.getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.ITEM_BREAK, 10, 10);
	}
	public void DestroyFishingRod2(PlayerInteractEvent e){
		if(!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
		if(!(e.getItem().getType() == Material.FISHING_ROD)) return; 
		Player p = e.getPlayer();
		p.getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.ITEM_BREAK, 10, 10);
	}
   public void DestroyFlintAndSteal(PlayerInteractEvent e){
		if(!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return; 
		if(!(e.getItem().getType() == Material.FLINT_AND_STEEL)) return; 
		Player p = e.getPlayer();
		p.getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.ITEM_BREAK, 10, 10);
	} 
   }

	

