package com.structural.composite.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ConcreteCompany extends Company {
    private List<Company> children = new LinkedList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(Collections.nCopies(depth, "-") + " " + name);
        for (Company c : children) {
            c.display(depth + 1);
        }
    }

    @Override
    public void doWork() {
        for (Company c : children) {
            c.doWork();
        }
    }
}
