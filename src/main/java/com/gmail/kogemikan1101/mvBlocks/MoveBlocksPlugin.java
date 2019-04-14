package com.gmail.kogemikan1101.mvBlocks;

import com.gmail.kogemikan1101.mvBlocks.command.MoveBlocksCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

/**
 * @author kogemikan
 */
public class MoveBlocksPlugin extends JavaPlugin {

    private static final MoveBlocksCommand PLUGIN_COMMAND = new MoveBlocksCommand();

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return PLUGIN_COMMAND.onCommand(sender, command, label, args);
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return PLUGIN_COMMAND.onTabComplete(sender, command, alias, args);
    }
}
