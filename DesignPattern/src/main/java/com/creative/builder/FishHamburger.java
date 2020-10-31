package com.creative.builder;

public class FishHamburger extends HamburgerBuilder {

    @Override
    public void placeBread() {
        hamburger.add("rice bread");
    }

    @Override
    public void placeVegetable() {
        hamburger.add("lettuce");
    }

    @Override
    public void placeMeet() {
        hamburger.add("fish");
    }

    @Override
    public Hamburger getHamburger() {
        return hamburger;
    }

}
