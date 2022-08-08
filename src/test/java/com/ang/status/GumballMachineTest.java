package com.ang.status;

import org.junit.Test;

import static org.junit.Assert.*;

public class GumballMachineTest {
    @Test
    public void test1() {
        try {
            GumballMachine machine = new GumballMachine(3);
            machine.insertQuarter();
            machine.turnCrank();

            machine.insertQuarter();
            machine.turnCrank();

            machine.insertQuarter();
            machine.turnCrank();

            machine.insertQuarter();
            machine.turnCrank();

            machine.load(3);
            machine.insertQuarter();
            machine.turnCrank();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        GumballMachine machine = new GumballMachine(2, "布鲁克林大街212号");
        GumballMachineMonitor monitor = new GumballMachineMonitor(machine);

        try {
            machine.insertQuarter();
            machine.turnCrank();

            monitor.report();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
