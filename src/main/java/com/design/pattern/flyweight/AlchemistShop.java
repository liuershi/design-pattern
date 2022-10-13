package com.design.pattern.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * AlchemistShop holds potion on its shelves. It uses PotionFactory to provide the potions.
 *
 * @author zhangwei151
 * @date 2022/10/13 15:39
 */
@Slf4j
public class AlchemistShop {

    private final List<Potion> topShelf;
    private final List<Potion> bottomShelf;

    public AlchemistShop() {
        var factory = new PotionFactory();
        this.topShelf = List.of(
                  factory.createPotion(PotionType.INVISIBILITY),
                  factory.createPotion(PotionType.INVISIBILITY),
                  factory.createPotion(PotionType.STRENGTH),
                  factory.createPotion(PotionType.HEALING),
                  factory.createPotion(PotionType.INVISIBILITY),
                  factory.createPotion(PotionType.STRENGTH),
                  factory.createPotion(PotionType.HEALING),
                  factory.createPotion(PotionType.HEALING)
        );
        this.bottomShelf = List.of(
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER)
        );
    }

    /**
     * Get a read-only list of all the items on the top shelf.
     *
     * @return The top shelf potions
     */
    public List<Potion> getTopShelf() {
        return new ArrayList<>(topShelf);
    }

    /**
     * Get a read-only list of all the items on the bottom shelf.
     *
     * @return The bottom shelf potions
     */
    public List<Potion> getBottomShelf() {
        return new ArrayList<>(bottomShelf);
    }

    public void drinkPotions() {
        log.info("Drink top shelf potions");
        topShelf.forEach(Potion::drink);
        log.info("Drink bottom shelf potions");
        bottomShelf.forEach(Potion::drink);
    }
}
