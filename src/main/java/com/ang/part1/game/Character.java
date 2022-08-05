package com.ang.part1.game;

import lombok.Data;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
@Data
public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public void flight() {
        weaponBehavior.useWeapon();
    }
}
