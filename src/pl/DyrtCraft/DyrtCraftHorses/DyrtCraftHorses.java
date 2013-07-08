package pl.DyrtCraft.DyrtCraftHorses;

import org.bukkit.Bukkit;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * G³ówna klasa
 * 
 * @author TheMolkaPL
 * @since Release 1.0
 */
public class DyrtCraftHorses extends JavaPlugin implements Listener {
	
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onHorseDamage(EntityDamageByEntityEvent e) {
		if(e.getDamager() instanceof Player) {
			if(e.getEntityType() == EntityType.HORSE) {
				e.setCancelled(true);
			}
		}
		if(e.getDamager() instanceof Arrow) {
			if(e.getEntityType() == EntityType.HORSE) {
				e.setCancelled(true);
			}
		}
	}
	
}
