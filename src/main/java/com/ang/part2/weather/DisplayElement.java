package com.ang.part2.weather;

/**
 * 行为接口
 * 不同实物可以有不同的实现,从而方便对系统进行拓展,并且规范这些实物的行为
 *
 * @author: 于昂
 * @date: 2022/8/3
 **/
public interface DisplayElement {
    /**
     * 展示数据
     */
    void display();
}
