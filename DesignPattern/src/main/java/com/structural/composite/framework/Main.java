package com.structural.composite.framework;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf X"));
        root.add(new Leaf("Leaf Y"));

        Composite compositeX = new Composite("CompositeX");
        compositeX.add(new Leaf("LeafX X"));
        compositeX.add(new Leaf("LeafX Y"));
        root.add(compositeX);

        root.display(1);
    }
}
