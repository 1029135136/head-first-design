package com.ang.part9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: 于昂
 * @date: 2022/11/9
 **/
public class Menu extends MenuComponent {
    List<MenuComponent> menuComponentList = new ArrayList<>();
    String name;
    String desc;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponentList.get(i);
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new CompositeIterator(menuComponentList.iterator());
    }

    @Override
    public void print() {
        System.out.print("\n" + name);
        System.out.print(", " + desc);
        System.out.print("\n----------------------------------");

//        for (MenuComponent menuComponent : menuComponentList) {
//            menuComponent.print();
//        }
    }
}
