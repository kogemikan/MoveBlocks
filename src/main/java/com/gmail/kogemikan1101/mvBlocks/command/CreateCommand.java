package com.gmail.kogemikan1101.mvBlocks.command;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * createコマンド実行クラス
 * @author kogemikan
 */
/*
動かすブロックを登録するためのコマンド
    /mvb create [Structure Name]
    選択中のブロックを任意の名前で登録します。
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
        //このコマンドはプレイヤーにのみ許される
        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "このコマンドはプレイヤー用です。");
            return true;
        }
        // /mvb create でコマンド実行時
        //一時的な名前で登録する
        if(args.length == 1) {
            //WorldEditから実行者が選択している範囲を取得する
            //情報が不完全な場合はコマンド実行失敗
            //範囲が大きすぎる、小さすぎる場合はコマンド実行失敗
            //範囲のブロックの情報を取得する
            //コンフィグファイルに一時的な名前"tmp"で保存する

            //正常終了

        }
        // /mvb create [Structure Name] でコマンド実行時
        //指定された名前で登録する
        else if(args.length == 2) {
            //WorldEditから実行者が選択している範囲を取得する
            //不完全な場合はコマンド実行失敗
            //構造物の名前が"tmp"の場合はコマンド実行失敗
            //すでに登録済みの名前の場合はコマンド実行失敗
            //範囲が大きすぎる、小さすぎる場合はコマンド実行失敗
            //範囲のブロックの情報を取得する
            //コンフィグファイルに指定された名前で保存する

            //正常終了

        }
        return false;
    }
}
