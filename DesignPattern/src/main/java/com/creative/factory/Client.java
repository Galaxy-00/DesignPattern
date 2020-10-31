package com.creative.factory;

import com.creative.factory.factory.ProductAFactory;
import com.creative.factory.factory.ProductBFactory;
import com.creative.factory.product.Product;

public class Client {
    public static void main(String[] args) {
        Product product = new ProductAFactory().getProduct();
        product.printInfo();

        product = new ProductBFactory().getProduct();
        product.printInfo();
    }

}
