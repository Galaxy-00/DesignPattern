package com.creative.simpleFactory;

import com.creative.simpleFactory.product.Product;

public class Client {
    public static void main(String[] args) {
        Product product = SimpleFactory.getProduct("ConcreteProduct");
        product.printInfo();

        product = SimpleFactory.getProduct("ConcreteProductTwo");
        product.printInfo();
    }

}
