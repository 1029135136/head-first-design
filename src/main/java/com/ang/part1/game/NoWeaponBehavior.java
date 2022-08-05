package com.ang.part1.game;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class NoWeaponBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("not have any weapon");
    }
}
