package com.oyd.adapter;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/5 16:55
 */
public class OpticalAdapter implements Motor {

    private OpticalMotor opticalMotor;

    public OpticalAdapter() {
        opticalMotor = new OpticalMotor();
    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}
