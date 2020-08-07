package com.oyd.decorator;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/6 16:53
 * 具体装饰角色：少女
 */
public class Girl extends Changer {
    public Girl(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger(){
        ((Original)super.morrigan).setImage("Morrigan2.jpg");
    }
}
