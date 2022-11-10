package com.ang.part9;

import java.util.Iterator;

/**
 * @author: 于昂
 * @date: 2022/11/10
 **/
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
