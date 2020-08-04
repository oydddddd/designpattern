package com.oyd.bulid;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/4 15:01
 * 具体建造者：具体装修工人2
 */
public class ConcreteDecorator2 extends Decorator {
    @Override
    public void buildWall() {
        parlour.setWall("w2");
    }

    @Override
    public void buildTV() {
        parlour.setTV("TV2");
    }

    @Override
    public void buildSofa() {
        parlour.setSofa("sofa2");
    }
}
