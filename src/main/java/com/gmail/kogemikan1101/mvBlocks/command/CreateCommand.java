package com.gmail.kogemikan1101.mvBlocks.command;

import org.bukkit.command.CommandSender;

/**
 * createコマンド実行クラス
 * @author kogemikan
 */
/*
動かすブロックを登録するためのコマンド
 */
public class CreateCommand implements MoveBlocksSubCommand {
    private static final String COMMAND_NAME = "create";
    private static final String PERMISSION_NODE = "mvblocks." + COMMAND_NAME;

    /**
     * コマンド名を取得する
     *
     * @return コマンド名
     */
    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }

    /**
     * パーミッションノードを取得する
     *
     * @return パーミッションノード
     */
    @Override
    public String getPermissionNode() {
        return PERMISSION_NODE;
    }

    /**
     * コマンドを実行する
     *
     * @param sender コマンドの実行者
     * @param label  実行されるコマンド
     * @param args   コマンドの引数
     * @return コマンド実行が為されたかどうか
     */
    @Override
    public boolean executeCommand(CommandSender sender, String label, String[] args) {
        return false;
    }
}
