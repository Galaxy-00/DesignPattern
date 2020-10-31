package com.creative.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton == singleton2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
