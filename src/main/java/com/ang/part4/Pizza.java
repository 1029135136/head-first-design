package com.ang.part4;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    String cheese;
    String clam;

    abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void bake() {
        System.out.println("190度 烤制 30分钟");
    }

    ;

    void cut() {
        System.out.println("切小块");
    }

    void box() {
        System.out.println("打包");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", clam='" + clam + '\'' +
                '}';
    }
}
