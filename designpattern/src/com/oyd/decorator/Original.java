package com.oyd.decorator;

import javax.swing.*;
import java.awt.*;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/6 16:41
 * 具体构件角色：原身
 */
public class Original extends JFrame implements Morrigan {

    private static final long serialVerionUID = 1L;

    private String t = "Morrigan0.jpg";

    public Original(){
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }

    public void setImage(String t)
    {
        this.t=t;
    }

    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        JLabel jLabel = new JLabel(new ImageIcon("designpattern/src/" + t));
        this.add(jLabel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
