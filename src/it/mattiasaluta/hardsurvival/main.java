package it.mattiasaluta.hardsurvival;

import java.util.Date;
import java.util.HashMap;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.TextComponent;

public class main extends JavaPlugin implements Listener{
    private DestroyTools d = new DestroyTools();
    private BreakEvent b = new BreakEvent();
    private DisableCraftings dc = new DisableCraftings();
    public final HashMap<Player, Integer> deathmap = new HashMap();
    int deathCount = 0;
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
        this.getLogger().info("{HardSurvival} is on");
    }

    public void onDisable() {
        this.getLogger().info("{HardSurvival} is off");
    }

	@EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        ++this.deathCount;
        this.deathmap.put(player, this.deathCount);
        if(this.deathmap.get(player) == 5){
        	Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tempban " + player.getName() + " 1 hour §4§lReturn playing after an hour maybe will go better!");
        	this.deathCount = 0;
        	return;
        }
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            if (cmd.getName().equalsIgnoreCase("death")) {
            	if (((Player)sender).hasPermission("hs.deathsee")){
                if (this.deathmap.get((Object)((Player)sender)) == null) {
                    ((Player)sender).sendMessage((Object)ChatColor.GRAY + "Deaths : 0");
                } else {
                    ((Player)sender).sendMessage((Object)ChatColor.GRAY + "Remaining " + (5 - this.deathmap.get((Object)((Player)sender)))  + " Deaths for the TempBan");
                }
                return true;
            }
            }
            if(cmd.getName().equalsIgnoreCase("src")){
            	TextComponent message = new TextComponent( "Source Code" );
            	message.setBold(true);
            	message.setColor(ChatColor.DARK_GREEN);
            	message.setClickEvent( new ClickEvent( ClickEvent.Action.OPEN_URL, "https://github.com/MattiaSaluta/HardSurvivalPlugin/" ) );
            	((Player)sender).spigot().sendMessage(message);
            }
        }
		return false;
    }
    @EventHandler
    public void onEntityRightClick(PlayerInteractEvent e){
    	if(e.getPlayer().hasPermission("hs.ignore")){
    		return;
    	}
    	else{
    	d.DestroyFishingRod(e);
    	d.DestroyFishingRod2(e);
    	d.DestroyFlintAndSteal(e);
    }
    }
    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
      if(event.getEntity().hasPermission("hs.ignore")){
    	  return;
      }
      else{
    	d.DestroyTools(event);
    }
    }
    @EventHandler
    public void onShootBow(EntityShootBowEvent event){
    	if(event.getEntity().hasPermission("hs.ignore")){
    		return;
    	}
    	else {
    	d.onEntityShootBow(event);
    }
    }	
	@EventHandler
	public void onBreak(BlockBreakEvent e){
		if(e.getPlayer().hasPermission("hs.ignore")){
			return;
		}
		else{
			
		b.onBreaks(e);
		b.onbreak1(e);
		b.onbreak2(e);
		b.onbreak3(e);
		b.onbreak4(e);
		b.onbreak5(e);
		b.onbreak6(e);
		b.onbreak7(e);
		b.onbreak8(e);
		b.onbreak9(e);
		b.onbreak41(e);
		b.onbreak10(e);
		b.onbreak11(e);
		b.onbreak12(e);
		b.onbreak13(e);
		b.onbreak14(e);
		}
	}
	@EventHandler
  public void craftItem(PrepareItemCraftEvent e){
		dc.DisableCraftItem(e);
	}
}