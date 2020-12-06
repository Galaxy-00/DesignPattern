package com.structural.composite.framework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Composite extends Component {
    private List<Component> children = new LinkedList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component e) {
        children.add(e);
    }

    @Override
    public void remove(Component e) {
        children.remove(e);
    }

    @Override
    public void display(int depth) {
        System.out.println(Collections.nCopies(depth, "-").toString() + " " + name);
        for (Component component : children) {
            component.display(depth + 1);
        }
    }
}
