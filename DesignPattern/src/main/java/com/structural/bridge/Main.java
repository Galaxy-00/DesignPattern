package com.structural.bridge;

import com.structural.bridge.function.PhoneCommun;
import com.structural.bridge.function.PhoneGameA;
import com.structural.bridge.phone.Phone;
import com.structural.bridge.phone.PhoneA;

public class Main {

    public static void main(String[] args) {
        Phone phone = new PhoneA();
        phone.setFunction(new PhoneGameA());
        phone.run();
        
        phone.setFunction(new PhoneCommun());
        phone.run();
    }
}
