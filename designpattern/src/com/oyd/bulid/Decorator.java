package com.oyd.bulid;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/4 14:52
 * 抽象建造者：装修工人
 */
public abstract class Decorator {
    Parlour parlour = new Parlour();
    //创建产品对象

    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();

    /**
     * 返回产品对象
     */
    public Parlour getResult(){
        return parlour;
    }
}
