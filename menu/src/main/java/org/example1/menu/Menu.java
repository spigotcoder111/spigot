package org.example1.menu;

import org.bukkit.plugin.java.JavaPlugin;
import org.example1.menu.commands.menuCMD;
import org.example1.menu.listeners.OnPlayerClick;

public final class Menu extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("в работе");
        getCommand("menu").setExecutor(new menuCMD());
        getServer().getPluginManager().registerEvents(new OnPlayerClick(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
