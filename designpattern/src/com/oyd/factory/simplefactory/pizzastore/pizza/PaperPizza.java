package com.oyd.factory.simplefactory.pizzastore.pizza;

public class PaperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给PaperPizza准备原材料！");
    }
}
