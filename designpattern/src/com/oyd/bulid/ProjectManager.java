package com.oyd.bulid;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/4 15:03
 * 指挥者：项目经理
 */
public class ProjectManager {
    private Decorator decorator;

    public ProjectManager(Decorator decorator) {
        this.decorator = decorator;
    }

    public Parlour decorate(){
        decorator.buildWall();
        decorator.buildTV();
        decorator.buildSofa();
        return decorator.getResult();
    }
}
