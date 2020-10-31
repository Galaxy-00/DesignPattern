package com.structural.builder;

// 指挥建造过程
public class Director {
    public void build(HamburgerBuilder hamburgerBuilder) {
        hamburgerBuilder.placeBread();
        hamburgerBuilder.placeVegetable();
        hamburgerBuilder.placeMeet();
        hamburgerBuilder.placeBread();
    }
}
