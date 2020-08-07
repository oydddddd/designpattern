package com.oyd.decorator;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/6 16:49
 * 具体装饰角色：女妖
 */
public class Succubus extends Changer{
    public Succubus(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display(){
        setChanger();
        super.display();
    }

    public void setChanger()
    {
        ((Original) super.morrigan).setImage("Morrigan1.jpg");
    }
}
