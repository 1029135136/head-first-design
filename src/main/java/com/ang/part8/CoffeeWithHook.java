package com.ang.part8;

import java.util.Scanner;

/**
 * @author: 于昂
 * @date: 2022/11/9
 **/
public class CoffeeWithHook extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("煮咖啡粉");
    }

    @Override
    void addCondiments() {
        System.out.println("添加焦糖");
    }

    @Override
    boolean customerWantsCondiments() {
        return getUserInput();
    }

    public boolean getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("是否添加配料 是输入y,不是输入其他");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y");
    }
}
