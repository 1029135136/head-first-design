package com.ang.part10;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);

        machine.insertQuarter();
        machine.tumCrank();
        System.out.println(machine);


        machine.insertQuarter();
        machine.tumCrank();

        machine.insertQuarter();
        machine.tumCrank();

        machine.insertQuarter();
        machine.tumCrank();

        machine.insertQuarter();
        machine.tumCrank();

        machine.insertQuarter();
        machine.tumCrank();
        System.out.println(machine);

    }
}
