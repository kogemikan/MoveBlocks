package com.gmail.kogemikan1101.mvBlocks.command;

import org.bukkit.command.CommandSender;

/*
プラグインのコマンド用インターフェース
 */
public interface MoveBlocksSubCommand {

    /**
     * コマンド名を取得する
     * @return コマンド名
     */
    public abstract String getCommandName();

    /**
     * パーミッションノードを取得する
     * @return パーミッションノード
     */
    public abstract String getPermissionNode();

    /**
     * コマンドを実行する
     * @param sender コマンドの実行者
     * @param label 実行されるコマンド
     * @param args コマンドの引数
     * @return コマンド実行が為されたかどうか
     */
    public abstract boolean executeCommand(CommandSender sender, String label, String args[]);

}
