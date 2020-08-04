package com.oyd.bulid;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/4 14:58
 * 具体建造者：具体装修工人1
 */
public class ConcreteDecorator1 extends Decorator {
    @Override
    public void buildWall() {
        parlour.setWall("w1");
    }

    @Override
    public void buildTV() {
        parlour.setTV("TV1");
    }

    @Override
    public void buildSofa() {
        parlour.setSofa("sofa1");
    }
}
