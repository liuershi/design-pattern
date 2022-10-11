package com.design.pattern.bridge;



/**
 * @author zhangwei151
 * @date 2022/10/11 15:54
 */
public class App {

    /**
     * Program entry point.
     *
     * @param args
     */
    public static void main(String[] args) {
        var enchantmentSword = new Sword(new FlyingEnchantment());
        enchantmentSword.wield();
        enchantmentSword.swing();
        enchantmentSword.unwield();

        var enchantmentHammer = new Hammer(new SoulEatingEnchantment());
        enchantmentHammer.wield();
        enchantmentHammer.swing();
        enchantmentHammer.unwield();
    }
}
