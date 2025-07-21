package org.Bow.tpBow.listeners;

import org.Bow.tpBow.TpBow;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class hintEvent implements Listener {

    private TpBow plugin;

    public hintEvent(TpBow plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void OnAroowHint(ProjectileHitEvent e){

        if(e.getEntity().getShooter() instanceof Player p){

            if(p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("bow-name")))) {
                Location l = e.getEntity().getLocation();
                p.teleport(l);
            }
        }
    }



}
