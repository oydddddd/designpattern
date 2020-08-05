package com.oyd.proxy;

import javax.swing.*;
import java.awt.*;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/5 15:03
 * 真实主题：婺源特产
 */
public class WySpecialty implements Specialty {

    private static final long serialVersionUID = 1L;

    private Product product;

    public WySpecialty(Product product) {
        this.product = product;
    }

    @Override
    public void display() {
        product.setId(1);
        product.setName("水果");
        product.setPrice(100.1);
        System.out.println(product.toString());
    }
}
