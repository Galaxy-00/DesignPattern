package com.structural.bridge.phone;

public class PhoneA extends Phone {
    @Override
    public void run() {
        System.out.print("PhoneA ");
        this.phoneFunction.run();
    }
}
