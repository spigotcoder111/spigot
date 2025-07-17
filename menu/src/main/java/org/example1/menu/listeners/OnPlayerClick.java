package org.example1.menu.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;


public class OnPlayerClick implements Listener {

    @EventHandler

    public void OnPLayerClick(InventoryClickEvent event) {


        if (event.getView().getTitle().equals("меню")){


            event.setCancelled(true);


            if (!event.getClick().isLeftClick()) return;

            Player player = (Player) event.getWhoClicked();


            switch (event.getCurrentItem().getType()){
                case BREAD:
                    player.setFoodLevel(20);
                    break;
                case TNT:
                    player.setHealth(0);
                    break;
                case DIAMOND_SWORD:
                    player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
                    break;
            }

        }else{
            System.out.println(event.getView().getTitle());
        }

    }

}


