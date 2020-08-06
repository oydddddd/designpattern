package com.oyd.bridge;



/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/6 15:02
 */
public class BagManage {
    public static void main(String[] args){
        Color color;
        Bag bag;
        color=(Color)ReadXML.getObject("color");
        bag=(Bag)ReadXML.getObject("bag");
        bag.setColor(color);
        String name=bag.getName();
        System.out.println(name);
    }
}
