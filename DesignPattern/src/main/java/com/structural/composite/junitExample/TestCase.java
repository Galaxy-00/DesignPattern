package com.structural.composite.junitExample;

public class TestCase implements Test {
    private String name;

    public TestCase(String name) {
        this.name = name;
    }

    @Override
    public int countTestCases() {
        return 1;
    }

    @Override
    public void run() {
        System.out.println("TestCase " + name);
    }

}
