package com.oyd.singleton.type2;



public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}
//懒汉式
class Singleton2 {
    //本类创建对象实例为空
    private static volatile Singleton2 ins;

    //私有化构造器，不能通过外部new来实例化对象
    private Singleton2() {
    }

    //提供共有静态方法，返回对象实例
    public static synchronized Singleton2 getInstance() {//双重检查
//    public static Singleton2 getInstance() {
        if(ins == null){
            synchronized (Singleton2.class){
                if(ins == null){
                    ins = new Singleton2();
                }
            }
        }
        return ins;
    }
}
