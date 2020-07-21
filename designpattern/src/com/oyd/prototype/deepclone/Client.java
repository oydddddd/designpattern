package com.oyd.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype d1 = new DeepPrototype();
        d1.name="oyd";
        d1.deepCloneableTarget = new DeepCloneableTarget("oyd","oyd的类");
        DeepPrototype d2 = (DeepPrototype)d1.clone();

        System.out.println("d1.name="+d1.name+" d1.deepCloneableTarget.hashcode="+d1.deepCloneableTarget.hashCode());
        System.out.println("d2.name="+d2.name+" d2.deepCloneableTarget.hashcode="+d2.deepCloneableTarget.hashCode());
    }
}
