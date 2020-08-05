package com.oyd.proxy;

import jdk.nashorn.internal.ir.CallNode;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/5 15:06
 * 代理：韶关代理
 */
public class SgProxy implements Specialty {
    /**
     * 真实产品
     */
    private WySpecialty wySpecialty = new WySpecialty(new Product());

    @Override
    public void display() {
        this.preRequest();
        wySpecialty.display();
        this.postRequest();
    }

    public void preRequest(){
        System.out.println("开始代理特产。");
    }

    public void postRequest(){
        System.out.println("结束代理产品。");
    }
}
