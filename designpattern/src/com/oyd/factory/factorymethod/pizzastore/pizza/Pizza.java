package com.oyd.factory.factorymethod.pizzastore.pizza;

public abstract class Pizza {
    protected String name;
    //准备原材料。不同类型的pizza要准备不同的材料
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
