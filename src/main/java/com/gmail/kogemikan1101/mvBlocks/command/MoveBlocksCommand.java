package com.gmail.kogemikan1101.mvBlocks.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.graalvm.compiler.lir.sparc.SPARCMove;

import javax.swing.text.TabExpander;
import java.util.List;

public class MoveBlocksCommand implements TabExecutor {


    public MoveBlocksCommand() {

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }
}
