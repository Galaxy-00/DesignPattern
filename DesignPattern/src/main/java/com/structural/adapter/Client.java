package com.structural.adapter;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(); // 以Target的形式调用adaptee, adapter为设配器接口
        target.Request();
    }

}
