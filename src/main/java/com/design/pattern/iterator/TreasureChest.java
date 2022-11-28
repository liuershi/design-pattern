package com.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * TreasureChest the collection class.
 *
 * @author zhangwei151
 * @date 2022/11/28 10:51
 */
public class TreasureChest {

    private List<Item> container;

    public TreasureChest() {
        this.container = List.of(
                new Item(ItemType.POTION, "Potion of courage"),
                new Item(ItemType.RING, "Ring of shadows"),
                new Item(ItemType.POTION, "Potion of wisdom"),
                new Item(ItemType.POTION, "Potion of blood"),
                new Item(ItemType.WEAPON, "Sword of silver +1"),
                new Item(ItemType.POTION, "Potion of rust"),
                new Item(ItemType.POTION, "Potion of healing"),
                new Item(ItemType.RING, "Ring of armor"),
                new Item(ItemType.WEAPON, "Steel halberd"),
                new Item(ItemType.WEAPON, "Dagger of poison")
        );
    }

    /**
     * get item iterator
     * @param type
     * @return
     */
    public Iterator<Item> iterator(ItemType type) {
        return new TreasureChestIterator(this, type);
    }

    /**
     * get all items
     * @return
     */
    public List<Item> getItems() {
        return new ArrayList<>(container);
    }
}
