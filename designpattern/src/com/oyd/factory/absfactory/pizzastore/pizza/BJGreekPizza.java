package com.oyd.factory.absfactory.pizzastore.pizza;

public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJ greek pizza");
        System.out.println("给BJ greek pizza准备原材料！");
    }
}
