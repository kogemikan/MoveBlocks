package com.gmail.kogemikan1101.mvBlocks.blocks;

import com.sk89q.worldedit.Vector;
import org.bukkit.block.Block;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kogemikan
 */
public class BlockData {
    private List<Block> data = new ArrayList<>();
    private Vector area;

    public BlockData(List<Block> data,Vector min,Vector max) {
        this.data.addAll(data);
        this.area = max.subtract(min);
    }

    /***
     * ブロックの情報を取得する
     *
     * @return ブロックのリスト
     */
    public List<Block> getData() {
        return data;
    }

    /***
     * 0から数えたときの領域の大きさを取得
     *
     * @return 領域の大きさ
     */
    public Vector getArea() {
        return area;
    }
}
