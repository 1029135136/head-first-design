package com.ang.part4;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class ClamPizza extends Pizza {
    IngredientFactory factory;

    public ClamPizza(IngredientFactory factory, String name) {
        this.factory = factory;
        this.name = name;
        prepare();
    }

    @Override
    void prepare() {
        System.out.println("材料准备工作" + name);
        dough = factory.createDough();
        cheese = factory.createCheese();
        sauce = factory.createSauce();
        clam = factory.createClam();
    }
}
