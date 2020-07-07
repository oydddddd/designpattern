package com.oyd.singleton.type3;

public class SingletonTest3 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
//使用内部静态类实现单例模式
class Singleton {
    //私有化构造器，不能通过外部new来实例化对象
    private Singleton() {
    }

    //静态内部类，该类中有一个静态属性INSTANCE
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    /*
    * 提供今天共有方法，直接返回内部类的成员变量
    * 不调用内部类的成员变量的话，是不会初始化对象的，起到了懒加载的效果
    * 通过类加载机制就可以保证线程安全
    * */
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
