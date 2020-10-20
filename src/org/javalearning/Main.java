package org.javalearning;

import java.util.HashSet;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(planet.MERCURY.equals(planet.MERCURY));
        System.out.println(planet.MERCURY == planet.VENUS);
        System.out.println(planet.MERCURY == planet.MERCURY);
        HashSet set = new HashSet();
        set.add(new Integer(1));
        set.add(new Integer(1));
        set.add(new Integer(2));
        System.out.println(set.size());
        Outer.Inner inner = new Outer().new Inner();
        inner.display();
    }

    enum planet {
        MERCURY, VENUS, EARTH;
    }
}

class Outer {
    private String s1 = "abc";
    class Inner {
        void display() {
            System.out.println("s1:"+ s1);
        }
    }
}
