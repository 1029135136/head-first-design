package com.ang.part5;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class Singleton {
    private static volatile Singleton instance;
    private String name;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        } else {
            return instance;
        }
        return instance;
    }

}
