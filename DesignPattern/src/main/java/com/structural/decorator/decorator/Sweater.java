package com.structural.decorator.decorator;

import com.structural.decorator.component.Person;

public class Sweater extends Dress {

    public Sweater(Person component) {
        super(component);
    }

    public Sweater() {
    }

    @Override
    public void show() {
        if (component != null) {
            System.out.print("毛衣 ");
            component.show();
        }
    }

}
