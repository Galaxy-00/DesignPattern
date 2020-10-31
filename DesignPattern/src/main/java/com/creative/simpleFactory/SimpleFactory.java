package com.creative.simpleFactory;

import com.creative.simpleFactory.product.ConcreteProduct;
import com.creative.simpleFactory.product.ConcreteProductTwo;
import com.creative.simpleFactory.product.Product;

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