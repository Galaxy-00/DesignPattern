package com.structural.composite.example;

import java.util.Collections;

public class HRDepartment extends Company {

    public HRDepartment(String name) {
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
        System.out.println(name + " 公司招聘培训管理");
    }
    
}
