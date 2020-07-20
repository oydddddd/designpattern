package com.oyd.factory.absfactory.pizzastore.order;

import com.oyd.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.oyd.factory.absfactory.pizzastore.pizza.LDGreekPizza;
import com.oyd.factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("greek")){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
