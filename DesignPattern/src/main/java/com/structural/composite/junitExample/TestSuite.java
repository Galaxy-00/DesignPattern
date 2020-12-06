package com.structural.composite.junitExample;

import java.util.LinkedList;
import java.util.List;

public class TestSuite implements Test {
    private List<Test> ltest = new LinkedList<>();
    private String name;

    public TestSuite(String name) {
        this.name = name;
    }

    public void addTest(Test test) {
        ltest.add(test);
    }

    @Override
    public int countTestCases() {
        int count = 0;
        for (Test t : ltest) {
            count += t.countTestCases();
        }
        return count;
    }

    @Override
    public void run() {
        System.out.println("TestSuite: " + name);
        for (Test t : ltest) {
            t.run();
        }
    }
}
