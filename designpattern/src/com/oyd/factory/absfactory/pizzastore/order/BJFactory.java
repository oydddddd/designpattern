package com.oyd.factory.absfactory.pizzastore.order;

import com.oyd.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.oyd.factory.absfactory.pizzastore.pizza.BJGreekPizza;
import com.oyd.factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
