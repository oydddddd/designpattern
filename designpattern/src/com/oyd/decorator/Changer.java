package com.oyd.decorator;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/6 16:48
 * 抽象装饰角色：变形
 */
public class Changer implements Morrigan {
    Morrigan morrigan;

    public Changer(Morrigan morrigan) {
        this.morrigan = morrigan;
    }


    @Override
    public void display() {
        morrigan.display();
    }
}
