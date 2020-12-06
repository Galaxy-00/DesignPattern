package com.structural.composite.framework;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component e);

    public abstract void remove(Component e);

    public abstract void display(int depth);
}
