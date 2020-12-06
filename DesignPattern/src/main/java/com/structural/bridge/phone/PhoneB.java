package com.structural.bridge.phone;

public class PhoneB extends Phone {
    @Override
    public void run() {
        System.out.print("PhoneB ");
        this.phoneFunction.run();
    }
}
