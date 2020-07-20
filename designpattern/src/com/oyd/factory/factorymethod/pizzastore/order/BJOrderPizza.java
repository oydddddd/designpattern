package com.oyd.factory.factorymethod.pizzastore.order;

import com.oyd.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.oyd.factory.factorymethod.pizzastore.pizza.BJGreekPizza;
import com.oyd.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
