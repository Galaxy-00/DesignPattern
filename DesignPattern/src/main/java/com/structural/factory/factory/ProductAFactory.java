package com.structural.factory.factory;

import com.structural.factory.product.ConcreteProduct;
import com.structural.factory.product.Product;

public class ProductAFactory extends Factory {

    @Override
    public Product getProduct() {
        return new ConcreteProduct();
    }
    
}
