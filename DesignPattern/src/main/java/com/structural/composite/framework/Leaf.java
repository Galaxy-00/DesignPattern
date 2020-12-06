package com.structural.composite.framework;

import java.util.Collections;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component e) {
        System.out.println("can not add from leaf " + name);
    }

    @Override
    public void remove(Component e) {
        System.out.println("can not remove from leaf " + name);
    }

    @Override
    public void display(int depth) {
        System.out.println(Collections.nCopies(depth, "-").toString() + " " + name);
    }

}
