package com.oyd.bridge;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/6 14:57
 * 抽象化角色：包
 */
public abstract class Bag {

    protected Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract String getName();
}
