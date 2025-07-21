package org.Bow.tpBow;

import org.Bow.tpBow.commands.giveBow;
import org.Bow.tpBow.listeners.hintEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TpBow extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("плагин в работе");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("givebow").setExecutor(new giveBow(this));
        getServer().getPluginManager().registerEvents(new hintEvent(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
