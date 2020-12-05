package com.structural.decorator.decorator;

import com.structural.decorator.component.Person;

public class Dress extends Person {

    public Person component = null;

    public Dress(Person component) {
        this.component = component;
    }

    public Dress() {
    }

    public void setDress(Person component) {
        this.component = component;
    }

    public void show() {
        if(component != null) {
            component.show();
        }
    }
}
