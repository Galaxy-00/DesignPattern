package com.structural.builder;

public class BeefHamburger extends HamburgerBuilder{

    @Override
    public void placeBread() {
        hamburger.add("soft bread");
    }

    @Override
    public void placeVegetable() {
        hamburger.add("tomato");
    }

    @Override
    public void placeMeet() {
        hamburger.add("beef");
    }

    @Override
    public Hamburger getHamburger() {
        return hamburger;
    }
    
}
