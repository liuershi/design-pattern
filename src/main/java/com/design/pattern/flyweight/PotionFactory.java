package com.design.pattern.flyweight;

import java.util.EnumMap;
import java.util.Map;

/**
 * PotionFactory is the flyweight in this example. It minimizes memory use by sharing object
 * instances. It holds a map of potion instances and new potions are created only when none of
 * the type already exist.
 *
 * @author zhangwei151
 * @date 2022/10/13 15:26
 */
public class PotionFactory {

    public final Map<PotionType, Potion> potions;

    public PotionFactory() {
        this.potions = new EnumMap<PotionType, Potion>(PotionType.class);
    }

    Potion createPotion(PotionType type) {
        var potion = potions.get(type);
        if (potion == null) {
            switch (type) {
                case HEALING:
                    potion = new HealingPotion();
                    break;
                case STRENGTH:
                    potion = new StrengthPotion();
                    break;
                case HOLY_WATER:
                    potion = new HolyWaterPotion();
                    break;
                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    break;
                case POISON:
                    potion = new PoisonPotion();
                default:
                    break;
            }
            potions.put(type, potion);
        }
        return potion;
    }
}
