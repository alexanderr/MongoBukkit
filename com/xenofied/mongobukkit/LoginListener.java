package com.xenofied.mongobukkit;


import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class LoginListener implements Listener {

    public LoginListener() {
        MongoBukkit.getPlugin().getServer().getPluginManager().registerEvents(this, MongoBukkit.getPlugin());
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onLogin(PlayerLoginEvent event) {
        MongoBukkit.hasPlayer(MongoBukkit.getPlugin(), event.getPlayer().getUniqueId());
    }
}