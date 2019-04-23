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

    private MoveBlocksCommand pluginCommand;

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        pluginCommand = new MoveBlocksCommand();
        super.onEnable();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return pluginCommand.onCommand(sender, command, label, args);
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return pluginCommand.onTabComplete(sender, command, alias, args);
    }
}
