package com.oyd.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");
        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();

        System.out.println("sheep1 = " + sheep1);
        System.out.println("sheep2 = " + sheep2);
    }
}
