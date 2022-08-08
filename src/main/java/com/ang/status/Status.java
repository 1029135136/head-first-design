package com.ang.status;

import sun.reflect.generics.tree.VoidDescriptor;

/**
 * 糖果机状态
 *
 * @author: 于昂
 * @date: 2022/8/8
 **/
public interface Status {
    /**
     * 放入硬币
     *
     * @throws NoSuchMethodException 不支持该方法
     */
    void insertQuarter() throws NoSuchMethodException;

    /**
     * 退回硬币
     *
     * @throws NoSuchMethodException 不支持该方法
     */
    void ejectQuarter() throws NoSuchMethodException;

    /**
     * 转动曲柄
     *
     * @throws NoSuchMethodException 不支持该方法
     */
    boolean turnCrank() throws NoSuchMethodException;

    /**
     * 发放糖果
     */
    void dispense();


    /**
     * 重新装填糖果机器
     * @param num
     */
    default void load(int num) {
    }
}
