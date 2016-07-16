package it.mattiasaluta.hardsurvival;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakEvent{
	
	public void onBreaks(BlockBreakEvent e){
	
		if(e.getBlock().getType().equals(Material.COAL_ORE) || e.getBlock().getType().equals(Material.COAL_BLOCK)){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.STONE_PICKAXE))
		{
;
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.COAL, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			return;	
			}
		}
        }
	
public void onbreak1(BlockBreakEvent e){
	if(e.getBlock().getType().equals(Material.STONE) || e.getBlock().getType().equals(Material.COBBLESTONE) || e.getBlock().getType().equals(Material.STONE_BUTTON) || e.getBlock().getType().equals(Material.STONE_PLATE) || e.getBlock().getType().equals(Material.STONE) || e.getBlock().getType().equals(Material.STONE_SLAB2) ||  e.getBlock().getType().equals(Material.COBBLESTONE_STAIRS) || e.getBlock().getType().equals(Material.DOUBLE_STONE_SLAB2) || e.getBlock().getType().equals(Material.PISTON_BASE) || e.getBlock().getType().equals(Material.PISTON_EXTENSION) || e.getBlock().getType().equals(Material.PISTON_MOVING_PIECE) || e.getBlock().getType().equals(Material.PISTON_STICKY_BASE)){

		
		if (e.getPlayer().getItemInHand().getType().equals(Material.WOOD_PICKAXE))
	{
		
		Player p = e.getPlayer();
		e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
	p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
	Block block = e.getBlock();
	block.setType(Material.AIR);
	block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.COBBLESTONE, 1));
	e.setCancelled(true);
	
	}
		else {
			e.setCancelled(true);
			
		return;	
		}
	}
}
	
public void onbreak2(BlockBreakEvent e){
	
	if(e.getBlock().getType().equals(Material.IRON_ORE) || e.getBlock().getType().equals(Material.IRON_BLOCK)){
		 
		
		if (e.getPlayer().getItemInHand().getType().equals(Material.STONE_PICKAXE))
	{
;
		Player p = e.getPlayer();
		e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
	p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
	Block block = e.getBlock();
	block.setType(Material.AIR);
	block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.IRON_INGOT, 1));
	e.setCancelled(true);
	
	}
		else {
			e.setCancelled(true);
			
		    return;	
		}
	}

}
	
public void onbreak3(BlockBreakEvent e){
	
	if(e.getBlock().getType().equals(Material.GOLD_ORE) || e.getBlock().getType().equals(Material.GOLD_BLOCK)){
		 
		
		if (e.getPlayer().getItemInHand().getType().equals(Material.IRON_PICKAXE))
	{
;
		Player p = e.getPlayer();
		e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
	p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
	Block block = e.getBlock();
	block.setType(Material.AIR);
	block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GOLD_INGOT, 1));
	e.setCancelled(true);
	
	}
		else {
			e.setCancelled(true);
			
		    return;	
		}
	}
}
	
	public void onbreak4(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.DIAMOND_ORE) || e.getBlock().getType().equals(Material.DIAMOND_BLOCK)){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.IRON_PICKAXE))
		{
	;
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.DIAMOND, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
	
	public void onbreak41(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.OBSIDIAN)){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_PICKAXE))
		{
	;
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.OBSIDIAN, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
	
	public void onbreak5(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.SAND) || e.getBlock().getType().equals(Material.GLASS) ||e.getBlock().getType().equals(Material.STAINED_GLASS) || e.getBlock().getType().equals(Material.THIN_GLASS) || e.getBlock().getType().equals(Material.STAINED_GLASS_PANE)){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.WOOD_SPADE)|| e.getPlayer().getItemInHand().getType().equals(Material.STONE_SPADE)|| e.getPlayer().getItemInHand().getType().equals(Material.GOLD_SPADE) || e.getPlayer().getItemInHand().getType().equals(Material.IRON_SPADE) || e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_SPADE)  )
		{
	
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GLASS, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
	
	public void onbreak6(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.DIRT) || e.getBlock().getType().equals(Material.GRASS) || e.getBlock().getType().equals(Material.FLOWER_POT) || e.getBlock().getType().equals(Material.LONG_GRASS)){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.WOOD_SPADE)|| e.getPlayer().getItemInHand().getType().equals(Material.STONE_SPADE)|| e.getPlayer().getItemInHand().getType().equals(Material.GOLD_SPADE) || e.getPlayer().getItemInHand().getType().equals(Material.IRON_SPADE) || e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_SPADE)  )
		{
	
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.DIRT, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
	
	public void onbreak7(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.LOG) || e.getBlock().getType().equals(Material.WORKBENCH) || e.getBlock().getType().equals(Material.BIRCH_DOOR) || e.getBlock().getType().equals(Material.BIRCH_FENCE) || e.getBlock().getType().equals(Material.BIRCH_FENCE_GATE) || e.getBlock().getType().equals(Material.BIRCH_WOOD_STAIRS)||  e.getBlock().getType().equals(Material.BIRCH_DOOR) || e.getBlock().getType().equals(Material.BIRCH_FENCE) || e.getBlock().getType().equals(Material.BIRCH_FENCE_GATE) || e.getBlock().getType().equals(Material.BIRCH_WOOD_STAIRS) || e.getBlock().getType().equals(Material.JUNGLE_DOOR) || e.getBlock().getType().equals(Material.JUNGLE_FENCE) || e.getBlock().getType().equals(Material.JUNGLE_FENCE_GATE) || e.getBlock().getType().equals(Material.JUNGLE_WOOD_STAIRS) || e.getBlock().getType().equals(Material.SPRUCE_DOOR) || e.getBlock().getType().equals(Material.SPRUCE_FENCE) || e.getBlock().getType().equals(Material.SPRUCE_FENCE_GATE) || e.getBlock().getType().equals(Material.SPRUCE_WOOD_STAIRS) ||  e.getBlock().getType().equals(Material.ACACIA_DOOR) || e.getBlock().getType().equals(Material.ACACIA_FENCE) || e.getBlock().getType().equals(Material.ACACIA_FENCE_GATE) || e.getBlock().getType().equals(Material.ACACIA_STAIRS) ||  e.getBlock().getType().equals(Material.DARK_OAK_DOOR) || e.getBlock().getType().equals(Material.DARK_OAK_FENCE) || e.getBlock().getType().equals(Material.DARK_OAK_FENCE_GATE) || e.getBlock().getType().equals(Material.DARK_OAK_STAIRS))
			 
		
			 {
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.WOOD_AXE)|| e.getPlayer().getItemInHand().getType().equals(Material.STONE_AXE)|| e.getPlayer().getItemInHand().getType().equals(Material.GOLD_AXE) || e.getPlayer().getItemInHand().getType().equals(Material.IRON_AXE) || e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_AXE)  )
		{
	
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.WOOD, 4));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
	
	public void onbreak8(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.LAPIS_BLOCK) || e.getBlock().getType().equals(Material.LAPIS_ORE)){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_PICKAXE))
		{
	;
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.LAPIS_BLOCK, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
	public void onbreak9(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.REDSTONE) || e.getBlock().getType().equals(Material.REDSTONE_BLOCK) || e.getBlock().getType().equals(Material.REDSTONE_COMPARATOR) || e.getBlock().getType().equals(Material.REDSTONE_COMPARATOR_OFF) || e.getBlock().getType().equals(Material.REDSTONE_COMPARATOR_ON) || e.getBlock().getType().equals(Material.REDSTONE_LAMP_OFF) || e.getBlock().getType().equals(Material.REDSTONE_LAMP_ON) || e.getBlock().getType().equals(Material.REDSTONE_ORE) || e.getBlock().getType().equals(Material.REDSTONE_TORCH_OFF) || e.getBlock().getType().equals(Material.REDSTONE_TORCH_ON) || e.getBlock().getType().equals(Material.REDSTONE_WIRE) || e.getBlock().getType().equals(Material.GLOWING_REDSTONE_ORE)){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.IRON_PICKAXE))
		{
	;
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.REDSTONE, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
	
	public void onbreak10(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.EMERALD) || e.getBlock().getType().equals(Material.EMERALD_BLOCK) || e.getBlock().getType().equals(Material.EMERALD_ORE)){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_PICKAXE))
		{
	;
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.EMERALD, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
	
	public void onbreak11(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.WOOL)){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.SHEARS))
		{
	;
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.STRING, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
	
	public void onbreak12(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.LEAVES) || e.getBlock().getType().equals(Material.LEAVES_2) ){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.SHEARS))
		{
	;
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.LEAVES, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
	
	public void onbreak13(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.HARD_CLAY) || e.getBlock().getType().equals(Material.STAINED_CLAY)){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.WOOD_SPADE)|| e.getPlayer().getItemInHand().getType().equals(Material.STONE_SPADE)|| e.getPlayer().getItemInHand().getType().equals(Material.GOLD_SPADE) || e.getPlayer().getItemInHand().getType().equals(Material.IRON_SPADE) || e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_SPADE)  )
		{
	
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.CLAY_BALL, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
	
	public void onbreak14(BlockBreakEvent e){
		
		if(e.getBlock().getType().equals(Material.GRAVEL)){
			 
			
			if (e.getPlayer().getItemInHand().getType().equals(Material.WOOD_SPADE)|| e.getPlayer().getItemInHand().getType().equals(Material.STONE_SPADE)|| e.getPlayer().getItemInHand().getType().equals(Material.GOLD_SPADE) || e.getPlayer().getItemInHand().getType().equals(Material.IRON_SPADE) || e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_SPADE)  )
		{
	
			Player p = e.getPlayer();
			e.getPlayer().getInventory().removeItem(new ItemStack(p.getItemInHand().getTypeId(), 1));
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
		Block block = e.getBlock();
		block.setType(Material.AIR);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.FLINT, 1));
		e.setCancelled(true);
		
		}
			else {
				e.setCancelled(true);
				
			    return;	
			}
		}

}
		
	}


