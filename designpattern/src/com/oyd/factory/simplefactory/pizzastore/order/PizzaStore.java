package com.oyd.factory.simplefactory.pizzastore.order;

//发出订购任务
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
