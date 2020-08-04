package com.oyd.bulid;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/4 10:58
 */
public class Client {
    public static void main(String[] args) {
        ConcreteDecorator1 createBuilder = new ConcreteDecorator1();
        ProjectManager pj = new ProjectManager(createBuilder);
        Parlour decorate = pj.decorate();
        decorate.show();
    }
}
