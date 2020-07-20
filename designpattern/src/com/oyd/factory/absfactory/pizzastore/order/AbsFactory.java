package com.oyd.factory.absfactory.pizzastore.order;

import com.oyd.factory.absfactory.pizzastore.pizza.Pizza;

//抽象工厂模式抽象层
public interface AbsFactory {
    //让下面的工厂子类来实现
    public Pizza createPizza(String orderType);
}
