package com.structural.composite.junitExample;

public class Main {
    public static void main(String[] args) {
        TestSuite root = new TestSuite("root test suite");
        root.addTest(new TestCase("test case1"));
        root.addTest(new TestCase("test case2"));

        TestSuite testSuiteA = new TestSuite("test suite A");
        testSuiteA.addTest(new TestCase("test case A1"));
        testSuiteA.addTest(new TestCase("test case A2"));

        TestSuite testSuiteB = new TestSuite("test suite B");
        testSuiteB.addTest(new TestCase("test case B1"));
        testSuiteB.addTest(new TestCase("test case B2"));

        root.addTest(testSuiteA);
        root.addTest(testSuiteB);
        
        root.run();
    }
}
