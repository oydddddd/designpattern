package com.oyd.bridge;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/6 15:00
 * 扩展抽象化角色：挎包
 */
public class HandBag extends Bag {
    @Override
    public String getName() {
        return color.getColor()+"HandBag";
    }
}
