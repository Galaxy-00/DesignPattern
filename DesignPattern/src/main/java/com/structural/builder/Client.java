package com.structural.builder;

/**
 * 屏蔽建造细节, 使得相同的建造过程用于不同的建造细节
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(); // 封装建造过程
        HamburgerBuilder hamburgerBuilder = new BeefHamburger();
        director.build(hamburgerBuilder);
        Hamburger hamburger = hamburgerBuilder.getHamburger();
        hamburger.show();

        hamburgerBuilder = new FishHamburger();
        director.build(hamburgerBuilder);
        hamburger = hamburgerBuilder.getHamburger();
        hamburger.show();
    }
}
