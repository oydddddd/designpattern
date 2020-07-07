package com.oyd.singleton.type1;

public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

//饿汉式
class Singleton {
    //本类创建对象实例
    private final static Singleton ins = new Singleton();

    //私有化构造器，不能通过外部new来实例化对象
    private Singleton() {
    }

    //提供共有静态方法，返回对象实例
    public static Singleton getInstance() {
        return ins;
    }

}