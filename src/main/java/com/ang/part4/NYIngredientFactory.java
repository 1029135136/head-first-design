package com.ang.part4;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class NYIngredientFactory implements IngredientFactory {
    @Override
    public String createDough() {
        return "薄饼";
    }

    @Override
    public String createSauce() {
        return "大蒜番茄酱";
    }

    @Override
    public String createCheese() {
        return "高级意大利干酪";
    }

    @Override
    public String createClam() {
        return "新鲜牡蛎";
    }
}
