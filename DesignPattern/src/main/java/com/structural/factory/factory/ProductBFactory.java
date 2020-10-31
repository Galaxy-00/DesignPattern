package com.structural.factory.factory;

import com.structural.factory.product.ConcreteProductTwo;
import com.structural.factory.product.Product;

public class ProductBFactory extends Factory {

    @Override
    public Product getProduct() {
        return new ConcreteProductTwo();
    }
    
}
