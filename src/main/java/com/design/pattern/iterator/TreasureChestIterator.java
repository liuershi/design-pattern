package com.design.pattern.iterator;


/**
 * @author zhangwei151
 * @date 2022/11/28 10:55
 */
public class TreasureChestIterator implements Iterator<Item> {

    private int idx;
    private final TreasureChest treasureChest;
    private final ItemType type;

    public TreasureChestIterator(TreasureChest treasureChest, ItemType type) {
        this.treasureChest = treasureChest;
        this.type = type;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public Item next() {
        idx = findNextIdx();
        if (idx == -1)
            return null;
        return treasureChest.getItems().get(idx);
    }

    private int findNextIdx() {

        var items = treasureChest.getItems();
        int tempIdx = idx;
        while (true) {
            tempIdx++;
            if (tempIdx >= items.size()) {
                tempIdx = -1;
                break;
            }

            if (type == ItemType.ANY || type == items.get(tempIdx).getType()) {
                break;
            }
        }
        return tempIdx;
    }
}
