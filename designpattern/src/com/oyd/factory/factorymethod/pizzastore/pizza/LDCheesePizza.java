package com.oyd.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("LD cheese pizza");
        System.out.println("给LD cheese pizza准备原材料！");
    }
}
