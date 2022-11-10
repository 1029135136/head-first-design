package com.ang.part9;

import java.util.*;

/**
 * 递归式迭代器
 *
 * @author: 于昂
 * @date: 2022/11/10
 **/
public class CompositeIterator implements Iterator<MenuComponent> {
    private final Stack<Iterator<MenuComponent>> stack = new Stack<>();

    /**
     * 将要遍历的顶层组合迭代器传入,保存在堆栈中
     *
     * @param iterator
     */
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    /**
     * @return
     */
    @Override
    public boolean hasNext() {
        //想知道还有没有下一个元素,首先要判断栈是否为空,空栈意味着没有任何元素了
        if (stack.isEmpty()) {
            return false;
        } else {
            //从栈顶取出迭代器,判断迭代器内部如果已经没有元素了,将其弹出,并取出下一个迭代器继续判断
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                //丢弃
                stack.pop();
                return hasNext();
            } else {
                //否则,表示迭代器内部还有元素,返回true
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        //当客户端取出元素时,先调用hasNext(),查看是否有元素可以取出
        if (hasNext()) {
            //如果有下一个元素,先从栈中取出当前的迭代器,并取出下一个元素
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent menuComponent = iterator.next();
            //如果元素是一个菜单,我们就有了另一个需要遍历的菜单,将其放入栈顶
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            //无论我们取出的是菜单还是还是单个菜品,都应该返回
            return menuComponent;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
