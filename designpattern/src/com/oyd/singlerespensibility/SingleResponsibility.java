package com.oyd.singlerespensibility;

import java.util.ArrayList;
import java.util.List;

public class SingleResponsibility {
    public static void main(String[] args) {
        Vechicle vechicle = new Vechicle();
        vechicle.run("公交车");
        vechicle.runAir("飞机");
        vechicle.runWater("轮船");
        List<Object> objects = new ArrayList<>();
    }
    static class Vechicle{
        public void run (String vechicle){
            System.out.println(vechicle+"在公路上跑。。。");
        }
        public void runAir (String vechicle){
            System.out.println(vechicle+"在空中飞。。。");
        }
        public void runWater (String vechicle){
            System.out.println(vechicle+"在水上跑。。。");
        }
    }
}
