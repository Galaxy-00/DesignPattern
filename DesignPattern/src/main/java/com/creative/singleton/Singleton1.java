package com.creative.singleton;

// 饿汉式, 天生线程安全
public class Singleton1 {
    private final static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return singleton1;
    }

}
