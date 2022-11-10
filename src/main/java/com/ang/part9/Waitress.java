package com.ang.part9;

import java.util.Iterator;

/**
 * @author: 于昂
 * @date: 2022/11/9
 **/
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            try {
                component.print();
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}
