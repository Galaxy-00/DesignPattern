package com.structural.bridge.phone;

import com.structural.bridge.function.PhoneFunction;

public abstract class Phone {
    protected PhoneFunction phoneFunction = null;

    public void setFunction(PhoneFunction phoneFunction) {
        this.phoneFunction = phoneFunction;
    }

    public void run() {
        phoneFunction.run();
    }
}
