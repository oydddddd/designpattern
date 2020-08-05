package com.oyd.adapter;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/5 16:52
 * 电能适配器
 */
public class ElectricAdapter implements Motor {

    private ElectricMotor electricMotor;

    public ElectricAdapter() {
        electricMotor = new ElectricMotor();
    }

    @Override
    public void drive() {
        electricMotor.electricDrive();
    }
}
