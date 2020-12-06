package com.structural.composite.example;

import java.util.Collections;

public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println(Collections.nCopies(depth, "-") + " " + name);
    }

    @Override
    public void doWork() {
        System.out.println(name + " 公司财务收支管理");
    }
    
}
