package com.gmail.kogemikan1101.mvBlocks.command;

import org.bukkit.command.CommandSender;

/**
 * サブコマンドのインターフェイス
 * @author kogemikan
 */
/*
    プラグインのコマンド用インターフェイス
 */
public interface MoveBlocksSubCommand {

    /**
     * コマンド名を取得する
     * @return コマンド名
     */
    String getCommandName();

    /**
     * パーミッションノードを取得する
     * @return パーミッションノード
     */
    String getPermissionNode();

    /**
     * コマンドを実行する
     * @param sender コマンドの実行者
     * @param label 実行されるコマンド
     * @param args コマンドの引数
     * @return コマンド実行が為されたかどうか
     */
    boolean executeCommand(CommandSender sender, String label, String args[]);

}
