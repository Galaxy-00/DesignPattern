package com.structural.decorator.decorator;

import com.structural.decorator.component.Person;

public class Jeans extends Dress {

    public Jeans(Person component) {
        super(component);
    }

    public Jeans() {
    }

    @Override
    public void show() {
        if (component != null) {
            System.out.print("牛仔裤 ");
            component.show();
        }
    }

}
