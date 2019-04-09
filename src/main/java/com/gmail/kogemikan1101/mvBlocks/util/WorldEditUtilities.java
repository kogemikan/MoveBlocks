package com.gmail.kogemikan1101.mvBlocks.util;

import com.sk89q.worldedit.LocalSession;
import com.sk89q.worldedit.bukkit.BukkitPlayer;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import javax.annotation.Nullable;

/**
 * @author kogemikan
 */
public class WorldEditUtilities {
    private static WorldEditPlugin worldEditPlugin = null;


    private WorldEditUtilities() {
        throw new AssertionError();
    }

    @Nullable
    public static WorldEditPlugin getWorldEditPlugin() {
        if (worldEditPlugin == null) {

            try {
                Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("WorldEdit");
                if (plugin != null) {
                    if (plugin instanceof WorldEditPlugin) {
                        worldEditPlugin = (WorldEditPlugin) plugin;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                Bukkit.getLogger().warning("Can't load WorldEdit");
            }

        }

        return worldEditPlugin;
    }

    @Nullable
    public static LocalSession getPlayerLocalSession(Player player) {

        try {
            final WorldEditPlugin wePlugin = getWorldEditPlugin();
            if (wePlugin != null) {
                return wePlugin.getSession(player);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Nullable
    public static BukkitPlayer getBukkitPlayer(Player player) {

        try {
            final WorldEditPlugin wePlugin = getWorldEditPlugin();
            if(wePlugin != null) {
                return wePlugin.wrapPlayer(player);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}


