package com.ang.part12;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class DuckSimulator {
    private AbstractDuckFactory duckFactory;

    public DuckSimulator(AbstractDuckFactory duckFactory) {
        this.duckFactory = duckFactory;
    }

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator(new CountingDuckFactory());
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable readHeadDuck = duckFactory.createReadHeadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(readHeadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseAdapter);

        Flock flockOfMallard = new Flock();
        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();
        flockOfMallard.add(mallardDuck1);
        flockOfMallard.add(mallardDuck2);
        flockOfMallard.add(mallardDuck3);
        flockOfMallard.add(mallardDuck4);

        flockOfDucks.add(flockOfMallard);

        System.out.println("Simulate flockOfDucks");
        simulate(flockOfDucks);


        System.out.println("Simulate flockOfMallard");
        simulate(flockOfMallard);
        System.out.println("count :" + QuackCount.getQuacks());

    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
