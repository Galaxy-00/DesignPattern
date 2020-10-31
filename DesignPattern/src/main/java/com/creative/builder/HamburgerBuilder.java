package com.creative.builder;

public abstract class HamburgerBuilder {
    Hamburger hamburger = new Hamburger();

    public abstract void placeBread();

    public abstract void placeVegetable();

    public abstract void placeMeet();

    public abstract Hamburger getHamburger();
}
