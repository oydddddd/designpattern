package com.oyd.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/5 16:58
 */
public class MotorAdapterTest {
    public static void main(String[] args) throws IOException {
        System.out.println("适配器模式测试：");
        while (true){
            BufferedReader type = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input 汽车类型：");
            String str = type.readLine();
            Motor motor = null;
            if("electric".equals(str)){
                motor = new ElectricAdapter();
                motor.drive();
            }else if("optical".equals(str)){
                motor = new OpticalAdapter();
                motor.drive();
            }else{
                System.out.println("无法适配！");
                break;
            }
        }
    }
}
