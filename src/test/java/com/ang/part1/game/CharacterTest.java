package com.ang.part1.game;

import com.ang.part1.game.impl.King;
import com.ang.part1.game.impl.SwordBehavior;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {

    @Test
    public void test() {
        Character king = new King();
        king.flight();
        king.setWeaponBehavior(new SwordBehavior());
        king.flight();

    }

}
