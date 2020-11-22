package org.javalearning.designpattern.creational.singleton;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

class SingletonB implements Cloneable {
    private static final SingletonB INSTANCE = new SingletonB();
    private SingletonB() {}
    public static SingletonB getInstance() {
        return INSTANCE;
    }
    public Object clone() throws CloneNotSupportedException {
        return INSTANCE;
    }
}
public class PreventSingletonFromClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonB s1 = SingletonB.getInstance();
        SingletonB s2 = (SingletonB) s1.clone();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(null);
        System.out.println(ll);
        ll.removeIf(Objects::isNull);
        System.out.println(ll);
    }
}
