package com.ang.part6.model;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class Stereo {
    int volume;
    String cd;
    public void on() {
        System.out.println("音响 开");
    }

    public void off() {
        System.out.println("音响 关");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }
}
