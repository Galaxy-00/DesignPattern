package com.structural.builder;

import java.util.ArrayList;
import java.util.List;

public class Hamburger{
    List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("汉堡:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
