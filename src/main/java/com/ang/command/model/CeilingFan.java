package com.ang.command.model;

/**
 * 风扇
 *
 * @author: 于昂
 * @date: 2022/8/5
 **/
public class CeilingFan {
    public static final int HIGH = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(this);
        ;
    }

    public void low() {
        speed = LOW;
        System.out.println(this);
        ;
    }

    public void off() {
        speed = OFF;
        System.out.println(this);
        ;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        String status;
        switch (speed) {
            case OFF:
                status = "OFF";
                break;
            case LOW:
                status = "LOW";
                break;
            case HIGH:
                status = "HIGH";
                break;
            default:
                status = "";
        }
        return String.format("%s ceiling fan is %s", location, status);
    }
}
