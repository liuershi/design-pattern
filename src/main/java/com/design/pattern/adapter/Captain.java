package com.design.pattern.adapter;

/**
 * The captain use {@link RowingBoat} to sail.
 *
 * This is the client in the pattern.
 *
 * @author zhangwei151
 * @date 2022/9/24 23:29
 */
public final class Captain {

    private final RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    void row() {
        rowingBoat.row();
    }
}
