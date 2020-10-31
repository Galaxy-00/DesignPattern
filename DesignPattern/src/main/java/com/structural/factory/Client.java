package com.structural.factory;

import com.structural.factory.factory.ProductAFactory;
import com.structural.factory.factory.ProductBFactory;
import com.structural.factory.product.Product;

public class Client {
    public static void main(String[] args) {
        Product product = new ProductAFactory().getProduct();
        product.printInfo();

        product = new ProductBFactory().getProduct();
        product.printInfo();
    }

}
