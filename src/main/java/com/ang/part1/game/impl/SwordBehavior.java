package com.ang.part1.game.impl;

import com.ang.part1.game.WeaponBehavior;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use sword");
    }
}
