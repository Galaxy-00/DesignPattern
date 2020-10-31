package com.creative.factory.factory;

import com.creative.factory.product.ConcreteProductTwo;
import com.creative.factory.product.Product;

public class ProductBFactory extends Factory {

    @Override
    public Product getProduct() {
        return new ConcreteProductTwo();
    }
    
}
