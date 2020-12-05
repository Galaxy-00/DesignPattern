package com.structural.decorator;

import com.structural.decorator.component.Person;
import com.structural.decorator.decorator.*;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("A");
        Dress sweator = new Sweater();
        Dress jeans = new Jeans();

        jeans.setDress(person);
        sweator.setDress(jeans);
        sweator.show();
        System.out.println();

        Dress dress = new Jeans(new Sweater(new Person("B"))); // 为person按照一定顺序新增功能
        dress.show();
        System.out.println();
    }
}
