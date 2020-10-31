package com.creative.factory.factory;

import com.creative.factory.product.ConcreteProduct;
import com.creative.factory.product.Product;

public class ProductAFactory extends Factory {

    @Override
    public Product getProduct() {
        return new ConcreteProduct();
    }
    
}
