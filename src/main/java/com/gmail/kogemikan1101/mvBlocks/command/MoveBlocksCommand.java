package com.gmail.kogemikan1101.mvBlocks.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kogemikan
 */
public class MoveBlocksCommand implements TabExecutor {

    private List<MoveBlocksSubCommand> subCommands;


    public MoveBlocksCommand() {

        //サブコマンドクラス群のインスタンス化
        subCommands = new ArrayList<MoveBlocksSubCommand>() {{
            add(new CreateCommand());
        }};

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //引数が1つ以上の場合はサブコマンド別にコマンドの処理をさせる
        if(args.length >= 1) {
            for( MoveBlocksSubCommand cmd : subCommands) {
                if(cmd.getCommandName().equalsIgnoreCase(args[0])) {

                    //コマンドパーミッションの確認
                    if(!sender.hasPermission(cmd.getPermissionNode())) {
                        //パーミッションを持ってなかった時の処理
                        sender.sendMessage(ChatColor.RED + "コマンドを実行するためのパーミッションを持っていません。");
                        return true;
                    }
                    //サブコマンド処理
                    return cmd.executeCommand(sender, label, args);
                }
            }
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {

        //引数が1つの場合はサブコマンドの補完
        if(args.length == 1) {
            String sub = args[0].toLowerCase();
            ArrayList<String> completions = new ArrayList<>();

            for( MoveBlocksSubCommand cmd : subCommands )
                if(cmd.getCommandName().startsWith(sub) && sender.hasPermission(cmd.getPermissionNode()))
                    completions.add(cmd.getCommandName());

            return completions;
        }


        return null;
    }
}
