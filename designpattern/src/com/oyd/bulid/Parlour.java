package com.oyd.bulid;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/4 14:36
 * 产品：客厅
 */
public class Parlour {
    private String wall;
    private String TV;
    private String sofa;

    public void show(){
        System.out.println(wall+";"+TV+";"+sofa);
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getTV() {
        return TV;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }
}
