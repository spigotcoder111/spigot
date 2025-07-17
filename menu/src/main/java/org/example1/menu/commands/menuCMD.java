package org.example1.menu.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class menuCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player p){

            final Inventory menu = Bukkit.createInventory(p, 9, "меню");

            ItemStack TNT = new ItemStack(Material.TNT);
            ItemMeta TNTmeta = TNT.getItemMeta();
            TNTmeta.setDisplayName("Оно убьет тебя");
            TNTmeta.addEnchant(Enchantment.KNOCKBACK, 10000, true);
            TNT.setItemMeta(TNTmeta);
            menu.setItem(2, TNT);

            ItemStack BREAD = new ItemStack(Material.BREAD);
            ItemMeta BREADmeta = BREAD.getItemMeta();
            BREADmeta.setDisplayName("Оно убьет тебя");
            BREADmeta.addEnchant(Enchantment.KNOCKBACK, 10000, true);
            BREAD.setItemMeta(BREADmeta);
            menu.setItem(5, BREAD);

            ItemStack SWORD = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta SWORDmeta = SWORD.getItemMeta();
            SWORDmeta.setDisplayName("Оно убьет тебя");
            SWORDmeta.addEnchant(Enchantment.KNOCKBACK, 10000, true);
            SWORD.setItemMeta(SWORDmeta);
            menu.setItem(8, SWORD);


            p.openInventory(menu);

        }

        return true;
    }
}
