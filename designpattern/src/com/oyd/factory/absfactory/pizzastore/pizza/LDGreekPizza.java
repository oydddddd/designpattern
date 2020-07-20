package com.oyd.factory.absfactory.pizzastore.pizza;

public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LD greek pizza");
        System.out.println("给LD greek pizza准备原材料！");
    }
}
