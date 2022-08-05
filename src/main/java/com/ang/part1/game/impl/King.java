package com.ang.part1.game.impl;

import com.ang.part1.game.Character;
import com.ang.part1.game.NoWeaponBehavior;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class King extends Character {

    public King() {
        setWeaponBehavior(new NoWeaponBehavior());
    }
}
