package com.ang.part12;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class DuckSimulator2 {
    public static void main(String[] args) {
        DuckSimulator2 simulator = new DuckSimulator2();
        CountingDuckFactory factory = new CountingDuckFactory();

        simulator.simulate(factory);
    }

    private void simulate(CountingDuckFactory factory) {
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable rubberDuck = factory.createRubberDuck();

        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(rubberDuck);

        System.out.println("Duck Simulator: With Observer");
        QuackScholar quackScholar = new QuackScholar();
        flock.registerObserver(quackScholar);

        simulate(flock);

        System.out.println("quack num: " + QuackCount.getQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
