package com.structural.simpleFactory;

import com.structural.simpleFactory.product.*;

/**
 * SimpleFactory
 */
public class SimpleFactory {
    public static Product getProduct(String name) {
        switch (name) {
            case "ConcreteProduct":
                return new ConcreteProduct();
            case "ConcreteProductTwo":
                return new ConcreteProductTwo();
            default:
                return null;
        }
    }
}