/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.block;

import java.util.List;

/**
 * Auto-generated: 2021-11-01 9:42:4
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class BlockResult {

    private int height;
    private List<TxsResult> txsResults;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public List<TxsResult> getTxsResults() {
        return txsResults;
    }

    public void setTxsResults(List<TxsResult> txsResults) {
        this.txsResults = txsResults;
    }
}