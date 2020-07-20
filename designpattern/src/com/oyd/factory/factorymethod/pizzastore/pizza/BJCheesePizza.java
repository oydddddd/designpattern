package com.oyd.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJ cheese pizza");
        System.out.println("给BJ cheese pizza 准备原材料!");
    }
}
