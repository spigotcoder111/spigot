package org.Bow.tpBow.commands;

import org.Bow.tpBow.TpBow;
import org.Bow.tpBow.utily.BowUtily;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class giveBow implements CommandExecutor {

    private BowUtily BowUtily;
    private TpBow plugin;

    public giveBow(TpBow plugin) {
        this.plugin = plugin;
        BowUtily bow = new BowUtily(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player p) {
            if (args.length == 0) {
                if (p.hasPermission("bow.get")){

                    ItemStack bow = new BowUtily(plugin).BowUtily();
                    p.getInventory().addItem(bow);


                }else{

                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("no-bow.get-permission")));
                }

            }else if(args.length == 1){
                if(p.hasPermission("bow.other")){

                    Player target = Bukkit.getPlayerExact(args[0]);

                    if(target == null){

                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("bow-get-null-message")));
                    }else{
                        ItemStack bow = new BowUtily(plugin).BowUtily();
                        target.getInventory().addItem(bow);
                        p.sendMessage(ChatColor.YELLOW + "лук был выдан" + target.getDisplayName());
                    }

                }else{

                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("&eУ вас нет прав")));
                }

            }else if(args.length > 1){

                p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "вы неправильно ввели команду: " + ChatColor.GREEN + "пример /givebow <player>");
            }
        }
        return true;
    }
}
